/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbolatihan2;

/**
 *
 * @author fendy
 */
public class Main {
    public static void main(String[] args) {
    
        

        Manusia m = new Manusia();
        m.setRambut("Hitam");
        System.out.println(m.getRambut());

        PesawatTelepon pt = new PesawatTelepon();
        pt.setGagang_telepon(true);
        System.out.println(pt.getGagang_telepon());
    }

}
