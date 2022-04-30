/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesAdmin;

import habilidades.Debilidad;
import habilidades.Fortaleza;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import personajes.Cazador;
import personajes.Licantropo;
import personajes.Vampiro;
import practicamp.BaseDatos;
import practicamp.Usuario;

/**
 *
 * @author pcris
 */
public class GUICrearPersonaje2 extends javax.swing.JFrame {

    int Tipo;//el tipo de personaje(vampiro etc)
    Usuario usuario;
    List<Fortaleza> Fortalezas = new ArrayList();
    List<Debilidad> Debilidades = new ArrayList();
    BaseDatos b;

    /**
     * Creates new form GUICrearPersonaje2
     */
    public GUICrearPersonaje2(int tipo, Usuario u) throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        this.Tipo = tipo;
        this.usuario = u;
        //       b.DeserializePro("nombre");//todas
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombre = new javax.swing.JTextField();
        Salud = new javax.swing.JTextField();
        Poder = new javax.swing.JTextField();
        MostrarArmas = new javax.swing.JButton();
        MostrarArmaduras = new javax.swing.JButton();
        MostrarFortalezas = new javax.swing.JButton();
        Debilidad = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaArmas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaDebilidades = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaArmaduras = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaFortalezas = new javax.swing.JList<>();
        AñadirFort = new javax.swing.JButton();
        AñadirDeb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Nombre.setText("Nombre");
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        Salud.setText("Salud");

        Poder.setText("Poder");
        Poder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoderActionPerformed(evt);
            }
        });

        MostrarArmas.setText("Mostrar Armas");
        MostrarArmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarArmasActionPerformed(evt);
            }
        });

        MostrarArmaduras.setText("Mostrar Armaduras");
        MostrarArmaduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarArmadurasActionPerformed(evt);
            }
        });

        MostrarFortalezas.setText("Mostrar Fortalezas");
        MostrarFortalezas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarFortalezasActionPerformed(evt);
            }
        });

        Debilidad.setText("Mostrar debilidades");
        Debilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebilidadActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(ListaArmas);

        jScrollPane2.setViewportView(ListaDebilidades);

        jScrollPane3.setViewportView(ListaArmaduras);

        jScrollPane4.setViewportView(ListaFortalezas);

        AñadirFort.setText("Añadir Fortaleza");
        AñadirFort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirFortActionPerformed(evt);
            }
        });

        AñadirDeb.setText("Añadir Debilidad");
        AñadirDeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirDebActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MostrarArmas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(AñadirFort)
                                .addComponent(MostrarFortalezas)))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Debilidad)
                            .addComponent(MostrarArmaduras)
                            .addComponent(AñadirDeb, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(Salud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(Poder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Aceptar)))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Poder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Aceptar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(MostrarArmas))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(MostrarArmaduras))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(MostrarFortalezas))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(Debilidad)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AñadirFort)
                            .addComponent(AñadirDeb))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(170, 170, 170))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void PoderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoderActionPerformed

    private void DebilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebilidadActionPerformed
        DefaultListModel dlm1 = new DefaultListModel();
        BaseDatos b = new BaseDatos();
        try {
            b.DeserializePro("Debilidad");
        } catch (IOException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i = b.getListaDebilidades().size();
        for (int j = 0; j < i; j++) {
            dlm1.addElement(b.getListaDebilidades().get(j).getName());
        }
        ListaDebilidades.setModel(dlm1);
    }//GEN-LAST:event_DebilidadActionPerformed

    private void MostrarArmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarArmasActionPerformed
        DefaultListModel dlm1 = new DefaultListModel();
        BaseDatos b = new BaseDatos();
        try {
            b.DeserializePro("Arma");
        } catch (IOException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i = b.getListaArmas().size();
        for (int j = 0; j < i; j++) {
            dlm1.addElement(b.getListaArmas().get(j).getName());
        }
        ListaArmas.setModel(dlm1);
    }//GEN-LAST:event_MostrarArmasActionPerformed

    private void MostrarArmadurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarArmadurasActionPerformed
        DefaultListModel dlm1 = new DefaultListModel();
        BaseDatos b = new BaseDatos();
        try {
            b.DeserializePro("Armadura");
        } catch (IOException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i = b.getListaArmaduras().size();
        for (int j = 0; j < i; j++) {
            dlm1.addElement(b.getListaArmaduras().get(j).getName());
        }
        ListaArmaduras.setModel(dlm1);
    }//GEN-LAST:event_MostrarArmadurasActionPerformed

    private void MostrarFortalezasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarFortalezasActionPerformed
        DefaultListModel dlm1 = new DefaultListModel();
        BaseDatos b = new BaseDatos();
        try {
            b.DeserializePro("Fortaleza");
        } catch (IOException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i = b.getListaFortalezas().size();
        for (int j = 0; j < i; j++) {
            dlm1.addElement(b.getListaFortalezas().get(j).getName());
        }
        ListaFortalezas.setModel(dlm1);
    }//GEN-LAST:event_MostrarFortalezasActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        BaseDatos b = new BaseDatos();
        try {
            b.DeserializePro("Arma");
        } catch (IOException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            b.DeserializePro("Armadura");
        } catch (IOException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        }
        String nombre = Nombre.getText();
        int salud = Integer.valueOf(Salud.getText());
        int poder = Integer.valueOf(Poder.getText());
        int arma = ListaArmas.getSelectedIndex();
        int armadura = ListaArmaduras.getSelectedIndex();
