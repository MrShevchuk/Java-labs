package lab31.CS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProxySession {
    public static void main(String[] args) throws IOException {
// create server socket
        try (ServerSocket serverSocket = new ServerSocket(8081);
             Socket clientSocket = serverSocket.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             ///================////
             ServerSocket serverSocket1 = new ServerSocket(8082);
             Socket clientSocket1 = serverSocket1.accept();
             BufferedReader in1 = new BufferedReader(new InputStreamReader(clientSocket1.getInputStream()));
             PrintWriter out1 = new PrintWriter(clientSocket1.getOutputStream(), true);) {
            String input1;
            String output1;
            String input;
            String output;
            System.out.println("Wait for messages");
            while ((input1 = in1.readLine()) != null) {
                if (input1.equalsIgnoreCase("exit")) break;
                out.println("Response ::: " + "echo ->" + input1);
                System.out.println(input1);
            }
        } catch (IOException e) {
            System.out.println("Error on server");
            System.exit(-1);
        }

    }
}