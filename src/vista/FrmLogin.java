
package vista;
import dao.UsuarioDAO;
import modelo.Usuario;
import vista.FrmMenuPrincipal;
import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.ImageIcon;


public class FrmLogin extends javax.swing.JFrame {

    
    public FrmLogin() {
    initComponents();
    ajustarImagenFondo();

    // Para que la imagen se ajuste al cambiar tamaño
    this.addComponentListener(new java.awt.event.ComponentAdapter() {
        public void componentResized(java.awt.event.ComponentEvent evt) {
            ajustarImagenFondo();
        }
    });
}

public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new FrmLogin().setVisible(true);
        }
    });
}
private void ajustarImagenFondo() {
    ImageIcon original = new ImageIcon(getClass().getResource("/recursos/login.jpeg"));
    Image escala = original.getImage().getScaledInstance(
            lblFondo.getWidth(),
            lblFondo.getHeight(),
            Image.SCALE_SMOOTH
    );
    lblFondo.setIcon(new ImageIcon(escala));
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 62, -1));

        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 71, -1));

        txtPassword.setToolTipText("");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 177, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));
        getContentPane().add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 254, 198, 25));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/login.jpeg"))); // NOI18N
        lblFondo.setAutoscrolls(true);
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 340, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
      String usuario = txtUsuario.getText().trim();
    String clave = new String(txtPassword.getPassword()).trim();

    UsuarioDAO dao = new UsuarioDAO();
    Usuario u = dao.validarLogin(usuario, clave);  // o como se llame tu método

    if (u != null) {
        // 1. Abrir menú principal
        FrmMenuPrincipal menu = new FrmMenuPrincipal();
        menu.setLocationRelativeTo(null); // centrar

        // (Opcional) si quieres mostrar el nombre del usuario en el menú,
        // puedes crear un constructor con parámetro o un método setUsuario()
        // por ahora solo lo abrimos:
        menu.setVisible(true);

        // 2. Cerrar la ventana de login
        this.dispose();   

    } else {
        JOptionPane.showMessageDialog(this,
                "Usuario o contraseña incorrectos",
                "Error de autenticación",
                JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
