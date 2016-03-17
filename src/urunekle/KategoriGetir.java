
package urunekle;

import giris.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KategoriGetir {
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
}
