import speech_recognition as sr

def takeCommand():
    r = sr.Recognizer()
    with sr.Microphone() as source:
        print('Escuchando...')
        r.pause_threshold = 0.7
        audio = r.listen(source)
        try:
            print("Recognizing")
            Query = r.recognize_google(audio, language='es-MX')
            print("Busqueda:",Query)
        except Exception as e:
            print(e)
            print("Prueba de nuevo")
            return "None"
        return Query
takeCommand()
