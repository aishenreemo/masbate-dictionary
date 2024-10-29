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

public class DictionaryFrame extends JFrame {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 700;

    DictionaryFrame() {
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

        JLabel welcome = new JLabel("Dictionary");
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

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(null);
        JLabel vocabulary = new JLabel("Expand your Vocabulary!");
        vocabulary.setFont(new Font("Arial", Font.BOLD, 65));
        vocabulary.setBounds(70, 20, 1000, 100);
        vocabulary.setForeground(Palette.ROYAL_BLUE.getColor());
        centerPanel.add(vocabulary);

        JPanel wordPanel = new JPanel();
        wordPanel.setLayout(null);
        wordPanel.setBounds(40,125, 400, 400);
        wordPanel.setBackground(Palette.ROYAL_BLUE.getColor());

        JLabel wotdLabel= new JLabel("Word of the Day!");
        wotdLabel.setFont(new Font("Arial", Font.BOLD, 40));
        wotdLabel.setBounds(70, 125, 1000, 100);
        wotdLabel.setForeground(Palette.WHITE.getColor());
        centerPanel.add(wotdLabel);

        JLabel letterLabel = new JLabel("Words that start with...");
        letterLabel.setFont(new Font("Arial", Font.BOLD, 40));
        letterLabel.setBounds(455, 125, 1000, 100);
        letterLabel.setForeground(Palette.ROYAL_BLUE.getColor());
        centerPanel.add(letterLabel);

        centerPanel.add(wordPanel);
        this.add(titlePanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
    }


}
