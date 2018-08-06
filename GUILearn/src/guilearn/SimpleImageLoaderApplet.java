/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author wy521
 */
public class SimpleImageLoaderApplet extends Applet{
    Image img;
    
    public void init(){
        img=getImage(getDocumentBase(),getParameter("image"));
    }
        public void paint(Graphics g){
            g.drawImage(img,0,0,this);
        }
        public SimpleImageLoaderApplet(){
            init();
            paint(this.getGraphics());
        }
 
}
