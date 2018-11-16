package com.TicTacToe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LANServerUse extends JFrame {
    private JButton button1 = new JButton();
    private JButton button2 = new JButton();
    private JButton button3 = new JButton();
    private JButton button4 = new JButton();
    private JButton button5 = new JButton();
    private JButton button6 = new JButton();
    private JButton button7 = new JButton();
    private JButton button8 = new JButton();
    private JButton button9 = new JButton();
    private LANServer lanserver = new LANServer();

    public LANServerUse() throws Exception {
        super();

        lanserver.start(6666);
        boolean checkClient = lanserver.check();
        if (checkClient == true) {
            System.out.println("Server check");
        } else {
            System.out.println("Server check failed");
        }

        this.setTitle("TicTacToe2.0 by Ayush Zenith-LANSERVER");

        System.out.println("Gamemode:MultiPlayer!");
        button1.setText(null);
        setLayout(null);
        button1.setBounds(25, 25, 100, 100);
        add(button1);


        button2.setText(null);
        setLayout(null);
        button2.setBounds(150, 25, 100, 100);
        add(button2);


        button3.setText(null);
        setLayout(null);
        button3.setBounds(275, 25, 100, 100);
        add(button3);


        button4.setText(null);
        setLayout(null);
        button4.setBounds(25, 150, 100, 100);
        add(button4);


        button5.setText(null);
        setLayout(null);
        button5.setBounds(150, 150, 100, 100);
        add(button5);


        button6.setText(null);
        setLayout(null);
        button6.setBounds(275, 150, 100, 100);
        add(button6);


        button7.setText(null);
        setLayout(null);
        button7.setBounds(25, 275, 100, 100);
        add(button7);


        button8.setText(null);
        setLayout(null);
        button8.setBounds(150, 275, 100, 100);
        add(button8);


        button9.setText(null);
        setLayout(null);
        button9.setBounds(275, 275, 100, 100);
        add(button9);

        this.setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText("Y");
                button1.setEnabled(false);
                try {
                    lanserver.send("1");
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                try {
                    waitForResponse();
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                if (checkWin()==true){
                    System.out.println("WINNER");
                    System.exit(1);
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2.setText("Y");
                button2.setEnabled(false);
                try {
                    lanserver.send("2");
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                try {
                    waitForResponse();
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                if (checkWin()==true){
                    System.out.println("WINNER");
                    System.exit(1);
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3.setText("Y");
                button3.setEnabled(false);
                try {
                    lanserver.send("3");
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                try {
                    waitForResponse();
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                if (checkWin()==true){
                    System.out.println("WINNER");
                    System.exit(1);
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4.setText("Y");
                button4.setEnabled(false);
                try {
                    lanserver.send("4");
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                try {
                    waitForResponse();
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                if (checkWin()==true){
                    System.out.println("WINNER");
                    System.exit(1);
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button5.setText("Y");
                button5.setEnabled(false);
                try {
                    lanserver.send("5");
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                try {
                    waitForResponse();
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                if (checkWin()==true){
                    System.out.println("WINNER");
                    System.exit(1);
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button6.setText("Y");
                button6.setEnabled(false);
                try {
                    lanserver.send("6");
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                try {
                    waitForResponse();
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                if (checkWin()==true){
                    System.out.println("WINNER");
                    System.exit(1);
                }
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button7.setText("Y");
                button7.setEnabled(false);
                try {
                    lanserver.send("7");
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                try {
                    waitForResponse();
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                if (checkWin()==true){
                    System.out.println("WINNER");
                    System.exit(1);
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button8.setText("Y");
                button8.setEnabled(false);
                try {
                    lanserver.send("8");
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                try {
                    waitForResponse();
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                if (checkWin()==true){
                    System.out.println("WINNER");
                    System.exit(1);
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button9.setText("Y");
                button9.setEnabled(false);
                try {
                    lanserver.send("9");
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                try {
                    waitForResponse();
                } catch (Exception e1) {
                    System.out.println("error");
                    e1.printStackTrace();
                }
                if (checkWin()==true){
                    System.out.println("WINNER");
                    System.exit(1);
                }
            }
        });

        this.setBounds(500, 200, 400, 450);
        new menuBar(this);
        this.setVisible(true);
        System.out.println("Multiplayer!");

    }

    private void waitForResponse() throws Exception {

        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);

        String x = lanserver.recieve();
        System.out.println(x);

        if (x.equals("1")) {
            button1.setText("X");
        } else if (x.equals("2")) {
            button2.setText("X");
        } else if (x.equals("3")) {
            button3.setText("X");
        } else if (x.equals("4")) {
            button4.setText("X");
        } else if (x.equals("5")) {
            button5.setText("X");
        } else if (x.equals("6")) {
            button6.setText("X");
        } else if (x.equals("7")) {
            button7.setText("X");
        } else if (x.equals("8")) {
            button8.setText("X");
        } else if (x.equals("9")) {
            button9.setText("X");
        }

        if ((button1.getText()) == null) {
            button1.setEnabled(true);
        }
        if ((button2.getText()) == null) {
            button2.setEnabled(true);
        }
        if ((button3.getText()) == null) {
            button3.setEnabled(true);
        }
        if ((button4.getText()) == null) {
            button4.setEnabled(true);
        }
        if ((button5.getText()) == null) {
            button5.setEnabled(true);
        }
        if ((button6.getText()) == null) {
            button6.setEnabled(true);
        }
        if ((button7.getText()) == null) {
            button7.setEnabled(true);
        }
        if ((button8.getText()) == null) {
            button8.setEnabled(true);
        }
        if ((button9.getText()) == null) {
            button9.setEnabled(true);
        }

    }
    public boolean checkWin() {

        if(button1.getText()!=null){
            if ((button1.getText() == button2.getText())&&(button2.getText()==button3.getText())){
                System.out.println("Yay! line 1 horizontal");
                return true;
            }
            if ((button1.getText()==button5.getText())&&(button5.getText()==button9.getText())){
                System.out.println("Yay! line 1 diagonal");
                return true;
            }
            if ((button1.getText()==button4.getText())&&(button4.getText()==button9.getText())){
                System.out.println("Yay! line 1 vertical");
                return true;
            }
        }
        if (button2.getText()!=null){
            if ((button2.getText()==button5.getText())&&(button5.getText()==button8.getText())){
                System.out.println("Yay! line 2 vertical");
                return true;
            }
        }
        if (button3.getText()!=null){
            if ((button3.getText()==button5.getText())&&(button5.getText()==button7.getText())){
                System.out.println("Yay! line 3 vertical");
                return true;
            }
            if ((button3.getText()==button6.getText())&&(button6.getText()==button9.getText())){
                System.out.println("Yay! line 2 diagonal");
                return true;
            }
        }
        if (button4.getText()!=null){
            if ((button4.getText()==button5.getText())&&(button5.getText()==button6.getText())){
                System.out.println("Yay! line 2 horizontal");
                return true;
            }
        }
        if (button7.getText()!=null){
            if ((button7.getText()==button8.getText())&&(button8.getText()==button9.getText())){
                System.out.println("Yay! line 3 horizontal");
                return true;
            }

        }
        return false;

    }
}
