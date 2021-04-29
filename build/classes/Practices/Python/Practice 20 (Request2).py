from requests import get, post

if __name__ == "__main__":

    url = "http://httpbin.org/get"

    data = {
        "nombre":"tu_nombre",
        "apellido":"tu_apellido"
    } 

    response = get(url)
    
    #respuesta del servidor a la peticion get
    print("contenido de la respuesta del servidor:\n")
    print(response.text)
    
    #trabajar con la respuesta json del servidor
    json_response = response.json()
    print("valor de la llave origin")
    print(json_response['origin'])

    #usar metodo post y enviarle parametros dentro de los headers
    url = "http://httpbin.org/post"
    response = post(url, headers=data)

    #respuesta del servidor donde vemos en donde se envian los datos enviados con el metodo post
    print(response.text)