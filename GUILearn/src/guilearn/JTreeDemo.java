/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/**
 *
 * @author wy521
 */
public class JTreeDemo extends BaseSwingDemo {

    JTextField jtf;
    JTree tree;

    @Override
    protected void init() {
        setLayout(new BorderLayout());
        add(createTree(), BorderLayout.CENTER);
        jtf = new JTextField(30);
        add(jtf, BorderLayout.SOUTH);
    }

    @Override
    public String getTitle() {
        return "JTreeDemo æ¿˝";
    }

    private JScrollPane createTree() {
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("“Ù¿÷");
        DefaultMutableTreeNode classical = new DefaultMutableTreeNode("π≈µ‰");
        DefaultMutableTreeNode pop = new DefaultMutableTreeNode("¡˜––“Ù¿÷");
        DefaultMutableTreeNode jazz = new DefaultMutableTreeNode("æÙ ø");
        DefaultMutableTreeNode rock = new DefaultMutableTreeNode("“°πˆ");

        top.add(classical);
        top.add(pop);
        top.add(jazz);
        top.add(rock);

        classical.add(new DefaultMutableTreeNode("Beethoven-Six String Quratets"));
        classical.add(new DefaultMutableTreeNode("Beethoven-Grosse Fugue for String Quratets"));
        classical.add(new DefaultMutableTreeNode("Mozart-Piano String Concerto No.12"));

        pop.add(new DefaultMutableTreeNode("Celine Dion-Another Year Has Gone By"));
        pop.add(new DefaultMutableTreeNode("Celine Dion-Because you love me"));
        pop.add(new DefaultMutableTreeNode("Faye Wang-Eys On Me"));

        jazz.add(new DefaultMutableTreeNode("Albert Ayler-My Name is Albert Ayler"));
        jazz.add(new DefaultMutableTreeNode("Albert Ayler-Billie's Bounce"));
        jazz.add(new DefaultMutableTreeNode("Chet Baker-Let's Get Lost"));
        jazz.add(new DefaultMutableTreeNode("Chet Baker-My Name is Albert Ayler"));

        DefaultMutableTreeNode beetle = new DefaultMutableTreeNode("The Beetles");
        beetle.add(new DefaultMutableTreeNode("A Hard Da's Night"));
        beetle.add(new DefaultMutableTreeNode("If I Fell"));
        rock.add(beetle);
        DefaultMutableTreeNode garv = new DefaultMutableTreeNode("Harcin Garvel");
        garv.add(new DefaultMutableTreeNode("Is This Real"));
        garv.add(new DefaultMutableTreeNode("Simple"));
        garv.add(new DefaultMutableTreeNode("Just A Dog"));
        rock.add(garv);
        rock.add(new DefaultMutableTreeNode("Steve Miller-Fly Like An Eagle"));

        tree = new JTree(top);
        tree.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                showSelect(me);
            }

        });
        return new JScrollPane(tree);
    }

    private void showSelect(MouseEvent me) {
        TreePath tp = tree.getPathForLocation(me.getX(), me.getY());
        if (tp != null) {
            jtf.setText(tp.toString());
        } else {
            jtf.setText("");
        }
    }
}
