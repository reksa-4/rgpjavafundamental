package com.juaracoding.rgpjavafundamental;


/*
IntelliJ IDEA 2024.3.1 (Community Edition)
Build #IC-243.22562.145, built on December 9, 2024
@Author REKSA GAMA P
Java Developer
Created on 14/12/2024 9:22
@Last Modified 14/12/2024 9:22
Version 1.0
*/

import java.util.Scanner;

// Output dari input Tid4k $@ma adalah 268

public class Praktikum1 {
    public static void main(String[] args) {

        // Membuat scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan kata atau kalimat
        System.out.print("Masukkan Kata : ");
        String inputKata = scanner.nextLine();  // Membaca input dari pengguna

        // Variabel untuk menyimpan total hasil penjumlahan nilai ASCII
        int outputTotalASCII= 0;

        // Proses untuk setiap karakter dalam input
        for (int i = 0; i < inputKata.length(); i++) {
            char c = inputKata.charAt(i);  // Mengambil karakter satu per satu

            // Menampilkan karakter dan nilai ASCII-nya
            // System.out.println("Karakter : " + c + " - ASCII : " + (int)c);

            //Menambahkan nilai ASCII jika karakter adalah nilai ASCII di rentang 32 sampai 47
            if ((int)c >= 32 && (int)c <= 47){
                outputTotalASCII = outputTotalASCII + (int)c;
            }

            // Menambahkan nilai ASCII jika karakter adalah angka
            if (Character.isDigit(c)) {
                outputTotalASCII = outputTotalASCII + (int)c;
            }

            //Menambahkan nilai ASCII jika karakter adalah nilai ASCII di rentang 58 sampai 64
            if ((int)c >= 58 && (int)c <= 64){
                outputTotalASCII = outputTotalASCII + (int)c;
            }

            // Menambahkan nilai ASCII jika karakter adalah huruf besar
            if (Character.isUpperCase(c)) {
                outputTotalASCII = outputTotalASCII + (int)c;
            }
        }

        // Menampilkan output total penjumlahan nilai ASCII yang sesuai dengan kondisi yang telah dibuat
        System.out.println("Hasil : " + outputTotalASCII);

        // Menutup scanner untuk menghindari memory leak
        scanner.close();

    }
}
