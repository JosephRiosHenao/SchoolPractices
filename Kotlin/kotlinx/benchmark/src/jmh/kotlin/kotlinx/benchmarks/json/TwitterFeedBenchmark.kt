package kotlinx.benchmarks.json

import kotlinx.benchmarks.model.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import org.openjdk.jmh.annotations.*
import java.util.concurrent.*

@Warmup(iterations = 7, time = 1)
@Measurement(iterations = 7, time = 1)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.SECONDS)
@State(Scope.Benchmark)
@Fork(2)
open class TwitterFeedBenchmark {

    /*
     * Macro feed benchmark with a lot of UTF-16 used to track general regressions.
     *
     * This is a small piece of twitter feed taken from one of the simdjson repository
     * with Kotlin classes generated by Json2Kotlin plugin (and also manually adjusted)
     */
    private val input = TwitterFeedBenchmark::class.java.getResource("/twitter_macro.json").readBytes().decodeToString()
    private val twitter = Json.decodeFromString(MacroTwitterFeed.serializer(), input)

    private val jsonNoAltNames = Json { useAlternativeNames = false }
    private val jsonIgnoreUnknwn = Json { ignoreUnknownKeys = true }
    private val jsonIgnoreUnknwnNoAltNames = Json { ignoreUnknownKeys = true; useAlternativeNames = false }
    private val jsonNamingStrategy = Json { namingStrategy = JsonNamingStrategy.SnakeCase }
    private val jsonNamingStrategyIgnoreUnknwn = Json(jsonNamingStrategy) { ignoreUnknownKeys = true }

    private val twitterKt = jsonNamingStrategy.decodeFromString(MacroTwitterFeedKt.serializer(), input)

    @Setup
    fun init() {
        require(twitter == Json.decodeFromString(MacroTwitterFeed.serializer(), Json.encodeToString(MacroTwitterFeed.serializer(), twitter)))
    }

    // Order of magnitude: ~500 op/s
    @Benchmark
    fun decodeTwitter() = Json.decodeFromString(MacroTwitterFeed.serializer(), input)

    // Should be the same as decodeTwitter, since decodeTwitter never hit unknown name and therefore should never build deserializationNamesMap anyway
    @Benchmark
    fun decodeTwitterNoAltNames() = jsonNoAltNames.decodeFromString(MacroTwitterFeed.serializer(), input)

    @Benchmark
    fun encodeTwitter() = Json.encodeToString(MacroTwitterFeed.serializer(), twitter)

    @Benchmark
    fun decodeMicroTwitter() = jsonIgnoreUnknwn.decodeFromString(MicroTwitterFeed.serializer(), input)

    // Should be faster than decodeMicroTwitter, as we explicitly opt-out from deserializationNamesMap on unknown name
    @Benchmark
    fun decodeMicroTwitterNoAltNames() = jsonIgnoreUnknwnNoAltNames.decodeFromString(MicroTwitterFeed.serializer(), input)

    // Should be just a bit slower than decodeMicroTwitter, because alternative names map is created in both cases
    @Benchmark
    fun decodeMicroTwitterWithNamingStrategy(): MicroTwitterFeedKt = jsonNamingStrategyIgnoreUnknwn.decodeFromString(MicroTwitterFeedKt.serializer(), input)

    // Can be slower than decodeTwitter, as we always build deserializationNamesMap when naming strategy is used
    @Benchmark
    fun decodeTwitterWithNamingStrategy(): MacroTwitterFeedKt = jsonNamingStrategy.decodeFromString(MacroTwitterFeedKt.serializer(), input)

    // 15-20% slower than without the strategy. Without serializationNamesMap (invoking strategy on every write), up to 50% slower
    @Benchmark
    fun encodeTwitterWithNamingStrategy(): String = jsonNamingStrategy.encodeToString(MacroTwitterFeedKt.serializer(), twitterKt)

}