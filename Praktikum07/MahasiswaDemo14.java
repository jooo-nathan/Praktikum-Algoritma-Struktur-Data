package Praktikum07;
import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14();
        
        Scanner sc = new Scanner(System.in);

        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            
            System.out.print("NIM     : ");
            String nim = sc.nextLine();

            System.out.print("Nama    : ");
            String nama = sc.nextLine();

            System.out.print("Kelas   : ");
            String kelas = sc.nextLine();

            System.out.print("IPK     : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);

            System.out.println("------------------------------");
            list.tambah(new Mahasiswa14(nim, nama, kelas, ipk));

        }

        list.tampil();

        System.out.println("\n--------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------");
        System.out.println("\nIPK mahasiswa yang dicari");
        System.out.print("Masukkan IPK : ");
        double cari = sc.nextDouble();

        System.out.println("\n--------------------------------");
        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);


        // MELAKUKAN PENCARIAN DATA BINARY
        System.out.println("\n--------------------------------");
        System.out.println("Menggunakan binary searching");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
    
}
