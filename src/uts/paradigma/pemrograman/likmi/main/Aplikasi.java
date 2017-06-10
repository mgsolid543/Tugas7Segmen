/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.paradigma.pemrograman.likmi.main;

import uts.paradigma.pemrograman.likmi.lib.Display;
import uts.paradigma.pemrograman.likmi.lib.UpdateJam;

/**
 *
 * @author irpan
 */
public class Aplikasi {
    public static void main(String[] args) {
        Display display = new Display();
        display.setVisible(true);
        
        @SuppressWarnings("unused")
        UpdateJam updateJam = new UpdateJam(display);
    }
}
