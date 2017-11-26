/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.DAOFactory;
import Model.Bean.Exemplary;
import Model.DAO.ExemplaryDAO;
import View.ViewDelete.ViewDeleteExemplary;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XXXXXX
 */
public class DAODeleteController {
    
    public static boolean removeExemplary(ViewDeleteExemplary viewDeleteExemplary){
        int[] rowsSelected = viewDeleteExemplary.getjTableExemplarys().getSelectedRows();
        int numberExemplarysSelected = rowsSelected.length;
        
        ExemplaryDAO exDAO = DAOFactory.getInstanceExemplaryDAO();
        List<Exemplary> exemplarys = DAODeleteController.createExemplarysToDelete(rowsSelected, viewDeleteExemplary);
        
        for(Exemplary ex:exemplarys){
            if(exDAO.delete(ex)){
                numberExemplarysSelected--;
            }
            exDAO = DAOFactory.getInstanceExemplaryDAO();
        }
        return numberExemplarysSelected==0;
    }
    
    private static List<Exemplary> createExemplarysToDelete(int[] positions,ViewDeleteExemplary viewDeleteExemplary){
        List<Exemplary> exemplarys = new ArrayList<>();
        
        for(int i:positions){
            Exemplary ex = new Exemplary();
            ex.setIdExemplary((int)viewDeleteExemplary.getjTableExemplarys().getValueAt(i, 0));
            ex.setTitle((String)viewDeleteExemplary.getjTableExemplarys().getValueAt(i, 1));
            ex.setId((int)viewDeleteExemplary.getjTableExemplarys().getValueAt(i, 3));
            String avaliable = (String)viewDeleteExemplary.getjTableExemplarys().getValueAt(i, 2);
        
            if(avaliable.equals("Disponível")){
                ex.setAvaliable(true);
            }else{
                ex.setAvaliable(false);
            }
            exemplarys.add(ex);
        }
        return exemplarys;
    }
}
