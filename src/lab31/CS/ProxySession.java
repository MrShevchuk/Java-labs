package lab31.CS;

import java.io.*;
import java.net.*;

public class ProxySession {

    public static void main(String[] args) throws IOException {
// create server socket
        try (ServerSocket serverSocket = new ServerSocket(8888);
             Socket clientSocket = serverSocket.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);) {
            String input;
            String output;

            System.out.println("Wait for messages");

            while ((input = in.readLine()) != null) {
                if (input.equalsIgnoreCase("exit")) break;
                out.println("Response ::: " + "echo ->" + input);
                System.out.println(input);
            }
        }
        try {
            ServerSocket serverSocket1 = new ServerSocket(8881);
            Socket clientSocket1 = serverSocket1.accept();
            BufferedReader in1 = new BufferedReader(new InputStreamReader(clientSocket1.getInputStream()));
            PrintWriter out1 = new PrintWriter(clientSocket1.getOutputStream(), true);
            {
                String input1;
                String output1;

                while ((input1 = in1.readLine()) != null) {
                    if (input1.equalsIgnoreCase("exit")) break;
                    out1.println("Response1 ::: " + "echo ->" + input1);
                    System.out.println(input1);
                }
            }
        } catch (IOException e) {
            System.out.println("Error on server");
            System.exit(-1);
        }
    }
}
