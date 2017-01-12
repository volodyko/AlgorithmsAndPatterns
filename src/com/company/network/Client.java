package com.company.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by volodyko on 27.12.16.
 */
public class Client {
    public static void main(String[] args) {
        try {
            InetAddress localAdress = InetAddress.getLocalHost();

            try (Socket clientSocket = new Socket(localAdress, 6000);
                 PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                 BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                
            }
        } catch (IOException e) {

        }
    }
}
