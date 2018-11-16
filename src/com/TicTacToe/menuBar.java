package com.TicTacToe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuBar extends JMenuBar {


    public menuBar(JFrame FrameName){
        super();
        JMenu file = new JMenu("Game");
        file.getAccessibleContext().setAccessibleDescription("Game options");
        add(file);

        JMenuItem menuItem = new JMenuItem("New Game");
        file.add(menuItem);
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LocalOrLan();
                FrameName.setVisible(false);
                FrameName.dispose();
            }
        });
        menuItem = new JMenuItem("Help");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameName.setVisible(false);
                FrameName.dispose();
            }
        });
        file.add(menuItem);
        menuItem = new JMenuItem("Exit");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
        file.add(menuItem);

        file.addSeparator();

        FrameName.setJMenuBar(this);
        file.setVisible(true);

    }
}
