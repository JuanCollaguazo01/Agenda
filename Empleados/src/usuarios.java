import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugo Costilla
 */
public class usuarios extends javax.swing.JFrame {

   Connection con = null;
   Statement stmt = null;
    public usuarios() {
        initComponents();
        this.setTitle("Registro De Usuarios");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        ImageIcon icono = new ImageIcon("C:\\hugo\\JavaClass\\Empleados\\src\\imagenes\\button.png");
        this.setIconImage(icono.getImage());
        
        
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelnumber = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelAp = new javax.swing.JLabel();
        jLabelCd = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jLabelPuesto = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        jTextUser = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextApe = new javax.swing.JTextField();
        jTextCd = new javax.swing.JTextField();
        jTextTel = new javax.swing.JTextField();
        jTextPuesto = new javax.swing.JTextField();
        jButtonAcept = new javax.swing.JButton();
        jButtonSalida = new javax.swing.JButton();
        empresa = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        tabla = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelnumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelnumber.setText("No. Usuario: ");
        getContentPane().add(jLabelnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 100, 30));

        jLabelUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelUser.setText("Nombre: ");
        getContentPane().add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 80, 20));

        jLabelAp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAp.setText("Apellido: ");
        getContentPane().add(jLabelAp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 30));

        jLabelCd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCd.setText("Ciudad: ");
        getContentPane().add(jLabelCd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabelTel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTel.setText("Telefono: ");
        getContentPane().add(jLabelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 70, -1));

        jLabelPuesto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPuesto.setText("Puesto: ");
        getContentPane().add(jLabelPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 70, -1));

        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llama.png"))); // NOI18N
        jLabelFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, null));
        getContentPane().add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 200, 210));

        jTextUser.setEditable(false);
        jTextUser.setBackground(new java.awt.Color(204, 204, 204));
        jTextUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUserActionPerformed(evt);
            }
        });
        jTextUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextUserKeyTyped(evt);
            }
        });
        getContentPane().add(jTextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 40, 30));

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 210, 30));

        jTextApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApeActionPerformed(evt);
            }
        });
        jTextApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApeKeyTyped(evt);
            }
        });
        getContentPane().add(jTextApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 210, 30));

        jTextCd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCdActionPerformed(evt);
            }
        });
        jTextCd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCdKeyTyped(evt);
            }
        });
        getContentPane().add(jTextCd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 210, 30));

        jTextTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelActionPerformed(evt);
            }
        });
        jTextTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelKeyTyped(evt);
            }
        });
        getContentPane().add(jTextTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 210, 30));

        jTextPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPuestoActionPerformed(evt);
            }
        });
        jTextPuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPuestoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 210, 30));

        jButtonAcept.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAcept.setText("Aceptar");
        jButtonAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 100, -1));

        jButtonSalida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalida.setText("Salir");
        jButtonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, -1));

        empresa.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        empresa.setText("Registro");
        getContentPane().add(empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 180, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 620, 310));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Numeros");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 100, 30));

        jMenu1.setText("Archivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        tabla.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        tabla.setText("Consultar/Actualizar");
        tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablaActionPerformed(evt);
            }
        });
        jMenu1.add(tabla);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablaActionPerformed
        this.dispose();
        ConsultasUser cu = new ConsultasUser();
        cu.setLocationRelativeTo(null);
        cu.setVisible(true);
    }//GEN-LAST:event_tablaActionPerformed

    private void jButtonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalidaActionPerformed

    private void jButtonAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptActionPerformed
        String cadena3, cadena4, cadena5, cadena6, cadena7;

        cadena3 = jTextNombre.getText();
        cadena4 = jTextApe.getText();
        cadena5 = jTextCd.getText();
        cadena6 = jTextTel.getText();
        cadena7 = jTextPuesto.getText();

        if ((jTextNombre.getText().equals("")) ||
            (jTextTel.getText().equals("")) || (jTextApe.getText().equals(""))
            || (jTextCd.getText().equals("")) || (jTextPuesto.getText().equals(""))) {

            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            jTextNombre.requestFocus();
        }else {
            try {

                String url = "jdbc:mysql://localhost:puerto/base de datos";
                String usuario = "root";
                String contraseña = "";

                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection(url,usuario,contraseña);
                if ( con != null )
                System.out.println("Se ha establecido una conexión a la base de datos " +
                    "\n " + url );

                stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO datos VALUES('"+0+"','"+cadena3+"','"+cadena4+"','"+cadena5+"','"+cadena6+"','"+cadena7+"')");
                System.out.println("Los valores han sido agregados a la base de datos ");

            } catch (InstantiationException ex) {
                Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }

            finally {
                if (con != null) {
                    try {
                        con.close();
                        stmt.close();
                    } catch ( Exception e ) {
                        System.out.println( e.getMessage());
                    }
                }
            }
            javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        this.jTextNombre.setText("");
        this.jTextApe.setText("");
        this.jTextCd.setText("");
        this.jTextTel.setText("");
        this.jTextPuesto.setText("");

    }//GEN-LAST:event_jButtonAceptActionPerformed

    private void jTextPuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPuestoKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_jTextPuestoKeyTyped

    private void jTextPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPuestoActionPerformed

    private void jTextTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextTelKeyTyped

    private void jTextTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelActionPerformed

    private void jTextCdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCdKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_jTextCdKeyTyped

    private void jTextCdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCdActionPerformed

    }//GEN-LAST:event_jTextCdActionPerformed

    private void jTextApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextApeKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_jTextApeKeyTyped

    private void jTextApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApeActionPerformed

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextUserKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextUserKeyTyped

    private void jTextUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUserActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ConsultasUser ven = new ConsultasUser();
        ven.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel empresa;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAcept;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JLabel jLabelAp;
    private javax.swing.JLabel jLabelCd;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelPuesto;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelnumber;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextApe;
    private javax.swing.JTextField jTextCd;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPuesto;
    private javax.swing.JTextField jTextTel;
    private javax.swing.JTextField jTextUser;
    private javax.swing.JMenuItem tabla;
    // End of variables declaration//GEN-END:variables
}
