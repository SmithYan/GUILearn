/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.applet.Applet;
import java.applet.AudioClip;

/**
 *
 * @author wy521
 */
public class audio extends Applet {
    AudioClip sound;
    public void init(){
        sound =getAudioClip(getCodeBase(),"./M哥 - 我的将军啊 (Live).wav");
    }
    public void start(){
        sound.play();
    }
    public audio(){
        init();
    }
}
