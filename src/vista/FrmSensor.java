package vista;
import controlador.SensorControl;
import dao.CultivoDAO;
import modelo.Cultivo;
import modelo.Sensor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmSensor extends javax.swing.JFrame {
private SensorControl control = new SensorControl();
    private CultivoDAO cultivoDAO = new CultivoDAO();

    
    public FrmSensor() {
        initComponents();
        cargarTiposSensor();
        cargarCultivos();
        rbActivo.setSelected(true);
        listarSensoresPorCultivoSeleccionado();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtIdSensor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboCultivo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtModelo = new javax.swing.JTextField();
        txtFechaInstalacion = new javax.swing.JTextField();
        rbActivo = new javax.swing.JRadioButton();
        rbInactivo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSensor = new javax.swing.JTable();
        cboTipoSensor = new javax.swing.JComboBox<>();
        brnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtIdSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSensorActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Sensor:");

        jLabel2.setText("Cultivo:");

        cboCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCultivoActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado:");

        jLabel3.setText("Tipo de sensor");

        jLabel4.setText("Modelo:");

        jLabel5.setText("Fecha instalación (yyyy-MM-dd):");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

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

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbActivo);
        rbActivo.setText("Activo");

        buttonGroup1.add(rbInactivo);
        rbInactivo.setText("Inactivo");

        tablaSensor.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaSensor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSensorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSensor);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtModelo)
                                                .addComponent(txtFechaInstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(rbActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rbInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIdSensor, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cboCultivo, 0, 144, Short.MAX_VALUE)
                                            .addComponent(cboTipoSensor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(104, 104, 104)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(brnMenu)
                                .addGap(104, 104, 104))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdSensor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(brnMenu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboTipoSensor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaInstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbActivo)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbInactivo)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSensorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSensorActionPerformed

    private void cboCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCultivoActionPerformed
        listarSensoresPorCultivoSeleccionado();
    }//GEN-LAST:event_cboCultivoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
