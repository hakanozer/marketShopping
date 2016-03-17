package kasiyer;

import giris.DB;
import giris.anaForm;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class barkodOkuma extends javax.swing.JFrame {

    DefaultTableModel dt = new DefaultTableModel();

    public barkodOkuma() {
        initComponents();
        tablo();
        txtAra.requestFocus();
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
               
                new anaForm().setVisible(true);

            }
        });
    }

    public void tablo() {
        dt.addColumn("Ürün Adı");
        dt.addColumn("Ürün Fiyatı");
        dt.addColumn("Ürün Açıklaması");
        dt.addColumn("Ürün Stok");
        jTable1.setModel(dt);
    }

    public void temizle() {
        if (jTable1.getRowCount() > 0) {
            dt.getDataVector().removeAllElements();
            jTable1.setModel(dt);
        }

    }
    
    public void fncBtnAra() {
        boolean durum = false;
        temizle();
        if (!(txtAra.getText().equals(""))) {
            try {
                String aranan = txtAra.getText().trim();

                DB db = new DB();
                ResultSet rs = db.dataGetir("urunler where barkodNo = '" + aranan + "'");
                while (rs.next()) {
                    durum = true;
                    if (rs.getString("barkodNo").equals(aranan)) {
                        dt.addRow(new String[]{rs.getString("urunAdi"), rs.getString("fiyat"), rs.getString("kisaAciklama"), rs.getString("stok")});
                        if (rs.getString("stok").equals("0")) {
                            JOptionPane.showMessageDialog(rootPane, "Ürün Stokta Bulunmamaktadır.");
                        }
                    }

                }
                db.kapat();

                DB dbb = new DB();
                ResultSet rss = dbb.dataGetir("urunler where urunAdi like '" + aranan + "'");
                while (rss.next()) {
                    durum = true;
                    if (rss.getString("urunAdi").equals(aranan)) {
                        dt.addRow(new String[]{rss.getString("urunAdi"), rss.getString("fiyat"), rss.getString("kisaAciklama"), rss.getString("stok")});
                        //System.out.println(jTable1.getRowCount());
                        if (rss.getString("stok").equals("0")) {
                            JOptionPane.showMessageDialog(rootPane, "Ürün Stokta Bulunmamaktadır.");
                        }
                    }
                }

                if (durum == false) {

                    JOptionPane.showMessageDialog(rootPane, "Böyle Bir Ürün Yok !");
                    dt.addRow(new String[]{"", "", "", ""});
                    temizle();
                    System.out.println("temizlemedim");
                }

                dbb.kapat();

            } catch (SQLException | HeadlessException e) {
                System.out.println("Ürün Arama Hatası :" + e);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Boş Alanları Doldurunuz !");
            txtAra.requestFocus();
        }

        txtAra.setText("");
        txtAra.requestFocus();

        
    }
    
     public void fncButton2(){
     int secim = JOptionPane.showConfirmDialog(rootPane,"Emin misiniz?","Satış Sayfasına Dön", JOptionPane.YES_NO_OPTION);
        if (secim == 0) {
            anaForm af = new anaForm();
            af.setVisible(true);
            this.setVisible(false);
        }
     
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAra = new javax.swing.JTextField();
        btnAra = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ürün Arama Paneli");
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ürün Arama Ekranı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(230, 98, 9))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Ürün Ara :");

        txtAra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAraKeyPressed(evt);
            }
        });

        btnAra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAra.setForeground(new java.awt.Color(0, 51, 102));
        btnAra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnAra.setText("Ara");
        btnAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAraActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.SystemColor.info);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1457748004_back.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAra))
                .addGap(70, 70, 70)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAra)
                .addGap(38, 38, 38))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAraActionPerformed
        fncBtnAra();
    }//GEN-LAST:event_btnAraActionPerformed

    private void txtAraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAraActionPerformed(null);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jButton2ActionPerformed(null);
        }
    }//GEN-LAST:event_txtAraKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        fncButton2();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barkodOkuma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAra;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAra;
    // End of variables declaration//GEN-END:variables
}
