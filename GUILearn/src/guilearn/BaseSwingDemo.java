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
     * ����ĳ�ʼ������Ӧ����������������
     * Ĭ�ϵĹ�����������������
     */
    protected abstract void init();
    
    /**
     * �õ����demo��������Ϣ��ͨ��������Ϊ���ڵı���
     * @return
     */
    public abstract String getTitle();
    public Dimension getPreferredSize(){
        return new Dimension(360,200);
    }
}
