/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpro;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Widi
 */
public class kasir extends javax.swing.JFrame {

    /**
     * Creates new form kasir
     */
    private int nip, role;
    public kasir(int nip, int role) {
        setTitle("Program Kasir");
        this.nip = nip ; this.role=role;
        initComponents();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd - MMMM - yyyy");
        LocalDateTime lokal = LocalDateTime.now();
        tanggalLabel.setText(format.format(lokal));
        setResizable(false);
        namaBarangTField.requestFocus();
        kembaliKeDashboard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kasirPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        namaBarangTField = new javax.swing.JTextField();
        jumlahBarangTField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelCari = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelBelanja = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        tanggalLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalBelanjaan = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        kembaliKeDashboard = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        diskonText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kasirPanel.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setText("Nama / Kode Barang");

        namaBarangTField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        namaBarangTField.setMargin(new java.awt.Insets(2, 10, 2, 2));
        namaBarangTField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namaBarangTFieldKeyReleased(evt);
            }
        });

        jumlahBarangTField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jumlahBarangTField.setText("1");
        jumlahBarangTField.setMargin(new java.awt.Insets(2, 15, 2, 2));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel2.setText("Jumlah");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("USER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("TAMBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("BAYAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tabelCari.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabelCari.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama", "Harga", "Stok"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelCari.setGridColor(new java.awt.Color(255, 255, 255));
        tabelCari.setRowHeight(25);
        tabelCari.setRowMargin(5);
        tabelCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelCariMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelCari);

        tabelBelanja.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabelBelanja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Harga", "Jumlah", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelBelanja.setRowHeight(25);
        tabelBelanja.setRowMargin(5);
        jScrollPane2.setViewportView(tabelBelanja);
        if (tabelBelanja.getColumnModel().getColumnCount() > 0) {
            tabelBelanja.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Tabel Pencarian");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Tabel Belanjaan");

        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usernameLabel.setText("User Default");

        tanggalLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tanggalLabel.setText("Tanggal");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setText("Total Belanjaan (Rp)");

        totalBelanjaan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        totalBelanjaan.setText("0");

        resetButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        kembaliKeDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kembaliKeDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        kembaliKeDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliKeDashboardMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setText("Diskon : ");

        diskonText.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        diskonText.setText("0%");

        javax.swing.GroupLayout kasirPanelLayout = new javax.swing.GroupLayout(kasirPanel);
        kasirPanel.setLayout(kasirPanelLayout);
        kasirPanelLayout.setHorizontalGroup(
            kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kasirPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kembaliKeDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameLabel)
                    .addGroup(kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kasirPanelLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(registerButton)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(kasirPanelLayout.createSequentialGroup()
                            .addGroup(kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(kasirPanelLayout.createSequentialGroup()
                                    .addGroup(kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(namaBarangTField, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addGap(64, 64, 64)
                                    .addGroup(kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(tanggalLabel)
                                        .addGroup(kasirPanelLayout.createSequentialGroup()
                                            .addComponent(jumlahBarangTField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(62, 62, 62)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(44, 44, 44)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGap(0, 29, Short.MAX_VALUE))
                        .addGroup(kasirPanelLayout.createSequentialGroup()
                            .addGroup(kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(kasirPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(36, 36, 36)
                                    .addComponent(totalBelanjaan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8))
                                .addGroup(kasirPanelLayout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGap(18, 18, 18)
                            .addGroup(kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(kasirPanelLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(kasirPanelLayout.createSequentialGroup()
                                    .addComponent(diskonText)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        kasirPanelLayout.setVerticalGroup(
            kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kasirPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kembaliKeDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(kasirPanelLayout.createSequentialGroup()
                        .addGroup(kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tanggalLabel)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(registerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel)
                .addGap(16, 16, 16)
                .addGroup(kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kasirPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jumlahBarangTField, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(kasirPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namaBarangTField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(kasirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totalBelanjaan)
                    .addComponent(jLabel8)
                    .addComponent(diskonText))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kasirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kasirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    String namabrg, harga, stok, kode;
    int totalsemua=0;
    private void cariBarang(String nama){
        try{
            DefaultTableModel tabel = (DefaultTableModel) tabelCari.getModel();
            tabel.setRowCount(0);
            koneksi data = new koneksi();
            String sql = "SELECT * FROM barang WHERE nama_brg LIKE '%" + nama + "%' OR kode LIKE '%" + nama + "%'";
            data.rs = data.st.executeQuery(sql);
            while(data.rs.next()){
                kode = data.rs.getString("kode");
                namabrg = data.rs.getString("nama_brg");
                harga = data.rs.getString("harga_jual");
                stok = data.rs.getString("stok");
                Object[] row = {kode,namabrg, harga, stok};
                tabel.addRow(row);
            }
            if(nama.isEmpty())
                tabel.setRowCount(0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void namaBarangTFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaBarangTFieldKeyReleased
        // TODO add your handling code here:
        cariBarang(namaBarangTField.getText());
    }//GEN-LAST:event_namaBarangTFieldKeyReleased

    private int cekField(){
        if(namaBarangTField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "MASUKKAN NAMA DULU");
            namaBarangTField.requestFocus();
        }else if(tabelCari.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "NAMA TIDAK ADA YANG SESUAI");
            namaBarangTField.requestFocus();
        }else if(tabelCari.getRowCount() > 1){
            JOptionPane.showMessageDialog(null, "PILIH NAMA YANG SESUAI");
            namaBarangTField.requestFocus();
        }else if(!namaBarangTField.getText().equals(tabelCari.getValueAt(0, 1)) && !namaBarangTField.getText().equals(tabelCari.getValueAt(0, 0))){
            JOptionPane.showMessageDialog(null, "KETIKKAN NAMA YANG BENAR");
            namaBarangTField.requestFocus();
        }else if(tabelCari.getRowCount() == 1 && Integer.parseInt(jumlahBarangTField.getText()) > Integer.parseInt(tabelCari.getValueAt(0, 3).toString())){
            JOptionPane.showMessageDialog(null, "STOK KURANG BOSS");
            namaBarangTField.requestFocus();
        }
        else if(tabelCari.getRowCount() == 1)
            return 1;
        return 0;
    }
    
    private void tabelCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelCariMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            int row = tabelCari.getSelectedRow();
            namaBarangTField.setText(tabelCari.getValueAt(row, 1).toString());
            cariBarang(namaBarangTField.getText());
            jumlahBarangTField.requestFocus();
        }
    }//GEN-LAST:event_tabelCariMouseClicked
    String[] kodeh = new String[100];
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(cekField() == 1){
            DefaultTableModel tabel = (DefaultTableModel) tabelCari.getModel();
            DefaultTableModel tabelbelanja = (DefaultTableModel) tabelBelanja.getModel();
            namaBarangTField.setText("");
            tabel.setRowCount(0);
            
            total brg = new total(jumlahBarangTField.getText());
            brg.totalHarga(brg, harga);
            
            jumlahBarangTField.setText("1");
            int i=0; int suk=0;
            while(kodeh[i] != null){
                if(kodeh[i].equals(kode)){
                    int ot = Integer.parseInt(tabelbelanja.getValueAt(i, 2).toString()) + brg.jumlah;
                    int kok = Integer.parseInt(harga) * ot;
                    tabelbelanja.setValueAt(ot, i, 2);
                    tabelbelanja.setValueAt(kok, i, 3);
                    suk=1;
                }
                i++;
            }
            if(suk == 0){
                Object[] row = {namabrg, harga, brg.jumlah, brg.harga};
                tabelbelanja.addRow(row);
            }
            totalsemua+=brg.harga;
            totalBelanjaan.setText(Integer.toString(totalsemua));
            kodeh[tabelBelanja.getRowCount()-1] = kode;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void resetKasir(){
        namaBarangTField.setText("");
        jumlahBarangTField.setText("1");
        DefaultTableModel cari = (DefaultTableModel) tabelCari.getModel();
        DefaultTableModel bayar = (DefaultTableModel) tabelBelanja.getModel();
        cari.setRowCount(0);
        bayar.setRowCount(0);
        totalBelanjaan.setText("0");
        namaBarangTField.requestFocus();
        diskonText.setText("0%");
        usernameLabel.setText("User Default");
        Arrays.fill(kodeh, null);
        totalsemua = 0;
    }
    
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        resetKasir();
    }//GEN-LAST:event_resetButtonActionPerformed
    
    private int cekLoyalUser(String user){
        try{
            koneksi data = new koneksi();
            String sql = "SELECT loyal FROM user WHERE username='" + user +  "'";
            data.rs = data.st.executeQuery(sql);
            if(data.rs.next()){
                if(data.rs.getString("loyal").equals("Bronze")){
                    return 1;
                }else if(data.rs.getString("loyal").equals("Silver")){
                    return 2;
                }else if(data.rs.getString("loyal").equals("Gold")){
                    return 3;
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userkasir us = new userkasir();
        us.setVisible(true);
        us.belanjaButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(us.cekField()==1){
                    usernameLabel.setText(us.userCariTabel.getValueAt(0, 0).toString());
                    us.dispose();
                    if(cekLoyalUser(us.userCariTabel.getValueAt(0, 0).toString()) == 1){
                        diskonText.setText("2%");
                    }else if(cekLoyalUser(us.userCariTabel.getValueAt(0, 0).toString()) == 2){
                        diskonText.setText("5%");
                    }else if(cekLoyalUser(us.userCariTabel.getValueAt(0, 0).toString()) == 3){
                        diskonText.setText("10%");
                    }
                }
            }
        });
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        registerUser tambah = new registerUser();
        tambah.setVisible(true);
        tambah.tambahDataUserButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tambah.cek()==1){
                    String sql = "INSERT INTO user (username, nama, tgl_lahir, alamat, jenis_kelamin) VALUES('%s', '%s', '%s', '%s', '%s')";
                    sql = String.format(sql, tambah.username, tambah.nama, tambah.tgl, tambah.alamat, tambah.jk);
                    try{
                        koneksi data = new koneksi();
                        data.st.execute(sql);
                        data.tutupKoneksi();
                    }catch (Exception ex){
                        System.out.println(ex.getMessage());
                    }
                    JOptionPane.showMessageDialog(null, "User Berhasil Ditambah");
                    usernameLabel.setText(tambah.username);
                    tambah.dispose();
                    if(cekLoyalUser(tambah.username) == 1){
                        diskonText.setText("2%");
                    }else if(cekLoyalUser(tambah.username) == 2){
                        diskonText.setText("5%");
                    }else if(cekLoyalUser(tambah.username) == 3){
                        diskonText.setText("10%");
                    }
                    DefaultTableModel belanja = (DefaultTableModel) tabelBelanja.getModel();
                    Object[] row = {"Beli Kartu Member", "20000", "1", "20000"};
                    totalsemua+=20000;
                    totalBelanjaan.setText(Integer.toString(totalsemua));
                    belanja.addRow(row);
                }
            }
        });
        
    }//GEN-LAST:event_registerButtonActionPerformed
    
    private void masukInvoice(){
        try{
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalDateTime waktu = LocalDateTime.now();
            koneksi data = new koneksi();
            String sql = "";
            for(int i=0; i<tabelBelanja.getRowCount(); i++){
                sql = "INSERT INTO belanjaanuser (username, kode_barang, harga, jumlah, total, bulan, tahun, id_karyawan, waktu) VALUES('%s', '%s', %s, %s, %s, '%s', '%s', '%s', '%s')";
                sql = String.format(sql, usernameLabel.getText(), kodeh[i], tabelBelanja.getValueAt(i, 1).toString(), tabelBelanja.getValueAt(i, 2).toString(), tabelBelanja.getValueAt(i, 3).toString(), waktu.getMonth(), waktu.getYear(), nip, dtf.format(waktu));
                data.st.execute(sql);
            }
            data.tutupKoneksi();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void masukPendapatan(String nama){
        try{
            LocalDateTime waktu = LocalDateTime.now();
            koneksi data = new koneksi();
            String sql = "INSERT INTO pendapatan (waktu, bulan, tahun, nama, total) VALUES('%s', '%s', '%s', '%s', %s)";
            sql = String.format(sql, waktu.getDayOfMonth(), waktu.getMonth(), waktu.getYear(), nama, totalBelanjaan.getText());
            data.st.execute(sql);
            data.tutupKoneksi();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(tabelBelanja.getRowCount()==0)
            JOptionPane.showMessageDialog(null, "Belanja Dulu lah");
        else{
            String[] diskon = diskonText.getText().split("%");
            float tol = Float.parseFloat(totalBelanjaan.getText());
            tol = tol - (tol * (Float.parseFloat(diskon[0])/100));
            bayarBelanja bayar = new bayarBelanja(Float.toString(tol));
            bayar.setVisible(true);
            bayar.uangBayar.addKeyListener(new KeyListener(){
                @Override
                public void keyTyped(KeyEvent e) {
                    
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode() == KeyEvent.VK_ENTER){
                        if(Float.parseFloat(bayar.kembalian.getText()) < 0){
                            JOptionPane.showMessageDialog(null, "Uang masih kurang");
                        }else{
                            masukInvoice();
                            masukPendapatan("Belanja User");
                            bayar.dispose();
                            JOptionPane.showMessageDialog(null, "Belanjaan Berhasil");
                            resetKasir();
                        }
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    
                }
            });
            bayar.bayar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(Float.parseFloat(bayar.kembalian.getText()) < 0){
                        JOptionPane.showMessageDialog(null, "Uang masih kurang");
                    }else{
                        masukInvoice();
                        masukPendapatan("Belanja User");
                        bayar.dispose();
                        JOptionPane.showMessageDialog(null, "Belanjaan Berhasil");
                        resetKasir();
                    }
                }
            });
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void kembaliKeDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliKeDashboardMouseClicked
        // TODO add your handling code here:
        dashboard karyawan = new dashboard();
        karyawan.setNip(nip);
        karyawan.setRole(role);
        karyawan.setVisible(true);
        if(role == 1){
            karyawan.manajer();
        }
        else if(role == 2){
            karyawan.pegawai();
         }
        dispose();
        
    }//GEN-LAST:event_kembaliKeDashboardMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel diskonText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jumlahBarangTField;
    private javax.swing.JPanel kasirPanel;
    private javax.swing.JLabel kembaliKeDashboard;
    private javax.swing.JTextField namaBarangTField;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JTable tabelBelanja;
    private javax.swing.JTable tabelCari;
    private javax.swing.JLabel tanggalLabel;
    private javax.swing.JLabel totalBelanjaan;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
