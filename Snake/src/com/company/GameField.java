package com.company;

import javax.swing.*;
import java.awt.*; //чтобы картинки работали
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GameField extends JPanel implements ActionListener {
    private final int size = 320;
    private final int dot_size = 16;
    private final int all_dots = 400; // сколько всего точек может поместиться на экран
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int [] x = new int[all_dots]; //змея сама
    private int [] y = new int[all_dots];
    private int dots; //длина змейки
    private Timer timer;
    private int speed = 250;
    private static int score;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;


    public GameField(){
        setBackground(Color.black);
        loadImage(); //загрузили картинки
        initGame();
        addKeyListener(new FieldKey());
        setFocusable(true);

    }

    public void initGame(){ //инициализация игры
        dots = 3;
        for (int i = 0; i < dots; i++) {
            x[i] = 48 - i*dot_size; //начальная позиция х
            y[i] = 48;
        }

       timer = new Timer(speed,this);
           timer.start();

        createApple();
    }

    public void createApple(){
        appleX = new Random().nextInt(19)*dot_size; //столько позиций может быть на поле
        appleY = new Random().nextInt(19)*dot_size;
        for (int i = dots; i > 0 ; i--) {
            if (appleX == x[i] && appleY == y[i]) {
                createApple();
            }
        }


    }

    public void loadImage(){
        ImageIcon iia = new ImageIcon("fruit.png");
        apple = iia.getImage();
        ImageIcon iis = new ImageIcon("square.png");
        dot = iis.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) { //альт инсерт, оверрайд методс
        super.paintComponent(g); //перерисовка всего компонента
        if(inGame) {
            g.drawImage(apple,appleX,appleY,this);
            for (int i = 0; i < dots; i++) {
                g.drawImage(dot,x[i],y[i],this);

            }
            String Sc = new String("Score: " + score);
            g.setColor(Color.white);
            g.drawString(Sc,250,15);
        } else {
            String str = "Game Over";
            String s = "Your score: " + score;
            //Font f = new Font("Arial",14,Font.BOLD);
            g.setColor(Color.white);
            //g.setFont(f);
            g.drawString(str,125,150);
            g.drawString(s, 122, 170);
        }
    }


    public void  move() {
        for (int i = dots; i>0; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        if(left) {
            x[0] -= dot_size;
        }
        if(right) {
            x[0] += dot_size;
        }
        if(down) {
            y[0] += dot_size;
        }
        if(up) {
            y[0] -= dot_size;
        }

    }

    public void checkApple(){
        if (x[0] == appleX && y[0] == appleY){
            dots++;
            score ++;

            createApple();
        }
    }

    public void checkCollisions(){
        for (int i = dots; i > 0 ; i--) {
            if (i >4 && x[0] == x[i] && y[0] == y[i]) {
                inGame = false;
            }
        }
        if (x[0] > (size-20) || x[0] < 0 || y[0] > (size-20) || y[0] < 0) {
            inGame = false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(inGame){
            checkApple();
            checkCollisions();
            move();

        }
        repaint();
    }

    class FieldKey extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_LEFT && ! right) {
                left = true;
                up = false;
                down = false;
            }
            if(key == KeyEvent.VK_RIGHT && ! left) {
                right = true;
                up = false;
                down = false;
            }
            if(key == KeyEvent.VK_UP && ! down) {
                left = false;
                up = true;
                right = false;
            }
            if(key == KeyEvent.VK_DOWN && ! up) {
                left = false;
                right = false;
                down = true;
            }
        }
    }

}
