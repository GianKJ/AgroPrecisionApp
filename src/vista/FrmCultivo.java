
package vista;
import controlador.CultivoControl;
import modelo.Cultivo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class FrmCultivo extends javax.swing.JFrame {
    
 private CultivoControl control = new CultivoControl();

   
    public FrmCultivo() {
        initComponents();
        listarCultivos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdCultivo = new javax.swing.JTextField();
        txtIdAgricultor = new javax.swing.JTextField();
        txtParcela = new javax.swing.JTextField();
        txtTipoCultivo = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCultivo = new javax.swing.JTable();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID cultivo:");

        jLabel2.setText("ID agricultor:");

        jLabel3.setText("Parcela:");

        jLabel4.setText("Tipo cultivo:");

        jLabel6.setText("Area(ha):");

        jLabel7.setText("Fecha inicio (yyyy-MM-dd):");

        jLabel8.setText("Estado:");

        txtTipoCultivo.setText(" ");

        txtFechaInicio.setText(" ");

        txtEstado.setText(" ");

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

        tablaCultivo.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaCultivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCultivoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCultivo);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdCultivo)
                            .addComponent(txtIdAgricultor)
                            .addComponent(txtParcela)
                            .addComponent(txtTipoCultivo)
                            .addComponent(txtArea)
                            .addComponent(txtFechaInicio)
                            .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(21, 21, 21))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdAgricultor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtTipoCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      try {
        int idAgr = Integer.parseInt(txtIdAgricultor.getText().trim());
        String parcela = txtParcela.getText().trim();
        String tipo = txtTipoCultivo.getText().trim();
        double area = Double.parseDouble(txtArea.getText().trim());
        String fecha = txtFechaInicio.getText().trim(); // formato yyyy-MM-dd
        String estado = txtEstado.getText().trim();

        if (parcela.isEmpty() || tipo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Parcela y tipo son obligatorios.");
            return;
        }

        boolean ok = control.guardar(idAgr, parcela, tipo, area, fecha, estado);
        if (ok) {
            JOptionPane.showMessageDialog(this, "Cultivo registrado.");
            listarCultivos();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar.");
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Revisa ID agricultor y área (números).");
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtIdCultivo.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Selecciona un cultivo de la tabla.");
        return;
    }

    try {
        int idCult = Integer.parseInt(txtIdCultivo.getText().trim());
        int idAgr = Integer.parseInt(txtIdAgricultor.getText().trim());
        String parcela = txtParcela.getText().trim();
        String tipo = txtTipoCultivo.getText().trim();
        double area = Double.parseDouble(txtArea.getText().trim());
        String fecha = txtFechaInicio.getText().trim();
        String estado = txtEstado.getText().trim();

        boolean ok = control.actualizar(idCult, idAgr, parcela, tipo, area, fecha, estado);

        if (ok) {
            JOptionPane.showMessageDialog(this, "Cultivo actualizado.");
            listarCultivos();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar.");
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Revisa ID y área (números).");
    }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         int fila = tablaCultivo.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un registro.");
        return;
    }

    int idCult = (int) tablaCultivo.getValueAt(fila, 0);

    int r = JOptionPane.showConfirmDialog(this,
            "¿Eliminar cultivo " + idCult + "?", "Confirmar",
            JOptionPane.YES_NO_OPTION);

    if (r == JOptionPane.YES_OPTION) {
        boolean ok = control.eliminar(idCult);
        if (ok) {
            JOptionPane.showMessageDialog(this, "Cultivo eliminado.");
            listarCultivos();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar.");
        }
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaCultivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCultivoMouseClicked
        int fila = tablaCultivo.getSelectedRow();

    txtIdCultivo.setText(tablaCultivo.getValueAt(fila, 0).toString());
    txtIdAgricultor.setText(tablaCultivo.getValueAt(fila, 1).toString());
    txtParcela.setText(tablaCultivo.getValueAt(fila, 2).toString());
    txtTipoCultivo.setText(tablaCultivo.getValueAt(fila, 3).toString());
    txtArea.setText(tablaCultivo.getValueAt(fila, 4).toString());
    txtFechaInicio.setText(String.valueOf(tablaCultivo.getValueAt(fila, 5)));
    txtEstado.setText(String.valueOf(tablaCultivo.getValueAt(fila, 6)));
    }//GEN-LAST:event_tablaCultivoMouseClicked

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
            java.util.logging.Logger.getLogger(FrmCultivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCultivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCultivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCultivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCultivo().setVisible(true);
            }
        });
    }
    
        private void listarCultivos() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.setColumnIdentifiers(new String[]{
            "ID", "ID Agricultor", "Parcela", "Tipo cultivo",
            "Área (ha)", "Fecha inicio", "Estado"
        });

        List<Cultivo> lista = control.listarTodos();
        for (Cultivo c : lista) {
            modeloTabla.addRow(new Object[]{
                c.getIdCultivo(),
                c.getIdAgricultor(),
                c.getNombreParcela(),
                c.getTipoCultivo(),
                c.getAreaHa(),
                c.getFechaInicio(),
                c.getEstado()
            });
        }

        tablaCultivo.setModel(modeloTabla);
    }

    private void limpiarCampos() {
        txtIdCultivo.setText("");
        txtIdAgricultor.setText("");
        txtParcela.setText("");
        txtTipoCultivo.setText("");
        txtArea.setText("");
        txtFechaInicio.setText("");
        txtEstado.setText("");
        txtIdAgricultor.requestFocus();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCultivo;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtIdAgricultor;
    private javax.swing.JTextField txtIdCultivo;
    private javax.swing.JTextField txtParcela;
    private javax.swing.JTextField txtTipoCultivo;
    // End of variables declaration//GEN-END:variables
}
