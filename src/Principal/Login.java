/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javax.swing.UIManager;

/**
 *
 * @author emili
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        Login_BACKGROUND = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TF_Usuario = new javax.swing.JTextField();
        PF_Password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        BT_Registro = new javax.swing.JButton();
        BT_Ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login_BACKGROUND.setBackground(new java.awt.Color(51, 51, 51));
        Login_BACKGROUND.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel1.setText("Usuario");
        Login_BACKGROUND.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        Login_BACKGROUND.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        TF_Usuario.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Login_BACKGROUND.add(TF_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 360, 40));

        PF_Password.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Login_BACKGROUND.add(PF_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 360, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Login");
        Login_BACKGROUND.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        BT_Registro.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        BT_Registro.setText("Registro");
        Login_BACKGROUND.add(BT_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 230, 50));

        BT_Ingresar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        BT_Ingresar.setText("Ingresar");
        Login_BACKGROUND.add(BT_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 230, 50));

        getContentPane().add(Login_BACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        //UIManager.setLookAndFeel(new );
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Ingresar;
    private javax.swing.JButton BT_Registro;
    private javax.swing.JPanel Login_BACKGROUND;
    private javax.swing.JPasswordField PF_Password;
    private javax.swing.JTextField TF_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
