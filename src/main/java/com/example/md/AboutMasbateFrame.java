package com.example.md;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutMasbateFrame extends JFrame {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 700;

    AboutMasbateFrame() {
        super();
        this.setTitle("Masbate Dictionary");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel();
        titlePanel.setPreferredSize(new Dimension(WIDTH, (int) (HEIGHT * 0.1)));
        titlePanel.setBackground(Palette.ROYAL_BLUE.getColor());
        titlePanel.setLayout(null);

        JLabel welcome = new JLabel("All about Masbate!");
        welcome.setFont(new Font("Arial", Font.BOLD, 40));
        welcome.setForeground(Palette.WHITE.getColor());
        welcome.setBounds(10, 5, 500, 55);

        RoundedButton returnButton = new RoundedButton("➜", 55, 40, 10, 10);
        returnButton.setBounds(925, 15, 55, 40);
        returnButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new App();
                dispose();
                System.out.println("Button clicked!");
            }
        });
        titlePanel.add(returnButton);
        titlePanel.add(welcome);

        this.add(titlePanel, BorderLayout.NORTH);
    }


}
