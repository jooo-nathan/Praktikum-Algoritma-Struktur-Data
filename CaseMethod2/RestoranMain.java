package CaseMethod2;
import java.util.Scanner;

public class RestoranMain {

    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("\n===============================");
        System.out.println("| SISTEM ANTRIAN ROYAL DELISH |");
        System.out.println("===============================\n");

        System.out.println("| Pilihan fitur : ");
        System.out.println("| 1. Tambah Antrian");
        System.out.println("| 2. Cetak Antrian");
        System.out.println("| 3. Hapus Antrian dan Pesan");
        System.out.println("| 4. Laporan Pesanan");
        System.out.println("| 0. Keluar\n");
    }

    static Pembeli inputAntrian(int idx) {
        System.out.println("\n| INPUT DATA |\n");
        System.out.print("| Nama Pembeli        : ");
        String namaPembeli = sc.nextLine();
        System.out.print("| No HP               : ");
        String noHP = sc.nextLine();
        
        Pembeli pembeli = new Pembeli(namaPembeli, noHP, idx);
        System.out.println("\nAntrian berhasil ditambahkan!");
        System.out.println("Nomor antrian : " + idx);

        return pembeli;
    }

    public static void main(String[] args) {
        
        Pembeli pembeli = new Pembeli();
        RestoranRoyalDelish restoran = new RestoranRoyalDelish();

        int pilihan, index = 0;

        do {
            menu();
            
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();

            switch(pilihan) {
                case 1:
                    index++;
                    sc.nextLine();
                    inputAntrian(index);
                    break;

                case 2:
                    restoran.cetakAntrian();
                    break;

                case 3:


                case 4:


                case 0:
                    System.out.println("\nTerima kasih telah menggunakan layanan kami.\n");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Silakan masukkan ulang!");
                    break;
            }
        } while (pilihan != 0);
    }
}
