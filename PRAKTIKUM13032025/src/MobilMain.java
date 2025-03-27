/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asaaa
 */
public class MobilMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mobil mobil1 =new mobil ();
        mobil1.merk = "Civic";
        mobil1.plat = "BA 111 AL";
        mobil1.tahun = 2006;
        mobil1.warna = "Hitam";
        
        System.out.println("Merk mobil Saya = "+mobil1.merk);
        System.out.println("Nomor plat mobil saya "+mobil1.plat);
        System.out.println("Tahun Keluaran = "+mobil1.tahun);
        System.out.println("Warna Mobil "+mobil1.warna);
        
        mobil1.mobilAktif();//tanpa return
        System.out.println(mobil1.Suaramobil1());//menggunakan retrurn
    
        
    }
    
}
