/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author XXXXXX
 */
public class ChangeViewController {
    
    public static void changeView(JFrame jFrameActtualy,JFrame jFrameToOpen){
        jFrameActtualy.dispose();
        jFrameToOpen.setVisible(true);
    }
    public static void changeView(JDesktopPane jDesktopPane,JInternalFrame jInternalFrameToOpen){
        jDesktopPane.add(jInternalFrameToOpen);
        jInternalFrameToOpen.setVisible(true);
    }
}
