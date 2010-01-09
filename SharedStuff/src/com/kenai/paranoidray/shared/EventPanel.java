/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kenai.paranoidray.shared;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Ray
 */
public class EventPanel extends JPanel {
    
    ArrayList<PaintListener> paintListeners = new ArrayList<PaintListener>();

    public EventPanel() {
    }


    public synchronized void addPaintListener(PaintListener listener) {
        paintListeners.add(listener);
    }

    public synchronized void removePaintListener(PaintListener listener) {
        paintListeners.remove(listener);
    }

    @Override
    public void paintComponent(Graphics g) {
        for (PaintListener paintListener : paintListeners) {
            paintListener.paint( new PaintEvent(g));
        }
    }
}
