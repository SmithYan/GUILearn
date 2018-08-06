/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.Frame;

/**
 * ����һ��Demo������
 *
 * @author wy521
 */
public class DemoLaucher {

    public DemoLaucher(String args) {
        Object demo = null;
        try {
            demo = Class.forName(args).newInstance();
        } catch (InstantiationException e) {
            System.err.println("�޷�ʵ������" + args + ",Ҳ����û���޲����Ĺ��췽��");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.err.println("�޷�������" + args);
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("�Ҳ��������" + args);
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.err.println("�÷���gui.DemoLauch");
        }
        if (null == demo) {
            System.exit(-1);
        }
        if (demo instanceof BaseDemo) {
            awtDemo((BaseDemo) demo);
        } else {
            System.err.println(args + "�Ȳ���һ��AWTDemoҲ����һ��SwingDemo.\n" + "DemoӦ����BaseDemo�����������BaseSwingDemo������");
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
