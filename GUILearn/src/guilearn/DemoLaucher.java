/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.Frame;

/**
 * 启动一个Demo工具类
 *
 * @author wy521
 */
public class DemoLaucher {

    public DemoLaucher(String args) {
        Object demo = null;
        try {
            demo = Class.forName(args).newInstance();
        } catch (InstantiationException e) {
            System.err.println("无法实例化类" + args + ",也许其没有无参数的构造方法");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.err.println("无法访问类" + args);
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("找不到这个类" + args);
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.err.println("用法：gui.DemoLauch");
        }
        if (null == demo) {
            System.exit(-1);
        }
        if (demo instanceof BaseDemo) {
            awtDemo((BaseDemo) demo);
        } else {
            System.err.println(args + "既不是一个AWTDemo也不是一个SwingDemo.\n" + "Demo应该是BaseDemo的子类或者是BaseSwingDemo的子类");
        }
    }

    public static void awtDemo(BaseDemo baseDemo) {
        Frame frm = new Frame(baseDemo.getTitle());
        frm.add(baseDemo);
        frm.pack();
        frm.addWindowListener(new DefaultWindowListener());
    }

    public static void swingDemo(BaseDemo baseDemo) {
        javax.swing.JFrame frm = new javax.swing.JFrame(baseDemo.getTitle());
        frm.getContentPane().add(baseDemo);
        frm.pack();
        frm.addWindowListener(new DefaultWindowListener());
    }
}
