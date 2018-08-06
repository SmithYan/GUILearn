/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilearn;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.util.StringTokenizer;

/**
 *
 * @author wy521
 */
public class Animation extends Applet implements Runnable {

    Image cell[];
    final int MAXSEQ = 64;
    int sequence[];
    int nseq;
    int idx;
    int framerate;
    boolean stopFlag;

    private int getParameter(String name, int def) {
        int n = def;
        String s = getParameter(name);
        if (s != null) {
            try {
                n = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return n;
    }

    @Override
    public void run() {
        idx = 0;
        while (true) {
            repaint();
            idx = (idx + 1) % nseq;
            try {
                Thread.sleep(1000 / framerate);
            } catch (Exception e) {

            }
            if (stopFlag) {
                return;
            }
        }
    }

    public Animation() {
        framerate = getParameter("framerate", 5);
        int tilex = getParameter("cols", 1);
        int tiley = getParameter("rows", 1);
        cell = new Image[tilex * tiley];
        StringTokenizer st = new StringTokenizer(getParameter("sequence"), ",");
        sequence = new int[MAXSEQ];
        nseq = 0;
        while (st.hasMoreTokens() && nseq < MAXSEQ) {
            try {
                sequence[nseq] = Integer.parseInt(st.nextToken());
            } catch (NumberFormatException e) {
                sequence[nseq] = 0;
            }
            nseq++;
        }
        try {
            Image img = getImage(getDocumentBase(), getParameter("img"));
            MediaTracker t = new MediaTracker(this);
            t.addImage(img, 0);
            t.waitForID(0);
            int iw = img.getWidth(null);
            int ih = img.getHeight(null);
            int tw = iw / tilex;
            int th = ih / tiley;
            CropImageFilter f;
            FilteredImageSource fis;
            for (int y = 0; y < tiley; y++) {
                for (int x = 0; x < tilex; x++) {
                    f = new CropImageFilter(tw * x, th * y, tw, th);
                    fis = new FilteredImageSource(img.getSource(), f);
                    int i = y * tilex + x;
                    cell[i] = createImage(fis);
                    t.addImage(cell[i], i);
                }
            }
            t.waitForAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void update(Graphics g) {
        g.drawImage(cell[sequence[idx]], 0, 0, null);
    }

    public void paint(Graphics g) {
        update(g);
    }
    Thread t;

    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    public void stop() {
        stopFlag = true;
    }
}
