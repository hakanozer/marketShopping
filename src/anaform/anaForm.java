package giris;


import kasiyer.barkodOkuma;
import kasiyer.profilSettings;
import kasiyer.satis;
import raporlama.rapor;
import urunIade.iadeForm;
import urunekle.urunEkle;

public class anaForm extends javax.swing.JFrame {

    public anaForm() {
        initComponents();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUrunEkle = new javax.swing.JButton();
        btnBarkodOkuma = new javax.swing.JButton();
        btnRaporlama = new javax.swing.JButton();
        btnUrunIade = new javax.swing.JButton();
        btnAdminEkle = new javax.swing.JButton();
        btnSatis = new javax.swing.JButton();
        btnAyarlar = new javax.swing.JButton();
        btnCikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Navigasyon Paneli");
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 514));
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navigasyon Paneli", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(230, 98, 9))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 550));

        btnUrunEkle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUrunEkle.setForeground(new java.awt.Color(0, 51, 102));
        btnUrunEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/urunekle.png"))); // NOI18N
        btnUrunEkle.setText("Ürün Ekle");
        btnUrunEkle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUrunEkle.setMaximumSize(new java.awt.Dimension(110, 95));
        btnUrunEkle.setMinimumSize(new java.awt.Dimension(110, 95));
        btnUrunEkle.setPreferredSize(new java.awt.Dimension(105, 80));
        btnUrunEkle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnUrunEkle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUrunEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrunEkleActionPerformed(evt);
            }
        });

        btnBarkodOkuma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBarkodOkuma.setForeground(new java.awt.Color(0, 51, 102));
        btnBarkodOkuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/barcode.png"))); // NOI18N
        btnBarkodOkuma.setText("Stok/Barkod");
        btnBarkodOkuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBarkodOkuma.setMaximumSize(new java.awt.Dimension(110, 95));
        btnBarkodOkuma.setMinimumSize(new java.awt.Dimension(110, 95));
        btnBarkodOkuma.setPreferredSize(new java.awt.Dimension(105, 80));
        btnBarkodOkuma.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBarkodOkuma.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBarkodOkuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarkodOkumaActionPerformed(evt);
            }
        });

        btnRaporlama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRaporlama.setForeground(new java.awt.Color(0, 51, 102));
        btnRaporlama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Raporlama.png"))); // NOI18N
        btnRaporlama.setText("Raporlama");
        btnRaporlama.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRaporlama.setMaximumSize(new java.awt.Dimension(110, 95));
        btnRaporlama.setMinimumSize(new java.awt.Dimension(110, 95));
        btnRaporlama.setPreferredSize(new java.awt.Dimension(105, 80));
        btnRaporlama.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRaporlama.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRaporlama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaporlamaActionPerformed(evt);
            }
        });

        btnUrunIade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUrunIade.setForeground(new java.awt.Color(0, 51, 102));
        btnUrunIade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ürün iade.png"))); // NOI18N
        btnUrunIade.setText("Ürün Iade");
        btnUrunIade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUrunIade.setMaximumSize(new java.awt.Dimension(110, 95));
        btnUrunIade.setMinimumSize(new java.awt.Dimension(110, 95));
        btnUrunIade.setPreferredSize(new java.awt.Dimension(105, 80));
        btnUrunIade.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnUrunIade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUrunIade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrunIadeActionPerformed(evt);
            }
        });

        btnAdminEkle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdminEkle.setForeground(new java.awt.Color(0, 51, 102));
        btnAdminEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1457743855_user-group-new.png"))); // NOI18N
        btnAdminEkle.setText("Admin Ekle");
        btnAdminEkle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminEkle.setMaximumSize(new java.awt.Dimension(110, 95));
        btnAdminEkle.setMinimumSize(new java.awt.Dimension(110, 95));
        btnAdminEkle.setPreferredSize(new java.awt.Dimension(105, 80));
        btnAdminEkle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAdminEkle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdminEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminEkleActionPerformed(evt);
            }
        });

        btnSatis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSatis.setForeground(new java.awt.Color(0, 51, 102));
        btnSatis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sale.png"))); // NOI18N
        btnSatis.setText("Satış");
        btnSatis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSatis.setMaximumSize(new java.awt.Dimension(110, 95));
        btnSatis.setMinimumSize(new java.awt.Dimension(110, 95));
        btnSatis.setPreferredSize(new java.awt.Dimension(105, 80));
        btnSatis.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSatis.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSatis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatisActionPerformed(evt);
            }
        });

        btnAyarlar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAyarlar.setForeground(new java.awt.Color(0, 51, 102));
        btnAyarlar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/settings1.png"))); // NOI18N
        btnAyarlar.setText("Ayarlar");
        btnAyarlar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAyarlar.setMaximumSize(new java.awt.Dimension(110, 95));
        btnAyarlar.setMinimumSize(new java.awt.Dimension(110, 95));
        btnAyarlar.setPreferredSize(new java.awt.Dimension(105, 80));
        btnAyarlar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAyarlar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAyarlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyarlarActionPerformed(evt);
            }
        });

        btnCikis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCikis.setForeground(new java.awt.Color(0, 51, 102));
        btnCikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        btnCikis.setText("Çıkış");
        btnCikis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCikis.setMaximumSize(new java.awt.Dimension(110, 95));
        btnCikis.setMinimumSize(new java.awt.Dimension(110, 95));
        btnCikis.setPreferredSize(new java.awt.Dimension(105, 80));
        btnCikis.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCikis.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnUrunEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnBarkodOkuma, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSatis, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnUrunIade, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdminEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRaporlama, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(97, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAyarlar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBarkodOkuma, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRaporlama, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUrunEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSatis, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUrunIade, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdminEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAyarlar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCikis, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUrunEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrunEkleActionPerformed
        urunEkle ns = new urunEkle();
        ns.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUrunEkleActionPerformed

    private void btnBarkodOkumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarkodOkumaActionPerformed
        barkodOkuma ns = new barkodOkuma();
        ns.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBarkodOkumaActionPerformed

    private void btnRaporlamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaporlamaActionPerformed
        rapor ns = new rapor();
        ns.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRaporlamaActionPerformed

    private void btnUrunIadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrunIadeActionPerformed
        iadeForm ns = new iadeForm();
        ns.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUrunIadeActionPerformed

    private void btnAdminEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminEkleActionPerformed
        adminEkle ns = new adminEkle();
        ns.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAdminEkleActionPerformed

    private void btnAyarlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyarlarActionPerformed
        profilSettings ns = new profilSettings();
        ns.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAyarlarActionPerformed

    private void btnCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCikisActionPerformed

    private void btnSatisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatisActionPerformed
       satis st=new satis();
       st.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnSatisActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(anaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminEkle;
    private javax.swing.JButton btnAyarlar;
    private javax.swing.JButton btnBarkodOkuma;
    private javax.swing.JButton btnCikis;
    private javax.swing.JButton btnRaporlama;
    private javax.swing.JButton btnSatis;
    private javax.swing.JButton btnUrunEkle;
    private javax.swing.JButton btnUrunIade;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
