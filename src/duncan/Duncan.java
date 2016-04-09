/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duncan;//package name

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Duncan extends JApplet implements ActionListener, KeyListener {

    Graphics2D myPic;
    Image dbImage, master;
    private Graphics dbg;
    Timer timer;
    int var;

    public Duncan() {//program name
        timer = new Timer(60, this);
        timer.setInitialDelay(100);     //starts timer
        timer.start();
        Timer timer = new Timer(2000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //this will run every 2 seconds
            }

        });
        /**
         * @param args the command line arguments
         */        
    }

    public static void main(String[] args) {
        JFrame f = new JFrame(""); //name on program
        JApplet applet = new Duncan();        //sets up the window
        f.getContentPane().add("Center", applet);
        applet.init();
        f.pack();
        f.setSize(925, 777);     //sets the window size
        f.setVisible(true); //makes it visible
        f.setResizable(false);//makes in unsizable
        f.setBounds(400, 25, 925, 757);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //stops program if you x out the window    
    }

    public void paint(Graphics g) {
        dbImage = createImage(getWidth(), getHeight());      //creats and image the size of the screen
        dbg = dbImage.getGraphics();        //double buffers the panel
        paintComponent(dbg);
        g.drawImage(dbImage, 0, 0, this);
    }

    public void paintComponent(Graphics g) {
        myPic = (Graphics2D) g;

        //draw here
        myPic.fillRect(300, 700, 30, 12);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        requestFocus();
        setFocusTraversalKeysEnabled(false);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //
    }

}

