/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.Dimension;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Properties;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author wy521
 */
public class JRadioButtonDemo extends BaseSwingDemo implements ActionListener {
    JTextField jtf;
    Properties ships;
    ButtonGroup bg;
    @Override
    protected void init() {
        bg=new ButtonGroup();
        ships=new Properties();
       ships.setProperty("尼布甲尼撒号", "（马克三星，编号十一）建于206rfthr9年");
        ships.setProperty("尼布", "（马克fd 星，编号十一）建于20fghf69年");
        ships.setProperty("尼布甲", "（马克dhsrt星，编号十一）建于2069tfrh年");
        ships.setProperty("尼布甲尼撒", "（马克fghrf星，编号十一）建于206fht年");
        Enumeration keys=ships.keys();
        while(keys.hasMoreElements()){
            String key = keys.nextElement().toString();
            add(createShip(key));
        }
        jtf=new JTextField(30);
        add(jtf);
    }
    

    @Override
    public String getTitle() {
        return "JradioButton演示";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String ship =e.getActionCommand();
        jtf.setText(ship+":"+ships.getProperty(ship));
    }
    public Dimension getPreferredSize(){
        return new Dimension(400,100);
    }

    private JRadioButton createShip(String text) {
        JRadioButton ship=new JRadioButton(text);
        ship.addActionListener(this);
        bg.add(ship);
        return ship;
        }
}
