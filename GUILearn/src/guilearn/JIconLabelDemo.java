/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author wy521
 */
public class JIconLabelDemo extends BaseSwingDemo {

    @Override
    protected void init() {
        ImageIcon icon = new ImageIcon("C:/Users/wy521/Pictures/图标/下载.jpg");
        
        JLabel label = new JLabel("Reloaded",icon,JLabel.CENTER);
        
        add(label);
    }

    @Override
    public String getTitle() {
        return "带图标的标签示例";
    }

}
