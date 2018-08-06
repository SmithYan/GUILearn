/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author wy521
 */
public class JScrollPaneDemo extends BaseSwingDemo {

    @Override
    protected void init() {
        ImageIcon post = new ImageIcon("C:/Users/wy521/Pictures/QQÕº∆¨20180804082230.jpg");
        JLabel label = new JLabel(post);
        setLayout(new BorderLayout());

        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane scrollPane = new JScrollPane(label, v, h);
        scrollPane.setPreferredSize(this.getPreferredSize());

        add(scrollPane, BorderLayout.CENTER);
    }

    @Override
    public String getTitle() {
        return "JScrolPaneDemo—› æ";
    }

    public Dimension getPreferredSize() {
        return new Dimension(480, 480);
    }
}
