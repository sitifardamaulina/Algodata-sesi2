/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelamaris;

/**
 *
 * @author FIKRI HAIKAL ALBI
 */
public class HotelAmaris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] Kamar  = {
            {"1", "2", "3", "4", "X"},
            {"1", "2", "3", "4", "5"},
            {"1", "2", "3", "4", "5"},
            {"1", "2", "3", "X", "5"},
        };
        
        int kamarKosong = 0;
        for (int i = 0; i < Kamar.length; i++) {
            for (int j = 0; j < Kamar[i].length; j++) {
                if (Kamar[i][j] == "X") {
                    System.out.println(" Tamu berada di Lantai " + (i+1) + " Kamar " + (j + 1) );
                } else {
                  kamarKosong += 1;
            }
        }
        
        System.out.println("");
        System.out.println("Jumlah kamar yang tersedia ada " + kamarKosong);
    }
    
}
   

