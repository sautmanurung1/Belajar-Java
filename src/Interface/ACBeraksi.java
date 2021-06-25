/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author NITRO
 */
public class ACBeraksi {
    public static void main(String[]args){
        AC acKamar = new AC();
        System.out.println("Status AC Saat Ini = MATI");
        
        acKamar.hidupkan();
        acKamar.matikan();
        acKamar.dinginkan();
        acKamar.panaskan();
    }
}
