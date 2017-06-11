package uts.paradigma.pemrograman.likmi.lib;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 *
 * @author Kelompok 2:
 * 1. Irpan Budiana                 (2016210069)    irpan.budiana@gmail.com
 * 2. Valeri Widyaningtyas          (2016210046)    276valeri@gmail.com
 * 3. Evans Melisa Dumat            (2016210053)    evansdumat@gmail.com
 * 4. Syahrir Lubis                 (2016210052)    syahrirlubis81@gmail.com
 * 5. Basith Rasyid Slamet Riahja   (2016210057)    basitrasyid7@gmail.com
 */
public class Segmen extends JPanel {

    private Rectangle[] kotak = {
        new Rectangle(10, 10, 115, 10),
        new Rectangle(125, 20, 10, 115),
        new Rectangle(125, 145, 10, 115),
        new Rectangle(10, 260, 115, 10),
        new Rectangle(0, 145, 10, 115),
        new Rectangle(0, 20, 10, 115),
        new Rectangle(10, 135, 115, 10)
    };

    private JPanel[] panelSegmen;

    public JPanel getPanelSeg(int index) {
        return this.panelSegmen[index];
    }

    public Segmen() {
        super();
        initSegment(new Dimension(80, 80), Color.DARK_GRAY);
    }

    public Segmen(Dimension dim, Color col) {
        super();
        initSegment(dim, col);
    }

    private void initSegment(Dimension dim, Color col) {
        this.setName("SegmenKepala");
        this.setBackground(Color.DARK_GRAY);
        this.setSize(dim);
        this.panelSegmen = new JPanel[7];

        for (int j = 0; j < 7; j++) {
            this.panelSegmen[j] = new JPanel();
            this.panelSegmen[j].setName("BagianSegmen #" + j);
            this.panelSegmen[j].setToolTipText(this.panelSegmen[j].getName());
            this.panelSegmen[j].setBounds(kotak[j]);
            this.panelSegmen[j].setLayout(null);
        }

    }

    public Rectangle getkotak(int index) {
        return kotak[index];
    }
}
