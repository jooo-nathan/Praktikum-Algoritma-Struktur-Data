package Praktikum03;
import java.util.Scanner;

public class Dosen14 {
    String nama, kode, jenisKelamin;
    int usia;

    static Scanner sc = new Scanner(System.in);

    Dosen14() {

    }

    Dosen14(String nama, String kode, String jenisKelamin, int usia) {
        this.nama = nama;
        this.kode = kode;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void addData(int index) {
        System.out.println("Masukkan data dosen ke-" + (index + 1));
        System.out.print("Kode          : ");
        kode = sc.nextLine();
        System.out.print("Nama          : ");
        nama = sc.nextLine();
        System.out.print("Jenis kelamin : ");
        jenisKelamin = sc.nextLine();
        System.out.print("Usia          : ");
        usia = sc.nextInt();
        System.out.println("--------------------------\n");
        sc.nextLine();
    }

    void showData(int index) {
        System.out.println("Data dosen ke-" + (index + 1));
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis kelamin : " + jenisKelamin);
        System.out.println("Usia          : " + usia);
        System.out.println("--------------------------\n");
    }

}
