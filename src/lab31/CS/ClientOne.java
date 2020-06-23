package lab31.CS;

import java.io.*;
import java.net.*;

public class ClientOne {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter to send message to server. Write ‘exit’ to close");
        try (Socket connectToServerSocket = new Socket("localhost", 8081);
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(connectToServerSocket.getInputStream())
             );
             PrintWriter out = new PrintWriter(connectToServerSocket.getOutputStream(), true);
             BufferedReader inu = new BufferedReader(new InputStreamReader(System.in));) {
            String userInput;
            String  serverOutput;

            while ((userInput = inu.readLine()) != null) {
                out.println(userInput);
                serverOutput = in.readLine();
                System.out.println(serverOutput);
                if (userInput.equalsIgnoreCase("exit")){
                    break;
                }
            }
        }
    }
}
