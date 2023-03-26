
package SeedClicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickOfSeeds extends JFrame {
    private long hiScore = 0;
    private long score = 0;
    private long scoreIncrement = 1;
    private long _price = scoreIncrement * 200;
    private JLabel hiScoreLabel = new JLabel("Всього взято зерна: 0");
    private JLabel scoreLabel = new JLabel("Зерно: 0");
    private JLabel rateLabel = new JLabel("Рейт: x1 --> Ціна більшого рейта: 200");

    public ClickOfSeeds() {

        setLayout(new FlowLayout());
        JButton clickButton = new JButton("Взяти зерно!");
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hiScore += scoreIncrement;
                score += scoreIncrement;
                hiScoreLabel.setText("Всього взято зерна: " + hiScore);
                scoreLabel.setText("Зерно: " + score);
            }
        });
        JButton doubleButton = new JButton("Купити більший рейт");
        doubleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (score >= _price){
                    score -= _price;
                    scoreIncrement *= 2;
                    _price = scoreIncrement * 200;
                    rateLabel.setText("Рейт: x" + scoreIncrement + " --> Ціна більшого рейта: " + _price);
                    scoreLabel.setText("Зерно: " + score);
                }
            }
        });
        add(hiScoreLabel);
        add(scoreLabel);
        add(clickButton);
        add(rateLabel);
        add(doubleButton);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-getSize().width/2, dim.height/2-getSize().height/2);
        setSize(800, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClickOfSeeds();
    }
}
