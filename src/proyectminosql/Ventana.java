/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectminosql;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author gigabyte
 */
public class Ventana extends javax.swing.JFrame implements ActionListener {
    int i;
    int[] indice;
    String ubicacion;
    public Ventana() {
        this.ubicacion = System.getProperty("user.dir");
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

        comboEsquema = new javax.swing.JComboBox<>();
        textEsquema = new javax.swing.JTextField();
        buttonEsquema = new javax.swing.JButton();
        buttonBorrarEsquema = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        comboTabla = new javax.swing.JComboBox<>();
        textTabla = new javax.swing.JTextField();
        buttonTabla = new javax.swing.JButton();
        buttonBorrarTabla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonCargarTodos = new javax.swing.JButton();
        buttonBorrarFila = new javax.swing.JButton();
        buttonBuscarColumna = new javax.swing.JButton();
        comboColumas = new javax.swing.JComboBox<>();
        textBuscarColumna = new javax.swing.JTextField();
        textBuscarComando = new javax.swing.JTextField();
        buttonBuscarComando = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboEsquema.setActionCommand("comboEsquema");
        comboEsquema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEsquemaActionPerformed(evt);
            }
        });

        textEsquema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEsquemaActionPerformed(evt);
            }
        });

        buttonEsquema.setText("Nuevo Esquema");
        buttonEsquema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEsquemaActionPerformed(evt);
            }
        });

        buttonBorrarEsquema.setText("Borrar Esquema");
        buttonBorrarEsquema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarEsquemaActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "ID"
            }
        ));
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabla.setColumnSelectionAllowed(true);
        tabla.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tablaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        comboTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTablaActionPerformed(evt);
            }
        });

        textTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTablaActionPerformed(evt);
            }
        });

        buttonTabla.setText("Nueva Tabla");
        buttonTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTablaActionPerformed(evt);
            }
        });

        buttonBorrarTabla.setText("Borrar Tabla");
        buttonBorrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarTablaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minosql/icon/icon.png"))); // NOI18N

        buttonCargarTodos.setText("Cargar Todos");
        buttonCargarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCargarTodosActionPerformed(evt);
            }
        });

        buttonBorrarFila.setText("Borrar");
        buttonBorrarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarFilaActionPerformed(evt);
            }
        });

        buttonBuscarColumna.setText("Buscar");
        buttonBuscarColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarColumnaActionPerformed(evt);
            }
        });

        comboColumas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboColumasActionPerformed(evt);
            }
        });

        textBuscarColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBuscarColumnaActionPerformed(evt);
            }
        });

        textBuscarComando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBuscarComandoActionPerformed(evt);
            }
        });

        buttonBuscarComando.setText("Buscar");
        buttonBuscarComando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarComandoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboColumas, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textBuscarColumna)
                        .addGap(18, 18, 18)
                        .addComponent(buttonBuscarColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(buttonBorrarFila, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(buttonCargarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboTabla, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(comboEsquema, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textEsquema, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonEsquema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonBorrarEsquema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonBorrarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(textBuscarComando)
                            .addGap(18, 18, 18)
                            .addComponent(buttonBuscarComando, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(356, 356, 356)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonBorrarEsquema)
                            .addComponent(buttonEsquema)
                            .addComponent(textEsquema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEsquema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTabla)
                            .addComponent(buttonBorrarTabla)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCargarTodos)
                    .addComponent(buttonBorrarFila)
                    .addComponent(buttonBuscarColumna)
                    .addComponent(comboColumas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBuscarColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBuscarComando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscarComando))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Main() {
    }

    private void comboEsquemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEsquemaActionPerformed
    // if(comboEsquema.getSelectedItem().equals("")){
      // comboTabla.setEnabled(false);
      // textTabla.setEnabled(false);
     //}
        
    }//GEN-LAST:event_comboEsquemaActionPerformed

    private void textEsquemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEsquemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEsquemaActionPerformed

    private void buttonTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTablaActionPerformed
        // TODO add your handling code here:
     
        ObservableList<String> comboContentDos=
        FXCollections.observableArrayList();
        String ttabla=textTabla.getText();
        comboContentDos.add(ttabla);
        comboTabla.setSelectedItem(ttabla);
        comboTabla.addItem(ttabla);
        textTabla.setText("");
        AgregarColumnas columna= new AgregarColumnas(this,true);
        columna.setVisible(true);
        columna.listo.addActionListener(new ActionListener(){
            @Override
                    public void actionPerformed(ActionEvent e) {
                             for(JLabel txt:columna.columnas){
                              System.out.println(txt.getText());
           
        }
        columna.listo.updateUI();
        
   }
                    });
    }//GEN-LAST:event_buttonTablaActionPerformed

    private void buttonEsquemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEsquemaActionPerformed

        ObservableList<String> comboContentUno=
        FXCollections.observableArrayList();
        String esquema=textEsquema.getText();
        comboContentUno.add(esquema);
        comboEsquema.addItem(esquema);
        comboEsquema.setSelectedItem(esquema);
        textEsquema.setText("");
        i++;
       // indice[i];
        
       
    }//GEN-LAST:event_buttonEsquemaActionPerformed

    private void comboTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTablaActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_comboTablaActionPerformed

    private void buttonBorrarEsquemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarEsquemaActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea elminar el esquema?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp==JOptionPane.YES_OPTION){
       String esquema= (String) comboEsquema.getSelectedItem();
        comboEsquema.removeItem(esquema);
        }
    }//GEN-LAST:event_buttonBorrarEsquemaActionPerformed

    private void buttonBorrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarTablaActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea elminar la tabla?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp==JOptionPane.YES_OPTION){
        String tablas=(String) comboTabla.getSelectedItem();
        comboTabla.removeItem(tablas);
        }
    }//GEN-LAST:event_buttonBorrarTablaActionPerformed

    private void buttonBuscarColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarColumnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarColumnaActionPerformed

    private void textTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTablaActionPerformed

    private void comboColumasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboColumasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboColumasActionPerformed

    private void textBuscarColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscarColumnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscarColumnaActionPerformed

    private void buttonBorrarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarFilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBorrarFilaActionPerformed

    private void buttonCargarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCargarTodosActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_buttonCargarTodosActionPerformed

    private void textBuscarComandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscarComandoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscarComandoActionPerformed

    private void buttonBuscarComandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarComandoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarComandoActionPerformed

    private void tablaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablaAncestorAdded
        
    }//GEN-LAST:event_tablaAncestorAdded

    private void tablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyPressed
     //  DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
        
      //  if(evt.getKeyCode() == KeyEvent.VK_ENTER)
     //   {
     //     dtm.addRow(new Object[]{});
     //   }
     //   tabla.updateUI();
    }//GEN-LAST:event_tablaKeyPressed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBorrarEsquema;
    private javax.swing.JButton buttonBorrarFila;
    private javax.swing.JButton buttonBorrarTabla;
    private javax.swing.JButton buttonBuscarColumna;
    private javax.swing.JButton buttonBuscarComando;
    private javax.swing.JButton buttonCargarTodos;
    private javax.swing.JButton buttonEsquema;
    private javax.swing.JButton buttonTabla;
    private javax.swing.JComboBox<String> comboColumas;
    private javax.swing.JComboBox<String> comboEsquema;
    private javax.swing.JComboBox<String> comboTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabla;
    private javax.swing.JTextField textBuscarColumna;
    private javax.swing.JTextField textBuscarComando;
    private javax.swing.JTextField textEsquema;
    private javax.swing.JTextField textTabla;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


// test

