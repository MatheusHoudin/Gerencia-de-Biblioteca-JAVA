/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuration;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author XXXXXX
 */
public class MsgBoxDialog {
    public static void showMsgYesNo(JInternalFrame j){
        int confirmation = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar?", "Cancelar ação", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(confirmation==JOptionPane.NO_OPTION){
            j.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }else{
            j.dispose();
        }
    }
   
}