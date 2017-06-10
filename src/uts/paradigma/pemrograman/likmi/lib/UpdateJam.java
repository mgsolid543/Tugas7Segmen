package uts.paradigma.pemrograman.likmi.lib;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author irpan
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
