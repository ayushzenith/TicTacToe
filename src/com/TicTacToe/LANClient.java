package com.TicTacToe;

import java.net.*;
import java.io.*;

public class LANClient {

    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(String ip, int port) throws Exception{
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }
    public boolean checkConnection() throws Exception{
        out.println("hello server");
        String greeting = in.readLine();
        if ("hello challenger".equals(greeting)) {
            System.out.println("Joined server");
            return true;
        } else {
            out.println("unrecognised greeting");
            System.out.println("Failed to joined server");
            return false;
        }
    }
    public void sendMessage(String box) throws Exception{
        out.println(box);
    }

    public String recieveMessage() throws Exception{
        String resp = in.readLine();
        return resp;
    }
    public void stopConnection() throws Exception{
        in.close();
        out.close();
        clientSocket.close();
    }

}
