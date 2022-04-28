/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesAdmin;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import practicamp.BaseDatos;
import practicamp.Operador;

/**
 *
 * @author pcris
 */
public class GUIBanear extends javax.swing.JFrame {

    private Operador operador;
    private BaseDatos base;

    /**
     * Creates new form GUIBanear
     */
    public GUIBanear(Operador operador) {
        this.base = new BaseDatos(); //Antes ponía this.base=base pero creo q hay q crear la basa
        this.operador = operador;
        initComponents();
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

        Aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ban", "Desbanear" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Lista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nombre))
                .addContainerGap(476, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(Aceptar)
                .addGap(18, 18, 18)
                .addComponent(Cancelar)
                .addGap(203, 203, 203))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        GUIOperador i = new GUIOperador(operador);
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        String nombre = Nombre.getText();

        try {
            this.base.DeserializePro("Ban");
        } catch (IOException ex) {
            Logger.getLogger(GUIBanear.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIBanear.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.base.DeserializePro("Usuario");
        } catch (IOException ex) {
            Logger.getLogger(GUIBanear.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIBanear.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ("Ban".equals(Lista.getSelectedValue())) {
            if (base.pertenece(nombre)) {
                if (!(base.perteneceBaneado(nombre))) {
                    base.getListabaneados().add(nombre);
                    JOptionPane.showMessageDialog(null, "'" + nombre + "'" + " ha sido baneado");
                    try {
                        base.SerializePro(Lista.getSelectedValue());
                    } catch (IOException ex) {
                        Logger.getLogger(GUIBanear.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ese usuario ya ha sido baneado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ese usuario no existe");
            }
        } else if ("Desbanear".equals(Lista.getSelectedValue())){
            base.getListabaneados().remove(nombre);
            JOptionPane.showMessageDialog(null, "'" + nombre + "'" + " ha sido desbaneado");
            try {
                base.SerializePro("Ban");
            } catch (IOException ex) {
                Logger.getLogger(GUIBanear.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_AceptarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIBanear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIBanear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIBanear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIBanear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIBanear(operador).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JList<String> Lista;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}