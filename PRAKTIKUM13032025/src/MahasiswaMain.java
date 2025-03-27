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

public class MahasiswaMain {

    public static void main(String[] args) {
        String namaa;
        int nimm;
        int tugass;
        int utss;
        int uass;
        int quizz;

        Scanner in = new Scanner(System.in);

        // Meminta input variabel
        System.out.print("Nama Lengkap = ");
        namaa = in.nextLine();
        System.out.print("NIM = ");
        nimm = in.nextInt();
        System.out.print("Tugas = ");
        tugass = in.nextInt();
        System.out.print("UTS = ");
        utss = in.nextInt();
        System.out.print("UAS = ");
        uass = in.nextInt();
        System.out.print("Quiz = ");
        quizz = in.nextInt();  // Corrected this line to assign value to quizz

        // Membuat objek Mahasiswa
        Mahasiswa nilai1 = new Mahasiswa(namaa, nimm, tugass, uass, utss, quizz);

        System.out.println("\n--Nilai Akhir anda--");

        // Menampilkan informasi mahasiswa
        System.out.println("-----Informasi Anda-----");
        nilai1.TampilData();

        // Menghitung dan menampilkan nilai akhir
        System.out.println("-----Nilai Akhir-----");
        nilai1.NilaiAkhir();

        // Mengkonversi nilai akhir ke huruf
        System.out.println("-----Konversi Nilai-----");
        nilai1.KonversiNilai((int) nilai1.NilaiAkhir); // Menggunakan nilai akhir yang sudah dihitung
    }
}