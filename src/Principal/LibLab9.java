package lab9;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * La primera pareja que se ponga de pie y diga gane el punto extra, lo ganara
 * and open the template in the editor.
 */

/**
 *
 * @author James Josue Molina
 */
public class LibLab9 implements Runnable{
    private int recientesPos = 0;
    private String[] recientes = new String[5];
    private JTable antes;
    private JTable despues;
    private JProgressBar barra;
    private boolean random = false;
    
    public LibLab9(){
        
    }
    
    
    public static String encrypt(String password){
        try{
            MessageDigest m = MessageDigest.getInstance("MD5");  
            m.update(password.getBytes());
            byte[] bytes = m.digest();
            StringBuilder s = new StringBuilder();  
            for(int i=0; i< bytes.length ;i++){  
                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));  
            }
            return s.toString();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "";
    }
    
    public void changeRecent(JMenuItem menu, JLabel label){
        menu.removeAll();
        for (int i = 0; i < recientesPos; i++) {
            JMenuItem item = new JMenuItem(recientes[i]);
            item.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        ObjectInputStream os = new ObjectInputStream(new FileInputStream(item.getText()));
                        String queryPath = (String)os.readObject();
                        label.setText((String)queryPath);
                        os.close();
                    }catch(Exception ex){
                        
                    }
                }
            });
            menu.add(item);
        }
    }
    
    public void loadRecent(){
        int i = 0;
        try{
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("./Recent.sj"));
            String path;    
            while( (path = (String)os.readObject()) != null){
                recientes[i++] = path;
            }
            os.close();
            
        }catch(Exception ex){
        }
        recientesPos = i;
    }
    
    public void saveRecent(){
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./Recent.sj"));
            for (int i = 0; i < recientesPos; i++)
                os.writeObject(recientes[i]);
            os.close();
        }catch(Exception ex){
        }
    }
    
    public void addRecent(String path){
        recientes[recientesPos] = path;
        recientesPos %= 5;
        recientesPos++;
        
    }
    
    public void sendMail(String mensaje, String asunto, String receptor){
        Properties propiedades = new Properties();
        propiedades.setProperty("mail.smtp.host","smtp.gmail.com");
        propiedades.setProperty("mail.smtp.starttls.enable", "true");
        propiedades.setProperty("mail.smtp.port", "587");
        propiedades.setProperty("mail.smtp.auth","true");
        
        Session sesion = Session.getDefaultInstance(propiedades);
        String correoEnvia = "";
        String contrasena = "";
        try{
            MimeMessage mail = new MimeMessage(sesion);
            
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(receptor));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia,contrasena);
            
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            JOptionPane.showMessageDialog(null,"Listo! Revise el correo");
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
    
    public void setTables(JTable before, JTable after){
        antes = before;
        despues = after;
    }
    
    public void colorRand(boolean random){
        this.random = random;
        
    }
    
    public void setProgressBar(JProgressBar progressBar){
        barra = progressBar;
    }
    
    Thread hilo = new Thread(this);
    @Override
    public void run() {
        Random rd = new Random();
        while(true){
            try{
                int dif = Math.abs( antes.getRowCount() - despues.getRowCount() );
                barra.setMaximum(dif);
                barra.setValue(0);
                for (int i = 0; i <= dif; i++) {
                    barra.setValue(i);
                    if(random){
                        Color c = new Color(rd.nextInt(255),rd.nextInt(255),rd.nextInt(255));
                        barra.setForeground(c);
                    }
                    Thread.sleep(1000);
                }
                barra.setValue(0);
                break;
            }catch(Exception e){
                
            }
        }
    }
}
