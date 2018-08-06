/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import javax.swing.JTextField;

/**
 *
 * @author wy521
 */
public class JTextFieldDemo extends BaseSwingDemo {

    @Override
    protected void init() {
   JTextField jtf =new JTextField(30);
   add(jtf);
           }

    @Override
    public String getTitle() {
        return "JTextField—› æ";
    }
    
}
