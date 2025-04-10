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

public class TestBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Tambah Nasabah dengan Tabungan");
            System.out.println("3. Tampilkan Jumlah Nasabah");
            System.out.println("4. Cari Nasabah");
            System.out.println("5. Tampilkan Semua Nasabah");
            System.out.println("6. Simpan Uang");
            System.out.println("7. Ambil Uang");
            System.out.println("8. Keluar");
            System.out.print("Pilih opsi (1-8): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama awal nasabah: ");
                    String namaAwal = scanner.nextLine();
                    System.out.print("Masukkan nama akhir nasabah: ");
                    String namaAkhir = scanner.nextLine();
                    bank.tambahNasabah(namaAwal, namaAkhir);
                    System.out.println("Nasabah berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.print("Masukkan nama awal nasabah: ");
                    String namaAwalTabungan = scanner.nextLine();
                    System.out.print("Masukkan nama akhir nasabah: ");
                    String namaAkhirTabungan = scanner.nextLine();
                    System.out.print("Masukkan saldo awal untuk tabungan: ");
                    int saldoAwal = scanner.nextInt();
                    Tabungan tabungan = new Tabungan(saldoAwal);
                    bank.tambahNasabah(namaAwalTabungan, namaAkhirTabungan, tabungan);
                    System.out.println("Nasabah dengan tabungan berhasil ditambahkan.");
                    break;

                case 3:
                    System.out.println("Jumlah nasabah saat ini: " + bank.getJumlahNasabah());
                    break;

                case 4:
                    System.out.print("Masukkan nama awal nasabah yang dicari: ");
                    String namaAwalCari = scanner.nextLine();
                    System.out.print("Masukkan nama akhir nasabah yang dicari: ");
                    String namaAkhirCari = scanner.nextLine();
                    int indeks = bank.searchNasabah(namaAwalCari, namaAkhirCari);
                    if (indeks != -1) {
                        System.out.println("Nasabah ditemukan: " + bank.getNasabah(indeks));
                    } else {
                        System.out.println("Nasabah tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Daftar Nasabah:");
                    for (int i = 0; i < bank.getJumlahNasabah(); i++) {
                        System.out.println(bank.getNasabah(i));
                    }
                    break;

                case 6:
                    System.out.print("Masukkan nama awal nasabah untuk menyimpan uang: ");
                    String namaAwalSimpan = scanner.nextLine();
                    System.out.print("Masukkan nama akhir nasabah untuk menyimpan uang: ");
                    String namaAkhirSimpan = scanner.nextLine();
                    int indeksSimpan = bank.searchNasabah(namaAwalSimpan, namaAkhirSimpan);
                    if (indeksSimpan != -1) {
                        System.out.print("Masukkan jumlah uang yang ingin disimpan: ");
                        int jumlahSimpan = scanner.nextInt();
                        bank.getNasabah(indeksSimpan).getTabungan().simpanUang(jumlahSimpan);
                        System.out.println("Uang berhasil disimpan.");
                    } else {
                        System.out.println("Nasabah tidak ditemukan.");
                    }
                    break;

                case 7:
                    System.out.print("Masukkan nama awal nasabah untuk mengambil uang: ");
                    String namaAwalAmbil = scanner.nextLine();
                    System.out.print("Masukkan nama akhir nasabah untuk mengambil uang: ");
                    String namaAkhirAmbil = scanner.nextLine();
                    int indeksAmbil = bank.searchNasabah(namaAwalAmbil, namaAkhirAmbil);
                    if (indeksAmbil != -1) {
                        System.out.print("Masukkan jumlah uang yang ingin diambil: ");
                        int jumlahAmbil = scanner.nextInt();
                        if (bank.getNasabah(indeksAmbil).getTabungan().ambilUang(jumlahAmbil)) {
                            System.out.println("Uang berhasil diambil.");
                        } else {
                            System.out.println("Saldo tidak cukup untuk mengambil uang.");
                        }
                    } else {
                        System.out.println("Nasabah tidak ditemukan.");
                    }
                    break;

                case 8:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 8);

        scanner.close(); 
    }
}