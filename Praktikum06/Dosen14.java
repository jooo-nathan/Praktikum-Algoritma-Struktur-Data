package Praktikum06;
import java.util.Scanner;

public class Dosen14 {
    String kode, nama, jenisKelamin;
    int usia;

    Scanner sc = new Scanner(System.in);

    Dosen14() {

    }

    Dosen14(String kd, String name, String jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(int i) {
        System.out.println("-----------------------------");
        System.out.println("Data dosen ke-" + (i+1));

        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis kelamin   : " + jenisKelamin);
        System.out.println("Usia            : " + usia);
    }


}
