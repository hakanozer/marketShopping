
package urunekle;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TxtDenetim {
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
}
