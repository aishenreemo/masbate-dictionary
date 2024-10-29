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

public class QuizzesFrame extends JFrame {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 700;

    QuizzesFrame() {
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

        JLabel welcome = new JLabel("Quizzes");
        welcome.setFont(new Font("Arial", Font.BOLD, 40));
        welcome.setForeground(Palette.WHITE.getColor());
        welcome.setBounds(10, 5, 500, 55);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(null);

        JLabel quizzes = new JLabel("Test your knowledge!");
        quizzes.setFont(new Font("Arial", Font.BOLD, 80));
        quizzes.setBounds(70, 20, 1000, 100);
        quizzes.setForeground(Palette.ROYAL_BLUE.getColor());
        centerPanel.add(quizzes);


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

        JPanel quizPanel1 = new JPanel();
        quizPanel1.setLayout(null);
        quizPanel1.setBounds(40,250, 400, 300);
        quizPanel1.setBackground(Palette.ROYAL_BLUE.getColor());

        JLabel quizLabel1 = new JLabel("Quiz 1");
        quizLabel1.setFont(new Font("Arial", Font.PLAIN, 40));
        quizLabel1.setForeground(Palette.WHITE.getColor());
        quizLabel1.setBounds(140, 25, 500, 55);

        quizPanel1.add(quizLabel1);

        RoundedButton quizButton1 = new RoundedButton("PLAY", 200, 75, 10, 10);
        quizButton1.setBounds(95, 200, 200, 75);
        quizButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        quizButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new QuizzesFrame();
                dispose();
                System.out.println("Quiz Button clicked!");
            }
        });
        quizPanel1.add(quizButton1);

        JPanel quizPanel2 = new JPanel();
        quizPanel2.setLayout(null);
        quizPanel2.setBounds(545, 250, 400, 300);
        quizPanel2.setBackground(Palette.ROYAL_BLUE.getColor());

        JLabel quizLabel2 = new JLabel("Quiz 2");
        quizLabel2.setFont(new Font("Arial", Font.PLAIN, 40));
        quizLabel2.setForeground(Palette.WHITE.getColor());
        quizLabel2.setBounds(140, 25, 500, 55);

        quizPanel2.add(quizLabel2);

        RoundedButton quizButton2 = new RoundedButton("PLAY", 200, 75, 10, 10);
        quizButton2.setBounds(100, 200, 200, 75);
        quizButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        quizButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new QuizzesFrame();
                dispose();
                System.out.println("Quiz Button clicked!");
            }
        });
        quizPanel2.add(quizButton2);

        centerPanel.add(quizPanel1);
        centerPanel.add(quizPanel2);

        this.add(titlePanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
    }
}

