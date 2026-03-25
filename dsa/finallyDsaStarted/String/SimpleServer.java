package finallyDsaStarted.String;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(8080);
        System.out.println("Server started on port 8080");

        while (true) {
            Socket socket = server.accept();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            OutputStream out = socket.getOutputStream();

            // Read request (just print it)
            String line;
            while (!(line = in.readLine()).isEmpty()) {
                System.out.println(line);
            }

            // Send simple response
            String response = "Hello from Java Server onkar shirsekar";

            String httpResponse =
                    "HTTP/1.1 200 OK\r\n" +
                    "Content-Length: " + response.length() + "\r\n" +
                    "\r\n" +
                    response;

            out.write(httpResponse.getBytes());

            socket.close();
        }
    }
}