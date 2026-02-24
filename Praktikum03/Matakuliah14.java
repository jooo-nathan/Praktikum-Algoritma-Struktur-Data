package Praktikum03;
import java.util.Scanner;

public class Matakuliah14 {
    public String kode, nama, dummy;
    public int sks, jumlahJam;

    public Scanner sc = new Scanner(System.in);

    void tambahData(int index) {

        System.out.println("\nMasukkan Data Matakuliah ke-" + (index + 1));
        System.out.print("Kode       : ");
        kode = sc.nextLine();

        System.out.print("Nama       : ");
        nama = sc.nextLine();

        System.out.print("SKS        : ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);

        System.out.print("Jumlah Jam : ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);
        
        System.out.println("-------------------------------");
    }

    void cetakInfo(int index) {
        System.out.println("\nData Matakuliah ke-" + (index + 1));
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("-------------------------------");
    }
}

