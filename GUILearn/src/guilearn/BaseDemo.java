/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.Dimension;
import java.awt.Panel;

/**
 * A Base Class for all demos
 *
 * @author wy521
 */
public abstract class BaseDemo extends Panel {

    private static final long serialVersionUID = 1L;

    public BaseDemo() {
        super();
        init();
    }

    /**
     * 子类的初始化操作应该在这个方法中完成 默认的构造器会调用这个方法
     */
    protected abstract void init();

    /**
     * 得到这个demo的描述信息，通常用来做这个窗口的标题
     *
     * @return demo 标题
     */
    public abstract String getTitle();

    public Dimension getPreferredSize() {
        return new Dimension(360, 200);
    }
}
