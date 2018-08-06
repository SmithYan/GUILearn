/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author wy521
 */
public class AdapterDemo extends Frame {

    TextField status;

    public void init() {
        status = new TextField(30);
        status.setEditable(false);
        add(status);
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
    }

    public String getTitle() {
        return "事件处理器";
    }

    public void showStatus(String message) {
        status.setText(message);
    }

    public AdapterDemo() {
        init();
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);
        //添加窗口关闭但不杀死主线程的监听
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
}

class MyMouseAdapter extends MouseAdapter {

    AdapterDemo adapterDemo = new AdapterDemo();

    public MyMouseAdapter(AdapterDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }

    public void mouseClicked(MouseEvent me) {
        adapterDemo.showStatus("Mouse clicked");
    }
}

class MyMouseMotionAdapter extends MouseMotionAdapter {

    AdapterDemo adapterDemo;

    public MyMouseMotionAdapter(AdapterDemo aThis) {
        this.adapterDemo = aThis;
    }

    public void mouseDragged(MouseEvent e) {
        adapterDemo.showStatus("Mouse dragged");
    }
}
