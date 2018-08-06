/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import javax.swing.JTabbedPane;

/**
 *
 * @author wy521
 */
public class JTabbedPaneDemo extends BaseSwingDemo{

    @Override
    protected void init() {
        JTabbedPane panes=new JTabbedPane();
        BaseSwingDemo demo;
        demo=new JCheckBoxDemo();
        panes.addTab(demo.getTitle(),demo);
        demo=new JComboBoxDemo();
        panes.addTab(demo.getTitle(),demo);
          demo=new JRadioButtonDemo();
        panes.addTab(demo.getTitle(),demo);
        add(panes);
    }

    @Override
    public String getTitle() {
        return "JTabbedPane бнЪО";
    }
    
}
