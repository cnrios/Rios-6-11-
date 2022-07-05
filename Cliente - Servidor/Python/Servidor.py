from socket import * 

direccionServidor = "localhost"
puertoServidor = 9099

socketServidor = socket( AF_INET, SOCK_STREAM )

socketServidor.bind( (direccionServidor, puertoServidor ))
socketServidor.listen()


while True:

    socketConexion, addr = socketServidor.accept()
    print("Conectado con un cliente ",addr)

    while True:
        mensajeRecibido = socketConexion.recv().decode()
        print(mensajeRecibido)

        if mensajeRecibido == "adios":
            break 
        socketConexion.send(input().encode())

    
    print("Desconectado el cliente ",addr)

    socketConexion.close()