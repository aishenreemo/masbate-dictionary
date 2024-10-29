package com.example.md;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

class RoundedBorder implements Border {

    private int radius;

    public RoundedBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius + 1);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.setColor(c.getForeground());
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}

class RoundedPanel extends JPanel {

    public RoundedPanel() {
        this.setLayout(null);
        setOpaque(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);
    }
}
class RoundedButton extends JButton {
    private int arcWidth;
    private int arcHeight;

    public RoundedButton(String text, int width, int height, int arcWidth, int arcHeight) {
        super(text);
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
        this.setFont(new Font("Arial", Font.PLAIN, 20));
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        setContentAreaFilled(false); // Important: Set to false for custom painting
        setBorder(null);
        setForeground(Palette.ROYAL_BLUE.getColor());
        setBackground(Palette.WHITE.getColor());

        Dimension buttonSize = new Dimension(width, height);
        setPreferredSize(buttonSize);
        setMaximumSize(buttonSize);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 

        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 
                0, getWidth(), getHeight(), arcWidth, arcHeight);
        super.paintComponent(g2d);
        g2d.dispose();
    }
}
