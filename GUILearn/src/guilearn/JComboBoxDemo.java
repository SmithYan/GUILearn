/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author wy521
 */
public class JComboBoxDemo extends BaseSwingDemo implements ItemListener {

    JLabel osIcon;

    @Override
    protected void init() {
        JComboBox jc = new JComboBox();
        jc.addItem("default");
        jc.addItem("bsd");
        jc.addItem("linux");
        jc.addItem("mac");
        jc.addItem("Windows");
        jc.addItemListener(this);
        add(jc);
        osIcon = new JLabel("default");
        add(osIcon);
    }

    @Override
    public String getTitle() {
        return "JComboBox—› æ";
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String s = (String) e.getItem();
        osIcon.setText(s);
    }

    public Dimension getPreferredSize() {
        return new Dimension(240, 120);
    }
}
