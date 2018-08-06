/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Enumeration;
import java.util.Properties;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

/**
 *
 * @author wy521
 */
public class JCheckBoxDemo extends BaseSwingDemo implements ItemListener {
    
    JTextField jtf;
    Properties ships;
    
    @Override
    protected void init() {
        ships = new Properties();
        ships.setProperty("�᲼��������", "��������ǣ����ʮһ������206rfthr9��");
        ships.setProperty("�᲼", "�����fd �ǣ����ʮһ������20fghf69��");
        ships.setProperty("�᲼��", "�����dhsrt�ǣ����ʮһ������2069tfrh��");
        ships.setProperty("�᲼������", "�����fghrf�ǣ����ʮһ������206fht��");
        Enumeration keys = ships.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement().toString();
            this.add(createShip(key));
        }
        jtf =new JTextField(30);
        add(jtf);
    }
    
    @Override
    public String getTitle() {
        return "JCheckBox��ʾ";
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        String ship = ((JCheckBox) e.getItem()).getText();
        jtf.setText(ship + ":" + ships.getProperty(ship));
    }
    private JCheckBox createShip(String text){
        JCheckBox check=new JCheckBox(text);
        check.addItemListener(this);
        return check;
    }
}
