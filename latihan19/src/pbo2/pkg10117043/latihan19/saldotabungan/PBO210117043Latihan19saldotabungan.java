/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117043.latihan19.saldotabungan;

/**
 *NAMA                 : Yusrizal Falahan
 * Kelas                : PBO-2 
 * NIM                  : 10117043
 * Deskripsi Program    : Program ini berisi perintah untuk menghitung 
 *                        saldo tabungan 
 * @author Acer
 */
public class PBO210117043Latihan19saldotabungan{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int saldo, bulan;
        double bunga;

        saldo = 2500000;
        bulan = 0;
        while (bulan < 6) {
            bulan = bulan + 1;
            saldo = (int) (saldo + (saldo * 0.15));
            String matauang = String.format("Rp.%,3d", saldo).replaceAll(",", ".");

            System.out.printf("saldo di bulan ke-" + bulan + "%s%n", matauang);

        }

    }

}
