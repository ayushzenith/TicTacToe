package com.TicTacToe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Multiplayer extends JFrame{

    private String turn = "X";
    private JButton button1 = new JButton();
    private JButton button2 = new JButton();
    private JButton button3 = new JButton();
    private JButton button4 = new JButton();
    private JButton button5 = new JButton();
    private JButton button6 = new JButton();
    private JButton button7 = new JButton();
    private JButton button8 = new JButton();
    private JButton button9 = new JButton();

    public Multiplayer(){
        super();
        this.setTitle("TicTacToe2.0 by Ayush Zenith-Local");
        System.out.println("Gamemode:Multi Player!");


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
                System.out.println(turn);
                if (turn == "X") {
                    button1.setText("X");
                } else {
                    button1.setText("Y");
                }
                button1.setEnabled(false);
                turn = (turn == "X") ? "Y" : "X";
                System.out.println(turn);
                boolean winner=checkWin();
                if (winner==true){
                    System.out.println("YAYAY we have a winner");
                    System.exit(1);
                }

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (turn == "X") {
                    button2.setText("X");
                } else {
                    button2.setText("Y");
                }
                button2.setEnabled(false);
                turn = (turn == "X") ? "Y" : "X";
                System.out.println(turn);
                boolean winner=checkWin();
                if (winner==true){
                    System.out.println("YAYAY we have a winner");
                    System.exit(1);
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (turn == "X") {
                    button3.setText("X");
                } else {
                    button3.setText("Y");
                }
                button3.setEnabled(false);
                turn = (turn == "X") ? "Y" : "X";
                System.out.println(turn);
                boolean winner=checkWin();
                if (winner==true){
                    System.out.println("YAYAY we have a winner");
                    System.exit(1);
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (turn == "X") {
                    button4.setText("X");
                } else {
                    button4.setText("Y");
                }
                button4.setEnabled(false);
                turn = (turn == "X") ? "Y" : "X";
                System.out.println(turn);
                boolean winner=checkWin();
                if (winner==true){
                    System.out.println("YAYAY we have a winner");
                    System.exit(1);
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (turn == "X") {
                    button5.setText("X");
                } else {
                    button5.setText("Y");
                }
                button5.setEnabled(false);
                turn = (turn == "X") ? "Y" : "X";
                System.out.println(turn);
                boolean winner=checkWin();
                if (winner==true){
                    System.out.println("YAYAY we have a winner");
                    System.exit(1);
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (turn == "X") {
                    button6.setText("X");
                } else {
                    button6.setText("Y");
                }
                button6.setEnabled(false);
                turn = (turn == "X") ? "Y" : "X";
                System.out.println(turn);
                boolean winner=checkWin();
                if (winner==true){
                    System.out.println("YAYAY we have a winner");
                    System.exit(1);
                }
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (turn == "X") {
                    button7.setText("X");
                } else {
                    button7.setText("Y");
                }
                button7.setEnabled(false);
                turn = (turn == "X") ? "Y" : "X";
                System.out.println(turn);
                boolean winner=checkWin();
                if (winner==true){
                    System.out.println("YAYAY we have a winner");
                    System.exit(1);
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (turn == "X") {
                    button8.setText("X");
                } else {
                    button8.setText("Y");
                }
                button8.setEnabled(false);
                turn = (turn == "X") ? "Y" : "X";
                System.out.println(turn);
                boolean winner=checkWin();
                if (winner==true){
                    System.out.println("YAYAY we have a winner");
                    System.exit(1);
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (turn == "X") {
                    button9.setText("X");
                } else {
                    button9.setText("Y");
                }
                button9.setEnabled(false);
                turn = (turn == "X") ? "Y" : "X";
                boolean winner=checkWin();
                if (winner==true){
                    System.out.println("YAYAY we have a winner");
                    System.exit(1);
                }
                System.out.println(turn);
            }
        });
        this.setBounds(500,200,400,450);
        new menuBar(this);
        this.setVisible(true);
        System.out.println("Multiplayer!");
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
