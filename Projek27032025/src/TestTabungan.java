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

public class TestTabungan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membuat objek Tabungan dengan saldo awal
        System.out.print("Masukkan saldo awal: ");
        int saldoAwal = scanner.nextInt();
        Tabungan tabungan = new Tabungan(saldoAwal);
        
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Saldo");
            System.out.println("2. Simpan Uang");
            System.out.println("3. Ambil Uang");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1-4): ");
            pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println(tabungan);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah uang yang ingin disimpan: ");
                    int jumlahSimpan = scanner.nextInt();
                    tabungan.simpanUang(jumlahSimpan);
                    System.out.println("Uang berhasil disimpan.");
                    break;
                case 3:
                    System.out.print("Masukkan jumlah uang yang ingin diambil: ");
                    int jumlahAmbil = scanner.nextInt();
                    if (tabungan.ambilUang(jumlahAmbil)) {
                        System.out.println("Uang berhasil diambil.");
                    } else {
                        System.out.println("Saldo tidak cukup untuk menarik uang.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                   break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
        
        scanner.close(); 
    }
}