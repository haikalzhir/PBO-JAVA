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
import projek27032025.PersegiPanjang;

public class TestPersegiPanjang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Kondisi awal sebelum pembuatan objek");
        System.out.println("Jumlah persegi panjang = " + PersegiPanjang.getJumlahObjek());
        
        PersegiPanjang pp1 = new PersegiPanjang();
        System.out.println("Panjang awal = " + pp1.getPanjang());
        System.out.println("Lebar awal = " + pp1.getLebar());
        
        System.out.println("Luas = " + pp1.getLuas());
        System.out.println("Keliling = " + pp1.getKeliling());
        System.out.println("Jumlah persegi panjang saat ini = " + PersegiPanjang.getJumlahObjek());
        
        PersegiPanjang pp2 = new PersegiPanjang();
        System.out.print("Masukkan panjang untuk persegi panjang kedua: ");
        pp2.setPanjang(in.nextInt());
        System.out.print("Masukkan lebar untuk persegi panjang kedua: ");
        pp2.setLebar(in.nextInt());
        
        System.out.println("Luas persegi panjang kedua = " + pp2.getLuas());
        System.out.println("Keliling persegi panjang kedua = " + pp2.getKeliling());
        System.out.println("Jumlah persegi panjang saat ini = " + PersegiPanjang.getJumlahObjek());
        
        in.close(); 
    }
}

