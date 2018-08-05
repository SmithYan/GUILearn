/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author wy521
 */
public class BorderLayoutDemo extends Frame{
    public void init(){
        this.setLayout(new BorderLayout());
        
        this.add(new Button("上."),BorderLayout.NORTH);
        this.add(new Label("下面这个部分通常用来显示状态信息"),BorderLayout.SOUTH);
        this.add(new Button("右"),BorderLayout.EAST);
        this.add(new Button("左"),BorderLayout.WEST);
        String msg="Every thing that has a beginning has an end!";
        this.add(new TextArea(msg),BorderLayout.CENTER);
    }
    
    public BorderLayoutDemo(){
        super("BorderLayout示例");
        init();
        //添加窗口关闭但不杀死主线程的监听
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
    
}
