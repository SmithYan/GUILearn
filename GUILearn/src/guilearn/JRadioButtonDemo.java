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
       ships.setProperty("�᲼��������", "��������ǣ����ʮһ������206rfthr9��");
        ships.setProperty("�᲼", "�����fd �ǣ����ʮһ������20fghf69��");
        ships.setProperty("�᲼��", "�����dhsrt�ǣ����ʮһ������2069tfrh��");
        ships.setProperty("�᲼������", "�����fghrf�ǣ����ʮһ������206fht��");
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
        return "JradioButton��ʾ";
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
