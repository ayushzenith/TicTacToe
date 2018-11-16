package com.TicTacToe;
import java.net.*;
import java.io.*;

public class LANServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws Exception{
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public boolean check() throws Exception{
        String greeting = in.readLine();
        if ("hello server".equals(greeting)) {
            out.println("hello challenger");
            System.out.println("New challenger joined server");
            return true;
        } else {
            out.println("unrecognised greeting");
            System.out.println("New challenger failed to joined server");
            return false;
        }
    }

    public void send(String box) throws Exception{
        out.println(box);
    }

    public String recieve() throws Exception{
        String  resp = in.readLine();
        return resp;
    }

    public void stop() throws Exception{
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
}
