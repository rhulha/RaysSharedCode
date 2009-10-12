/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kenai.paranoidray.shared;

import java.awt.Component;
import java.util.HashMap;
import javax.swing.text.JTextComponent;
import org.jdesktop.application.SessionStorage.Property;

/**
 *
 * @author Ray
 */
public class TextProperty implements Property {

    public Object getSessionState(Component c) {
        HashMap hm = new HashMap();
        hm.put("text", ((JTextComponent) c).getText());
        return hm;
    }

    public void setSessionState(Component c, Object state) {
        HashMap hm = (HashMap) state;
        ((JTextComponent) c).setText(""+hm.get("text"));

    }

}
