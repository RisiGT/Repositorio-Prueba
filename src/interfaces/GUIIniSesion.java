/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import interfacesAdmin.GUIOperador;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import practicamp.BaseDatos;

/**
 *
 * @author PcCom
 */
public class GUIIniSesion extends javax.swing.JFrame {

    private String name;
    private String password;
    private BaseDatos base;
    private GUIMenuIni mi;

    public GUIMenuIni getMi() {
        return mi;
    }

    public void setMi(GUIMenuIni mi) {
        this.mi = mi;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    /**
     * Creates new form GUIIniSesion
     */
    public GUIIniSesion() {
        initComponents();
        this.base = new BaseDatos();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        SignIn = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        Title.setText("PUSH OR NOT PUSH, BUT NOT PULL");
        Title.setToolTipText("");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 910, 120));

        lblUser.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        lblUser.setText("Usuario");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 120, 30));

        lblPassword.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        lblPassword.setText("Contraseña");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 130, 30));

        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 190, 30));

        SignIn.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        SignIn.setText("Entrar");
        SignIn.setToolTipText("");
        SignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInMouseClicked(evt);
            }
        });
        SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInActionPerformed(evt);
            }
        });
        getContentPane().add(SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 120, 40));

        Exit.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        Exit.setText("Salir");
        Exit.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 100, -1));

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, 190, 30));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo Espada.jpg"))); // NOI18N
        Background.setText("jLabel1");
        Background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-400, -190, 1670, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void SignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SignInMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        GUIMenuIni m = this.mi;
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void SignInActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //this.Password= new String(Arrays.toString(Password.getPassword()));
        this.name = new String(User.getText());
        this.password = new String(Password.getText());
        
        BaseDatos b = this.base;
        
        try {
            b.DeserializePro("Operator");
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(GUIIniSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (b.perteneceOperador(name)) {
            if (b.okIniOperador(name, password)) {
                GUIOperador i = new GUIOperador(b.getOperador(name));
                i.setVisible(true);
                this.setVisible(false);
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
            
        } else {
            
            try {
                b.DeserializePro("Usuario");
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(GUIIniSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                b.DeserializePro("Ban");
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(GUIIniSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (!(b.perteneceBaneado(name))) {
                if (b.pertenece(name)) {
                    if (b.okIni(name, password)) {
                        GUIMenuUsuario i = new GUIMenuUsuario(b.getUsuario(name));
                        i.setVisible(true);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no existente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cuenta baneada");
            }
        }
//<<<<<<< HEAD
    }                                       

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void Contraseña2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contraseña2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contraseña2ActionPerformed

    private void InicSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InicSesionActionPerformed
//=======
                                          
//>>>>>>> origin/DejaosDeLLoros
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
            java.util.logging.Logger.getLogger(GUIIniSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIIniSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIIniSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIIniSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIIniSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Exit;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton SignIn;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField User;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
