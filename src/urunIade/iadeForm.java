package urunIade;

import giris.DB;
import giris.anaForm;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class iadeForm extends javax.swing.JFrame {

    DefaultTableModel dt = new DefaultTableModel();

    Statement st = null;

    public iadeForm() {
        initComponents();
        txtFatura.requestFocus();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
    @Override
    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
        
        new anaForm().setVisible(true);
        
    }});
        dt = new DefaultTableModel();
        dt.addColumn("urunID");
        dt.addColumn("kategoriID");
        dt.addColumn("barkodNo");
        dt.addColumn("urunAdi");
        dt.addColumn("kisaAciklama");
        dt.addColumn("fiyat");
        dt.addColumn("stok");
        jTable1.setModel(dt);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUrunIade = new javax.swing.JButton();
        txtBarkod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFatura = new javax.swing.JTextField();
        btnGetir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblKullanıcı = new javax.swing.JLabel();
        lblAdi = new javax.swing.JLabel();
        lblSoyadi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ürün İade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(230, 98, 9))); // NOI18N

        btnUrunIade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUrunIade.setForeground(new java.awt.Color(0, 51, 102));
        btnUrunIade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Resim2.png"))); // NOI18N
        btnUrunIade.setText("Ürün İade");
        btnUrunIade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrunIadeActionPerformed(evt);
            }
        });

        txtBarkod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBarkodKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Barkod Numarası:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Fatura Numarası:");

        txtFatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFaturaKeyPressed(evt);
            }
        });

        btnGetir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGetir.setForeground(new java.awt.Color(0, 51, 102));
        btnGetir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/direction_right.png"))); // NOI18N
        btnGetir.setText("Getir");
        btnGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Kasiyer Bilgileri");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText(" Kullanıcı Adı :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Soyadı :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Adı :");

        lblKullanıcı.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblAdi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblSoyadi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBarkod, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFatura, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGetir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnUrunIade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKullanıcı, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblKullanıcı, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBarkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUrunIade)
                        .addComponent(btnGetir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSoyadi, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetirActionPerformed
        if(!txtFatura.getText().trim().equals("") ){
        bilgiGetir();
        urunGetir();
        }else{
            JOptionPane.showMessageDialog(this, "Lütfen Fatura Numarasını Giriniz");
            txtFatura.requestFocus();
        }
    }//GEN-LAST:event_btnGetirActionPerformed

    private void btnUrunIadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrunIadeActionPerformed
        int secim = JOptionPane.showConfirmDialog(rootPane, "İade Etmek İstediğinizden Emin Misiniz ?","İade Yap",JOptionPane.YES_NO_OPTION);
        if (secim == 0) {
        iade();
        stok();
         dt.setRowCount(0);
         jTable1.setModel(dt);
        }
    }//GEN-LAST:event_btnUrunIadeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // GERİ BUTONU
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtFaturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFaturaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtBarkod.requestFocus();
        }
    }//GEN-LAST:event_txtFaturaKeyPressed

    private void txtBarkodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarkodKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGetirActionPerformed(null);
        }
    }//GEN-LAST:event_txtBarkodKeyPressed

    public void urunGetir() {
        try {
            DB db = new DB();

            ResultSet rs = db.dataGetir("urunler where barkodNo = '" + txtBarkod.getText().trim() + "'");
            if (rs.next()) {
                dt.addRow(new String[]{rs.getString("urunID"), rs.getString("kategoriID"), rs.getString("barkodNo"), rs.getString("urunAdi"), rs.getString("kisaAciklama"), rs.getString("fiyat"), rs.getString("stok")});
            jTable1.setModel(dt);
            }else{
                JOptionPane.showMessageDialog(this, "Barkod Numarasını Kontrol Ediniz");
                txtBarkod.requestFocus();
            }
            
            db.kapat();
        } catch (SQLException | HeadlessException e) {
            System.out.println("getirme hatası : " + e);
        }
    }

    public void bilgiGetir() {
        try {
            DB db = new DB();

            ResultSet rs = db.dataGetir("admin left join satis on admin.id = satis.kasiyerID where satisID = '" + txtFatura.getText().trim() + "'");
            if (rs.next()) {
                lblAdi.setText(rs.getString("adi"));
                lblSoyadi.setText(rs.getString("soyadi"));
                lblKullanıcı.setText(rs.getString("kulAdi"));
            }else{
                JOptionPane.showMessageDialog(this, "Bu Ürün Sistemde Bulunmamaktadır");
            }
            db.kapat();
        } catch (SQLException | HeadlessException e) {
            System.out.println("getirme hatası : " + e);
        }
    }
    double fiyat = 0;
    double tfiyat = 0;
    double ofiyat = 0;

    public void iade() { //txtFatura= satisID  txtBarkod = barkodNo
        try {
            DB db = new DB();
            ResultSet rs = db.dataGetir("satis where satisID = '" + txtFatura.getText().trim() + "'  ");
            tfiyat = Double.valueOf(rs.getString("toplamFiyat"));
            ofiyat = Double.valueOf(rs.getString("odenenFiyat"));
            System.out.println("tfiyat-ofiyat : " + tfiyat + ofiyat);
            try {
                 ResultSet rss = db.dataGetir("urunler where barkodNo = '" + txtBarkod.getText().trim() + "'  ");
                 fiyat = Double.valueOf(rss.getString("fiyat"));
                 
            } catch (SQLException | NumberFormatException e) {
                System.err.println("iadede ikinci catche girdi : " +e);
            }
            System.out.println("FIYATIMIZ : " +fiyat);
            tfiyat -= fiyat;
            ofiyat -= fiyat;
            System.out.println("son fiyatlar : " + tfiyat + " " + ofiyat);

            String txtfiyat = String.valueOf(tfiyat);
            String txtofiyat = String.valueOf(ofiyat);

            boolean sonuc = db.genelQuery("update satis set toplamFiyat = '" + txtfiyat + "',odenenFiyat='" + txtofiyat + "' where satisID = '" + txtFatura.getText().trim() + "' ");
            if (sonuc) {
                System.out.println("sonuc sıfırdan büyük : " + sonuc);
            }

            db.kapat();

        } catch (SQLException | NumberFormatException e) {
            System.err.println("iade hatası : " + e);
        }

    }
    
    public void stok() {
        try {
            DB db = new DB();
            ResultSet rs = db.dataGetir("urunler where barkodNo = '" + txtBarkod.getText() + "'");

            int stok = rs.getInt("stok");
            stok++;
            boolean sonuc = db.genelQuery("update urunler set stok = '" + stok + "' where barkodNo = '" + txtBarkod.getText() + "' ");
            if (sonuc) {
                System.out.println("sonuc sıfırdan büyük : " + sonuc);
            }
            db.kapat();
        } catch (Exception e) {
            System.out.println("stok hatası : " +e);
        }
    }

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
            java.util.logging.Logger.getLogger(iadeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iadeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iadeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iadeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iadeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetir;
    private javax.swing.JButton btnUrunIade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAdi;
    private javax.swing.JLabel lblKullanıcı;
    private javax.swing.JLabel lblSoyadi;
    private javax.swing.JTextField txtBarkod;
    private javax.swing.JTextField txtFatura;
    // End of variables declaration//GEN-END:variables
}
