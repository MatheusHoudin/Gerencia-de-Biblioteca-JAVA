/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ViewUpdate;

import Controller.DAOFindController;
import Controller.DAOUpdateController;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author XXXXXX
 */
public class ViewUpdateBook extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewUpdateBook
     */
    public ViewUpdateBook() {
        initComponents();
        this.btnUpdate.setVisible(false);
        DAOFindController.fillJTableBooks(jTableBooks);
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
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTheme = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPublishingCompany = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSpinnerEdition = new javax.swing.JSpinner();

        setClosable(true);

        jTableBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Título", "Tema", "Autor", "Edição", "Editora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBooks.getTableHeader().setReorderingAllowed(false);
        jTableBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBooksMouseClicked(evt);
            }
        });
        jTableBooks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableBooksKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBooks);

        btnUpdate.setText("Atualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Título");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Tema");

        txtTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThemeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Autor");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Editora");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Edição");

        jSpinnerEdition.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 327, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTitle)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAuthor)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPublishingCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtTheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPublishingCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinnerEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThemeActionPerformed

    private void jTableBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBooksMouseClicked
        if(this.jTableBooks.getSelectedRow()!=-1){
            this.txtTitle.setText(this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 1).toString());
            this.txtTheme.setText(this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 2).toString());
            this.txtAuthor.setText(this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 3).toString());
            this.txtPublishingCompany.setText(this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 5).toString());
            this.jSpinnerEdition.setValue(this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 4));
            this.btnUpdate.setVisible(true);
        }
    }//GEN-LAST:event_jTableBooksMouseClicked

    private void jTableBooksKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableBooksKeyReleased
         if(this.jTableBooks.getSelectedRow()!=-1){
            this.txtTitle.setText(this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 1).toString());
            this.txtTheme.setText(this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 2).toString());
            this.txtAuthor.setText(this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 3).toString());
            this.txtPublishingCompany.setText(this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 5).toString());
            this.jSpinnerEdition.setValue(this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 4));
            this.btnUpdate.setVisible(true);
        }
    }//GEN-LAST:event_jTableBooksKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(this.isUpdated()){
            if(DAOUpdateController.updateBook(this)){
                JOptionPane.showMessageDialog(rootPane, "Dados alterados com sucesso");
                DAOFindController.fillJTableBooks(jTableBooks);
            }else{
                 JOptionPane.showMessageDialog(rootPane, "Erro ao alterar dados");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Dados inalterados");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
    
    private boolean isUpdated(){
        String titlee = this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 1).toString();
        String theme = this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 2).toString();
        String author = this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 3).toString();
        String pubCom = this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 5).toString();
        int edition = (int)this.jTableBooks.getValueAt(jTableBooks.getSelectedRow(), 4);
        
        return !this.txtTitle.getText().equals(titlee) || !this.txtTheme.getText().equals(theme) || !this.txtAuthor.getText().equals(author)
                || !this.txtPublishingCompany.getText().equals(pubCom) || !this.jSpinnerEdition.getValue().equals(edition);
    }

    public JTable getjTableBooks() {
        return jTableBooks;
    }

    public JSpinner getjSpinnerEdition() {
        return jSpinnerEdition;
    }

    public JTextField getTxtAuthor() {
        return txtAuthor;
    }

    public JTextField getTxtPublishingCompany() {
        return txtPublishingCompany;
    }

    public JTextField getTxtTheme() {
        return txtTheme;
    }

    public JTextField getTxtTitle() {
        return txtTitle;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerEdition;
    private javax.swing.JTable jTableBooks;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtPublishingCompany;
    private javax.swing.JTextField txtTheme;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}