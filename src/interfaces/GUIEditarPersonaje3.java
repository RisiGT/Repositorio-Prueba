/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacesPersonalizacion;

import interfacesAdmin.GUIOperador;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import personajes.Personaje;
import practicamp.BaseDatos;
import practicamp.Operador;
import practicamp.Usuario;

/**
 *
 * @author PcCom
 */
public class GUIEditarPersonaje3 extends javax.swing.JFrame {

    /**
     * Creates new form GUIEditarPersonaje3
     */
 private   Usuario Usuario;
 private   Personaje Personaje;
 private Operador operador;
    /**
     * Creates new form GUIEditarPersonaje2
     */
    public GUIEditarPersonaje3(Usuario u, Personaje p, Operador operador) {
        initComponents();
        this.operador = operador;
        Usuario = u;
        Personaje = p;
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

        Editar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaHabilidades = new javax.swing.JList<>();
        Mostrar = new javax.swing.JButton();
        Seleccionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfSalud = new javax.swing.JTextField();
        tfPoder = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Editar.setText("Guardar Cambios");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ListaHabilidades);

        Mostrar.setText("Mostrar Habilidades");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        Seleccionar.setText("Seleccionar Habilidad");

        jLabel1.setText("Salud");

        jLabel2.setText("Poder");

        tfSalud.setText(" 1");
        tfSalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSaludActionPerformed(evt);
            }
        });

        tfPoder.setText("1");

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Seleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPoder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Cancelar)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Editar)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Editar)
                    .addComponent(Cancelar))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Mostrar)
                .addGap(28, 28, 28)
                .addComponent(Seleccionar)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPoder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        BaseDatos b = new BaseDatos();
        switch (Personaje.getTipo()) {
            case 1: {
                try {
                    b.DeserializePro("Disciplina");
                } catch (IOException ex) {
                    Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(Level.SEVERE, null, ex);
                }
                DefaultListModel dlm = new DefaultListModel();
                int i = b.getListaDisciplinas().size();
                for (int j = 0; j < i; j++) {
                    dlm.addElement(b.getListaDisciplinas().get(j).getName());
                }
                ListaHabilidades.setModel(dlm);
                break;
            }
            case 2: {
                try {
                    b.DeserializePro("Don");
                } catch (IOException ex) {
                    Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(Level.SEVERE, null, ex);
                }
                DefaultListModel dlm = new DefaultListModel();
                int i = b.getListaDones().size();
                for (int j = 0; j < i; j++) {
                    dlm.addElement(b.getListaDones().get(j).getName());
                }
                ListaHabilidades.setModel(dlm);
                break;
            }
            case 3: {
                try {
                    b.DeserializePro("Talento");
                } catch (IOException ex) {
                    Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(Level.SEVERE, null, ex);
                }
                DefaultListModel dlm = new DefaultListModel();
                int i = b.getListaTalentos().size();
                for (int j = 0; j < i; j++) {
                    dlm.addElement(b.getListaTalentos().get(j).getName());
                }
                ListaHabilidades.setModel(dlm);
                break;
            }
        }
    }//GEN-LAST:event_MostrarActionPerformed

    private void tfSaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaludActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaludActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        BaseDatos b = new BaseDatos();
        switch (Personaje.getTipo()) {
            case 1: {
                try {
                    b.DeserializePro("Disciplina");
                } catch (IOException ex) {
                    Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(Level.SEVERE, null, ex);
                }
                Personaje.setHabilidadEspecial(b.getListaDisciplinas().get(ListaHabilidades.getSelectedIndex()));
            }
            case 2: {
                try {
                    b.DeserializePro("Don");
                } catch (IOException ex) {
                    Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(Level.SEVERE, null, ex);
                }
                Personaje.setHabilidadEspecial(b.getListaDones().get(ListaHabilidades.getSelectedIndex()));
            }
            case 3: {
                try {
                    b.DeserializePro("Talento");
                } catch (IOException ex) {
                    Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(Level.SEVERE, null, ex);
                }
                Personaje.setHabilidadEspecial(b.getListaTalentos().get(ListaHabilidades.getSelectedIndex()));
            }
            Personaje.setSalud(Integer.valueOf(tfSalud.getText()));
            Personaje.setPoder(Integer.valueOf(tfPoder.getText()));
            Usuario.getPersonajes().remove(Personaje);
            Usuario.getPersonajes().add(Personaje);
            b.actualizarUsuario(Usuario);
        GUIOperador i = new GUIOperador(operador);
        i.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        GUIOperador i = new GUIOperador(operador);
        i.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEditarPersonaje3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEditarPersonaje3(Usuario, Personaje, operador).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Editar;
    private javax.swing.JList<String> ListaHabilidades;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Seleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfPoder;
    private javax.swing.JTextField tfSalud;
    // End of variables declaration//GEN-END:variables
}
