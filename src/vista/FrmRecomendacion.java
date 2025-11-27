
package vista;
import controlador.RecomendacionControl;
import dao.PrediccionIADAO;
import modelo.PrediccionIA;
import modelo.Recomendacion;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmRecomendacion extends javax.swing.JFrame {
    private RecomendacionControl control = new RecomendacionControl();
    private PrediccionIADAO predDAO = new PrediccionIADAO();

   
    public FrmRecomendacion() {
        initComponents();
        cargarPredicciones();
        listarRecomendaciones();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboPrediccion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        chkLeida = new javax.swing.JCheckBox();
        chkCritica = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRecomendacion = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Prediccion:");

        jLabel2.setText("Tipo recomendacion:");

        jLabel3.setText("Descripcion:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        chkLeida.setText("Marcada como leida");

        chkCritica.setText("Alerta critica ");
        chkCritica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCriticaActionPerformed(evt);
            }
        });

        tablaRecomendacion.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaRecomendacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRecomendacionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaRecomendacion);

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

        btnMenu.setText("Menu Principal");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(cboPrediccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTipo)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar)
                            .addComponent(btnNuevo)
                            .addComponent(btnEliminar)
                            .addComponent(btnActualizar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkLeida)
                            .addComponent(chkCritica))))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenu)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboPrediccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(chkLeida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCritica)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         int idPred = obtenerIdPrediccionSeleccionada();
    if (idPred == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona una predicción.");
        return;
    }

    String tipo = txtTipo.getText().trim();
    String desc = txtDescripcion.getText().trim();
    boolean leida = chkLeida.isSelected();
    boolean critica = chkCritica.isSelected();

    if (tipo.isEmpty() || desc.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Completa tipo y descripción.");
        return;
    }

    boolean ok = control.guardar(idPred, tipo, desc, leida, critica);
    if (ok) {
        JOptionPane.showMessageDialog(this, "Recomendación registrada.");
        listarRecomendaciones();
        limpiarCampos();
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo registrar.");
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int fila = tablaRecomendacion.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona una recomendación.");
        return;
    }

    int idRec = (int) tablaRecomendacion.getValueAt(fila, 0);
    int idPred = obtenerIdPrediccionSeleccionada();
    String tipo = txtTipo.getText().trim();
    String desc = txtDescripcion.getText().trim();
    boolean leida = chkLeida.isSelected();
    boolean critica = chkCritica.isSelected();

    boolean ok = control.actualizar(idRec, idPred, tipo, desc, leida, critica);
    if (ok) {
        JOptionPane.showMessageDialog(this, "Recomendación actualizada.");
        listarRecomendaciones();
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo actualizar.");
    }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tablaRecomendacion.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona una recomendación.");
        return;
    }

    int idRec = (int) tablaRecomendacion.getValueAt(fila, 0);

    int r = JOptionPane.showConfirmDialog(this,
            "¿Eliminar la recomendación " + idRec + "?",
            "Confirmar", JOptionPane.YES_NO_OPTION);

    if (r == JOptionPane.YES_OPTION) {
        boolean ok = control.eliminar(idRec);
        if (ok) {
            JOptionPane.showMessageDialog(this, "Recomendación eliminada.");
            listarRecomendaciones();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar.");
        }
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaRecomendacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRecomendacionMouseClicked
 int fila = tablaRecomendacion.getSelectedRow();
    if (fila == -1) return;

    txtTipo.setText(tablaRecomendacion.getValueAt(fila, 2).toString());
    txtDescripcion.setText(tablaRecomendacion.getValueAt(fila, 3).toString());

    String leida = tablaRecomendacion.getValueAt(fila, 4).toString();
    String critica = tablaRecomendacion.getValueAt(fila, 5).toString();

    chkLeida.setSelected(leida.equals("Sí"));
    chkCritica.setSelected(critica.equals("Sí"));
    actualizarColorDescripcion();
    }//GEN-LAST:event_tablaRecomendacionMouseClicked

    private void chkCriticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCriticaActionPerformed
        actualizarColorDescripcion();
    }//GEN-LAST:event_chkCriticaActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
         FrmMenuPrincipal menu = new FrmMenuPrincipal();
    menu.setVisible(true);
    this.dispose();   // <-- Cierra el formulario actual
    }//GEN-LAST:event_btnMenuActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrmRecomendacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRecomendacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRecomendacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRecomendacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRecomendacion().setVisible(true);
            }
        });
    }
    private void cargarPredicciones() {
        cboPrediccion.removeAllItems();
        List<PrediccionIA> lista = predDAO.listarTodos();
        for (PrediccionIA p : lista) {
            String texto = p.getIdPrediccion() + " - " +
                           p.getTipoPrediccion() + " (" +
                           p.getProbabilidad() + "%)";
            cboPrediccion.addItem(texto);
        }
    }

    private int obtenerIdPrediccionSeleccionada() {
        Object item = cboPrediccion.getSelectedItem();
        if (item == null) return -1;
        String texto = item.toString(); // "5 - Riesgo de plaga (80%)"
        String[] partes = texto.split(" - ");
        return Integer.parseInt(partes[0]);
    }

    private void listarRecomendaciones() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{
            "ID", "Predicción", "Tipo", "Descripción", "Leída", "Crítica"
        });

        List<Recomendacion> lista = control.listarTodas();
        for (Recomendacion r : lista) {
            modelo.addRow(new Object[]{
                r.getIdRecomendacion(),
                r.getIdPrediccion(),
                r.getTipo(),
                r.getDescripcion(),
                r.isEsLeida() ? "Sí" : "No",
                r.isAlertaCritica() ? "Sí" : "No"
            });
        }

        tablaRecomendacion.setModel(modelo);
    }

    private void limpiarCampos() {
        txtTipo.setText("");
        txtDescripcion.setText("");
        chkLeida.setSelected(false);
        chkCritica.setSelected(false);
        txtDescripcion.setBackground(Color.WHITE);
    }

    // Para que sea más interactivo: fondo rojo si es crítica
    private void actualizarColorDescripcion() {
        if (chkCritica.isSelected()) {
            txtDescripcion.setBackground(new Color(255, 220, 220));
        } else {
            txtDescripcion.setBackground(Color.WHITE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboPrediccion;
    private javax.swing.JCheckBox chkCritica;
    private javax.swing.JCheckBox chkLeida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaRecomendacion;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
