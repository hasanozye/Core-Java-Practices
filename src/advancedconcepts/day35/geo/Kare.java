package advancedconcepts.day35.geo;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Kare extends JComponent implements Sekil {

    private int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
        setSize(kenar, kenar);
        setBorder(new LineBorder(Color.BLUE, 2));
    }


    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

    @Override
    public int getAlan() {
        return kenar * kenar;
    }

    @Override
    public int getCevre() {
        return 4 * kenar;
    }
}
