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
public class GUIEditarPersonaje2 extends javax.swing.JFrame {
    
    private Operador operador;
    private Usuario usuario;
    private Personaje personaje;

    /**
     * Creates new form GUIEditarPersonaje2
     */
    public GUIEditarPersonaje2(Usuario u, Personaje p, Operador operador) {
        initComponents();
        this.operador = operador;
        this.usuario = u;
        this.personaje = p;
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

        LHabilidadesP = new javax.swing.JScrollPane();
        LDebilidadesPers = new javax.swing.JList<>();
        LHabilidadesBD = new javax.swing.JScrollPane();
        ListaDebilidades = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Mostrar = new javax.swing.JButton();
        QuitarDebilidad = new javax.swing.JButton();
        AñadirDebilidad = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Mostrar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LFortalezasPers = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaFortalezas = new javax.swing.JList<>();
        QuitarFortaleza = new javax.swing.JButton();
        AñadirFortaleza = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LDebilidadesPers.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        LHabilidadesP.setViewportView(LDebilidadesPers);

        ListaDebilidades.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        LHabilidadesBD.setViewportView(ListaDebilidades);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel1.setText("Debilidades del personaje");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel2.setText("Debilidades");

        Mostrar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        Mostrar.setText("Mostrar Debilidades");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        QuitarDebilidad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        QuitarDebilidad.setText("Quitar Debilidad");
        QuitarDebilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarDebilidadActionPerformed(evt);
            }
        });

        AñadirDebilidad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        AñadirDebilidad.setText("Añadir Debilidad");
        AñadirDebilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirDebilidadActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel3.setText("Fortalezas del personaje");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel4.setText("Fortalezas");

        Mostrar2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        Mostrar2.setText("Mostrar Fortalezas");
        Mostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar2ActionPerformed(evt);
            }
        });

        LFortalezasPers.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(LFortalezasPers);

        ListaFortalezas.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(ListaFortalezas);

        QuitarFortaleza.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        QuitarFortaleza.setText("Quitar Fortaleza");
        QuitarFortaleza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarFortalezaActionPerformed(evt);
            }
        });

        AñadirFortaleza.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        AñadirFortaleza.setText("Añadir Fortaleza");
        AñadirFortaleza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirFortalezaActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel5.setText("Editar modificadores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QuitarDebilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mostrar2)
                    .addComponent(QuitarFortaleza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LHabilidadesP, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LHabilidadesBD, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cancelar))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AñadirFortaleza)
                    .addComponent(AñadirDebilidad))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AñadirDebilidad, AñadirFortaleza, Mostrar, Mostrar2, QuitarDebilidad, QuitarFortaleza});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LHabilidadesBD, LHabilidadesP, jScrollPane1, jScrollPane2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mostrar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LHabilidadesP, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LHabilidadesBD, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(AñadirDebilidad))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(QuitarDebilidad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AñadirFortaleza)
                        .addGap(78, 78, 78))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Mostrar2)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(QuitarFortaleza)))))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(Cancelar))
                .addGap(34, 34, 34))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AñadirDebilidad, AñadirFortaleza, Mostrar, Mostrar2, QuitarDebilidad, QuitarFortaleza});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LHabilidadesBD, LHabilidadesP, jScrollPane1, jScrollPane2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("unchecked")
    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        BaseDatos b = new BaseDatos();
        try {
            b.deserializePro("Debilidad");
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(GUIEditarPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultListModel dlm1 = new DefaultListModel();
        int i = b.getListaDebilidades().size();
        for (int j = 0; j < i; j++) {
            if (personaje.getDebilidades().contains(b.getListaDebilidades().get(j))) {
                dlm1.addElement(" ");
            } else {
                dlm1.addElement(b.getListaDebilidades().get(j).getName());
            }
        }
        ListaDebilidades.setModel(dlm1);
        DefaultListModel dlm2 = new DefaultListModel();
        int k = personaje.getDebilidades().size();
        for (int j = 0; j < k; j++) {
            dlm2.addElement(personaje.getDebilidades().get(j).getName());
        }
        LDebilidadesPers.setModel(dlm2);

    }//GEN-LAST:event_MostrarActionPerformed

    private void AñadirDebilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirDebilidadActionPerformed
        int numH = ListaDebilidades.getSelectedIndex();
        BaseDatos b = new BaseDatos();
        try {
            b.deserializePro("Debilidad");
        } catch (IOException ex) {
            Logger.getLogger(GUIEditarPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIEditarPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        }
        personaje.getDebilidades().add(b.getListaDebilidades().get(numH));
        Mostrar.doClick();
    }//GEN-LAST:event_AñadirDebilidadActionPerformed

    private void QuitarDebilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitarDebilidadActionPerformed
        int numH = LDebilidadesPers.getSelectedIndex();
        personaje.getDebilidades().remove(numH);
        Mostrar.doClick();
    }//GEN-LAST:event_QuitarDebilidadActionPerformed

    @SuppressWarnings("unchecked")
    private void Mostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar2ActionPerformed
        BaseDatos b = new BaseDatos();
        try {
            b.deserializePro("Fortaleza");
        } catch (IOException ex) {
            Logger.getLogger(GUIEditarPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIEditarPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultListModel dlm1 = new DefaultListModel();
        int i = b.getListaFortalezas().size();
        for (int j = 0; j < i; j++) {
            if (personaje.getFortalezas().contains(b.getListaFortalezas().get(j))) {
                dlm1.addElement(" ");
            } else {
                dlm1.addElement(b.getListaFortalezas().get(j).getName());
            }
        }
        ListaFortalezas.setModel(dlm1);
        DefaultListModel dlm2 = new DefaultListModel();
        int k = personaje.getFortalezas().size();
        for (int j = 0; j < k; j++) {
            dlm2.addElement(personaje.getFortalezas().get(j).getName());
        }
        LFortalezasPers.setModel(dlm2);

    }//GEN-LAST:event_Mostrar2ActionPerformed

    private void QuitarFortalezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitarFortalezaActionPerformed
        int numF = LFortalezasPers.getSelectedIndex();
        personaje.getFortalezas().remove(numF);
        Mostrar2.doClick();
    }//GEN-LAST:event_QuitarFortalezaActionPerformed

    private void AñadirFortalezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirFortalezaActionPerformed
        int numH = ListaFortalezas.getSelectedIndex();
        BaseDatos b = new BaseDatos();
        try {
            b.deserializePro("Fortaleza");
        } catch (IOException ex) {
            Logger.getLogger(GUIEditarPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIEditarPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        }
        personaje.getFortalezas().add(b.getListaFortalezas().get(numH));
        Mostrar2.doClick();
    }//GEN-LAST:event_AñadirFortalezaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        GUIEditarPersonaje3 g = new GUIEditarPersonaje3(usuario, personaje, operador);
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIEditarPersonaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEditarPersonaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEditarPersonaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEditarPersonaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEditarPersonaje2(usuario, personaje, operador).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AñadirDebilidad;
    private javax.swing.JButton AñadirFortaleza;
    private javax.swing.JButton Cancelar;
    private javax.swing.JList<String> LDebilidadesPers;
    private javax.swing.JList<String> LFortalezasPers;
    private javax.swing.JScrollPane LHabilidadesBD;
    private javax.swing.JScrollPane LHabilidadesP;
    private javax.swing.JList<String> ListaDebilidades;
    private javax.swing.JList<String> ListaFortalezas;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Mostrar2;
    private javax.swing.JButton QuitarDebilidad;
    private javax.swing.JButton QuitarFortaleza;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
