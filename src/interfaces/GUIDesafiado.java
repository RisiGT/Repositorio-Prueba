/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import personajes.Demonio;
import personajes.Esbirro;
import personajes.Ghoul;
import personajes.Humano;
import personajes.Personaje;
import practicamp.BaseDatos;
import practicamp.Desafio;
import practicamp.Usuario;

/**
 *
 * @author pcris
 */
public class GUIDesafiado extends javax.swing.JFrame {

    private Desafio desafio;
    private Usuario usuario;
    private BaseDatos base;
    private ArrayList<Esbirro> listaEsbirros = new ArrayList<Esbirro>();

    /**
     * Creates new form GUIDesafiado
     */
    public GUIDesafiado(Usuario usuario, Desafio desafio) {
        initComponents();
        this.usuario = usuario;
        this.desafio = desafio;
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

        MensajeIni = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        MensajeOro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaPersonajes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaArmas = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaArmaduras = new javax.swing.JList<>();
        MostrarArmas = new javax.swing.JButton();
        MostrarArmaduras = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        seleccionEsbirro = new javax.swing.JList<>();
        nombreEsbirro = new javax.swing.JTextField();
        añadirEsbirro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(814, 668));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MensajeIni.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        MensajeIni.setText("Has sido desafiado por:");
        getContentPane().add(MensajeIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 316, 33));

        Aceptar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, -1, -1));

        Cancelar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));

        MensajeOro.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        MensajeOro.setText("Si cancelas perderás: ");
        getContentPane().add(MensajeOro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, 291, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione su personaje");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        ListaPersonajes.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        ListaPersonajes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Lorem ipsum" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaPersonajes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 160, 180));

        ListaArmas.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        ListaArmas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Lorem ipsum" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListaArmas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 160, 180));

        ListaArmaduras.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        ListaArmaduras.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Lorem ipsum" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(ListaArmaduras);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 160, 180));

        MostrarArmas.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        MostrarArmas.setText("Armas disponibles");
        MostrarArmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarArmasActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarArmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 190, -1));

        MostrarArmaduras.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        MostrarArmaduras.setText("Armaduras disponibles");
        MostrarArmaduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarArmadurasActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarArmaduras, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 200, -1));

        seleccionEsbirro.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        seleccionEsbirro.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "10 monedas - Humano", "20 monedas - Ghoul", "30 monedas - Demonio" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(seleccionEsbirro);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 170, 80));

        nombreEsbirro.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        getContentPane().add(nombreEsbirro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 180, -1));

        añadirEsbirro.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        añadirEsbirro.setText("Añadir esbirro");
        añadirEsbirro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirEsbirroActionPerformed(evt);
            }
        });
        getContentPane().add(añadirEsbirro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel1.setText("Nombre de su esbirro:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel6.setText("Precio / Esbirro");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 190, 20));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel7.setText("Compra de esbirros (Opcional)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("unchecked")
    private void MostrarArmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarArmasActionPerformed
        DefaultListModel dlm1 = new DefaultListModel();
        BaseDatos b = new BaseDatos();
        try {
            b.deserializePro("Arma");
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i = b.getListaArmas().size();
        for (int j = 0; j < i; j++) {
            dlm1.addElement(b.getListaArmas().get(j).getName());
        }
        ListaArmas.setModel(dlm1);
        try {
            b.serializePro("Arma");
        } catch (IOException ex) {
            Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MostrarArmasActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if (!(ListaPersonajes.getSelectedValue() == (null))) {
            if (!(ListaArmas.getSelectedValue() == (null))) {
                if (!(ListaArmaduras.getSelectedValue() == (null))) {
                    BaseDatos b = this.base;
                    try {
                        b.deserializePro("Arma");
                    } catch (IOException ex) {
                        Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        b.deserializePro("Armadura");
                    } catch (IOException ex) {
                        Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Personaje personaje = usuario.getPersonaje(ListaPersonajes.getSelectedValue());
                    personaje.setEsbirros(listaEsbirros);
                    personaje.setArmasActivas(b.getListaArmas().get(ListaArmas.getSelectedIndex()));                   
                    personaje.setArmaduraActiva(b.getListaArmaduras().get((ListaArmaduras.getSelectedIndex())));
                    try {
                        b.deserializePro("Desafio");
                    } catch (IOException ex) {
                        Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    for (Desafio desafio : b.getListadesafios()) {
                        if (desafio.getDesafiado().getNombre().equals(usuario.getNombre())) {
                            desafio.setPersonajeDesafiado(personaje);
                            desafio.setEstado(1);
                            int oro = desafio.getOro();
                            if(usuario.getOro()<desafio.getOro()){
                                desafio.setOro(desafio.getOro()+usuario.getOro());
                                desafio.setOroDesafiado(usuario.getOro());
                                usuario.setOro(0);                               
                            }
                            else{
                                usuario.setOro(usuario.getOro()-desafio.getOro());
                                desafio.setOroDesafiado(usuario.getOro());
                                desafio.setOro(desafio.getOro()*2);
                            }
                        }
                    }     
                    System.out.println();
                    try {
                        b.serializePro("Desafio");
                    } catch (IOException ex) {
                        Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    GUIMenuUsuario i = new GUIMenuUsuario(usuario);
                    i.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione la armadura");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un arma");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un personaje");
        }
    }//GEN-LAST:event_AceptarActionPerformed

    @SuppressWarnings("unchecked")
    private void MostrarArmadurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarArmadurasActionPerformed
        DefaultListModel dlm1 = new DefaultListModel();
        BaseDatos b = new BaseDatos();
        try {
            b.deserializePro("Armadura");
        } catch (IOException ex) {
            Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i = b.getListaArmaduras().size();
        for (int j = 0; j < i; j++) {
            dlm1.addElement(b.getListaArmaduras().get(j).getName());
        }
        ListaArmaduras.setModel(dlm1);
    }//GEN-LAST:event_MostrarArmadurasActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        BaseDatos b = this.base;
        try {
            b.deserializePro("Usuario");
        } catch (IOException ex) {
            Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Usuario usuario : b.getListausuarios()) {
            if (usuario.getNombre().equals(this.usuario.getNombre())) {
                usuario.RestarOro(desafio.oroPorRechazar());
            }
        }
        try {
            b.serializePro("Usuario");
        } catch (IOException ex) {
            Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
        }
        GUIMenuUsuario i = new GUIMenuUsuario(usuario);
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    @SuppressWarnings("unchecked")
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MensajeIni.setText("Has sido desafiado por " + desafio.getDesafiante().getNombre());
        MensajeOro.setText("Si cancelas perderas " + Integer.toString(desafio.oroPorRechazar()) + " de oro");
        DefaultListModel dlm1 = new DefaultListModel();
        int i = usuario.getPersonajes().size();
        for (int j = 0; j < i; j++) {
            dlm1.addElement(usuario.getPersonajes().get(j).getNombre());
        }
        ListaPersonajes.setModel(dlm1);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void añadirEsbirroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirEsbirroActionPerformed
        if (!(seleccionEsbirro.getSelectedValue() == null)) {
            switch (seleccionEsbirro.getSelectedIndex()) {
                case 1:
                    if (usuario.getOro() >= 10) {
                        Humano h = new Humano(nombreEsbirro.getText(), 2, 0);
                        listaEsbirros.add(h);
                        usuario.setOro(usuario.getOro() - 10);
                    } else {
                        JOptionPane.showMessageDialog(null, "Oro insuficiente");                //oro insuficiente
                    }
                    break;
                case 2:
                    if (usuario.getOro() >= 20) {
                        Ghoul g = new Ghoul(nombreEsbirro.getText(), 2, 0);
                        listaEsbirros.add(g);
                        usuario.setOro(usuario.getOro() - 20);
                    } else {
                        JOptionPane.showMessageDialog(null, "Oro insuficiente");                //oro insuficiente
                    }
                    break;
                case 3:
                    if (usuario.getOro() >= 30) {
                        Demonio d = new Demonio(nombreEsbirro.getText(), 2, "Pacto del demonio " + nombreEsbirro.getText() + " con " + usuario.getNombre());
                        Random rand = new Random();
                        int j = rand.nextInt(3);
                        for (int i = 0; i <= j; i++) {
                            String s = Integer.toString(i);
                            Ghoul g = new Ghoul("Esbirro del demonio " + nombreEsbirro.getText() + " número " + s, 2, 0);
                        }
                        listaEsbirros.add(d);
                        usuario.setOro(usuario.getOro() - 30);
                    } else {
                        JOptionPane.showMessageDialog(null, "Oro insuficiente");                //oro insuficiente
                    }

                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione el tipo de esbirro");
        }
    }//GEN-LAST:event_añadirEsbirroActionPerformed

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
            java.util.logging.Logger.getLogger(GUIDesafiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIDesafiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIDesafiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIDesafiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("unchecked")
            public void run() {
                new GUIDesafiado(usuario, desafio).setVisible(true);
                MensajeIni.setText("Has sido desafiado por " + desafio.getDesafiante());
                MensajeOro.setText("Si cancelas perderas " + desafio.oroPorRechazar() + " de oro");
                DefaultListModel dlm1 = new DefaultListModel();
                int i = usuario.getPersonajes().size();
                for (int j = 0; j < i; j++) {
                    dlm1.addElement(usuario.getPersonajes().get(j).getNombre());
                }
                ListaPersonajes.setModel(dlm1);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JList<String> ListaArmaduras;
    private javax.swing.JList<String> ListaArmas;
    private javax.swing.JList<String> ListaPersonajes;
    private javax.swing.JLabel MensajeIni;
    private javax.swing.JLabel MensajeOro;
    private javax.swing.JButton MostrarArmaduras;
    private javax.swing.JButton MostrarArmas;
    private javax.swing.JButton añadirEsbirro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField nombreEsbirro;
    private javax.swing.JList<String> seleccionEsbirro;
    // End of variables declaration//GEN-END:variables
}
