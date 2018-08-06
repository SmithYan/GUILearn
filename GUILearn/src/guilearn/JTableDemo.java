/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author wy521
 */
public class JTableDemo extends BaseSwingDemo {

    @Override
    protected void init() {
        this.setLayout(new BorderLayout());
        final String[] colHeads = {"ѧ��", "����", "ϵ��", "�Ա�"};
        final Object[][] data = {
            {"2002010001", "����", "����", "��"},
            {"2002010001", "����", "����", "Ů"},
            {"2002010001", "����", "����", "Ů"},
            {"2002010001", "����", "����", "��"},};
        JTable table = new JTable(data, colHeads);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(table, v, h);
        add(jsp, BorderLayout.CENTER);
    }

    @Override
    public String getTitle() {
        return "JTable ��ʾ";
    }

}
