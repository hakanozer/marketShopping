package raporlama;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import giris.DB;
import giris.anaForm;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;


public class rapor extends javax.swing.JFrame {

    DefaultTableModel dtable = new DefaultTableModel();
    DB db = new DB();
    SimpleDateFormat simple = new SimpleDateFormat("yyyyMMdd");
    Date tarihs = new Date();
    double toplam = 0;
    double ktoplam = 0;
    double ntoplam = 0;
    double topla = 0;
    ResultSet rs = null;
    ArrayList<String> idler = new ArrayList<>();

    public rapor() {
        initComponents();
           setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
    @Override
    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
           new anaForm().setVisible(true);   
    }});
        
        dtable.addColumn("Satış ID");
        dtable.addColumn("Sepet Referans Kodu");
        dtable.addColumn("Kasiyer ID");
        dtable.addColumn("Fiyat");
        dtable.addColumn("Ödeme Tipi");
        dtable.addColumn("Satış Tarihi");
        tbl.setModel(dtable);
        ResultSet rs2 = db.dataGetir("admin");
        try {
            idler.add("");
            while (rs2.next()) {
                idler.add(rs2.getString("id"));
                cmbKasiyer.addItem(rs2.getString("adi") + " " + rs2.getString("soyadi"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(rapor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnYillik = new javax.swing.JButton();
        btnAylikR = new javax.swing.JButton();
        btnHaftalikR = new javax.swing.JButton();
        btnGunlukR = new javax.swing.JButton();
        cmbKasiyer = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblNakit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblKart = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Raporlama Paneli");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gün Sonu Rapor Paneli", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(230, 98, 9))); // NOI18N

        btnYillik.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnYillik.setForeground(new java.awt.Color(0, 51, 102));
        btnYillik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/yillik.png"))); // NOI18N
        btnYillik.setText("Yıllık Rapor");
        btnYillik.setPreferredSize(new java.awt.Dimension(160, 40));
        btnYillik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYillikActionPerformed(evt);
            }
        });

        btnAylikR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAylikR.setForeground(new java.awt.Color(0, 51, 102));
        btnAylikR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/aylıik1.png"))); // NOI18N
        btnAylikR.setText("Aylık Rapor");
        btnAylikR.setPreferredSize(new java.awt.Dimension(160, 40));
        btnAylikR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAylikRActionPerformed(evt);
            }
        });

        btnHaftalikR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHaftalikR.setForeground(new java.awt.Color(0, 51, 102));
        btnHaftalikR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/haftalik.png"))); // NOI18N
        btnHaftalikR.setText("Haftalık Rapor");
        btnHaftalikR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHaftalikRActionPerformed(evt);
            }
        });

        btnGunlukR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGunlukR.setForeground(new java.awt.Color(0, 51, 102));
        btnGunlukR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gunluk.png"))); // NOI18N
        btnGunlukR.setText("Günlük Rapor");
        btnGunlukR.setPreferredSize(new java.awt.Dimension(160, 40));
        btnGunlukR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGunlukRActionPerformed(evt);
            }
        });

        cmbKasiyer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbKasiyer.setForeground(new java.awt.Color(0, 51, 102));
        cmbKasiyer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kasiyerler" }));
        cmbKasiyer.setToolTipText("Kasiyer Seçimi");
        cmbKasiyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKasiyerActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tbl);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Toplam Nakit Ciro : ");

        lblNakit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNakit.setText("0");

        jLabel5.setText("TL");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Toplam Kart Ciro : ");

        lblKart.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKart.setText("0");

        jLabel6.setText("TL");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Toplam Ciro : ");

        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("0");

        jLabel7.setText("TL");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pdf.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNakit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbKasiyer, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnHaftalikR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGunlukR, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnYillik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAylikR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGunlukR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAylikR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmbKasiyer)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHaftalikR)
                            .addComponent(btnYillik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNakit)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblKart)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblTotal)
                    .addComponent(jLabel7))
                .addGap(342, 342, 342))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbKasiyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKasiyerActionPerformed
        toplam = 0;
        ktoplam = 0;
        ntoplam = 0;
        topla = 0;
        int ttarih = 0;
        gunsonuRapor(ttarih);
    }//GEN-LAST:event_cmbKasiyerActionPerformed

    private void btnGunlukRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGunlukRActionPerformed
        toplam = 0;
        ktoplam = 0;
        ntoplam = 0;
        topla = 0;
        LocalDate localdate = LocalDate.now();
        localdate = localdate.minusDays(0);
        int ttarih = Integer.valueOf(localdate.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("Gelen : " + ttarih);
        gunsonuRapor(ttarih);
    }//GEN-LAST:event_btnGunlukRActionPerformed

    private void btnHaftalikRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHaftalikRActionPerformed
        toplam = 0;
        ktoplam = 0;
        ntoplam = 0;
        topla = 0;
        LocalDate localdate = LocalDate.now();
        localdate = localdate.minusDays(7);
        int ttarih = Integer.valueOf(localdate.format(DateTimeFormatter.BASIC_ISO_DATE));
        gunsonuRapor(ttarih);
    }//GEN-LAST:event_btnHaftalikRActionPerformed

    private void btnAylikRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAylikRActionPerformed
        toplam = 0;
        ktoplam = 0;
        ntoplam = 0;
        topla = 0;
        LocalDate localdate = LocalDate.now();
        localdate = localdate.minusMonths(1);
        int ttarih = Integer.valueOf(localdate.format(DateTimeFormatter.BASIC_ISO_DATE));
        gunsonuRapor(ttarih);
    }//GEN-LAST:event_btnAylikRActionPerformed

    private void btnYillikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYillikActionPerformed
        toplam = 0;
        ktoplam = 0;
        ntoplam = 0;
        topla = 0;
        LocalDate localdate = LocalDate.now();
        localdate = localdate.minusYears(1);
        int ttarih = Integer.valueOf(localdate.format(DateTimeFormatter.BASIC_ISO_DATE));
        gunsonuRapor(ttarih);
    }//GEN-LAST:event_btnYillikActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pdfAktar(tbl);
    }//GEN-LAST:event_jButton1ActionPerformed
    public void gunsonuRapor(int ttarih) {
        if (!cmbKasiyer.getSelectedItem().equals("Kasiyerler")) {
            toplam = 0;
            ktoplam = 0;
            ntoplam = 0;
            topla = 0;
            dtable.setRowCount(0);
            int secilen = cmbKasiyer.getSelectedIndex();
            try {
                System.out.println("Giden : "+ ttarih);
                rs = db.dataGetir("satis where satisTarih >= '" + ttarih + "' and kasiyerID = '" + idler.get(secilen) + "'");
                while (rs.next()) {
                    dtable.addRow(new String[]{rs.getString("satisID"), rs.getString("sepetRefID"), rs.getString("kasiyerID"), rs.getString("toplamFiyat"), rs.getString("odemeTuru"), rs.getString("satisTarih")});
                }
            } catch (SQLException ex) {
                System.err.println("Data getirme hatası ! " + ex);
            }

            try {

                ResultSet rs1 = db.dataGetir("satis where satisTarih >='" + ttarih + "' and  odemeTuru = 0 and kasiyerID = '" + idler.get(secilen) + "'");

                while (rs1.next()) {
                    ktoplam = Double.valueOf(rs1.getString("toplamFiyat"));
                    toplam += ktoplam;
                }

            } catch (SQLException ex) {
                System.err.println("Tür dönüşüm hatası ! " + ex);
            }
            try {

                ResultSet rs1 = db.dataGetir("satis where satisTarih >= '" + ttarih + "' and  odemeTuru = 1 and kasiyerID = '" + idler.get(secilen) + "' ");

                while (rs1.next()) {
                    ntoplam = Double.valueOf(rs1.getString("toplamFiyat"));
                    topla += ntoplam;
                }

            } catch (SQLException ex) {
                System.err.println("Tür dönüşüm hatası ! " + ex);
            }
            lblKart.setText("" + toplam);
            lblNakit.setText("" + topla);
            lblTotal.setText("" + (toplam + topla));
            tbl.setModel(dtable);
        } else {
            toplam = 0;
            ktoplam = 0;
            ntoplam = 0;
            topla = 0;
            dtable.setRowCount(0);
            try {

                ResultSet rs = db.dataGetir("satis where satisTarih >= '" + ttarih + "'");
                while (rs.next()) {
                    dtable.addRow(new String[]{rs.getString("satisID"), rs.getString("sepetRefID"), rs.getString("kasiyerID"), rs.getString("toplamFiyat"), rs.getString("odemeTuru"), rs.getString("satisTarih")});
                }
            } catch (SQLException ex) {
                System.err.println("Data getirme hatası ! " + ex);
            }

            try {

                ResultSet rs1 = db.dataGetir("satis where satisTarih >= '" + ttarih + "' and  odemeTuru = 0");

                while (rs1.next()) {
                    ktoplam = Double.valueOf(rs1.getString("toplamFiyat"));
                    toplam += ktoplam;
                }

            } catch (SQLException ex) {
                System.err.println("Tür dönüşüm hatası ! " + ex);
            }
            try {

                ResultSet rs1 = db.dataGetir("satis where satisTarih >= '" + ttarih + "' and  odemeTuru = 1 ");

                while (rs1.next()) {
                    ntoplam = Double.valueOf(rs1.getString("toplamFiyat"));
                    topla += ntoplam;
                }

            } catch (SQLException ex) {
                System.err.println("Tür dönüşüm hatası ! " + ex);
            }
            lblKart.setText("" + toplam);
            lblNakit.setText("" + topla);
            lblTotal.setText("" + (toplam + topla));
            tbl.setModel(dtable);
        }
    }

    
    
     // dışa pdf aktar fnc
    public void pdfAktar(JTable table) {
        try {
            Document doc = new Document();
            Date dt = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
            String dosyaAdi = ft.format(dt);
            PdfWriter.getInstance(doc, new FileOutputStream(dosyaAdi + ".pdf"));
            doc.open();

            Paragraph para = new Paragraph(50);
            para.setSpacingAfter(50);
            para.setSpacingBefore(50);
            para.setAlignment(Element.ALIGN_CENTER);
            para.setFont(new Font(Font.FontFamily.COURIER, 25.0f, WIDTH, BaseColor.RED));
            para.add("Günlük Rapor");
            doc.add(para);

            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
            for (int i = 0; i < table.getColumnCount(); i++) {
                pdfTable.addCell(table.getColumnName(i));
            }
            for (int rows = 0; rows < table.getRowCount() - 1; rows++) {
                for (int cols = 0; cols < table.getColumnCount(); cols++) {
                    pdfTable.addCell(table.getModel().getValueAt(rows, cols).toString());
                }
            }
            doc.add(pdfTable);

            doc.close();
            System.out.println("Rapor Alındı");
        } catch (DocumentException | FileNotFoundException ex) {
            System.err.println("Pdf Hatası : " + ex);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rapor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAylikR;
    private javax.swing.JButton btnGunlukR;
    private javax.swing.JButton btnHaftalikR;
    private javax.swing.JButton btnYillik;
    private javax.swing.JComboBox<String> cmbKasiyer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblKart;
    private javax.swing.JLabel lblNakit;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
