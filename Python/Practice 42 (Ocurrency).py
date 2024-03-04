n= 4
words = ["bcdef","abcdefg","bcde","bcdef"]

# words = [input() for _ in range(int(input()))]
words_used = dict.fromkeys(words)
for word in words:
    try:
        words_used[word] += 1
    except:
        words_used[word] = 1
print(len(words_used))
print(' '.join([str(a) for a in words_used.values()]))