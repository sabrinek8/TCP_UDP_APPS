package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
        try {
            // Création d'une socket UDP pour le client
            DatagramSocket clientSocket = new DatagramSocket();

            // Adresse IP et port du serveur
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;

            // Message à envoyer
            String message = "Bonjour, serveur UDP!";

            // Conversion du message en tableau de bytes
            byte[] sendData = message.getBytes();

            // Création du paquet à envoyer
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

            // Envoi du paquet au serveur
            clientSocket.send(sendPacket);

            System.out.println("Message envoyé au serveur: " + message);

            // Fermeture de la socket
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
