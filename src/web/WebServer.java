package web;

import com.sun.net.httpserver.HttpServer;
import exercises.ServerConfiguration;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class WebServer {

    public void startServer() throws IOException {
        HttpServer httpServer = HttpServer.create(ServerConfiguration.getInstance().getServerAddress(), 0);

        httpServer.createContext("/greeting").setHandler(exchange -> {

            String responseMessage = ServerConfiguration.getInstance().getGreetingMessage();

            exchange.sendResponseHeaders(200, responseMessage.length());

            OutputStream responseBody = exchange.getResponseBody();

            responseBody.write(responseMessage.getBytes());
            responseBody.flush();
            responseBody.close();
        });

        InetSocketAddress serverAddress = ServerConfiguration.getInstance().getServerAddress();


        System.out.printf("Starting server on address %s:%d%n",
                serverAddress.getHostName(),
                serverAddress.getPort());

        httpServer.start();
    }
}
