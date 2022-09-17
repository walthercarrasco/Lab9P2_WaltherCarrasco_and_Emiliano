/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author emili
 */
public class Login extends javax.swing.JFrame {
    
    database bd = new database("./database.accdb");

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        bd.conectar();
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
        TF_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_UsuarioKeyPressed(evt);
            }
        });
        Login_BACKGROUND.add(TF_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 360, 40));

        PF_Password.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Login_BACKGROUND.add(PF_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 360, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Login");
        Login_BACKGROUND.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        BT_Registro.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        BT_Registro.setText("Registro");
        BT_Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BT_RegistroMousePressed(evt);
            }
        });
        Login_BACKGROUND.add(BT_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 230, 50));

        BT_Ingresar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        BT_Ingresar.setText("Ingresar");
        BT_Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BT_IngresarMousePressed(evt);
            }
        });
        Login_BACKGROUND.add(BT_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 230, 50));

        getContentPane().add(Login_BACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_RegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_RegistroMousePressed
        new Registro().setVisible(true);
    }//GEN-LAST:event_BT_RegistroMousePressed

    private void BT_IngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_IngresarMousePressed
        String usuario = TF_Usuario.getText();
        String contra = String.valueOf(PF_Password.getPassword());
        contra = LibLab9.encrypt(contra);
        try{
            bd.query.execute("select usuario,contra from usuarios");
            ResultSet rs = bd.query.getResultSet();
            boolean val = false;
            while(rs.next()){
                if(rs.getString(1).equals(usuario) && rs.getString(2).equals(contra)){
                    val = true;
                }
            }
            if(val == true){
                new Main().setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Usuario y contra incorrectos");
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_BT_IngresarMousePressed

    private void TF_UsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_UsuarioKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            PF_Password.requestFocus(true);
        }
    }//GEN-LAST:event_TF_UsuarioKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
        }

        
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
