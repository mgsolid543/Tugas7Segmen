package uts.paradigma.pemrograman.likmi.main;

import uts.paradigma.pemrograman.likmi.lib.Display;
import uts.paradigma.pemrograman.likmi.lib.UpdateJam;

/**
 * TUGAS 
 * Ujian Tengah Semester 
 * Mata Kuliah : Paradigma Pemrograman
 * 
 * Dosen Pengajar : Dr. Ana Hadiana
 * 
 * Oleh:
 * 
 * @author Kelompok 2:
 * 1. Irpan Budiana                 (2016210069)    irpan.budiana@gmail.com
 * 2. Valeri Widyaningtyas          (2016210046)    276valeri@gmail.com
 * 3. Evans Melisa Dumat            (2016210053)    evansdumat@gmail.com
 * 4. Syahrir Lubis                 (2016210052)    syahrirlubis81@gmail.com
 * 5. Basith Rasyid Slamet Riahja   (2016210057)    basitrasyid7@gmail.com
 * 
 */
public class Aplikasi {
    public static void main(String[] args) {
        Display display = new Display();
        display.setVisible(true);
        
        @SuppressWarnings("unused")
        UpdateJam updateJam = new UpdateJam(display);
    }
}
