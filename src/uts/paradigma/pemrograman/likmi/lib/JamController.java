package uts.paradigma.pemrograman.likmi.lib;

import java.time.LocalTime;

/**
 *
 * @author Kelompok 2:
 * 1. Irpan Budiana                 (2016210069)    irpan.budiana@gmail.com
 * 2. Valeri Widyaningtyas          (2016210046)    276valeri@gmail.com
 * 3. Evans Melisa Dumat            (2016210053)    evansdumat@gmail.com
 * 4. Syahrir Lubis                 (2016210052)    syahrirlubis81@gmail.com
 * 5. Basith Rasyid Slamet Riahja   (2016210057)    basitrasyid7@gmail.com
 */

public class JamController {    
    public int getJam() {
        return LocalTime.now().getHour();
    }
    
    public int getMenit() {
        return LocalTime.now().getMinute();
    }
    
    public int getDetik() {
        return LocalTime.now().getSecond();
    }
}
