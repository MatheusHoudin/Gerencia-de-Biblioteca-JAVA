/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ViewSystem;

import View.ViewValidate.ViewLogin;
import Controller.ChangeViewController;
import View.ViewDelete.ViewDeleteBook;
import View.ViewDelete.ViewDeleteExemplary;
import View.ViewDelete.ViewDeleteUser;
import View.ViewValidate.ViewValidateUser;
import View.ViewShow.ViewShowBooks;
import View.ViewRegister.ViewRegisterExemplary;
import View.ViewRegister.ViewRegisterBook;
import View.ViewRegister.ViewRegisterLibrarian;
import View.ViewRegister.ViewRegisterUser;
import View.ViewShow.ViewShowExemplarys;
import View.ViewShow.ViewShowUsers;

/**
 *
 * @author XXXXXX
 */
public class ViewMain extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public ViewMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUsers = new javax.swing.JMenu();
        jMenuItemRegisterUser = new javax.swing.JMenuItem();
        jMenuItemDeleteUser = new javax.swing.JMenuItem();
        jMenuItemAlterUser = new javax.swing.JMenuItem();
        jMenuItemShowUsers = new javax.swing.JMenuItem();
        jMenuBooks = new javax.swing.JMenu();
        jMenuItemRegisterBook = new javax.swing.JMenuItem();
        jMenuItemDeleteBook = new javax.swing.JMenuItem();
        jMenuItemAlterBook = new javax.swing.JMenuItem();
        jMenuItemShowBooks = new javax.swing.JMenuItem();
        jMenuExemplarys = new javax.swing.JMenu();
        jMenuItemRegisterExemplary = new javax.swing.JMenuItem();
        jMenuItemDeleteExemplary = new javax.swing.JMenuItem();
        jMenuItemShowExemplarys = new javax.swing.JMenuItem();
        jMenuLendings = new javax.swing.JMenu();
        jMenuItemDoLending = new javax.swing.JMenuItem();
        jMenuItemShowLendings = new javax.swing.JMenuItem();
        jMenuItemRenovateLending = new javax.swing.JMenuItem();
        jMenuDevolution = new javax.swing.JMenu();
        jMenuItemDoDevolution = new javax.swing.JMenuItem();
        jMenuLibrarian = new javax.swing.JMenu();
        jMenuItemRegisterLibrarian = new javax.swing.JMenuItem();
        jMenuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de Biblioteca");

        jDesktopPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDesktopPane1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1062, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jMenuUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/group.png"))); // NOI18N
        jMenuUsers.setText("Usuários");

        jMenuItemRegisterUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        jMenuItemRegisterUser.setText("Adicionar Usuário");
        jMenuItemRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegisterUserActionPerformed(evt);
            }
        });
        jMenuUsers.add(jMenuItemRegisterUser);

        jMenuItemDeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_delete.png"))); // NOI18N
        jMenuItemDeleteUser.setText("Remover Usuario");
        jMenuItemDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeleteUserActionPerformed(evt);
            }
        });
        jMenuUsers.add(jMenuItemDeleteUser);

        jMenuItemAlterUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_edit.png"))); // NOI18N
        jMenuItemAlterUser.setText("Alterar Usuário");
        jMenuUsers.add(jMenuItemAlterUser);

        jMenuItemShowUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/group_go.png"))); // NOI18N
        jMenuItemShowUsers.setText("Listar Usuários");
        jMenuItemShowUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemShowUsersActionPerformed(evt);
            }
        });
        jMenuUsers.add(jMenuItemShowUsers);

        jMenuBar1.add(jMenuUsers);

        jMenuBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book.png"))); // NOI18N
        jMenuBooks.setText("Livros");
        jMenuBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItemRegisterBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_add.png"))); // NOI18N
        jMenuItemRegisterBook.setText("Adicionar Livro");
        jMenuItemRegisterBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemRegisterBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegisterBookActionPerformed(evt);
            }
        });
        jMenuBooks.add(jMenuItemRegisterBook);

        jMenuItemDeleteBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_delete.png"))); // NOI18N
        jMenuItemDeleteBook.setText("Remover Livro");
        jMenuItemDeleteBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeleteBookActionPerformed(evt);
            }
        });
        jMenuBooks.add(jMenuItemDeleteBook);

        jMenuItemAlterBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_edit.png"))); // NOI18N
        jMenuItemAlterBook.setText("Alterar Livro");
        jMenuItemAlterBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBooks.add(jMenuItemAlterBook);

        jMenuItemShowBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_open.png"))); // NOI18N
        jMenuItemShowBooks.setText("Listar Livros");
        jMenuItemShowBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemShowBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemShowBooksActionPerformed(evt);
            }
        });
        jMenuBooks.add(jMenuItemShowBooks);

        jMenuBar1.add(jMenuBooks);

        jMenuExemplarys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book.png"))); // NOI18N
        jMenuExemplarys.setText("Exemplares");

        jMenuItemRegisterExemplary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_add.png"))); // NOI18N
        jMenuItemRegisterExemplary.setText("Adicionar Exemplar");
        jMenuItemRegisterExemplary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemRegisterExemplaryMouseClicked(evt);
            }
        });
        jMenuItemRegisterExemplary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegisterExemplaryActionPerformed(evt);
            }
        });
        jMenuExemplarys.add(jMenuItemRegisterExemplary);

        jMenuItemDeleteExemplary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_delete.png"))); // NOI18N
        jMenuItemDeleteExemplary.setText("Remover Exemplar");
        jMenuItemDeleteExemplary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeleteExemplaryActionPerformed(evt);
            }
        });
        jMenuExemplarys.add(jMenuItemDeleteExemplary);

        jMenuItemShowExemplarys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_open.png"))); // NOI18N
        jMenuItemShowExemplarys.setText("Listar Exemplares");
        jMenuItemShowExemplarys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemShowExemplarysActionPerformed(evt);
            }
        });
        jMenuExemplarys.add(jMenuItemShowExemplarys);

        jMenuBar1.add(jMenuExemplarys);

        jMenuLendings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_link.png"))); // NOI18N
        jMenuLendings.setText("Empréstimos");

        jMenuItemDoLending.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_go.png"))); // NOI18N
        jMenuItemDoLending.setText("Realizar Empréstimo");
        jMenuItemDoLending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDoLendingActionPerformed(evt);
            }
        });
        jMenuLendings.add(jMenuItemDoLending);

        jMenuItemShowLendings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_next.png"))); // NOI18N
        jMenuItemShowLendings.setText("Visualizar Empréstimos");
        jMenuLendings.add(jMenuItemShowLendings);

        jMenuItemRenovateLending.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_error.png"))); // NOI18N
        jMenuItemRenovateLending.setText("Renovar Empréstimo");
        jMenuItemRenovateLending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRenovateLendingActionPerformed(evt);
            }
        });
        jMenuLendings.add(jMenuItemRenovateLending);

        jMenuBar1.add(jMenuLendings);

        jMenuDevolution.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_key.png"))); // NOI18N
        jMenuDevolution.setText("Devolução");

        jMenuItemDoDevolution.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_previous.png"))); // NOI18N
        jMenuItemDoDevolution.setText("Realizar Devolução");
        jMenuItemDoDevolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDoDevolutionActionPerformed(evt);
            }
        });
        jMenuDevolution.add(jMenuItemDoDevolution);

        jMenuBar1.add(jMenuDevolution);

        jMenuLibrarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_suit.png"))); // NOI18N
        jMenuLibrarian.setText("Bibliotecário");

        jMenuItemRegisterLibrarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_suit.png"))); // NOI18N
        jMenuItemRegisterLibrarian.setText("Adicionar Bibliotecário");
        jMenuItemRegisterLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegisterLibrarianActionPerformed(evt);
            }
        });
        jMenuLibrarian.add(jMenuItemRegisterLibrarian);

        jMenuBar1.add(jMenuLibrarian);

        jMenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door_out.png"))); // NOI18N
        jMenuExit.setText("Sair");
        jMenuExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuExitMouseClicked(evt);
            }
        });
        jMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExitActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemRegisterBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegisterBookActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewRegisterBook());
    }//GEN-LAST:event_jMenuItemRegisterBookActionPerformed

    private void jMenuItemRegisterExemplaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegisterExemplaryActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewRegisterExemplary());
    }//GEN-LAST:event_jMenuItemRegisterExemplaryActionPerformed

    private void jDesktopPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane1MouseClicked

    }//GEN-LAST:event_jDesktopPane1MouseClicked

    private void jMenuItemRenovateLendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRenovateLendingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRenovateLendingActionPerformed

    private void jMenuItemDoDevolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDoDevolutionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemDoDevolutionActionPerformed

    private void jMenuItemDoLendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDoLendingActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewValidateUser());
    }//GEN-LAST:event_jMenuItemDoLendingActionPerformed

    private void jMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExitActionPerformed

    }//GEN-LAST:event_jMenuExitActionPerformed

    private void jMenuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExitMouseClicked
        ChangeViewController.changeView(this, new ViewLogin());
    }//GEN-LAST:event_jMenuExitMouseClicked

    private void jMenuItemRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegisterUserActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewRegisterUser());
    }//GEN-LAST:event_jMenuItemRegisterUserActionPerformed

    private void jMenuItemRegisterExemplaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemRegisterExemplaryMouseClicked

    }//GEN-LAST:event_jMenuItemRegisterExemplaryMouseClicked

    private void jMenuItemShowBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemShowBooksActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewShowBooks());
    }//GEN-LAST:event_jMenuItemShowBooksActionPerformed

    private void jMenuItemRegisterLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegisterLibrarianActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewRegisterLibrarian());
    }//GEN-LAST:event_jMenuItemRegisterLibrarianActionPerformed

    private void jMenuItemShowExemplarysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemShowExemplarysActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewShowExemplarys());
    }//GEN-LAST:event_jMenuItemShowExemplarysActionPerformed

    private void jMenuItemDeleteExemplaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeleteExemplaryActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewDeleteExemplary());
    }//GEN-LAST:event_jMenuItemDeleteExemplaryActionPerformed

    private void jMenuItemDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeleteBookActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewDeleteBook());
    }//GEN-LAST:event_jMenuItemDeleteBookActionPerformed

    private void jMenuItemShowUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemShowUsersActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewShowUsers());
    }//GEN-LAST:event_jMenuItemShowUsersActionPerformed

    private void jMenuItemDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeleteUserActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewDeleteUser());
    }//GEN-LAST:event_jMenuItemDeleteUserActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuBooks;
    private javax.swing.JMenu jMenuDevolution;
    private javax.swing.JMenu jMenuExemplarys;
    private javax.swing.JMenu jMenuExit;
    private javax.swing.JMenuItem jMenuItemAlterBook;
    private javax.swing.JMenuItem jMenuItemAlterUser;
    private javax.swing.JMenuItem jMenuItemDeleteBook;
    private javax.swing.JMenuItem jMenuItemDeleteExemplary;
    private javax.swing.JMenuItem jMenuItemDeleteUser;
    private javax.swing.JMenuItem jMenuItemDoDevolution;
    private javax.swing.JMenuItem jMenuItemDoLending;
    private javax.swing.JMenuItem jMenuItemRegisterBook;
    private javax.swing.JMenuItem jMenuItemRegisterExemplary;
    private javax.swing.JMenuItem jMenuItemRegisterLibrarian;
    private javax.swing.JMenuItem jMenuItemRegisterUser;
    private javax.swing.JMenuItem jMenuItemRenovateLending;
    private javax.swing.JMenuItem jMenuItemShowBooks;
    private javax.swing.JMenuItem jMenuItemShowExemplarys;
    private javax.swing.JMenuItem jMenuItemShowLendings;
    private javax.swing.JMenuItem jMenuItemShowUsers;
    private javax.swing.JMenu jMenuLendings;
    private javax.swing.JMenu jMenuLibrarian;
    private javax.swing.JMenu jMenuUsers;
    // End of variables declaration//GEN-END:variables
}
