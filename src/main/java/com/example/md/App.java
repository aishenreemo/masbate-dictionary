package com.example.md;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App extends JFrame {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 700;

    App() {
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

        JLabel welcome = new JLabel("Maayong Adlaw!");
        welcome.setFont(new Font("Arial", Font.BOLD, 40));
        welcome.setForeground(Palette.WHITE.getColor());
        welcome.setBounds(10, 5, 500, 55);

        titlePanel.add(welcome);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(null);
        JLabel explore = new JLabel("Explore: Masbate");
        explore.setFont(new Font("Arial", Font.BOLD, 80));
        explore.setBounds(140, 100, 1000, 90);
        explore.setForeground(Palette.ROYAL_BLUE.getColor());
        centerPanel.add(explore);

        JTextField searchField = new JTextField(20);
        searchField.setToolTipText("Enter your search query");
        searchField.setBounds(100, 200, 600, 50);
        searchField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        centerPanel.add(searchField);

        RoundedButton searchButton = new RoundedButton("Search", 150, 150, 10, 10);
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(725, 200, 150, 50);
        searchButton.setFont(new Font("Arial", Font.PLAIN, 20));
        searchButton.setBackground(Palette.ROYAL_BLUE.getColor());
        searchButton.setForeground(Palette.WHITE.getColor());
        centerPanel.add(searchButton);

        JLabel clickableLabel = new JLabel("Give me a random word!");
        clickableLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        clickableLabel.setBounds(100, 250, 300, 50);
        clickableLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        clickableLabel.setForeground(Palette.ROYAL_BLUE.getColor());
        centerPanel.add(clickableLabel);

        //ImageIcon quiz = new ImageIcon("/resources/quizIcon.png");
        //JLabel quizLabel = new JLabel(quiz);
        //quizLabel.setBounds(20, 20, 50, 50);

        JPanel quizPanel = new JPanel();
        quizPanel.setLayout(null);
        quizPanel.setBounds(40,350, 300, 150);
        quizPanel.setBackground(Palette.ROYAL_BLUE.getColor());
        //quizPanel.add(quizLabel);

        RoundedButton quizButton = new RoundedButton("➜", 55, 40, 10, 10);
        quizButton.setBounds(235, 100, 55, 40);
        quizButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        quizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new QuizzesFrame();
                dispose();
                System.out.println("Quiz Button clicked!");
            }
        });
        quizPanel.add(quizButton);

        centerPanel.add(quizPanel);


        RoundedPanel dictionaryPanel = new RoundedPanel();
        dictionaryPanel.setBounds(350,350, 300, 150);
        dictionaryPanel.setBackground(Palette.ROYAL_BLUE.getColor());
        centerPanel.add(dictionaryPanel);

        RoundedButton dictionaryButton = new RoundedButton("➜", 55, 40, 10, 10);
        dictionaryButton.setBounds(235, 100, 55, 40);
        dictionaryButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dictionaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DictionaryFrame();
                dispose();
                System.out.println("Quiz Button clicked!");
            }
        });
        dictionaryPanel.add(dictionaryButton);


        RoundedPanel aboutPanel = new RoundedPanel();
        aboutPanel.setBounds(660,350, 300, 150);
        aboutPanel.setBackground(Palette.ROYAL_BLUE.getColor());

        RoundedButton aboutButton = new RoundedButton("➜", 55, 40, 10, 10);
        aboutButton.setBounds(235, 100, 55, 40);
        aboutButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AboutMasbateFrame();
                dispose();
                System.out.println("Quiz Button clicked!");
            }
        });
        aboutPanel.add(aboutButton);

        centerPanel.add(aboutPanel);

        this.add(titlePanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new App();
    }
}

enum Palette {
    BLACK("#131718"),
    WHITE("#FFFFFF"),
    ROYAL_BLUE("#3477ad"),
    GOLDEN_YELLOW("#F8CF40");

    private String hexcode;

    private Palette(String hexcode) {
        this.hexcode = hexcode;
    }

    public Color getColor() {
        return Color.decode(this.hexcode);
    }
}
