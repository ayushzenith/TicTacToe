package com.TicTacToe;

import javax.swing.*;

public class Welcome extends JFrame {
    public Welcome(){
        super();
        this.setTitle("TicTacToe2.0 by Ayush Zenith");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel welcomeMessage = new JLabel("Welcome to TicTacToe2.0 by Ayush Zenith");
        welcomeMessage.setHorizontalAlignment(JLabel.CENTER);
        this.add(welcomeMessage);
        this.setBounds(500,200,300,300);
        new menuBar(this);
        this.setVisible(true);
        System.out.println("Welcome Screen!");
    }
}
