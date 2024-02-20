package com.modul1;
import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("## Program Java Biodata Mahasiswa ##");
        System.out.println("======================================");
        System.out.println();

        String nama, jenis_kelamin;
        int umur,tahun_sekarang,tahun_lahir;

        //inisialisasi input
        Scanner objInput = new Scanner(System.in);

        // inisialsisasi kalendar
        Calendar kalender = Calendar.getInstance();

        // tampung ke variabel
        tahun_sekarang = kalender.get(Calendar.YEAR);

        //membuat menu sederhana
        System.out.print("Nama Mahasiswa: ");
        nama = objInput.nextLine();
        System.out.print("Jenis Kelamin (L/P): ");
        jenis_kelamin = input.nextLine();
        System.out.print("Masukkan tanggal lahir (dd/mm/yyyy): ");
        tahun_lahir = input.nextInt();

        //rumus
        umur = tahun_sekarang - tahun_lahir;

        //output
        System.out.println("Nama : " + nama );
        System.out.println("Jenis Kelamin :" + jenis_kelamin);
        System.out.println("Umur Anda Adalah : " + umur + " Tahun");

    }
}

