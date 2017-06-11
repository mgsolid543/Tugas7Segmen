package uts.paradigma.pemrograman.likmi.lib;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Kelompok 2:
 * 1. Irpan Budiana                 (2016210069)    irpan.budiana@gmail.com
 * 2. Valeri Widyaningtyas          (2016210046)    276valeri@gmail.com
 * 3. Evans Melisa Dumat            (2016210053)    evansdumat@gmail.com
 * 4. Syahrir Lubis                 (2016210052)    syahrirlubis81@gmail.com
 * 5. Basith Rasyid Slamet Riahja   (2016210057)    basitrasyid7@gmail.com
 */
public class UpdateJam {

    private Display display;
    private Timer t;
    private JamController cont;

    public UpdateJam(Display _display) {
        this.display = _display;
        this.cont = new JamController();
        
        mulaiTimer();
    }

    private void mulaiTimer() {
        t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                display.updateJam(cont.getJam());
                display.updateMenit(cont.getMenit());
                display.updateDetik(cont.getDetik());
            }
        }, 0, 1000);
    }

}
