/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author wy521
 */
public class CardLayoutDemo extends Frame implements ActionListener, MouseListener {

    Panel cards, buttons;
    CardLayout cardLO;
    Button card1, card2, card3;

    public void init() {
        card1 = new Button("The Matrix 1");
        card2 = new Button("The Matrix 2");
        card3 = new Button("The Matrix 3");
        card1.setVisible(true);
        card2.setVisible(true);
        card3.setVisible(true);
        this.add(card1);
        this.add(card2);
        this.add(card3);

        cardLO = new CardLayout();
        cards = new Panel();
        cards.setLayout(cardLO);

        Font font = new Font("Dialog", Font.PLAIN, 24);

        cards.add(createCard("The Matrix 1 -- First Chapter", Color.BLUE, font), "The Matrix 1");
        cards.add(createCard("The Matrix 2 -- RELOADED", Color.GREEN, font), "The Matrix 2");
        cards.add(createCard("The Matrix 3 -- REVOLUTION", Color.RED, font), "The Matrix 3");

        add(cards);

        card1.addActionListener(this);
        card2.addActionListener(this);
        card3.addActionListener(this);

    }

    private Label createCard(String text, Color bgColor, Font font) {
        Label label = new Label(text);
        label.setBackground(bgColor);
        label.setFont(font);
        return label;
    }

    public String getTitle() {
        return "演示CardLayoutDemo";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof Button) {
            String label = ((Button) e.getSource()).getLabel();
            cardLO.show(cards, label);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        cardLO.next(cards);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public Dimension getPreferredSize() {
        return new Dimension(360, 100);
    }

    public CardLayoutDemo() {
        super("CardLayoutDemo示例");
        init();
        getPreferredSize();
        this.addMouseListener(this);
        //添加窗口关闭但不杀死主线程的监听
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
}
