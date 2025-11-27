
package vista;

import controlador.PrediccionIAControl;
import dao.CultivoDAO;
import modelo.Cultivo;
import modelo.PrediccionIA;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

public class FrmPrediccionIA extends javax.swing.JFrame {
    private PrediccionIAControl control = new PrediccionIAControl();
    private CultivoDAO cultivoDAO = new CultivoDAO();

    
    public FrmPrediccionIA() {
        initComponents();
        cargarCultivos();
        cargarTiposPrediccion();
        configurarSlider();
        listarPredicciones();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboCultivo = new javax.swing.JComboBox<>();
        cboTipoPrediccion = new javax.swing.JComboBox<>();
        sliderProbabilidad = new javax.swing.JSlider();
        lblProbabilidadValor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCondiciones = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPrediccion = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        brnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCultivoActionPerformed(evt);
            }
        });

        txtCondiciones.setColumns(20);
        txtCondiciones.setRows(5);
        jScrollPane1.setViewportView(txtCondiciones);

        tablaPrediccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaPrediccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPrediccionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaPrediccion);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        brnMenu.setText("Menu Principal");
        brnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProbabilidadValor, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cboCultivo, 0, 170, Short.MAX_VALUE)
                                .addComponent(cboTipoPrediccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(sliderProbabilidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(brnMenu))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboTipoPrediccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sliderProbabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProbabilidadValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnActualizar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(brnMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
          int fila = tablaPrediccion.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona una predicción en la tabla.");
        return;
    }

    int idPred = (int) tablaPrediccion.getValueAt(fila, 0);
    int idCultivo = obtenerIdCultivoSeleccionado();
    String tipo = (String) cboTipoPrediccion.getSelectedItem();
    int prob = sliderProbabilidad.getValue();
    String condiciones = txtCondiciones.getText().trim();

    boolean ok = control.actualizar(idPred, idCultivo, tipo, prob, condiciones);
    if (ok) {
        JOptionPane.showMessageDialog(this, "Predicción actualizada.");
        listarPredicciones();
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo actualizar.");
    }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
         limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       int idCultivo = obtenerIdCultivoSeleccionado();
    if (idCultivo == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un cultivo.");
        return;
    }

    String tipo = (String) cboTipoPrediccion.getSelectedItem();
    int prob = sliderProbabilidad.getValue();
    String condiciones = txtCondiciones.getText().trim();

    if (condiciones.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Describe las condiciones favorables.");
        return;
    }

    boolean ok = control.guardar(idCultivo, tipo, prob, condiciones);
    if (ok) {
        JOptionPane.showMessageDialog(this, "Predicción registrada.");
        listarPredicciones();
        limpiarCampos();
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo registrar la predicción.");
    }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tablaPrediccion.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona una predicción.");
        return;
    }

    int idPred = (int) tablaPrediccion.getValueAt(fila, 0);

    int r = JOptionPane.showConfirmDialog(this,
            "¿Eliminar la predicción " + idPred + "?", "Confirmar",
            JOptionPane.YES_NO_OPTION);

    if (r == JOptionPane.YES_OPTION) {
        boolean ok = control.eliminar(idPred);
        if (ok) {
            JOptionPane.showMessageDialog(this, "Predicción eliminada.");
            listarPredicciones();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar.");
        }
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaPrediccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPrediccionMouseClicked
        int fila = tablaPrediccion.getSelectedRow();
    if (fila == -1) return;

    // ID predicción está en la columna 0 (lo usamos en actualizar/eliminar)
    int prob = Integer.parseInt(tablaPrediccion.getValueAt(fila, 3).toString().replace(" %", ""));
    sliderProbabilidad.setValue(prob);

    txtCondiciones.setText(tablaPrediccion.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_tablaPrediccionMouseClicked

    private void cboCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCultivoActionPerformed
          listarPredicciones();
    }//GEN-LAST:event_cboCultivoActionPerformed

    private void brnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnMenuActionPerformed
      FrmMenuPrincipal menu = new FrmMenuPrincipal();
    menu.setVisible(true);
    this.dispose();   // <-- Cierra el formulario actual 
    }//GEN-LAST:event_brnMenuActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrmPrediccionIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrediccionIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrediccionIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrediccionIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrediccionIA().setVisible(true);
            }
        });
    }
    private void cargarCultivos() {
        cboCultivo.removeAllItems();
        List<Cultivo> lista = cultivoDAO.listarTodos();
        for (Cultivo c : lista) {
            cboCultivo.addItem(c.getIdCultivo() + " - " + c.getNombreParcela());
        }
    }

    private int obtenerIdCultivoSeleccionado() {
        Object item = cboCultivo.getSelectedItem();
        if (item == null) return -1;
        String texto = item.toString();  // "1 - Parcela Demo"
        String[] partes = texto.split(" - ");
        return Integer.parseInt(partes[0]);
    }

    private void cargarTiposPrediccion() {
        cboTipoPrediccion.removeAllItems();
        cboTipoPrediccion.addItem("Riesgo de sequía");
        cboTipoPrediccion.addItem("Riesgo de plaga");
        cboTipoPrediccion.addItem("Necesidad de riego");
        cboTipoPrediccion.addItem("Riesgo de helada");
        cboTipoPrediccion.addItem("Riesgo de enfermedad foliar");
    }

    private void configurarSlider() {
        sliderProbabilidad.setMinimum(0);
        sliderProbabilidad.setMaximum(100);
        sliderProbabilidad.setValue(50);
        actualizarLabelProbabilidad(50);

        sliderProbabilidad.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int valor = sliderProbabilidad.getValue();
                actualizarLabelProbabilidad(valor);
            }
        });
    }

    private void actualizarLabelProbabilidad(int valor) {
        lblProbabilidadValor.setText(valor + " %");

        // Cambiar color según nivel de riesgo
        if (valor < 40) {
            lblProbabilidadValor.setForeground(new Color(0, 128, 0)); // verde
        } else if (valor < 70) {
            lblProbabilidadValor.setForeground(new Color(255, 140, 0)); // naranja
        } else {
            lblProbabilidadValor.setForeground(Color.RED); // rojo
        }
    }

    private void listarPredicciones() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.setColumnIdentifiers(new String[]{
            "ID", "Cultivo", "Tipo", "Probabilidad", "Fecha", "Condiciones"
        });

        int idCultivo = obtenerIdCultivoSeleccionado();
        List<PrediccionIA> lista;

        if (idCultivo == -1) {
            lista = control.listarTodos();
        } else {
            lista = control.listarPorCultivo(idCultivo);
        }

        for (PrediccionIA p : lista) {
            modeloTabla.addRow(new Object[]{
                p.getIdPrediccion(),
                p.getIdCultivo(),
                p.getTipoPrediccion(),
                p.getProbabilidad() + " %",
                p.getFechaPrediccion(),
                p.getCondicionesFavorables()
            });
        }

        tablaPrediccion.setModel(modeloTabla);
    }

    private void limpiarCampos() {
        sliderProbabilidad.setValue(50);
        txtCondiciones.setText("");
        if (cboTipoPrediccion.getItemCount() > 0) {
            cboTipoPrediccion.setSelectedIndex(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnMenu;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboCultivo;
    private javax.swing.JComboBox<String> cboTipoPrediccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblProbabilidadValor;
    private javax.swing.JSlider sliderProbabilidad;
    private javax.swing.JTable tablaPrediccion;
    private javax.swing.JTextArea txtCondiciones;
    // End of variables declaration//GEN-END:variables
}
