/***********************************
 * Alfredo Ceballos
 * CS 380 - Computer Networks
 * Professor Nima Davarpanah
 * Project 6
************************************/

import java.io.*;
import java.net.*;

public class TicTacToeClient {
    public static void main(String[] args) {
        try(Socket socket = new Socket("18.221.102.182", 38006)) {
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            Message connectMsg = new ConnectMessage("Major Tom");
            out.writeObject(connectMsg);
            CommandMessage cmdMsg = new CommandMessage(CommandMessage.Command.NEW_GAME);
            out.writeObject(cmdMsg);
            
            // Thread to handle reading messages from the server
            Runnable serverMsgThread = () -> {
                try {
                    Message servMsg = null;
                    
                } catch(Exception e) {
                    System.out.println("Something broke...");
                    e.printStackTrace();
                }
            }; // End of serverMsgThread
            
        } catch(Exception e) {
            System.out.println("Error occurred...");
            e.printStackTrace();
        }
    }
}