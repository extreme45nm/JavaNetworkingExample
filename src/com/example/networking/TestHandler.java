package com.example.networking;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

/**
 * Created by KTNVI on 25/7/2016.
 */
public class TestHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String message = "<html><h2> This is the fvcking response</h2><html>";
        httpExchange.sendResponseHeaders(200,message.length());
    }
}
