/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ���ö��䷽����һ��ʾ��
 * @author wy521
 */
public class FlowLayoutDemo  extends Frame{
     Label one, two, three, four;

    /**
     * ��Ӳ���ʾlabel
     */
    public void init() {
        //���������
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        
        one = new Label("The First Label");
        two = new Label("The Two Label");
        three = new Label("The Three Label");
        four = new Label("The Four Label");

        this.add(one);
        this.add(two);
        this.add(three);
        this.add(four);
        this.setSize(250, 200);
    }

    public FlowLayoutDemo() {
        super("FloeLayoutʾ��");
        init();
        //��Ӵ��ڹرյ���ɱ�����̵߳ļ���
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
    
}
