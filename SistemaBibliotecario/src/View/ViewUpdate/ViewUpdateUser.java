/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ViewUpdate;

import Controller.DAOFindController;
import Controller.DAOUpdateController;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author XXXXXX
 */
public class ViewUpdateUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewUpdateUser
     */
    public ViewUpdateUser() {
        initComponents();
        this.btnUpdate.setVisible(false);
        DAOFindController.fillJTableUsers(jTableUsers);
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
        jTableUsers = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();

        setClosable(true);

        jTableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Usuário", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsers.getTableHeader().setReorderingAllowed(false);
        jTableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsersMouseClicked(evt);
            }
        });
        jTableUsers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableUsersKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsers);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Usuário");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Senha");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnUpdate.setText("Atualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        btnUpdate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                btnUpdatePropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUser)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsersMouseClicked
        if(this.jTableUsers.getSelectedRow()!=-1){
            this.txtName.setText(this.jTableUsers.getValueAt(this.jTableUsers.getSelectedRow(), 1).toString());
            this.txtUser.setText(this.jTableUsers.getValueAt(this.jTableUsers.getSelectedRow(), 2).toString());
            this.txtPassword.setText(this.jTableUsers.getValueAt(this.jTableUsers.getSelectedRow(), 3).toString());
            this.btnUpdate.setVisible(true);
        }
    }//GEN-LAST:event_jTableUsersMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(this.isUpdated() && !this.isEmpty()){
            if(DAOUpdateController.updateUser(this)){
                JOptionPane.showMessageDialog(rootPane, "Dados alterados com sucesso");
                DAOFindController.fillJTableUsers(jTableUsers);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Erro ao alterar dados");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Dados inválidos");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
    private boolean isEmpty(){
        return this.txtName.getText().equals("") || this.txtPassword.getText().equals("") || this.txtUser.getText().endsWith("");
    }
    private void btnUpdatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btnUpdatePropertyChange
    }//GEN-LAST:event_btnUpdatePropertyChange

    private void jTableUsersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableUsersKeyReleased
        if(this.jTableUsers.getSelectedRow()!=-1){
            this.txtName.setText(this.jTableUsers.getValueAt(this.jTableUsers.getSelectedRow(), 1).toString());
            this.txtUser.setText(this.jTableUsers.getValueAt(this.jTableUsers.getSelectedRow(), 2).toString());
            this.txtPassword.setText(this.jTableUsers.getValueAt(this.jTableUsers.getSelectedRow(), 3).toString());
            this.btnUpdate.setVisible(true);
        }
    }//GEN-LAST:event_jTableUsersKeyReleased
    
    private boolean isUpdated(){
        String name = this.jTableUsers.getValueAt(this.jTableUsers.getSelectedRow(), 1).toString();
        String user = this.jTableUsers.getValueAt(this.jTableUsers.getSelectedRow(), 2).toString();
        String password = this.jTableUsers.getValueAt(this.jTableUsers.getSelectedRow(), 3).toString();
        
        return !this.txtName.getText().equals(name) || !this.txtPassword.getText().equals(password) || !this.txtUser.getText().equals(user);
    }

    public JTable getjTableUsers() {
        return jTableUsers;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public JTextField getTxtPassword() {
        return txtPassword;
    }

    public JTextField getTxtUser() {
        return txtUser;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsers;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
