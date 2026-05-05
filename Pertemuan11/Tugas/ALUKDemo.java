package Pertemuan11.Tugas;
import java.util.Scanner;

public class ALUKDemo {

    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("\nMenu :");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Panggil Antrian");
        System.out.println("3. Tampilkan Antrian Terdepan");
        System.out.println("4. Tampilkan Antrian Terakhir");
        System.out.println("5. Tampilkan Jumlah Mahasiswa yang Antri");
        System.out.println("6. Kosongkan Antrian");
        System.out.println("0. Keluar\n");
    }

    static MahasiswaALUK getData() {
        System.out.println("\nInput Data Diri");

        System.out.print("NIM       : ");
        String nim = sc.nextLine();
        System.out.print("Nama      : ");
        String nama = sc.nextLine();
        System.out.print("Kelas     : ");
        String kelas = sc.nextLine();
        System.out.print("Prodi     : ");
        String prodi = sc.nextLine();

        MahasiswaALUK mhs = new MahasiswaALUK(nim, nama, kelas, prodi);

        return mhs;
    }

    public static void main(String[] args) {
        System.out.println("\n=== PROGRAM ANTRIAN LAYANAN UNIT KEMAHASISWAAN ===");

        int pilihan;
        AntrianLayananUK aluk = new AntrianLayananUK();

        do {
            menu();
            System.out.print("Masukkan pilihan : ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    sc.nextLine();
                    aluk.addQueue(getData());
                    break;

                case 2:
                    aluk.callQueue();
                    break;

                case 3:
                    aluk.showFirst();
                    break;

                case 4:
                    aluk.showLast();
                    break;

                case 5:
                    aluk.showCount();
                    break;

                case 6:
                    aluk.clear();
                    break;

                case 0:
                    System.out.println("\nTerima kasih sudah menggunakan layanan kami\n");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Masukkan ulang.\n");
                    break;
            }
        } while (pilihan != 0);

    }
}