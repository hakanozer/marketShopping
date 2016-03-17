package urunekle;

import giris.DB;
import giris.anaForm;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class urunEkle extends javax.swing.JFrame {

    DefaultTableModel dt = new DefaultTableModel();

    public urunEkle() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
               
                new anaForm().setVisible(true);

            }
        });

        dt.addColumn("Ürün Id");
        dt.addColumn("Kategori ID");
        dt.addColumn("Barkod No");
        dt.addColumn("Ürün Adı");
        dt.addColumn("Açıklama");
        dt.addColumn("Ürün Fiyatı");
        dt.addColumn("Ürün Adeti");
        jTable1.setModel(dt);

        dataGetir();

        kategoriGetir();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtbarkod = new javax.swing.JTextField();
        txturunadi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txturunfiyat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtaciklama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txturunadeti = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmkategori = new javax.swing.JComboBox<>();
        ekle = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblbarkod = new javax.swing.JLabel();
        kaldir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        lblurunadi = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblurunfiyati = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblurunadeti = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblaciklama = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnGuncelle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ürün Ekleme Paneli");
        setPreferredSize(new java.awt.Dimension(900, 700));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ürün Ekleme Paneli", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(230, 98, 9))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 51, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 700));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Ürün Adı:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Ürün Fiyatı:");

        txtbarkod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbarkodKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Barkod:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Açıklama:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Ürün Adeti:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Barkod");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("Kategori:");

        cmkategori.setMaximumRowCount(10);
        cmkategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmkategoriItemStateChanged(evt);
            }
        });
        cmkategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmkategoriActionPerformed(evt);
            }
        });

        ekle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ekle.setForeground(new java.awt.Color(0, 51, 102));
        ekle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        ekle.setText("Ürün Ekle");
        ekle.setPreferredSize(new java.awt.Dimension(125, 40));
        ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 51, 102));
        jLabel12.setOpaque(true);

        kaldir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kaldir.setForeground(new java.awt.Color(0, 51, 102));
        kaldir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        kaldir.setText("Ürün Kaldır");
        kaldir.setPreferredSize(new java.awt.Dimension(125, 40));
        kaldir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaldirActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setText("Ürün Adı");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 102));
        jLabel17.setText("Ürün Fiyatı");

        jLabel18.setBackground(new java.awt.Color(0, 51, 102));
        jLabel18.setOpaque(true);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 102));
        jLabel20.setText("Ürün Adeti");

        jLabel21.setBackground(new java.awt.Color(0, 51, 102));
        jLabel21.setOpaque(true);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 102));
        jLabel23.setText("Açıklama");

        jLabel24.setBackground(new java.awt.Color(0, 51, 102));
        jLabel24.setOpaque(true);

        jLabel26.setBackground(new java.awt.Color(0, 51, 102));
        jLabel26.setOpaque(true);

        btnGuncelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuncelle.setForeground(new java.awt.Color(0, 51, 102));
        btnGuncelle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guncelle.png"))); // NOI18N
        btnGuncelle.setText("Güncelle");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbarkod, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txturunadi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txturunfiyat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txturunadeti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addComponent(txtaciklama, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblbarkod, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14)
                                    .addComponent(lblurunadi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblurunfiyati, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblurunadeti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(112, 112, 112)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblaciklama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(kaldir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmkategori, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbarkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(txturunfiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txturunadeti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txturunadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)))
                    .addComponent(txtaciklama, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ekle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuncelle)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(kaldir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblbarkod, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblurunadi, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblurunfiyati, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblurunadeti, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblaciklama, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmkategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmkategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkategoriActionPerformed
    int comboSecim = -1;
    private void cmkategoriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmkategoriItemStateChanged

        comboSecim = cmkategori.getSelectedIndex() + 1;

        System.out.println("seçilen : " + comboSecim);


    }//GEN-LAST:event_cmkategoriItemStateChanged

    private void ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleActionPerformed

        if (sayiKontrol(txturunfiyat.getText().trim()) && sayiKontrol(txturunadeti.getText().trim())) {

            if (txtdenetim()) {

            } else {
                DB db = new DB();
                int barkodNo = Integer.valueOf(txtbarkod.getText());
                ResultSet rs = db.dataGetir("urunler where barkodNo = '" + barkodNo + "'");
                boolean varmiDurum = true;
                db.kapat();
                try {
                    varmiDurum = rs.next();
                } catch (SQLException ex) {
                    Logger.getLogger(urunEkle.class.getName()).log(Level.SEVERE, null, ex);
                }

                String urunAdi = txturunadi.getText().trim();
                String urunFiyati = txturunfiyat.getText().trim();
                String urunAdet = txturunadeti.getText().trim();
                String aciklama = txtaciklama.getText().trim();
                if (comboSecim == -1) {
                    JOptionPane.showMessageDialog(rootPane, "Lütfen Kategori seçiniz");
                } else if (!varmiDurum) {
                    db = new DB();
                    boolean getir = db.genelQuery("insert into urunler values (null, '" + comboSecim + "', '" + barkodNo + "', '" + urunAdi + "', '" + aciklama + "', '" + urunFiyati + "', '" + urunAdet + "')");
                    if (getir) {
                        JOptionPane.showMessageDialog(rootPane, "Ekleme Başarılı");
                        txtbarkod.setText("");
                        txturunadeti.setText("");
                        txturunadi.setText("");
                        txtaciklama.setText("");
                        txturunfiyat.setText("");
                    }
                    db.kapat();
                    dataGetir();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Girdiğiniz Barkod Bulunmaktadır");

                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Ürün fiyatını ve Ürün Adetini Sayı Formatında Giriniz");
        }

    }//GEN-LAST:event_ekleActionPerformed
    int tabloSecim = -1;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        tabloSecim = Integer.valueOf("" + dt.getValueAt(jTable1.getSelectedRow(), 0));
        System.out.println("tablo seçim : " + tabloSecim);
        //sqlden veri alarak güncelleme
        try {
            DB db = new DB();
            ResultSet rs = db.dataGetir("urunler where urunID ='" + tabloSecim + "'");
            rs.next();//yazmazsak itaraayon bize bilgileri getirmez
            lblbarkod.setText(rs.getString("barkodNo"));
            lblurunadi.setText(rs.getString("urunAdi"));
            lblurunfiyati.setText(rs.getString("fiyat"));
            lblurunadeti.setText(rs.getString("stok"));
            lblaciklama.setText(rs.getString("kisaAciklama"));
            db.kapat();
        } catch (Exception e) {
            System.err.println("Okuma hatası" + e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void kaldirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaldirActionPerformed
        dataSil();
        dataGetir();
        JOptionPane.showMessageDialog(rootPane, "Ürün Kaldırıldı");
    }//GEN-LAST:event_kaldirActionPerformed
    int Stok = -1;
    private void txtbarkodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbarkodKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (sayiKontrol(txtbarkod.getText().trim())) {

                try {
                    DB db = new DB();
                    int getirBarkod = Integer.valueOf(txtbarkod.getText().trim());

                    ResultSet rs = db.dataGetir("urunler where barkodNo = '" + getirBarkod + "'");
                    int dataBarkod = rs.getInt("barkodNo");
                    System.out.println("barkod no" + dataBarkod);

                    int katno = rs.getInt("kategoriID");
                    txturunadi.setText(rs.getString("urunAdi"));
                    txturunfiyat.setText(rs.getString("fiyat"));
                    txturunadeti.setText(rs.getString("stok"));
                    txtaciklama.setText(rs.getString("kisaAciklama"));

                    cmkategori.setSelectedIndex(katno - 1);
                    System.out.println("kat no " + katno);
                    db.kapat();
                    txturunadi.requestFocus();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Böyle Bir Barkod Bulunmamaktadır");
                }
                lblaciklama.setText(txtaciklama.getText());
                lblbarkod.setText(txtbarkod.getText());
                lblurunadeti.setText(txturunadeti.getText());
                lblurunadi.setText(txturunadi.getText());
                lblurunfiyati.setText(txturunfiyat.getText());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Lütfen Barkodu Sayı Formatında Giriniz");
            }
        }
    }//GEN-LAST:event_txtbarkodKeyPressed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        if (sayiKontrol(txturunfiyat.getText().trim()) && sayiKontrol(txturunadeti.getText().trim())) {
            DB db = new DB();
            int barkodNo = Integer.valueOf(txtbarkod.getText().trim());
            String urunAdi = txturunadi.getText().trim();
            String urunFiyati = txturunfiyat.getText().trim();
            int urunAdet = Integer.valueOf(txturunadeti.getText().trim());
            String aciklama = txtaciklama.getText().trim();

            ResultSet rs = db.dataGetir("urunler where barkodNo = '" + barkodNo + "'");
            int Stok = 0;
            try {
                Stok = rs.getInt("stok");
            } catch (SQLException ex) {
                Logger.getLogger(urunEkle.class.getName()).log(Level.SEVERE, null, ex);
            }
            db.kapat();
            db = new DB();

            boolean sonuc = db.genelQuery("update urunler set urunAdi = '" + urunAdi + "', kisaAciklama = '" + aciklama + "', fiyat = '" + urunFiyati + "', stok = '" + (Stok + urunAdet) + "' where barkodNo = '" + barkodNo + "'");
            db.kapat();
            if (sonuc) {

                JOptionPane.showMessageDialog(rootPane, "Güncelleme işlemi başarılı.");

            }
            dataGetir();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Sayı Formatında Giriniz");
            txturunfiyat.requestFocus();

        }

    }//GEN-LAST:event_btnGuncelleActionPerformed
    DefaultComboBoxModel<String> cb = new DefaultComboBoxModel<>();

    public void kategoriGetir() {

        DB db = new DB();
        ResultSet rs = db.dataGetir("kategori");
        try {
            cb.setSelectedItem("Kategori Seç");

            while (rs.next()) {

                cb.addElement(rs.getString("katAdi"));

                cmkategori.setModel(cb);
            }
            db.kapat();
        } catch (SQLException ex) {
            Logger.getLogger(urunEkle.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void dataSil() {
        DB db = new DB();
        boolean sil = db.genelQuery("delete from urunler where urunID ='" + tabloSecim + "'");
        if (sil) {
            db.kapat();

        }

    }

    public void dataGetir() {
        DB db = new DB();
        dt.setRowCount(0);//tekrardan aynısını göndermesin diye table satır sayısını 0 ladık
        try {
            //datanın geleceğine karar verdi
            ResultSet rs = db.dataGetir("urunler");
            //while sorgu içindeki nextleri aradı 
            while (rs.next()) {
                dt.addRow(new String[]{rs.getString("urunID"), rs.getString("kategoriID"), rs.getString("barkodNo"), rs.getString("urunAdi"), rs.getString("kisaAciklama"), rs.getString("fiyat"), rs.getString("stok")});
            }
            jTable1.setModel(dt);
            db.kapat();
        } catch (Exception e) {
            System.err.println("Hata: " + e);
        }
    }

    public boolean txtdenetim() {
        boolean durum = false;
        Component[] comDizi = jPanel1.getComponents();
        for (Component component : comDizi) {
            if (component instanceof JTextField) {
                JTextField txt = (JTextField) component;
                if (txt.getText().equals("")) {
                    JOptionPane.showMessageDialog(component, "Lütfen Boş Alanları Doldurunuz.");
                    txtbarkod.requestFocus();
                    durum = true;
                    break;
                }
            }
        }
        return durum;
    }

    public static boolean sayiKontrol(String gelen) {
        if (gelen.length() >= 14) {
            return false;
        }
        boolean durum = false;
        char[] diz = gelen.toCharArray();

        for (int i = 0; i < diz.length; i++) {

            if (Character.isDigit(diz[i])) {
                durum = true;

            } else {
                durum = false;
                break;
            }

        }
        return durum;
    }

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
            java.util.logging.Logger.getLogger(urunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(urunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(urunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(urunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new urunEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JComboBox<String> cmkategori;
    private javax.swing.JButton ekle;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton kaldir;
    private javax.swing.JLabel lblaciklama;
    private javax.swing.JLabel lblbarkod;
    private javax.swing.JLabel lblurunadeti;
    private javax.swing.JLabel lblurunadi;
    private javax.swing.JLabel lblurunfiyati;
    private javax.swing.JTextField txtaciklama;
    private javax.swing.JTextField txtbarkod;
    private javax.swing.JTextField txturunadeti;
    private javax.swing.JTextField txturunadi;
    private javax.swing.JTextField txturunfiyat;
    // End of variables declaration//GEN-END:variables
}
