import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_socket2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1999);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket);

                ClientHandler clientHandler = new ClientHandler(clientSocket);
                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}