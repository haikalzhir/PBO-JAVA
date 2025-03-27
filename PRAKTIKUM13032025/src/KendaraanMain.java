/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asaaa
 */
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class KendaraanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String jns;
        int thn;
        String wrn;
        int v;
        
        Scanner in=new Scanner(System.in);
        ///meminta input variabel
        System.out.print("Masukkan jenis kendaraan = ");
        jns = in.nextLine();
        System.out.print("Masukkan Tahun Keluaran = ");
        thn = in.nextInt();
        in.nextLine();///agar yangn selanjutnya terbaca
        System.out.print("Masukkan Warna Kendaraan = ");
        wrn = in.nextLine();
        
        //inputkan dat akecepatan max kendaraan
        System.out.print("Masukkan data kecepatan max per km kendaraan anda ");
        v=in.nextInt();
   
        //deklarasi objek
        Kendaraan mobil1 = new Kendaraan(jns,thn, wrn);
        System.out.println("\n--informasi kendaraan 1--");
        mobil1.TampilData();
        
        mobil1.TipeKendaraan(v);
        
   
    }
    
}
