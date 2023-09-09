package com.greatspace.view;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;


public class Window {

    public Window() {

        JFrame frame = new JFrame("Great Space");
        Game f = new Game();
       
        
        f.checkPlayer();
        frame.add(f);
        frame.setJMenuBar(f.centralMenue());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,420);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        try {
            URL url = getClass().getResource("../sprites/gsicon.png");
            BufferedImage image = ImageIO.read(url);
            frame.setIconImage(image);
        } catch (IOException e) {
            System.out.println("ImageError: " + e);
        }
        frame.setVisible(true);
    }

    public static void main(String[] args) {
       
       java.awt.EventQueue.invokeLater(() -> {
            Window window = new Window();
        });

    }
}
