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
        System.out.println("\n======================");
        System.out.println("| INPUT DATA PEMBELI |");
        System.out.println("======================\n");

        System.out.print("| Nama Pembeli        : ");
        String namaPembeli = sc.nextLine();
        System.out.print("| No HP               : ");
        String noHP = sc.nextLine();
        
        Pembeli pembeli = new Pembeli(namaPembeli, noHP, idx);

        System.out.println("\n| Nomor antrian : " + idx);
        System.out.println("| Antrian berhasil ditambahkan");

        return pembeli;
    }

    static Pesanan inputPesanan() {
        System.out.println("\n======================");
        System.out.println("| INPUT DATA PESANAN |");
        System.out.println("======================\n");

        System.out.print("| Kode Pesanan        : ");
        String kodePesanan = sc.nextLine();
        System.out.print("| Nama Pesanan        : ");
        String namaPesanan = sc.nextLine();
        System.out.print("| Harga               : ");
        int harga = sc.nextInt();
        sc.nextLine();

        Pesanan pesanan = new Pesanan(kodePesanan, namaPesanan, harga);
        return pesanan;
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
                    restoran.tambahAntrian(inputAntrian(index));

                    /*
                    Pembeli pemb1 = new Pembeli("jojo", "082", 1);
                    Pembeli pemb2 = new Pembeli("nathan", "081", 2);
                    restoran.tambahAntrian(pemb1);
                    restoran.tambahAntrian(pemb2);
                    */
                   
                    break;

                case 2:
                    restoran.cetakAntrian();
                    break;

                case 3: // BINGUNGGGG
                    sc.nextLine();
                    restoran.hapusDanPesan();
                    break;

                case 4:
                    restoran.laporanPesanan();
                    break;

                case 0:
                    System.out.println("\n-----------------------------------------------");
                    System.out.println("| Terima kasih telah menggunakan layanan kami |");
                    System.out.println("-----------------------------------------------");
                    break;

                default:
                    System.out.println("\n------------------------------------------------");
                    System.out.println("| Pilihan tidak valid. Silakan masukkan ulang! |");
                    System.out.println("------------------------------------------------");

                    break;
            }
            
        } while (pilihan != 0);
    }
}
