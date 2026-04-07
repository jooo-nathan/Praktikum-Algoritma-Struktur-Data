package CaseMethod1;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 1;

        Mahasiswa mhs[] = new Mahasiswa[3];
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();
        }

        mhs[0].nim = "22001";
        mhs[0].nama = "Andi";
        mhs[0].prodi = "Teknik Informatika";

        mhs[1].nim = "22002";
        mhs[1].nama = "Budi";
        mhs[1].prodi = "Teknik Informatika";
        
        mhs[2].nim = "22003";
        mhs[2].nama = "Citra";
        mhs[2].prodi = "Sistem Informasi Bisnis";


        Buku buku[] = new Buku[4];
        for (int i = 0; i < buku.length; i++) {
            buku[i] = new Buku();
        }

        buku[0].kodeBuku = "B001";
        buku[0].judul = "Algoritma";
        buku[0].tahunTerbit = 2020;

        buku[1].kodeBuku = "B002";
        buku[1].judul = "Basis Data";
        buku[1].tahunTerbit = 2019;
        
        buku[2].kodeBuku = "B003";
        buku[2].judul = "Pemrograman";
        buku[2].tahunTerbit = 2021;

        buku[3].kodeBuku = "B004";
        buku[3].judul = "Fisika";
        buku[3].tahunTerbit = 2024;


        Peminjaman pinjam[] = new Peminjaman[5];
        for (int i = 0; i < pinjam.length; i++) {
            pinjam[i] = new Peminjaman();
        }

        pinjam[0].mhs = mhs[0];
        pinjam[0].buku = buku[0];
        pinjam[0].lamaPinjam = 7;

        pinjam[1].mhs = mhs[1];
        pinjam[1].buku = buku[1];
        pinjam[1].lamaPinjam = 3;

        pinjam[2].mhs = mhs[2];
        pinjam[2].buku = buku[2];
        pinjam[2].lamaPinjam = 10;

        pinjam[3].mhs = mhs[2];
        pinjam[3].buku = buku[2];
        pinjam[3].lamaPinjam = 6;

        pinjam[4].mhs = mhs[0];
        pinjam[4].buku = buku[0];
        pinjam[4].lamaPinjam = 4;

        do {
        System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===\n");

        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari Berdasarkan NIM");
        System.out.println("0. Keluar\n");

        System.out.print("Masukkan pilihan : ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("\nDaftar Mahasiswa :");
            for (int i = 0; i < mhs.length; i++) {
                mhs[i].tampilMahasiswa();
            }
        }
        else if (choice == 2) {
            System.out.println("\nDaftar Buku :");
            for (int i = 0; i < buku.length; i++) {
                buku[i].tampilBuku();
            }
        }
        else if (choice == 3) {
            System.out.println("\nData Peminjaman :");
            for (int i = 0; i < pinjam.length; i++) {
                pinjam[i].tampilPeminjaman();
            }
        }
        else if (choice == 4) {
            System.out.println("Setelah diurutkan (Denda terbesar) :");

            
            for (int i = 0; i < pinjam.length; i++) {
                pinjam[i].tampilPeminjaman();
            }
        }
        else if (choice == 5) {

        }
        else if (choice == 0) {
            System.out.println("\nTerima kasih telah menggunakan layanan kami!\n");
            break;
        }
        else {
            System.out.println("\nPilihan anda tidak ada dalam menu. Silakan masukkan ulang.\n");
        }


        } while (choice != 0);
    }
    
        
}
