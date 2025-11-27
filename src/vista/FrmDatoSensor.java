
package vista;

import controlador.DatoSensorControl;
import dao.SensorDAO;
import modelo.DatoSensor;
import modelo.Sensor;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class FrmDatoSensor extends javax.swing.JFrame {
    private DatoSensorControl control = new DatoSensorControl();
    private SensorDAO sensorDAO = new SensorDAO();

    private Timer timerSimulacion;
    private Random random = new Random();
    private boolean simulando = false;

    
    public FrmDatoSensor() {
        initComponents();
        cargarSensores();
        cargarUnidades();
        listarLecturas(); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboSensor = new javax.swing.JComboBox<>();
        txtValor = new javax.swing.JTextField();
        cboUnidad = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLecturas = new javax.swing.JTable();
        btnSimular = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtAreaHa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLaminaMm = new javax.swing.JTextField();
        btnCalcularAgua = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblResultadoAgua = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sensor:");

        jLabel2.setText("Valor:");

        jLabel3.setText("Unidad:");

        jLabel4.setText("Ultimas lecturas:");

        cboSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSensorActionPerformed(evt);
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

        btnRefrescar.setText("Refrescar");
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        tablaLecturas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaLecturas);

        btnSimular.setText("Simular IoT");
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu Principal");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jLabel5.setText("Area del cultivo (ha):");

        txtAreaHa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaHaActionPerformed(evt);
            }
        });

        jLabel6.setText("Lámina de agua (mm):");

        btnCalcularAgua.setText("Calcular agua");
        btnCalcularAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularAguaActionPerformed(evt);
            }
        });

        jLabel7.setText("Resultado:");

        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cboUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(txtValor)
                                .addComponent(cboSensor, 0, 158, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRefrescar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSimular)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAreaHa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExportar)
                        .addGap(91, 91, 91)
                        .addComponent(btnMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLaminaMm, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCalcularAgua))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblResultadoAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(445, 445, 445)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboSensor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGuardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRefrescar)
                            .addComponent(btnSimular)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnMenu)
                        .addComponent(jLabel5))
                    .addComponent(btnExportar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAreaHa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLaminaMm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcularAgua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblResultadoAgua))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     int idSensor = obtenerIdSensorSeleccionado();
    if (idSensor == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un sensor.");
        return;
    }

    String valorTexto = txtValor.getText().trim();
    String unidad = (String) cboUnidad.getSelectedItem();

    if (valorTexto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingresa el valor medido.");
        return;
    }

    try {
        double valor = Double.parseDouble(valorTexto);

        boolean ok = control.guardar(idSensor, valor, unidad);
        if (ok) {
            JOptionPane.showMessageDialog(this, "Lectura registrada.");
            listarLecturas();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar la lectura.");
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "El valor debe ser numérico.");
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        listarLecturas();
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void cboSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSensorActionPerformed
        listarLecturas();
    }//GEN-LAST:event_cboSensorActionPerformed

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed
if (!simulando) {
        iniciarSimulacionIoT();
    } else {
        detenerSimulacionIoT();
    }
    }//GEN-LAST:event_btnSimularActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
         FrmMenuPrincipal menu = new FrmMenuPrincipal();
    menu.setVisible(true);
    this.dispose();   // <-- Cierra el formulario actual
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtAreaHaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaHaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaHaActionPerformed

    private void btnCalcularAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularAguaActionPerformed
       try {
        // 1. Leer datos de los textfields
        double areaHa = Double.parseDouble(txtAreaHa.getText().trim());
        double laminaMm = Double.parseDouble(txtLaminaMm.getText().trim());

        if (areaHa <= 0 || laminaMm < 0) {
            JOptionPane.showMessageDialog(this,
                    "Ingresa valores válidos para área y lámina de agua.",
                    "Datos inválidos",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 2. Convertir hectáreas a m²
        double areaM2 = areaHa * 10000.0;

        // 3. Calcular volumen
        double volumenLitros = laminaMm * areaM2;      // 1 mm sobre 1 m² = 1 L
        double volumenM3 = volumenLitros / 1000.0;     // 1000 L = 1 m³

        // 4. Mostrar resultado formateado
        String texto = String.format("≈ %.0f L (%.2f m³)", volumenLitros, volumenM3);
        lblResultadoAgua.setText(texto);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this,
                "Ingresa números válidos en área (ha) y lámina (mm).",
                "Error de formato",
                JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnCalcularAguaActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
       // 1. Verificar que haya datos
    if (tablaLecturas.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this,
                "No hay datos para exportar.",
                "Exportar",
                JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    // 2. Elegir dónde guardar el archivo
    javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
    chooser.setDialogTitle("Guardar datos de sensor");
    chooser.setSelectedFile(new java.io.File("datos_sensor.csv"));

    int opcion = chooser.showSaveDialog(this);
    if (opcion != javax.swing.JFileChooser.APPROVE_OPTION) {
        return; // usuario canceló
    }

    java.io.File archivo = chooser.getSelectedFile();

    // 3. Escribir el archivo CSV
    try (java.io.PrintWriter pw = new java.io.PrintWriter(
            new java.io.OutputStreamWriter(
                    new java.io.FileOutputStream(archivo),
                    java.nio.charset.StandardCharsets.UTF_8))) {

        // 3.1 Cabeceras (column names)
        int colCount = tablaLecturas.getColumnCount();
        for (int c = 0; c < colCount; c++) {
            pw.print(tablaLecturas.getColumnCount());
            if (c < colCount - 1) {
                pw.print(";");  // separador
            }
        }
        pw.println();

        // 3.2 Filas
        int rowCount = tablaLecturas.getRowCount();
        for (int r = 0; r < rowCount; r++) {
            for (int c = 0; c < colCount; c++) {
                Object valor = tablaLecturas.getValueAt(r, c);
                pw.print(valor != null ? valor.toString() : "");
                if (c < colCount - 1) {
                    pw.print(";");
                }
            }
            pw.println();
        }

        pw.flush();

        JOptionPane.showMessageDialog(this,
                "Datos exportados correctamente a:\n" + archivo.getAbsolutePath(),
                "Exportar",
                JOptionPane.INFORMATION_MESSAGE);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this,
                "Error al exportar datos: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnExportarActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrmDatoSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDatoSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDatoSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDatoSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDatoSensor().setVisible(true);
            }
        });
    }
        // Llenar combo de sensores desde la BD
       private void cargarSensores() {
        cboSensor.removeAllItems();

        List<Sensor> lista = sensorDAO.listarTodos(); // usa el listarTodos que ya creamos
        for (Sensor s : lista) {
            String texto = s.getIdSensor() + " - " + s.getTipoSensor() + " (" + s.getModelo() + ")";
            cboSensor.addItem(texto);
        }
    }

    private void cargarUnidades() {
        cboUnidad.removeAllItems();
        cboUnidad.addItem("% humedad");
        cboUnidad.addItem("°C");
        cboUnidad.addItem("pH");
        cboUnidad.addItem("dS/m");
        cboUnidad.addItem("mm lluvia");
        cboUnidad.addItem("lux");
    }

    private int obtenerIdSensorSeleccionado() {
        Object item = cboSensor.getSelectedItem();
        if (item == null) return -1;
        String texto = item.toString();  // "3 - Humedad (SX-100)"
        String[] partes = texto.split(" - ");
        return Integer.parseInt(partes[0]);
    }

    private void listarLecturas() {
        int idSensor = obtenerIdSensorSeleccionado();
        if (idSensor == -1) return;

        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.setColumnIdentifiers(new String[]{"ID dato", "Fecha/hora", "Valor", "Unidad"});

        List<DatoSensor> lista = control.listarPorSensor(idSensor, 50); // últimas 50 lecturas
        for (DatoSensor d : lista) {
            modeloTabla.addRow(new Object[]{
                d.getIdDato(),
                d.getFecha(),
                d.getValor(),
                d.getUnidad()
            });
        }

        tablaLecturas.setModel(modeloTabla);
    }

    private void limpiarCampos() {
        txtValor.setText("");
        if (cboUnidad.getItemCount() > 0) {
            cboUnidad.setSelectedIndex(0);
        }
        txtValor.requestFocus();
    }

    // --------- PARTE IMPORTANTE: SIMULACIÓN IoT ----------

    private double generarValorAleatorioSegunUnidad(String unidad) {
        unidad = unidad == null ? "" : unidad;

        if (unidad.contains("humedad")) {        // % humedad
            return 10 + random.nextDouble() * 70;    // 10% - 80%
        } else if (unidad.contains("°C")) {      // temperatura
            return 10 + random.nextDouble() * 20;    // 10 - 30 °C
        } else if (unidad.contains("pH")) {      // pH
            return 4 + random.nextDouble() * 4;      // 4 - 8
        } else if (unidad.contains("dS/m")) {    // conductividad
            return 0.5 + random.nextDouble() * 3;    // 0.5 - 3.5
        } else if (unidad.contains("mm lluvia")) {
            return random.nextDouble() * 20;         // 0 - 20 mm
        } else if (unidad.contains("lux")) {
            return 100 + random.nextDouble() * 900;  // 100 - 1000 lux
        }
        // default
        return random.nextDouble() * 100;
    }

    private void iniciarSimulacionIoT() {
        if (timerSimulacion == null) {
            timerSimulacion = new Timer(1000, (java.awt.event.ActionEvent e) -> {
                int idSensor = obtenerIdSensorSeleccionado();
                if (idSensor == -1) return;

                String unidad = (String) cboUnidad.getSelectedItem();
                double valor = generarValorAleatorioSegunUnidad(unidad);

                control.guardar(idSensor, valor, unidad);
                listarLecturas();
                // si tienes un label de estado, aquí lo puedes actualizar
                // lblEstadoSimulacion.setText("Enviando datos... último: " + String.format("%.2f", valor) + " " + unidad);
            });
        }
        timerSimulacion.start();
        simulando = true;
        btnSimular.setText("Detener simulación");
        // if (lblEstadoSimulacion != null) lblEstadoSimulacion.setText("Simulación activa");
    }

    private void detenerSimulacionIoT() {
        if (timerSimulacion != null) {
            timerSimulacion.stop();
        }
        simulando = false;
        btnSimular.setText("Simular IoT");
        // if (lblEstadoSimulacion != null) lblEstadoSimulacion.setText("Simulación detenida");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularAgua;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JButton btnSimular;
    private javax.swing.JComboBox<String> cboSensor;
    private javax.swing.JComboBox<String> cboUnidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblResultadoAgua;
    private javax.swing.JTable tablaLecturas;
    private javax.swing.JTextField txtAreaHa;
    private javax.swing.JTextField txtLaminaMm;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
