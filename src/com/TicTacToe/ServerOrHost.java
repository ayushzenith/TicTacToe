package com.TicTacToe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerOrHost extends JFrame {

    public ServerOrHost(){
       super();
       this.setTitle("TicTacToe2.0 by Ayush Zenith-Server or host");
       JButton button;


       button = new JButton("Host or Client?");
       this.setLayout(null);
       button.setBounds(100,25,180,30);
       this.add(button);
       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.out.println("Please select one of the buttons below");
               setVisible(false);
               dispose();
           }
       });

       button = new JButton("Host");
       this.setLayout(null);
       button.setBounds(18, 100, 120, 60);
       this.add(button);
       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try {
                   new LANServerUse();
               } catch (Exception e1) {
                   e1.printStackTrace();
               }
               setVisible(false);
               dispose();
           }
       });

        button = new JButton("Client");
        this.setLayout(null);
        button.setBounds(250, 100, 120, 60);
        this.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new LANClientUse();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                setVisible(false);
                dispose();
            }
        });

        this.setBounds(500,200,400,400);
        new menuBar(this);
        this.setVisible(true);
        System.out.println("Host or Client window!");

    }

}
