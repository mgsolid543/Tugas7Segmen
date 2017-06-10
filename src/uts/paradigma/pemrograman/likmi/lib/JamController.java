package uts.paradigma.pemrograman.likmi.lib;

import java.time.LocalTime;

/**
 *
 * @author irpan
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
