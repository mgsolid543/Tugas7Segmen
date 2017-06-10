
package uts.paradigma.pemrograman.likmi.lib;

/**
 *
 * @author irpan
 */
public class Konstanta {

    static final String JUDUL_APP = "TUGAS UTS - Jam Digital 7-Segmen - MATA KULIAH PARADIGMA PEMROGRAMAN";
    static final String ICON_URL = "clock.png";
    
    public static final boolean[][] BINERJAM
            = {
                new boolean[]{true, true, true, true, true, true, false},       // angka 0
                new boolean[]{false, true, true, false, false, false, false},   // angka 1	
                new boolean[]{true, true, false, true, true, false, true},      // angka 2
                new boolean[]{true, true, true, true, false, false, true},      // angka 3
                new boolean[]{false, true, true, false, false, true, true},     // angka 4
                new boolean[]{true, false, true, true, false, true, true},      // angka 5
                new boolean[]{true, false, true, true, true, true, true},       // angka 6
                new boolean[]{true, true, true, false, false, false, false},    // angka 7
                new boolean[]{true, true, true, true, true, true, true},        // angka 8
                new boolean[]{true, true, true, true, false, true, true}        // angka 9
            };

    public static int getDigitKeN(int angka, int basis, int n) {
        return (int) ((angka / Math.pow(basis, n - 1)) % basis);
    }

}
