/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpro;

/**
 *
 * @author Widi
 */
public class warn extends javax.swing.JFrame {

    /**
     * Creates new form warn
     */
    public warn(int a) {
        initComponents();
        setResizable(false);
        setTitle("Warning!");
        if(a==1){
            gambarPanel.removeAll();
            gambarPanel.add(gambar1);
            gambarPanel.repaint();
            gambarPanel.revalidate();
            textPanel.removeAll();
            textPanel.add(text1);
            textPanel.repaint();
            textPanel.revalidate();
        }else if(a==2){
            gambarPanel.removeAll();
            gambarPanel.add(gambar2);
            gambarPanel.repaint();
            gambarPanel.revalidate();
            textPanel.removeAll();
            textPanel.add(text2);
            textPanel.repaint();
            textPanel.revalidate();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        gambarPanel = new javax.swing.JPanel();
        gambar1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        gambar2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textPanel = new javax.swing.JPanel();
        text1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(204, 255, 204));
        mainPanel.setForeground(new java.awt.Color(204, 255, 204));

        gambarPanel.setBackground(new java.awt.Color(204, 255, 204));
        gambarPanel.setLayout(new java.awt.CardLayout());

        gambar1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/emp.png"))); // NOI18N

        javax.swing.GroupLayout gambar1Layout = new javax.swing.GroupLayout(gambar1);
        gambar1.setLayout(gambar1Layout);
        gambar1Layout.setHorizontalGroup(
            gambar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );
        gambar1Layout.setVerticalGroup(
            gambar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gambarPanel.add(gambar1, "card2");

        gambar2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N

        javax.swing.GroupLayout gambar2Layout = new javax.swing.GroupLayout(gambar2);
        gambar2.setLayout(gambar2Layout);
        gambar2Layout.setHorizontalGroup(
            gambar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        gambar2Layout.setVerticalGroup(
            gambar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        gambarPanel.add(gambar2, "card3");

        textPanel.setBackground(new java.awt.Color(204, 255, 204));
        textPanel.setLayout(new java.awt.CardLayout());

        text1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("Anda Belum Mempunyai Pegawai");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setText("Tambahkan Pegawai di Bagian Pegawai");

        javax.swing.GroupLayout text1Layout = new javax.swing.GroupLayout(text1);
        text1.setLayout(text1Layout);
        text1Layout.setHorizontalGroup(
            text1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(text1Layout.createSequentialGroup()
                .addGroup(text1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(text1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(text1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        text1Layout.setVerticalGroup(
            text1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(text1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        textPanel.add(text1, "card2");

        text2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setText("Password anda sama dengan Username");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setText("Silahkan Ganti Password Anda");

        javax.swing.GroupLayout text2Layout = new javax.swing.GroupLayout(text2);
        text2.setLayout(text2Layout);
        text2Layout.setHorizontalGroup(
            text2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(text2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(text2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(text2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        text2Layout.setVerticalGroup(
            text2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(text2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        textPanel.add(text2, "card2");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(gambarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(textPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(gambarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(textPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gambar1;
    private javax.swing.JPanel gambar2;
    private javax.swing.JPanel gambarPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel text1;
    private javax.swing.JPanel text2;
    private javax.swing.JPanel textPanel;
    // End of variables declaration//GEN-END:variables
}
