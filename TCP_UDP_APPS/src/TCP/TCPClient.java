package TCP;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        try {
            // Connexion au serveur sur le port spécifié
            Socket socket = new Socket("localhost", 12345);

            // Flux d'écriture vers le serveur
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // Message à envoyer au serveur
            String message = "Bonjour, serveur TCP!";

            // Envoi du message au serveur
            writer.println(message);

            System.out.println("Message envoyé au serveur: " + message);

            // Fermeture des flux et de la socket
            writer.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
