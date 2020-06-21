package lab31.CS;

import javax.crypto.spec.PSource;
import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter to send message to server. Write ‘exit’ to close");

        try (Socket connectToServerSocket = new Socket("localhost", 8888);
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(connectToServerSocket.getInputStream())
             );
             PrintWriter out = new PrintWriter(connectToServerSocket.getOutputStream(), true);
             BufferedReader inu = new BufferedReader(new InputStreamReader(System.in));) {
            String userInput, serverOutput;

            while ((userInput = inu.readLine()) != null) {
                out.println(userInput);
                serverOutput = in.readLine();
                System.out.println(serverOutput);
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }

            Socket connectToServerSocket1 = new Socket("localhost", 8881);
            BufferedReader in1 = new BufferedReader(
                    new InputStreamReader(connectToServerSocket1.getInputStream())
            );
            PrintWriter out1 = new PrintWriter(connectToServerSocket1.getOutputStream(), true);
            BufferedReader inu1 = new BufferedReader(new InputStreamReader(System.in));
            {
                String userInput1, serverOutput1;

                    while ((userInput1 = inu1.readLine()) != null) {
                        out1.println(userInput1);
                        serverOutput1 = in1.readLine();
                        System.out.println(serverOutput1);
                        if (userInput1.equalsIgnoreCase("exit1")) {
                            break;
                        }
                    }
                }
            }
        }
    }
}
