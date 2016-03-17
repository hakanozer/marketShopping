
package raporlama;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;

public class rapor {
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
}
