/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import com.formdev.flatlaf.FlatDarkLaf;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.UIManager;

/**
 *
 * @author emili
 */
public class Main extends javax.swing.JFrame {
    
    private database bd = new database("./database.accdb");
    private LibLab9 l = new LibLab9();
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        bd.conectar();
        l.loadRecent();
        l.changeRecent(MItem_ArchivosRecientes, Juego_SQL);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_BACKGROUND = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Juego_CB = new javax.swing.JComboBox<>();
        Juego_BT_Ejecutar = new javax.swing.JButton();
        Juego_BT_Generar = new javax.swing.JButton();
        Juego_TF2_Nombre = new javax.swing.JTextField();
        Juego_TF1_Categoria = new javax.swing.JTextField();
        Juego_TF1_Nombre = new javax.swing.JTextField();
        Juego_TF2_Categoria = new javax.swing.JTextField();
        Juego_TF2_Costo = new javax.swing.JTextField();
        Juego_TF1_Costo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Juego_TB1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        Juego_TB2 = new javax.swing.JTable();
        Juego_SQL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Idioma_TF_Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Idioma_BT_Agregar = new javax.swing.JButton();
        Idioma_BT_Crear = new javax.swing.JButton();
        Idioma_CB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Idioma_TB = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Correos_TF_Para = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Correos_TF_Asunto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Correos_TA_Mensaje = new javax.swing.JTextArea();
        MenuBar = new javax.swing.JMenuBar();
        BT_Archivo = new javax.swing.JMenu();
        MItem_AbrirArchivo = new javax.swing.JMenuItem();
        MItem_ArchivosRecientes = new javax.swing.JMenu();
        MItem_Limpiar = new javax.swing.JMenuItem();
        MItem_Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main_BACKGROUND.setBackground(new java.awt.Color(51, 51, 51));
        Main_BACKGROUND.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Juego_CB.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Juego_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crear", "Modificar", "Eliminar", "Seleccionar" }));
        jPanel1.add(Juego_CB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 230, 40));

        Juego_BT_Ejecutar.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Juego_BT_Ejecutar.setText("Ejecutar");
        Juego_BT_Ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Juego_BT_EjecutarMousePressed(evt);
            }
        });
        jPanel1.add(Juego_BT_Ejecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 230, 40));

        Juego_BT_Generar.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Juego_BT_Generar.setText("Generar");
        Juego_BT_Generar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Juego_BT_GenerarMousePressed(evt);
            }
        });
        jPanel1.add(Juego_BT_Generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 230, 40));

        Juego_TF2_Nombre.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jPanel1.add(Juego_TF2_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 260, 40));

        Juego_TF1_Categoria.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jPanel1.add(Juego_TF1_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 270, 40));

        Juego_TF1_Nombre.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jPanel1.add(Juego_TF1_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 270, 40));

        Juego_TF2_Categoria.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jPanel1.add(Juego_TF2_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 260, 40));

        Juego_TF2_Costo.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jPanel1.add(Juego_TF2_Costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 260, 40));

        Juego_TF1_Costo.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jPanel1.add(Juego_TF1_Costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 270, 40));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel1.setText("Costo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setText("Categoría");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 60, -1));

        Juego_TB1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Juego_TB1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Categoria", "Costo", "Idiomas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Juego_TB1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1000, 150));

        Juego_TB2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Juego_TB2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Categoria", "Costo", "Idiomas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(Juego_TB2);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1000, 170));

        Juego_SQL.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        Juego_SQL.setText("SQL");
        Juego_SQL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        jPanel1.add(Juego_SQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 266, 620, 50));

        jTabbedPane1.addTab("Juego", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setText("Idioma a Juego");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 110, -1));

        Idioma_TF_Nombre.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jPanel2.add(Idioma_TF_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 250, 40));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel5.setText("Nombre");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 60, -1));

        Idioma_BT_Agregar.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Idioma_BT_Agregar.setText("Agregar");
        jPanel2.add(Idioma_BT_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 250, 40));

        Idioma_BT_Crear.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Idioma_BT_Crear.setText("Crear");
        jPanel2.add(Idioma_BT_Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 250, 40));

        Idioma_CB.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Idioma_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(Idioma_CB, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 250, 40));

        Idioma_TB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Idioma_TB);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 600, 450));

        jTabbedPane1.addTab("Idioma", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Correos_TF_Para.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jPanel3.add(Correos_TF_Para, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 310, 40));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel6.setText("Para");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 60, -1));

        Correos_TF_Asunto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jPanel3.add(Correos_TF_Asunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 310, 40));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel7.setText("Asunto");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 60, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel8.setText("Mensaje");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 60, -1));

        Correos_TA_Mensaje.setColumns(20);
        Correos_TA_Mensaje.setRows(5);
        jScrollPane2.setViewportView(Correos_TA_Mensaje);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 810, 350));

        jTabbedPane1.addTab("Correos", jPanel3);

        Main_BACKGROUND.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        BT_Archivo.setText("Archivo");

        MItem_AbrirArchivo.setText("Abrir Archivo");
        BT_Archivo.add(MItem_AbrirArchivo);

        MItem_ArchivosRecientes.setText("Archivos Recientes");
        BT_Archivo.add(MItem_ArchivosRecientes);

        MItem_Limpiar.setText("Limpiar");
        MItem_Limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MItem_LimpiarMousePressed(evt);
            }
        });
        BT_Archivo.add(MItem_Limpiar);

        MItem_Salir.setText("Salir");
        MItem_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItem_SalirActionPerformed(evt);
            }
        });
        BT_Archivo.add(MItem_Salir);

        MenuBar.add(BT_Archivo);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_BACKGROUND, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_BACKGROUND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MItem_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItem_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MItem_SalirActionPerformed

    private void Juego_BT_GenerarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Juego_BT_GenerarMousePressed
        try{
            if(!ObtenerQuery().isBlank() && !ObtenerQuery().isEmpty()){
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                JFileChooser f = new JFileChooser("./");
                UIManager.setLookAndFeel(new FlatDarkLaf());   
                FileWriter fw = null;
                BufferedWriter bw = null;
                if(f.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
                    File archivo = f.getSelectedFile();     
                    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(archivo));
                    os.writeObject(ObtenerQuery());
                    os.close();
                    l.addRecent(archivo.getAbsolutePath());
                    l.saveRecent();
                    l.changeRecent(MItem_ArchivosRecientes, Juego_SQL);
                    
                }
        }            
        }catch(Exception e){
            
        }

        
    }//GEN-LAST:event_Juego_BT_GenerarMousePressed

    private void Juego_BT_EjecutarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Juego_BT_EjecutarMousePressed
        if(!ObtenerQuery().isEmpty()){
            try{
                if(Juego_SQL.getText().equalsIgnoreCase("SQL") || Juego_SQL.getText().isBlank() ||Juego_SQL.getText().isEmpty() ){
                    bd.query.execute(ObtenerQuery());
                    bd.commit();
                }else{
                    bd.query.execute(Juego_SQL.getText());
                    bd.commit();
                }           
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_Juego_BT_EjecutarMousePressed

    private void MItem_LimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MItem_LimpiarMousePressed
        Juego_SQL.setText("SQL");
    }//GEN-LAST:event_MItem_LimpiarMousePressed

    private String ObtenerQuery(){
        String query = ""; 
        if(Juego_CB.getSelectedIndex() == 0){
            if(!Juego_TF1_Nombre.getText().isBlank() && !Juego_TF1_Nombre.getText().isBlank() &&
                    !Juego_TF1_Categoria.getText().isBlank() && !Juego_TF1_Categoria.getText().isEmpty() &&
                    !Juego_TF1_Costo.getText().isBlank() && !Juego_TF1_Costo.getText().isEmpty()){
                query = "insert into juego (nombre,costo,categoria) ";
                String nombre = Juego_TF1_Nombre.getText();
                int costo = Integer.parseInt(Juego_TF1_Costo.getText());
                String categoria = Juego_TF1_Categoria.getText();
                query += " values ('"+nombre+"',"+costo+",'"+categoria+"')";
           
            }
        }else if(Juego_CB.getSelectedIndex() == 1){
            if(!Juego_TF2_Nombre.getText().isBlank() && !Juego_TF2_Nombre.getText().isBlank() &&
                    !Juego_TF2_Categoria.getText().isBlank() && !Juego_TF2_Categoria.getText().isEmpty() &&
                    !Juego_TF2_Costo.getText().isBlank() && !Juego_TF2_Costo.getText().isEmpty()){
                query = "update juego ";
                String newname = Juego_TF2_Nombre.getText();
                String newcategoria = Juego_TF2_Categoria.getText();
                int newcosto = Integer.parseInt(Juego_TF2_Costo.getText());
                query += " set nombre='"+newname+"',categoria='"+newcategoria+"',costo="+newcosto;
                int costo = Integer.parseInt(Juego_TF1_Costo.getText());
                query += " where nombre='"+Juego_TF1_Nombre.getText()+"' OR categoria='"+Juego_TF1_Categoria.getText()+"' OR costo="+costo;
                
            }
        }else if(Juego_CB.getSelectedIndex() == 2){
            if(!Juego_TF1_Nombre.getText().isBlank() && !Juego_TF1_Nombre.getText().isBlank() &&
                    !Juego_TF1_Categoria.getText().isBlank() && !Juego_TF1_Categoria.getText().isEmpty() &&
                    !Juego_TF1_Costo.getText().isBlank() && !Juego_TF1_Costo.getText().isEmpty()){
                query = "delete juego";
                String nombre = Juego_TF1_Nombre.getText();
                int costo = Integer.parseInt(Juego_TF1_Costo.getText());
                String categoria = Juego_TF1_Categoria.getText();                
                query += " where nombre='"+nombre+"' OR categoria='"+categoria+"' OR costo="+costo;
            }            
        }else if(Juego_CB.getSelectedIndex() == 3){
            if(!Juego_TF1_Nombre.getText().isBlank() && !Juego_TF1_Nombre.getText().isBlank() &&
                    !Juego_TF1_Categoria.getText().isBlank() && !Juego_TF1_Categoria.getText().isEmpty() &&
                    !Juego_TF1_Costo.getText().isBlank() && !Juego_TF1_Costo.getText().isEmpty()){
                query = "select id,nombre,categoria,costo ";
                String nombre = Juego_TF1_Nombre.getText();
                int costo = Integer.parseInt(Juego_TF1_Costo.getText());
                String categoria = Juego_TF1_Categoria.getText();  
                query += " where nombre='"+nombre+"' OR categoria='"+categoria+"' OR costo="+costo;
            }
        }
        return query;
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BT_Archivo;
    private javax.swing.JTextArea Correos_TA_Mensaje;
    private javax.swing.JTextField Correos_TF_Asunto;
    private javax.swing.JTextField Correos_TF_Para;
    private javax.swing.JButton Idioma_BT_Agregar;
    private javax.swing.JButton Idioma_BT_Crear;
    private javax.swing.JComboBox<String> Idioma_CB;
    private javax.swing.JTable Idioma_TB;
    private javax.swing.JTextField Idioma_TF_Nombre;
    private javax.swing.JButton Juego_BT_Ejecutar;
    private javax.swing.JButton Juego_BT_Generar;
    private javax.swing.JComboBox<String> Juego_CB;
    private javax.swing.JLabel Juego_SQL;
    private javax.swing.JTable Juego_TB1;
    private javax.swing.JTable Juego_TB2;
    private javax.swing.JTextField Juego_TF1_Categoria;
    private javax.swing.JTextField Juego_TF1_Costo;
    private javax.swing.JTextField Juego_TF1_Nombre;
    private javax.swing.JTextField Juego_TF2_Categoria;
    private javax.swing.JTextField Juego_TF2_Costo;
    private javax.swing.JTextField Juego_TF2_Nombre;
    private javax.swing.JMenuItem MItem_AbrirArchivo;
    private javax.swing.JMenu MItem_ArchivosRecientes;
    private javax.swing.JMenuItem MItem_Limpiar;
    private javax.swing.JMenuItem MItem_Salir;
    private javax.swing.JPanel Main_BACKGROUND;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
