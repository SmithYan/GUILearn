/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author wy521
 */
public class SimpleImageLoader extends BaseSwingDemo{
    Toolkit tk;
    Image  img;

    @Override
    protected void init() {
       tk=Toolkit.getDefaultToolkit();
       img=tk.getImage("C:/Users/wy521/Pictures/QQÍ¼Æ¬20180804082230.jpg");
    }

    @Override
    public String getTitle() {
     return "¼òµ¥Í¼Ïñ×°ÔØÆ÷";
    }
    protected void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, this);
    }
}
