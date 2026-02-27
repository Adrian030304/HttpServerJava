package org.HttpServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        final int PORT = 8080;
        final ServerSocket server = new ServerSocket(PORT);
        System.out.println("Server is listening to port: " + PORT);
        while (true) {
            try (Socket socket = server.accept()) {
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
            }
        }

    }
}