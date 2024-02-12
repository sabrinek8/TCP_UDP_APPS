package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        try {
            // Cr�ation d'une socket UDP pour le serveur
            DatagramSocket serverSocket = new DatagramSocket(9876);

            byte[] receiveData = new byte[1024];

            System.out.println("Serveur UDP en attente...");

            while (true) {
                // R�ception du paquet depuis le client
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);

                // Extraction des donn�es re�ues
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());

                System.out.println("Message re�u du client: " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