int fila = tablaSensor.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un sensor de la tabla.");
        return;
    }

    int idSensor = (int) tablaSensor.getValueAt(fila, 0);

    int r = JOptionPane.showConfirmDialog(this,
            "¿Eliminar el sensor " + idSensor + "?", "Confirmar",
            JOptionPane.YES_NO_OPTION);

    if (r == JOptionPane.YES_OPTION) {
        boolean ok = control.eliminar(idSensor);
        if (ok) {
            JOptionPane.showMessageDialog(this, "Sensor eliminado.");
            listarSensoresPorCultivoSeleccionado();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar.");
        }
    }        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int idCultivo = obtenerIdCultivoSeleccionado();
    if (idCultivo == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un cultivo.");
        return;
    }

    String tipoSensor = (String) cboTipoSensor.getSelectedItem();
    String modelo = txtModelo.getText().trim();
    String fecha = txtFechaInstalacion.getText().trim(); // formato yyyy-MM-dd
    String estado = rbActivo.isSelected() ? "Activo" : "Inactivo";

    if (modelo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingresa el modelo del sensor.");
        return;
    }

    boolean ok = control.guardar(idCultivo, tipoSensor, modelo, fecha, estado);
    if (ok) {
        JOptionPane.showMessageDialog(this, "Sensor registrado correctamente.");
        listarSensoresPorCultivoSeleccionado();
        limpiarCampos();
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo registrar el sensor.");
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
 if (txtIdSensor.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Selecciona un sensor de la tabla.");
        return;
    }

    int idSensor = Integer.parseInt(txtIdSensor.getText().trim());
    int idCultivo = obtenerIdCultivoSeleccionado();
    String tipoSensor = (String) cboTipoSensor.getSelectedItem();
    String modelo = txtModelo.getText().trim();
    String fecha = txtFechaInstalacion.getText().trim();
    String estado = rbActivo.isSelected() ? "Activo" : "Inactivo";

    boolean ok = control.actualizar(idSensor, idCultivo, tipoSensor, modelo, fecha, estado);

    if (ok) {
        JOptionPane.showMessageDialog(this, "Sensor actualizado correctamente.");
        listarSensoresPorCultivoSeleccionado();
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo actualizar.");
    }        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void tablaSensorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSensorMouseClicked
         int fila = tablaSensor.getSelectedRow();
    if (fila == -1) return;

    txtIdSensor.setText(tablaSensor.getValueAt(fila, 0).toString());
    // El cultivo ya viene del combo, no lo cambiamos
    cboTipoSensor.setSelectedItem(tablaSensor.getValueAt(fila, 2).toString());
    txtModelo.setText(tablaSensor.getValueAt(fila, 3).toString());
    txtFechaInstalacion.setText(String.valueOf(tablaSensor.getValueAt(fila, 4)));

    String estado = String.valueOf(tablaSensor.getValueAt(fila, 5));
    if (estado.equalsIgnoreCase("Activo")) {
        rbActivo.setSelected(true);
    } else {
        rbInactivo.setSelected(true);
    }
    }//GEN-LAST:event_tablaSensorMouseClicked

    private void brnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnMenuActionPerformed
       FrmMenuPrincipal menu = new FrmMenuPrincipal();
    menu.setVisible(true);
    this.dispose();   // <-- Cierra el formulario actual
    }//GEN-LAST:event_brnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSensor().setVisible(true);
            }
        });
    }    // Llenar combo con tipos de sensor "bonitos"
    private void cargarTiposSensor() {
        cboTipoSensor.removeAllItems();
        cboTipoSensor.addItem("Humedad de suelo");
        cboTipoSensor.addItem("Temperatura ambiente");
        cboTipoSensor.addItem("pH del suelo");
        cboTipoSensor.addItem("Conductividad eléctrica");
        cboTipoSensor.addItem("Radiación solar");
        cboTipoSensor.addItem("Lluvia (pluviometría)");
    }

    // Llenar combo de cultivos desde la BD
    private void cargarCultivos() {
        cboCultivo.removeAllItems();
        List<Cultivo> lista = cultivoDAO.listarTodos();
        for (Cultivo c : lista) {
            // mostrará: "1 - Parcela A"
            cboCultivo.addItem(c.getIdCultivo() + " - " + c.getNombreParcela());
        }
    }

    // Obtener el id_cultivo a partir del item seleccionado en el combo
    private int obtenerIdCultivoSeleccionado() {
        Object item = cboCultivo.getSelectedItem();
        if (item == null) return -1;
        String texto = item.toString(); // "1 - Parcela A"
        String[] partes = texto.split(" - ");
        return Integer.parseInt(partes[0]);
    }

    // Limpiar los campos del formulario
    private void limpiarCampos() {
        txtIdSensor.setText("");
        txtModelo.setText("");
        txtFechaInstalacion.setText("");
        rbActivo.setSelected(true);
        cboTipoSensor.setSelectedIndex(0);
    }

    // Listar sensores del cultivo elegido
    private void listarSensoresPorCultivoSeleccionado() {
        int idCultivo = obtenerIdCultivoSeleccionado();
        if (idCultivo == -1) return;

        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.setColumnIdentifiers(new String[]{
            "ID Sensor", "Cultivo", "Tipo sensor", "Modelo", "Fecha instalación", "Estado"
        });

        List<Sensor> lista = control.listarPorCultivo(idCultivo);
        for (Sensor s : lista) {
            modeloTabla.addRow(new Object[]{
                s.getIdSensor(),
                idCultivo,
                s.getTipoSensor(),
                s.getModelo(),
                s.getFechaInstalacion(),
                s.getEstado()
            });
        }

        tablaSensor.setModel(modeloTabla);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnMenu;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboCultivo;
    private javax.swing.JComboBox<String> cboTipoSensor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbInactivo;
    private javax.swing.JTable tablaSensor;
    private javax.swing.JTextField txtFechaInstalacion;
    private javax.swing.JTextField txtIdSensor;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
