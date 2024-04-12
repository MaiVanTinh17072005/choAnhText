import java.io.*;
import java.net.*;

public class Client_socket2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1999);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Received: " + message);
            }

            in.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
