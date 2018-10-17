package org.zach.swing;

import javax.swing.*;

public class SwingDemo {
    SwingDemo() {
        JFrame jFrame = new JFrame("A Simple Swing Application");

        jFrame.setSize(275, 100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel(" Swing defines the modern Java GUI.");

        jFrame.add(jLabel);

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
