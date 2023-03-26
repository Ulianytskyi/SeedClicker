
package SeedClicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SeedClicker2 extends JFrame {
    private long hiScore = 0;
    private long score = 0;
    private long scoreIncrement = 1;
    private long _price = scoreIncrement * 100;
    private JLabel hiScoreLabel = new JLabel("Hi-Score: 0");
    private JLabel scoreLabel = new JLabel("Score: 0");
    private JLabel currRateLabel = new JLabel("Current Rate: x1");
    private JLabel nextRateLabel = new JLabel("Next Rate Price: 100");

    public SeedClicker2() {

        setLayout(new FlowLayout());
        JButton clickButton = new JButton("Click me!");
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hiScore += scoreIncrement;
                score += scoreIncrement;
                hiScoreLabel.setText("Hi-Score: " + hiScore);
                scoreLabel.setText("Score: " + score);
            }
        });
        JButton doubleButton = new JButton("Double increment!");
        doubleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //if (_price > score){
                    if (score >= _price){
                        score -= _price;
                        scoreIncrement *= 2;
                        _price = scoreIncrement * 100;
                        currRateLabel.setText("Rate: x" + scoreIncrement);
                        nextRateLabel.setText("Next Rate Price: " + _price);
                        scoreLabel.setText("Score: " + score);
                    }
                //}
            }
        });
        add(hiScoreLabel);
        add(scoreLabel);
        add(clickButton);
        add(currRateLabel);
        add(nextRateLabel);
        add(doubleButton);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-getSize().width/2, dim.height/2-getSize().height/2);
        setSize(800, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SeedClicker2();
    }
}
