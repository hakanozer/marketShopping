package kasiyer;

import giris.DB;

import giris.anaForm;
import giris.ortakData;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.ParseException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class satis extends javax.swing.JFrame {

    DefaultTableModel dt = new DefaultTableModel();
    ArrayList<HashMap> arr = new ArrayList<>();
    HashMap<String, Object> hs = null;
    NumberFormat numberFormatTR = NumberFormat.getInstance(new Locale("TR"));

    public satis() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {

                new anaForm().setVisible(true);

            }
        });
        jLabel_toplam.setBackground(Color.BLACK);
        lblAdSoyad.setText(ortakData.adi + " " + ortakData.soyadi);
        dt.addColumn("urunID");
        dt.addColumn("kategoriID");
        dt.addColumn("barkodNo");
        dt.addColumn("urunAdi");
        dt.addColumn("kisaAciklama");
        dt.addColumn("fiyat");
        dt.addColumn("stok");
        dt.addColumn("delete");
        jTable1.setModel(dt);
        tableYaz();
        referansYaz();
        barkodAl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblAdSoyad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_barkodNo = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel_referans = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnNakit = new javax.swing.JButton();
        btnKrediKart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_nakit = new javax.swing.JTextField();
        jTextField_paraUstu = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_toplam = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_urunFiyati = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel_urunAdi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Şatış İşlemleri Paneli");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(870, 650));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Şatış İşlemleri Paneli", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(230, 98, 9))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(840, 603));

        lblAdSoyad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAdSoyad.setForeground(new java.awt.Color(0, 51, 102));
        lblAdSoyad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAdSoyad.setText("Kasiyer Adi Soyadi");
        lblAdSoyad.setFocusable(false);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shopping-basket-remove.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bardcode Scanner.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Barkod Kodu:");

        jTextField_barkodNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_barkodNoKeyPressed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-24.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Referans Kodu:");

        jLabel_referans.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel_referans.setText("86318e52f5ed4801abe1d13d509443de");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("Kasiyer Adı Soyadı:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("Ödeme Şekli:");

        btnNakit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop-18-32.png"))); // NOI18N
        btnNakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNakitActionPerformed(evt);
            }
        });

        btnKrediKart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shop-25-32.png"))); // NOI18N
        btnKrediKart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKrediKartActionPerformed(evt);
            }
        });

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
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTable1);

        jTextField_nakit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_nakit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextField_nakitMouseMoved(evt);
            }
        });
        jTextField_nakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nakitActionPerformed(evt);
            }
        });

        jTextField_paraUstu.setEditable(false);
        jTextField_paraUstu.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_paraUstu.setText("0.0");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 102));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1457465584_coins.png"))); // NOI18N
        jLabel13.setText("Alınan Para:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1457465722_hand-coins.png"))); // NOI18N
        jLabel14.setText("   Paraüstü:");

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel_toplam.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_toplam.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel_toplam.setForeground(new java.awt.Color(51, 204, 0));
        jLabel_toplam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_toplam.setText("label toplam");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("TL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_toplam, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_toplam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(256, 55));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("1");

        jLabel_urunFiyati.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel_urunFiyati.setForeground(new java.awt.Color(51, 204, 0));
        jLabel_urunFiyati.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("*");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("TL");

        jLabel_urunAdi.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel_urunAdi.setForeground(new java.awt.Color(51, 204, 0));
        jLabel_urunAdi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel_urunFiyati, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jLabel_urunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_urunFiyati)
                    .addComponent(jLabel1)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_urunAdi))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(823, 823, 823)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_barkodNo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel_referans, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnNakit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKrediKart))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_paraUstu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(jTextField_nakit, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdSoyad)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_barkodNo)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_referans)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAdSoyad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnNakit)
                                .addComponent(btnKrediKart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_nakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField_paraUstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(150, 150, 150))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnKrediKart, btnNakit});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void barkodAl() {
        DB db = new DB();

    }
    String sorgu = null;
    ResultSet rs;
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        if (!jTextField_barkodNo.getText().trim().isEmpty()) {
            String barkodNo = jTextField_barkodNo.getText().trim();
            sorgu = "urunler where barkodNo='" + barkodNo + "'";

            try {
                DB db = new DB();
                rs = db.dataGetir(sorgu);
                if (rs.next()) {
                    if (Integer.valueOf(rs.getString("stok")) > 0) {
                        hs = new HashMap<>();
                        hs.put("urunId", rs.getString("urunID"));

                        int urunID = Integer.valueOf(rs.getString("urunID"));
                        hs.put("kategoriID", rs.getString("kategoriID"));
                        hs.put("barkodNo", rs.getString("barkodNo"));
                        hs.put("urunAdi", rs.getString("urunAdi"));
                        jLabel_urunAdi.setText(rs.getString("urunAdi"));
                        hs.put("kisaAciklama", rs.getString("kisaAciklama"));
                        hs.put("fiyat", rs.getString("fiyat"));
                        jLabel_urunFiyati.setText(rs.getString("fiyat"));
                        hs.put("stok", rs.getString("stok"));
                        sorgu = "insert into  sepet(sepetReferans,sepetUrunID) values('" + ref + "','" + urunID + "')";
                        db.genelQuery(sorgu);
                        arr.add(hs);
                        sorgu = "update urunler set stok= stok-1 where urunID='" + hs.get("urunId") + "'";
                        db.genelQuery(sorgu);
                    } else {
                        JOptionPane.showMessageDialog(this, "stokta kalmadı.");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Ürün Bulunamadı.");
                }
                db.kapat();
            } catch (SQLException ex) {
                Logger.getLogger(satis.class.getName()).log(Level.SEVERE, null, ex);
            }

            tableYaz();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Barkod No boş!");
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    int ref = 0;

    public void referansYaz() {
        Random rand = new Random();
        ref = rand.nextInt(10000);
        jLabel_referans.setText("" + ref);

    }

    double para_ustu = 0;
    double nakit = 0;

    public void paraUstu() {
        if (jTextField_nakit.getText().trim().contains(",")) {
            try {
                String deg = numberFormatTR.parseObject(jTextField_nakit.getText().trim()).toString();
                nakit = Double.valueOf(deg);
            } catch (ParseException ex) {
            }
        } else {
            nakit = Double.valueOf(jTextField_nakit.getText().trim());
        }
        if (nakit > 0) {
            toplam = Double.valueOf(jLabel_toplam.getText().trim());
            para_ustu = nakit - toplam;
            jTextField_paraUstu.setText(para_ustu + "");
            toplam = 0;
        }

    }
    private void jTextField_nakitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_nakitMouseMoved
        if (!jTextField_nakit.getText().trim().isEmpty()) {
            paraUstu();
        }


    }//GEN-LAST:event_jTextField_nakitMouseMoved

    private void jTextField_nakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nakitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nakitActionPerformed

    private void btnNakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNakitActionPerformed
        if (arr.size() > 0) {
            satisform form = new satisform();
            form.dataYaz(arr, 0, 0, lblAdSoyad.getText(), ref, nakit);
            form.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "ürün listesi boş!");
        }


    }//GEN-LAST:event_btnNakitActionPerformed

    private void btnKrediKartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKrediKartActionPerformed
        if (!jTextField_nakit.getText().trim().isEmpty()) {
            paraUstu();
        } else {
            jTextField_nakit.requestFocus();
        }

        if (arr.size() > 0) {
            if (!jTextField_nakit.getText().trim().isEmpty()) {
                if (nakit >= Double.valueOf(jLabel_toplam.getText().trim())) {
                    satisform form = new satisform();
                    form.dataYaz(arr, 1, para_ustu, lblAdSoyad.getText(), ref, nakit);
                    form.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "nakit miktarı toplamdan büyük olmalı.");
                }

            } else {
                JOptionPane.showMessageDialog(this, "nakit miktarı giriniz.");
                jTextField_nakit.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "ürün listesi boş!");

        }
            }//GEN-LAST:event_btnKrediKartActionPerformed
    public void stokArt() {
        for (int i = 0; i < arr.size(); i++) {
            DB db = new DB();
            sorgu = "update urunler set stok= stok+1 where urunID='" + arr.get(i).get("urunId") + "'";
            db.genelQuery(sorgu);
            db.kapat();
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (arr.size() > 0) {
            stokArt();
            arr.clear();
            tableYaz();
            jLabel_referans.setText("-");
            jLabel_toplam.setText("0");
            jLabel_urunAdi.setText("    -");
            jLabel_urunFiyati.setText("-   ");
            jTextField_barkodNo.setText("");
            jTextField_nakit.setText("");
            jTextField_paraUstu.setText("");
            referansYaz();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField_barkodNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_barkodNoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton6ActionPerformed(null);
        }

    }//GEN-LAST:event_jTextField_barkodNoKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (arr.size()>0) {
            stokArt();
        } 
    }//GEN-LAST:event_formWindowClosing

    double toplam = 0;

    private void tableYaz() {
        dt.setRowCount(0);

        for (int i = 0; i < arr.size(); i++) {

            dt.addRow(new String[]{arr.get(i).get("urunId").toString(), arr.get(i).get("kategoriID").toString(), arr.get(i).get("barkodNo").toString(), arr.get(i).get("urunAdi").toString(), arr.get(i).get("kisaAciklama").toString(), arr.get(i).get("fiyat").toString(), arr.get(i).get("stok").toString(), "sil"});
            toplam += Double.valueOf(arr.get(i).get("fiyat").toString());

        }
        jLabel_toplam.setText(toplam + "");
        toplam = 0;
        jTable1.setModel(dt);

        ButtonColumn buttonColumn = new ButtonColumn(jTable1, delete, 7);
        buttonColumn.setMnemonic(KeyEvent.VK_D);
    }

    Action delete = new AbstractAction() {
        public void actionPerformed(ActionEvent e) {

            int cevap = JOptionPane.showConfirmDialog(rootPane, "emin misiniz?", "sil", JOptionPane.YES_NO_OPTION);
            if (cevap == 0) {
                int sil = Integer.valueOf(e.getActionCommand());
                arr.get(sil).get("urunId");
                DB db = new DB();
                sorgu = "update urunler set stok= stok+1 where urunID='" + arr.get(sil).get("urunId") + "'";
                db.genelQuery(sorgu);
                db.kapat();

                arr.remove(sil);
                tableYaz();
            }

        }
    };

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new satis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKrediKart;
    private javax.swing.JButton btnNakit;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_referans;
    private javax.swing.JLabel jLabel_toplam;
    private javax.swing.JLabel jLabel_urunAdi;
    private javax.swing.JLabel jLabel_urunFiyati;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_barkodNo;
    private javax.swing.JTextField jTextField_nakit;
    private javax.swing.JTextField jTextField_paraUstu;
    private javax.swing.JLabel lblAdSoyad;
    // End of variables declaration//GEN-END:variables

}
