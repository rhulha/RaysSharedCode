/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kenai.paranoidray.shared;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author Ray
 */
public class SwingUtils {

    public static void setPlatLAF()
    {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            Logger.getLogger(SwingUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
