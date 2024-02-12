package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
        try {
            // Cr�ation d'une socket UDP pour le client
            DatagramSocket clientSocket = new DatagramSocket();

            // Adresse IP et port du serveur
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;

            // Message � envoyer
            String message = "Bonjour, serveur UDP!";

            // Conversion du message en tableau de bytes
            byte[] sendData = message.getBytes();

            // Cr�ation du paquet � envoyer
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

            // Envoi du paquet au serveur
            clientSocket.send(sendPacket);

            System.out.println("Message envoy� au serveur: " + message);

            // Fermeture de la socket
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
