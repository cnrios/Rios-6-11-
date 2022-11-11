from socket import *
import  sys


IPServidor = "localhost"
puertoServidor = 9099

socketCliente = socket(AF_INET, SOCK_STREAM)
socketCliente.connect((IPServidor,puertoServidor))

while True:

    mensaje = input()
    if mensaje == 'adios':

        socketCliente.send(mensaje.encode())

        respuesta = socketCliente.recv(4096).decode()

        print(respuesta)
    
    else:
        socketCliente.send(mensaje.encode())

        socketCliente.close()
        sys.exit