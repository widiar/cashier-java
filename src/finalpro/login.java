/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpro;

//INI IMPORT BUAT BIAR BISA MASUK SQL
import java.awt.Cursor;
import java.awt.event.KeyEvent;

//SAMPE INI

import javax.swing.JFrame;
/**
 *
 * @author Widi
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form ok
     */
    int role, nip;
    public login() {
        initComponents();
        username.requestFocus();
        loginExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    private int buatLogin(){
        String user = username.getText(); //ngambil data yang ada di textfield username
        String pass = new String(passwd.getPassword()); //ngambil data yang ada di textfield passwd
        try{
            //buat koneksi database (cari google biar lebih ngerti )
            koneksi data = new koneksi();
            String sql = "SELECT * FROM karyawan WHERE username='"+user+"'";
            data.rs = data.st.executeQuery(sql);
            //sampe sini
            if(data.rs.next()){
                if(data.rs.getString("password").equals(pass)){
                    //pesan login berhasil
                    role = data.rs.getInt("jabatan");
                    nip = data.rs.getInt("id");
                    return 1;
                }
            }
            data.tutupKoneksi();
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
        return 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwd = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        loginicon = new javax.swing.JLabel();
        loginExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(107, 214, 255));

        username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        labelUsername.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        labelUsername.setText("Username");

        jLabel2.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        jLabel2.setText("Password");

        passwd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwdKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        loginicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        loginExit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        loginExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginExit.setText("X");
        loginExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwd)
                            .addComponent(username)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelUsername)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(127, 127, 127))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 268, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(loginicon, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(loginicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(loginExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(labelUsername)
                .addGap(18, 18, 18)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(buatLogin() == 1){
            pesan("LOGIN",1,role,nip);
            dispose();
        }else{
            pesan("LOGIN",0, 0,0);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loginExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_loginExitMouseClicked

    private void passwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwdKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            if(buatLogin() == 1){
                pesan("LOGIN",1,role,nip);
                dispose();
            }else{
                pesan("LOGIN",0, 0,0);
            }
        }
    }//GEN-LAST:event_passwdKeyPressed

    public void pesan(String s, int a, int role, int nip){
        //pesan yg baris 110,114,116 masuk sini
        coba cob = new coba(); //buat object nama cob 
        cob.setVisible(true); //biar keliatan
        cob.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //biar klo diclose ga ngeclose semua
        cob.psn(s,a,role,nip); //manggil method psn yang ada di coba
    }
    
    /**
     * @param args the command line arguments
     */
    /**
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         *
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form *
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
*/
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel loginExit;
    private javax.swing.JLabel loginicon;
    private javax.swing.JPasswordField passwd;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
