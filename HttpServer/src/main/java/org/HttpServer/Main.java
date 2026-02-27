package org.HttpServer;

import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {
        final int PORT = 8080;
        final ServerSocket server = new ServerSocket(PORT);
        System.out.println("Server is listening to port: " + PORT);
        while (true) {
            final Socket client = server.accept();

            server.close();
        }

    }
}