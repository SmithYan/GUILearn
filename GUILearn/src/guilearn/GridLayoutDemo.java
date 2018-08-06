/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author wy521
 */
public class GridLayoutDemo extends Frame {

    static final int n = 4;

    public void init() {
        this.setLayout(new GridLayout(n, n));
        this.setFont(new Font("Dialog", Font.BOLD, 18));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = i * n + j;
                if (k > 0) {
                    this.add(new Button("��ť " + k));
                }
            }
        }
        this.setSize(250, 200);
    }

    public String getTitle() {
        return "��ʾGridLayout";
    }
    public GridLayoutDemo(){
        super("GridLayoutDemo");
        init();
         //��Ӵ��ڹرյ���ɱ�����̵߳ļ���
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
}
