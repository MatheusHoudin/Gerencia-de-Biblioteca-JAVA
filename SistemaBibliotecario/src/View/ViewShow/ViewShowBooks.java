/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ViewShow;

import Connection.DAOFactory;
import Model.Bean.Book;
import Model.DAO.BookDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XXXXXX
 */
public class ViewShowBooks extends javax.swing.JInternalFrame {

    /**
     * Creates new form TesteTabela
     */
    public ViewShowBooks() {
        initComponents();
        this.fillJTableBooks();
    }
    
    private void fillJTableBooks(){
        DefaultTableModel dtm = (DefaultTableModel) jTableBooks.getModel();
        dtm.setNumRows(0);
        BookDAO bDao = DAOFactory.getInstanceBookDAO();
        
        for(Book book:bDao.findAll()){
            dtm.addRow(new Object[]{
                book.getTitle(),
                book.getTheme(),
                book.getAuthor(),
                book.getEdition(),
                book.getPublishingCompany()
            });
           
        }
    }
    
    private void fillJTableBooks(String filter){
        DefaultTableModel dtm = (DefaultTableModel) jTableBooks.getModel();
        dtm.setNumRows(0);
        BookDAO bDao = DAOFactory.getInstanceBookDAO();
        
        for(Book book:bDao.findAll(filter)){
            dtm.addRow(new Object[]{
                book.getTitle(),
                book.getTheme(),
                book.getAuthor(),
                book.getEdition(),
                book.getPublishingCompany()
            });
            System.out.println(book.getTitle());
           
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBooks = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTitleFilter = new javax.swing.JTextField();
        btnFiltrate = new javax.swing.JButton();
        btnRemoveFilter = new javax.swing.JButton();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jTableBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Tema", "Autor", "Edição", "Editora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableBooks);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Filtrar por título");

        txtTitleFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleFilterActionPerformed(evt);
            }
        });

        btnFiltrate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnFiltrate.setText("Filtrar");
        btnFiltrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrateActionPerformed(evt);
            }
        });

        btnRemoveFilter.setText("Remover filtro");
        btnRemoveFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtTitleFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltrate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveFilter)
                        .addGap(106, 106, 106))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitleFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

        
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnFiltrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrateActionPerformed
        if(this.txtTitleFilter.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Insira dados no filtro");
        }else{
            this.fillJTableBooks(this.txtTitleFilter.getText());
        }
    }//GEN-LAST:event_btnFiltrateActionPerformed

    private void txtTitleFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleFilterActionPerformed

    private void btnRemoveFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFilterActionPerformed
        this.fillJTableBooks();
        this.txtTitleFilter.setText("");
    }//GEN-LAST:event_btnRemoveFilterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrate;
    private javax.swing.JButton btnRemoveFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBooks;
    private javax.swing.JTextField txtTitleFilter;
    // End of variables declaration//GEN-END:variables
}