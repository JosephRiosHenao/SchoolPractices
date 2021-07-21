import pyttsx3
engine = pyttsx3.init() # object creation

""" RATE"""
rate = engine.getProperty('rate')   # getting details of current speaking rate
print (rate)                        #printing current voice rate
engine.setProperty('rate', 200)     # setting up new voice rate


"""VOLUME"""
volume = engine.getProperty('volume')   #getting to know current volume level (min=0 and max=1)
print (volume)                          #printing current volume level
engine.setProperty('volume',1.0)    # setting up volume level  between 0 and 1

"""VOICE"""
voices = engine.getProperty('voices')       #getting details of current voice
#engine.setProperty('voice', voices[0].id)  #changing index, changes voices. o for male
engine.setProperty('voice', voices[1].id)   #changing index, changes voices. 1 for female

"""VOZ DEL ASISTENTE"""
# voice_engine = engine.getProperty('voices')
# engine.setProperty('voice', voice_engine[0].id)


engine.say("""Hola, what's happenin'?
No cap in my caption
Hola (uh), what's happenin'?
No cap in my caption
Got a little baddie and she textin' for the Addy
'Cause I got a little thing for when a bitch get ratchet
The ratchets love Snow
Soy la mexicana con tremendo flow
Tengo todo el control
Cierro los ojos, baby, let's go-go-go-go
Hola (uh), what's happenin'?
No cap in my caption
Got a little baddie and she textin' for the Addy
'Cause I got a little thing for when a bitch get ratchet
The ratchets love Snow
Soy la mexicana con tremendo flow
Tengo todo el control
Cierro los ojos, baby, let's go-go-go-go
Hola, buenas noches
Yo me llamo Snow, por si no me conocen
Yo ya tengo tiempo que le meto, pero con todo respeto
Ya llegó la hora que llegue con un golpe
Tengo whatever cuando quiero, lo que se antoje
Quiero dinero pa' que los haters se enojen
Soy de San José como Los Tigres del Norte
Traigo tanta feria que la bolsa se me rompe
I bet I could pull a little rapper outta Cloud9
Making these record' with a free translation
You see me, bet your knees be shakin'
That's why I'm on the throne and this seat's amazing
Tengo mucho flow, dicen, "Snow, that's crazy"
Yo les digo, "Claro, pero tengo un baby"
Así que en inglés o español, es lo mismo en los dos, hasta en seña'
Fuck you, pay me
'Cause ya llegó la mexicana, la mera mera
La nena que todos pensaban nada was ever gon' happen
And they wanted a bitch to fall off, but ta-dah
Pop back up, esto no se acaba
Vengo con cholos en un pinche Impala
Beat yo ass, make yo bitch a piñata
Shoulda known better, I'm a michoacana
La reina es el rey, no Beatriz Adriana
Yo represento la comunidad
Que está cansada de raperos que no saben rapear
Que solamente con sus joyas es que saben brillar
Que no tienen estrella propia y solo saben copiar
Son bola de mamones con su dinero de papá
Que con su "Bla-bla-bla", siempre cayendo mal
Y raperas que me conocen me 'tán tirando sal
Pero Biza dijo que le meta, so I'm killin' 'em off
And I got good and plenty, I know bitches couldn't get me
I'm actin' a fool if any bitches wanna catch this fade
Súbele a mí, que yo soy la dura que te dio solo dos rutas
Tírame o si quieres hazte, güey
Díganme si así o con más lumbre
que por costumbre mato yo el track
No acepto, no two-face, hoes that been choosin'
Pour me some D'USSÉ, bring the hook back like
Hola (uh), what's happenin'?
No cap in my caption
Got a little baddie and she textin' for the Addy
'Cause I got a little thing for when a bitch get ratchet
The ratchets love Snow
Soy la mexicana con tremendo flow
Tengo todo el control
Cierro los ojos, baby, let's go-go-go-go
Hola (uh), what's happenin'?
No cap in my caption
Got a little baddie and she textin' for the Addy
'Cause I got a little thing for when a bitch get ratchet
The ratchets love Snow
Soy la mexicana con tremendo flow
Tengo todo el control
Cierro los ojos, baby, let's go-go-go-go
Hola, what's happenin'?
No cap in my caption
Got a little baddie and she textin' for the Addy
'Cause I got a little thing for when a bitch get ratchet
The ratchets love Snow
Soy la mexicana con tremendo flow
Tengo todo el control
Cierro los ojos, baby, let's go, go
What's happenin'?
No caption
What's happenin'?
No caption
What's happenin'?
No caption
What's happenin'?
No, no-no-no caption""")
engine.say('Mi voz es ' + str(rate))
engine.runAndWait()
engine.stop()

"""Saving Voice to a file"""
# On linux make sure that 'espeak' and 'ffmpeg' are installed
engine.save_to_file('Hello World', 'test.mp3')
engine.runAndWait()

def text_to_speach(text):
    engine.say(text)
    engine.runAndWait()