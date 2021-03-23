/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectminosql;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author gigabyte
 */
public class AgregarColumnas extends javax.swing.JDialog {
    private List<JButton> botones;
    public static List<JLabel> columnas;
    private int indice;

    /**
     * Creates new form AgregarColumnas
     */
    public AgregarColumnas(){
        
    }
    public AgregarColumnas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        botones=new ArrayList<>();
        columnas=new ArrayList<>();
        indice=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textColumna = new javax.swing.JTextField();
        buttonAgregarColumna = new javax.swing.JButton();
        listo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelColumna = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        textColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textColumnaActionPerformed(evt);
            }
        });

        buttonAgregarColumna.setText("Nueva Columna");
        buttonAgregarColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarColumnaActionPerformed(evt);
            }
        });

        listo.setText("Listo");
        listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listoActionPerformed(evt);
            }
        });

        panelColumna.setLayout(new javax.swing.BoxLayout(panelColumna, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(panelColumna);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textColumna)
                                .addGap(18, 18, 18)
                                .addComponent(buttonAgregarColumna))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(listo)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAgregarColumna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listo)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAgregarColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarColumnaActionPerformed

       String columna=textColumna.getText();
       JLabel nom=new JLabel(columna);
       JButton boton=new JButton("X");
       panelColumna.add(nom);
       columnas.add(nom);
       panelColumna.add(boton);
       botones.add(boton);
       indice++;
       textColumna.setText("");
       boton.addActionListener(new ActionListener(){
            @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("boton presionado");
                         panelColumna.remove(nom);
                         columnas.remove(nom);
                         panelColumna.remove(boton);
                         panelColumna.updateUI();
                    }
       });
       
       panelColumna.updateUI();
    }//GEN-LAST:event_buttonAgregarColumnaActionPerformed

    private void textColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textColumnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textColumnaActionPerformed

    private void listoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listoActionPerformed
       
       DefaultTableModel dtm = (DefaultTableModel) Ventana.tabla.getModel();
       
       for(JLabel txt:columnas){
           System.out.println(txt.getText());
                dtm.addColumn(txt.getText());
                Ventana.comboColumas.addItem(txt.getText());
                
       }
       dispose();

       //     ventana.tabla.updateUI();
       
        
    }//GEN-LAST:event_listoActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarColumnas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarColumnas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarColumnas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarColumnas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarColumnas dialog = new AgregarColumnas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgregarColumna;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JButton listo;
    private javax.swing.JPanel panelColumna;
    public static javax.swing.JTextField textColumna;
    // End of variables declaration//GEN-END:variables
}
