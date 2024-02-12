package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        try {
            // Création d'une socket TCP pour le serveur
            ServerSocket serverSocket = new ServerSocket(12345);

            System.out.println("Serveur TCP en attente de connexions...");

            // Attente de la connexion d'un client
            Socket clientSocket = serverSocket.accept();

            // Flux de lecture du client
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Lecture du message envoyé par le client
            String message = reader.readLine();

            System.out.println("Message reçu du client: " + message);

            // Fermeture des flux et des sockets
            reader.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
