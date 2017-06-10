
package uts.paradigma.pemrograman.likmi.lib;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author irpan
 */
public class Display extends JFrame {

    private Segmen[] segmen = new Segmen[8];

    public Display() {
        this.setName("Frame_Tampilan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(Konstanta.ICON_URL).getImage());
        setTitle(Konstanta.JUDUL_APP);
        setSize(880, 320);
        setLocation(800, 600);
        setResizable(false);
        getContentPane().setBackground(Color.DARK_GRAY);
        FlowLayout layout = new FlowLayout();
        layout.setHgap(8);
        layout.setVgap(0);
        layout.setAlignment(FlowLayout.LEFT);
        setLayout(layout);
        setAlwaysOnTop(true);
        Dimension dim = new Dimension();

        for (int i = 0; i < 6; i++) {
            dim.setSize(getSize().width / 6.5f, 300);
            segmen[i] = new Segmen(dim, Color.LIGHT_GRAY);
            segmen[i].setName("Segmen #" + i);
            segmen[i].setPreferredSize(dim);
            segmen[i].setLayout(null);

            for (int j = 0; j < 7; j++) {
                segmen[i].getPanelSeg(j).setBackground((i < 2) ? Color.RED : (i < 4) ? Color.CYAN : (i < 6) ? Color.GREEN : Color.WHITE);
                segmen[i].getPanelSeg(j).setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
                segmen[i].add(segmen[i].getPanelSeg(j));
            }
            getContentPane().add(segmen[i]);
        }
    }

    public void updateJam(int jam) // 0 & 1
    {
        for (int i = 0; i < 7; i++) {
            segmen[0].getPanelSeg(i).setVisible((Konstanta.BINERJAM[Konstanta.getDigitKeN(jam, 10, 2)][i] == true) ? true : false);
            segmen[1].getPanelSeg(i).setVisible((Konstanta.BINERJAM[Konstanta.getDigitKeN(jam, 10, 1)][i] == true) ? true : false);
        }
    }

    public void updateMenit(int menit) // 2 & 3
    {
        for (int i = 0; i < 7; i++) {
            segmen[2].getPanelSeg(i).setVisible((Konstanta.BINERJAM[Konstanta.getDigitKeN(menit, 10, 2)][i] == true) ? true : false);
            segmen[3].getPanelSeg(i).setVisible((Konstanta.BINERJAM[Konstanta.getDigitKeN(menit, 10, 1)][i] == true) ? true : false);
        }
    }

    public void updateDetik(int detik) // 4 & 5
    {
        for (int i = 0; i < 7; i++) {
            segmen[4].getPanelSeg(i).setVisible((Konstanta.BINERJAM[Konstanta.getDigitKeN(detik, 10, 2)][i] == true) ? true : false);
            segmen[5].getPanelSeg(i).setVisible((Konstanta.BINERJAM[Konstanta.getDigitKeN(detik, 10, 1)][i] == true) ? true : false);
        }
    }
}
