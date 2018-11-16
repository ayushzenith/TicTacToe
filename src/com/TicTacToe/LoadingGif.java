package com.TicTacToe;

import javax.swing.*;

public class LoadingGif {
    public LoadingGif(){
        JWindow loading = new JWindow();

        loading.getContentPane().add(new JLabel("", new ImageIcon(LoadingGif.class.getClassLoader().getResource("tictactoegif.gif")), SwingConstants.CENTER));
        loading.setBounds(400, 100, 600, 600);
        loading.setVisible(true);
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        loading.setVisible(false);
        loading.dispose();
    }
}
