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
     * ����ĳ�ʼ������Ӧ���������������� Ĭ�ϵĹ�����������������
     */
    protected abstract void init();

    /**
     * �õ����demo��������Ϣ��ͨ��������������ڵı���
     *
     * @return demo ����
     */
    public abstract String getTitle();

    public Dimension getPreferredSize() {
        return new Dimension(360, 200);
    }
}
