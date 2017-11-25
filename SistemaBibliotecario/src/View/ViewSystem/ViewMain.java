/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ViewSystem;

import View.ViewValidate.ViewLogin;
import Controller.ChangeViewController;
import View.ViewValidate.ViewValidateUser;
import View.ViewShow.ViewShowBooks;
import View.ViewRegister.ViewRegisterExemplary;
import View.ViewRegister.ViewRegisterBook;
import View.ViewRegister.ViewRegisterLibrarian;
import View.ViewRegister.ViewRegisterUser;

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
        jMenuUsuarios = new javax.swing.JMenu();
        jMenuItemAdicionarUsuario = new javax.swing.JMenuItem();
        jMenuItemRemoverUsuario = new javax.swing.JMenuItem();
        jMenuItemAlterarUsuario = new javax.swing.JMenuItem();
        jMenuItemListarUsuarios = new javax.swing.JMenuItem();
        jMenuLivros = new javax.swing.JMenu();
        jMenuItemAdicionarLivro = new javax.swing.JMenuItem();
        jMenuItemRemoverLivro = new javax.swing.JMenuItem();
        jMenuItemAlterarLivro = new javax.swing.JMenuItem();
        jMenuItemListarLivros = new javax.swing.JMenuItem();
        jMenuExemplares = new javax.swing.JMenu();
        jMenuItemAdicionarExemplar = new javax.swing.JMenuItem();
        jMenuItemRemoverExemplar = new javax.swing.JMenuItem();
        jMenuItemAlterarExemplar = new javax.swing.JMenuItem();
        jMenuItemListarExemplares = new javax.swing.JMenuItem();
        jMenuEmprestimos = new javax.swing.JMenu();
        jMenuItemRealizarEmprestimo = new javax.swing.JMenuItem();
        jMenuItemVisualizarEmprestimos = new javax.swing.JMenuItem();
        jMenuItemRenovarEmprestimo = new javax.swing.JMenuItem();
        jMenuDevolucao = new javax.swing.JMenu();
        jMenuItemRealizarDevolucao = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

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

        jMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/group.png"))); // NOI18N
        jMenuUsuarios.setText("Usuários");

        jMenuItemAdicionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        jMenuItemAdicionarUsuario.setText("Adicionar Usuário");
        jMenuItemAdicionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdicionarUsuarioActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemAdicionarUsuario);

        jMenuItemRemoverUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_delete.png"))); // NOI18N
        jMenuItemRemoverUsuario.setText("Remover Usuario");
        jMenuUsuarios.add(jMenuItemRemoverUsuario);

        jMenuItemAlterarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_edit.png"))); // NOI18N
        jMenuItemAlterarUsuario.setText("Alterar Usuário");
        jMenuUsuarios.add(jMenuItemAlterarUsuario);

        jMenuItemListarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/group_go.png"))); // NOI18N
        jMenuItemListarUsuarios.setText("Listar Usuários");
        jMenuUsuarios.add(jMenuItemListarUsuarios);

        jMenuBar1.add(jMenuUsuarios);

        jMenuLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book.png"))); // NOI18N
        jMenuLivros.setText("Livros");
        jMenuLivros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItemAdicionarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_add.png"))); // NOI18N
        jMenuItemAdicionarLivro.setText("Adicionar Livro");
        jMenuItemAdicionarLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemAdicionarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdicionarLivroActionPerformed(evt);
            }
        });
        jMenuLivros.add(jMenuItemAdicionarLivro);

        jMenuItemRemoverLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_delete.png"))); // NOI18N
        jMenuItemRemoverLivro.setText("Remover Livro");
        jMenuItemRemoverLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuLivros.add(jMenuItemRemoverLivro);

        jMenuItemAlterarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_edit.png"))); // NOI18N
        jMenuItemAlterarLivro.setText("Alterar Livro");
        jMenuItemAlterarLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuLivros.add(jMenuItemAlterarLivro);

        jMenuItemListarLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_open.png"))); // NOI18N
        jMenuItemListarLivros.setText("Listar Livros");
        jMenuItemListarLivros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemListarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarLivrosActionPerformed(evt);
            }
        });
        jMenuLivros.add(jMenuItemListarLivros);

        jMenuBar1.add(jMenuLivros);

        jMenuExemplares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book.png"))); // NOI18N
        jMenuExemplares.setText("Exemplares");

        jMenuItemAdicionarExemplar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_add.png"))); // NOI18N
        jMenuItemAdicionarExemplar.setText("Adicionar Exemplar");
        jMenuItemAdicionarExemplar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemAdicionarExemplarMouseClicked(evt);
            }
        });
        jMenuItemAdicionarExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdicionarExemplarActionPerformed(evt);
            }
        });
        jMenuExemplares.add(jMenuItemAdicionarExemplar);

        jMenuItemRemoverExemplar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_delete.png"))); // NOI18N
        jMenuItemRemoverExemplar.setText("Remover Exemplar");
        jMenuExemplares.add(jMenuItemRemoverExemplar);

        jMenuItemAlterarExemplar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_edit.png"))); // NOI18N
        jMenuItemAlterarExemplar.setText("Alterar Exemplar");
        jMenuExemplares.add(jMenuItemAlterarExemplar);

        jMenuItemListarExemplares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_open.png"))); // NOI18N
        jMenuItemListarExemplares.setText("Listar Exemplares");
        jMenuExemplares.add(jMenuItemListarExemplares);

        jMenuBar1.add(jMenuExemplares);

        jMenuEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_link.png"))); // NOI18N
        jMenuEmprestimos.setText("Empréstimos");

        jMenuItemRealizarEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_go.png"))); // NOI18N
        jMenuItemRealizarEmprestimo.setText("Realizar Empréstimo");
        jMenuItemRealizarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRealizarEmprestimoActionPerformed(evt);
            }
        });
        jMenuEmprestimos.add(jMenuItemRealizarEmprestimo);

        jMenuItemVisualizarEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_next.png"))); // NOI18N
        jMenuItemVisualizarEmprestimos.setText("Visualizar Empréstimos");
        jMenuEmprestimos.add(jMenuItemVisualizarEmprestimos);

        jMenuItemRenovarEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_error.png"))); // NOI18N
        jMenuItemRenovarEmprestimo.setText("Renovar Empréstimo");
        jMenuItemRenovarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRenovarEmprestimoActionPerformed(evt);
            }
        });
        jMenuEmprestimos.add(jMenuItemRenovarEmprestimo);

        jMenuBar1.add(jMenuEmprestimos);

        jMenuDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_key.png"))); // NOI18N
        jMenuDevolucao.setText("Devolução");

        jMenuItemRealizarDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book_previous.png"))); // NOI18N
        jMenuItemRealizarDevolucao.setText("Realizar Devolução");
        jMenuItemRealizarDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRealizarDevolucaoActionPerformed(evt);
            }
        });
        jMenuDevolucao.add(jMenuItemRealizarDevolucao);

        jMenuBar1.add(jMenuDevolucao);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_suit.png"))); // NOI18N
        jMenu1.setText("Bibliotecário");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_suit.png"))); // NOI18N
        jMenuItem1.setText("Adicionar Bibliotecário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door_out.png"))); // NOI18N
        jMenuSair.setText("Sair");
        jMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

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

    private void jMenuItemAdicionarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdicionarLivroActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewRegisterBook());
    }//GEN-LAST:event_jMenuItemAdicionarLivroActionPerformed

    private void jMenuItemAdicionarExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdicionarExemplarActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewRegisterExemplary());
    }//GEN-LAST:event_jMenuItemAdicionarExemplarActionPerformed

    private void jDesktopPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane1MouseClicked

    }//GEN-LAST:event_jDesktopPane1MouseClicked

    private void jMenuItemRenovarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRenovarEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRenovarEmprestimoActionPerformed

    private void jMenuItemRealizarDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRealizarDevolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRealizarDevolucaoActionPerformed

    private void jMenuItemRealizarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRealizarEmprestimoActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewValidateUser());
    }//GEN-LAST:event_jMenuItemRealizarEmprestimoActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed

    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        ChangeViewController.changeView(this, new ViewLogin());
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemAdicionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdicionarUsuarioActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewRegisterUser());
    }//GEN-LAST:event_jMenuItemAdicionarUsuarioActionPerformed

    private void jMenuItemAdicionarExemplarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemAdicionarExemplarMouseClicked

    }//GEN-LAST:event_jMenuItemAdicionarExemplarMouseClicked

    private void jMenuItemListarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarLivrosActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewShowBooks());
    }//GEN-LAST:event_jMenuItemListarLivrosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ChangeViewController.changeView(jDesktopPane1, new ViewRegisterLibrarian());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDevolucao;
    private javax.swing.JMenu jMenuEmprestimos;
    private javax.swing.JMenu jMenuExemplares;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAdicionarExemplar;
    private javax.swing.JMenuItem jMenuItemAdicionarLivro;
    private javax.swing.JMenuItem jMenuItemAdicionarUsuario;
    private javax.swing.JMenuItem jMenuItemAlterarExemplar;
    private javax.swing.JMenuItem jMenuItemAlterarLivro;
    private javax.swing.JMenuItem jMenuItemAlterarUsuario;
    private javax.swing.JMenuItem jMenuItemListarExemplares;
    private javax.swing.JMenuItem jMenuItemListarLivros;
    private javax.swing.JMenuItem jMenuItemListarUsuarios;
    private javax.swing.JMenuItem jMenuItemRealizarDevolucao;
    private javax.swing.JMenuItem jMenuItemRealizarEmprestimo;
    private javax.swing.JMenuItem jMenuItemRemoverExemplar;
    private javax.swing.JMenuItem jMenuItemRemoverLivro;
    private javax.swing.JMenuItem jMenuItemRemoverUsuario;
    private javax.swing.JMenuItem jMenuItemRenovarEmprestimo;
    private javax.swing.JMenuItem jMenuItemVisualizarEmprestimos;
    private javax.swing.JMenu jMenuLivros;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuUsuarios;
    // End of variables declaration//GEN-END:variables
}