//        int debilidades = ListaDebilidades.getSelectedIndex();

        if (Tipo == 1) {
            Vampiro v;
            v = new Vampiro(nombre, salud, poder, b.getListaArmas().get(arma), b.getListaArmaduras().get(armadura), this.Debilidades, this.Fortalezas);
            Usuario u = this.usuario;
            GUICrearPersonaje3 g3 = new GUICrearPersonaje3(1, u, v);
            g3.setVisible(true);
            this.setVisible(false);
        } else if (Tipo == 2) {
            Licantropo l;
            l = new Licantropo(nombre, salud, poder, b.getListaArmas().get(arma), b.getListaArmaduras().get(armadura), this.Debilidades, this.Fortalezas);
            Usuario u = this.usuario;
            GUICrearPersonaje3 g3 = new GUICrearPersonaje3(2, u, l);
            g3.setVisible(true);
            this.setVisible(false);
        } else {
            Cazador c;
            c = new Cazador(nombre, salud, poder, b.getListaArmas().get(arma), b.getListaArmaduras().get(armadura), this.Debilidades, this.Fortalezas);
            Usuario u = this.usuario;
            GUICrearPersonaje3 g3 = new GUICrearPersonaje3(3, u, c);
            g3.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void AñadirDebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirDebActionPerformed
        BaseDatos b = new BaseDatos();
        try {
            b.DeserializePro("Debilidad");
        } catch (IOException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        }
        int k = ListaDebilidades.getSelectedIndex();
        Debilidades.add(b.getListaDebilidades().get(k));
        DefaultListModel dlm1 = new DefaultListModel();

        int i = b.getListaDebilidades().size();
        boolean pertenece;
        for (int j = 0; j < i; j++) {
            pertenece = false;

            for (Debilidad list : Debilidades) {
                if (list.getName().equals(b.getListaDebilidades().get(j).getName())) {
                    pertenece = true;
                }

                if (pertenece) {
                    dlm1.addElement("");
                } else {
                    dlm1.addElement(b.getListaDebilidades().get(j).getName());
                }
            }
            ListaDebilidades.setModel(dlm1);
        }
    }//GEN-LAST:event_AñadirDebActionPerformed

    private void AñadirFortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirFortActionPerformed
        BaseDatos b = new BaseDatos();
        try {
            b.DeserializePro("Fortaleza");
        } catch (IOException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
        }
        int k = ListaFortalezas.getSelectedIndex();
        Fortalezas.add(b.getListaFortalezas().get(k));
        DefaultListModel dlm1 = new DefaultListModel();
        int i = b.getListaFortalezas().size();
        boolean pertenece;
        for (int j = 0; j < i; j++) {
            pertenece = false;
            for (Fortaleza list : Fortalezas) {
                if (list.getName().equals(b.getListaFortalezas().get(j).getName())) {
                    pertenece = true;
                }

                if (pertenece) {
                    dlm1.addElement("");
                } else {
                    dlm1.addElement(b.getListaFortalezas().get(j).getName());
                }
            }
            ListaFortalezas.setModel(dlm1);
        }
    }//GEN-LAST:event_AñadirFortActionPerformed

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
            java.util.logging.Logger.getLogger(GUICrearPersonaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICrearPersonaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICrearPersonaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICrearPersonaje2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUICrearPersonaje2(Tipo, usuario).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUICrearPersonaje2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton AñadirDeb;
    private javax.swing.JButton AñadirFort;
    private javax.swing.JButton Debilidad;
    private javax.swing.JList<String> ListaArmaduras;
    private javax.swing.JList<String> ListaArmas;
    private javax.swing.JList<String> ListaDebilidades;
    private javax.swing.JList<String> ListaFortalezas;
    private javax.swing.JButton MostrarArmaduras;
    private javax.swing.JButton MostrarArmas;
    private javax.swing.JButton MostrarFortalezas;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Poder;
    private javax.swing.JTextField Salud;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

}
