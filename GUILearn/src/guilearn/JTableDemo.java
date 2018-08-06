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
        final String[] colHeads = {"学号", "姓名", "系别", "性别"};
        final Object[][] data = {
            {"2002010001", "张三", "建筑", "男"},
            {"2002010001", "王五", "建筑", "女"},
            {"2002010001", "李四", "建筑", "女"},
            {"2002010001", "赵六", "建筑", "男"},};
        JTable table = new JTable(data, colHeads);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(table, v, h);
        add(jsp, BorderLayout.CENTER);
    }

    @Override
    public String getTitle() {
        return "JTable 演示";
    }

}
