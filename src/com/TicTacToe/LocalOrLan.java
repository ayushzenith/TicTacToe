package com.TicTacToe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LocalOrLan extends JFrame{

    public LocalOrLan(){
        super();
        this.setTitle("TicTacToe2.0 by Ayush Zenith-Local or LAN");
        JButton button;

        button = new JButton("Single or Multiplayer?");
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

        button = new JButton("Local");
        this.setLayout(null);
        button.setBounds(18, 100, 120, 60);
        this.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Multiplayer();
                setVisible(false);
                dispose();
            }
        });

        button = new JButton("LAN");
        this.setLayout(null);
        button.setBounds(250, 100, 120, 60);
        this.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ServerOrHost();
                setVisible(false);
                dispose();
            }
        });

        this.setBounds(500,200,400,400);
        new menuBar(this);
        this.setVisible(true);
        System.out.println("Local or LAN window!");

    }

}
