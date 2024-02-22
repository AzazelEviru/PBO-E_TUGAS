package com.modul1;
import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class Datadiri {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("## Program Java Biodata Mahasiswa ##");
        System.out.println("======================================");
        System.out.println();

        String nama,nim;

        //inisialisasi input
        Scanner objInput = new Scanner(System.in);

        //membuat input nama mahasiswa
        System.out.print("Nama Mahasiswa: ");
        nama = objInput.nextLine();

        // Input jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        String jenisKelaminInput = objInput.nextLine();

        // Validasi jenis kelamin
        if (!jenisKelaminInput.equalsIgnoreCase("P") && !jenisKelaminInput.equalsIgnoreCase("L")) {
            System.out.println("Jenis kelamin tidak valid.");
            return;
        }

        // Konversi jenis kelamin menjadi teks lengkap
        String jenisKelamin = jenisKelaminInput.equalsIgnoreCase("P") ? "Perempuan" : "Laki-laki";

        System.out.print("Masukkan NIM Anda : ");
        nim = objInput.nextLine();
        System.out.print("Masukkan tanggal lahir [tahun-bulan-tanggal] (yyyy-MM-dd): ");
        String tanggalLahirString = input.nextLine();
        LocalDate kelahiran = LocalDate.parse(tanggalLahirString);

        //  umur
        LocalDate saat_ini = LocalDate.now();
        Period periode = Period.between(kelahiran, saat_ini);
        int tahun = periode.getYears();
        int bulan = periode.getMonths();
        int hari = periode.getDays();

        //output
        System.out.println();
        System.out.println("//Output");
        System.out.println("Nama : " + nama );
        System.out.println("Jenis Kelamin :" + jenisKelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahirString);
        System.out.println("Umur: " + tahun + " tahun " + bulan + " bulan " + hari + " hari");
        System.out.println("NIM anda Adalah : " + nim);

    }
}

