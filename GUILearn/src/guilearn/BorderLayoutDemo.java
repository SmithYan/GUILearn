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
 * �����Ķ����������������
 * @author wy521
 */
public class BorderLayoutDemo extends Frame{
    public void init(){
        this.setLayout(new BorderLayout());
        
        this.add(new Button("��."),BorderLayout.NORTH);
        this.add(new Label("�����������ͨ��������ʾ״̬��Ϣ"),BorderLayout.SOUTH);
        this.add(new Button("��"),BorderLayout.EAST);
        this.add(new Button("��"),BorderLayout.WEST);
        String msg="Every thing that has a beginning has an end!";
        this.add(new TextArea(msg),BorderLayout.CENTER);
    }
    
    public BorderLayoutDemo(){
        super("BorderLayoutʾ��");
        init();
        //��Ӵ��ڹرյ���ɱ�����̵߳ļ���
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
    
}
