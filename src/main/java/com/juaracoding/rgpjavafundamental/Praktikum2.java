package com.juaracoding.rgpjavafundamental;


/*
IntelliJ IDEA 2024.3.1 (Community Edition)
Build #IC-243.22562.145, built on December 9, 2024
@Author REKSA GAMA P
Java Developer
Created on 17/12/2024 21:35
@Last Modified 17/12/2024 21:35
Version 1.0
*/
import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char continueInput;

        do {
            // Variabel untuk menyimpan total dan jumlah angka
            double total = 0;
            int countAngka = 0;

            System.out.println("\nMasukkan angka-angka, ketik karakter selain angka untuk menghentikan");

            while (true) {
                try {
                    System.out.print("Masukkan Angka ke-" + (countAngka + 1) + " : ");
                    String inputAngka = scanner.nextLine(); // Membaca input sebagai string

                    // Coba konversi input menjadi angka (double)
                    double angka = Double.parseDouble(inputAngka);
                    total = total + angka;
                    countAngka++;
                } catch (NumberFormatException e) {
                    // Jika input bukan angka, beri tahu pengguna dan keluar dari loop
                    System.out.println("Input berhenti. Karakter selain angka telah diinput.");
                    break;
                }
            }

            // Menampilkan rata-rata jika ada angka yang dimasukkan
            if (countAngka > 0) {
                double averageTotal = total / countAngka;
                System.out.println("\nRata-rata : " + averageTotal);
            } else {
                System.out.println("\nTidak ada angka yang dimasukkan.");
            }

            // Tanya apakah pengguna ingin mencoba percobaan lain
            System.out.print("\nApakah Anda ingin memasukkan percobaan lain ? (Y/N): ");
            continueInput = scanner.nextLine().charAt(0);
        } while (continueInput == 'Y' || continueInput == 'y'); // Cek apakah pengguna ingin lanjutkan percakapan

        System.out.println("\nTerima kasih! Program selesai.");

        // Menutup scanner untuk menghindari memory leak
        scanner.close();
    }
}
