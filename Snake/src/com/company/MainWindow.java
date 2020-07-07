package com.company;

import javax.swing.*;

public class MainWindow extends JFrame { // для создания окна

    public MainWindow() {


        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // чтобы на крестик - выход
        setSize(320,345);
        setLocation(400,400);


        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
	MainWindow mW = new MainWindow();

    }
}
