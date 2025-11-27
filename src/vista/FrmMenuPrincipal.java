
package vista;


public class FrmMenuPrincipal extends javax.swing.JFrame {

    
    public FrmMenuPrincipal() {
        initComponents();
         setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAgricultor = new javax.swing.JButton();
        btnCultivo = new javax.swing.JButton();
        btnSensor = new javax.swing.JButton();
        btnDatoSensor = new javax.swing.JButton();
        btnPrediccion = new javax.swing.JButton();
        btnRecomendacion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AgroPrecision - Panel Principal");
        jLabel1.setAutoscrolls(true);

        btnAgricultor.setText("Agricultores");
        btnAgricultor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgricultorActionPerformed(evt);
            }
        });

        btnCultivo.setText("Cultivos");
        btnCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCultivoActionPerformed(evt);
            }
        });

        btnSensor.setText("Sensores");
        btnSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSensorActionPerformed(evt);
            }
        });

        btnDatoSensor.setText("Datos de sensores");
        btnDatoSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatoSensorActionPerformed(evt);
            }
        });

        btnPrediccion.setText("Prediccion IA");
        btnPrediccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrediccionActionPerformed(evt);
            }
        });

        btnRecomendacion.setText("Recomendaciones");
        btnRecomendacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecomendacionActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(70, 30));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgricultor, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btnCultivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSensor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPrediccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDatoSensor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecomendacion, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDatoSensor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgricultor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrediccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSensor, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnRecomendacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgricultorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgricultorActionPerformed
        FrmAgricultor f = new FrmAgricultor();
    f.setLocationRelativeTo(this);
    f.setVisible(true);
    }//GEN-LAST:event_btnAgricultorActionPerformed

    private void btnCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCultivoActionPerformed
        FrmCultivo f = new FrmCultivo();
    f.setLocationRelativeTo(this);
    f.setVisible(true);
    }//GEN-LAST:event_btnCultivoActionPerformed

    private void btnSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSensorActionPerformed
        FrmSensor f = new FrmSensor();
    f.setLocationRelativeTo(this);
    f.setVisible(true);
    }//GEN-LAST:event_btnSensorActionPerformed

    private void btnDatoSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatoSensorActionPerformed
        FrmDatoSensor f = new FrmDatoSensor();
    f.setLocationRelativeTo(this);
    f.setVisible(true);
    }//GEN-LAST:event_btnDatoSensorActionPerformed

    private void btnPrediccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrediccionActionPerformed
        FrmPrediccionIA f = new FrmPrediccionIA();
    f.setLocationRelativeTo(this);
    f.setVisible(true);
    
    }//GEN-LAST:event_btnPrediccionActionPerformed

    private void btnRecomendacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecomendacionActionPerformed
        FrmRecomendacion f = new FrmRecomendacion();
    f.setLocationRelativeTo(this);
    f.setVisible(true);
    }//GEN-LAST:event_btnRecomendacionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgricultor;
    private javax.swing.JButton btnCultivo;
    private javax.swing.JButton btnDatoSensor;
    private javax.swing.JButton btnPrediccion;
    private javax.swing.JButton btnRecomendacion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSensor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
