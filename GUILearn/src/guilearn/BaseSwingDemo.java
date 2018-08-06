/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author wy521
 */
public abstract class BaseSwingDemo extends JPanel{
    public BaseSwingDemo(){
        super();
        init();
    }
    
    /**
     * 子类的初始化操作应该在这个方法中完成
     * 默认的构造器会调用这个方法
     */
    protected abstract void init();
    
    /**
     * 得到这个demo的描述信息，通常用来作为窗口的标题
     * @return
     */
    public abstract String getTitle();
    public Dimension getPreferredSize(){
        return new Dimension(360,200);
    }
}
