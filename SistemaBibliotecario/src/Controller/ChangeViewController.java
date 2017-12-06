/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

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
    
    public static void addColorOnRows(JTable jTableExemplarys){
        jTableExemplarys.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel jlabel =(JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
                
                String obj = (String)table.getValueAt(row, 2);
                if(obj!=null && obj.equals("Disponível")){
                    jlabel.setForeground(Color.blue);
                }else{
                    jlabel.setForeground(Color.red);
                }
                return jlabel;
            }
            
        });
    }
    
    public static void addColorOnRowsOfLending(JTable jTableLendings){
        jTableLendings.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel jlabel = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                
                String obj = (String) table.getValueAt(row, 10);
                
                if(obj!=null && obj.equals("Em andamento")){
                    jlabel.setForeground(Color.blue);
                }else{
                    jlabel.setForeground(Color.red);
                }
                return jlabel;
            }
        });
    }
}
