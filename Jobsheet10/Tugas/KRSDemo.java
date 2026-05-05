package Jobsheet10.Tugas;
import java.util.Scanner;

public class KRSDemo {

    public static void menu() {
        System.out.println("\n=======================================");
        System.out.println("Pilihan menu\n");

        System.out.println("1. Manipulasi Antrian");
        System.out.println("2. Informasi Antrian");
        System.out.println("0. Keluar");
    }

    public static void menu1() {
        System.out.println("\n=======================================");
        System.out.println("Menu Manipulasi Antrian\n");

        System.out.println("1. Tambah Antrian");
        System.out.println("2. Proses Antrian (2 antrian)");
        System.out.println("3. Kosongkan Antrian");
        System.out.println("0. Kembali");
    }

    public static void menu2() {
        System.out.println("\n=======================================");
        System.out.println("Menu Informasi Antrian");

        System.out.println("1. Tampilkan Semua Antrian");
        System.out.println("2. Tampilkan 2 Antrian Terdepan");
        System.out.println("3. Tampilkan Antrian Terakhir");
        System.out.println("4. Tampilkan Jumlah Antrian");
        System.out.println("5. Tampilkan Jumlah Antrian Terproses");
        System.out.println("0. Kembali");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianKRS antrianKRS = new AntrianKRS(10);

        int pilihan, subPilihan;

        System.out.println("=== Program Antrian Persetujuan Kartu Rencana Srudi (KRS) ===");

        do {
            menu();

            System.out.print("\nMasukkan pilihan : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                // KASUS 1
                case 1:
                    menu1();

                    System.out.print("\nMasukkan pilihan : ");
                    subPilihan = sc.nextInt();
                    sc.nextLine();

                    switch(subPilihan) {
                        case 1:
                            System.out.println("\n------------------------------------------------------------------");
                            System.out.println("Antrian KRS yang ke-" + (MahasiswaKRS.totalInputMhs + 1));

                            System.out.print("NIM         : ");
                            String nim = sc.nextLine();

                            System.out.print("Nama        : ");
                            String nama = sc.nextLine();

                            System.out.print("Prodi       : ");
                            String prodi = sc.nextLine();

                            System.out.print("Kelas       : ");
                            String kelas = sc.nextLine();

                            MahasiswaKRS mhs = new MahasiswaKRS(nim, nama, prodi, kelas);
                            antrianKRS.tambahAntrian(mhs);
                            System.out.println("------------------------------------------------------------------");

                            break;

                        case 2: // proses langsung 2 antrian mennn
                            System.out.println("\nSedang memproses antrian...");
                            System.out.println("------------------------------------------------------------------");
                            antrianKRS.prosesKRS();
                            
                            System.out.println("------------------------------------------------------------------");

                            break;

                        case 3:
                            System.out.println("\nMengosongkan antrian...\n");
                            antrianKRS.kosongkanAntrian();
                            break;

                        case 0:
                            break;

                        default:
                            System.out.println("\nPilihan tidak valid. Silakan masukkan ulang.");
                    }
                        break;

                // KASUS 2
                case 2:
                    menu2();

                    System.out.print("\nMasukkan pilihan : ");
                    subPilihan = sc.nextInt();
                    sc.nextLine();

                    switch (subPilihan) {

                        case 1:
                            if (antrianKRS.size == 0) {
                                System.out.println("Belum ada antrian KRS yang diinputkan.");
                                break;
                            }

                            System.out.println("\nBerikut adalah seluruh antrian yang ada");
                            System.out.println("secara berurutan mulai dari yang paling awal hingga akhir.\n");

                            System.out.println("------------------------------------------------------------------");
                            antrianKRS.tampilkanSemua();
                            System.out.println("------------------------------------------------------------------");
                            break;

                        case 2:
                            if (antrianKRS.size == 0) {
                                System.out.println("Belum ada antrian KRS yang diinputkan.");
                                break;
                            }

                            System.out.println("\nBerikut adalah 2 antrian terdepan");
                            
                            antrianKRS.cetak2AntrianTerdepan(2);
                            System.out.println("-----------------------------------");
                            
                            break;

                        case 3:
                            if (antrianKRS.size == 0) {
                                System.out.println("Belum ada antrian KRS yang diinputkan.");
                                break;
                            }

                            System.out.println("\nBerikut adalah antrian terakhir");
                            antrianKRS.cetakAntrianTerakhir();
                            break;

                        case 4:
                            System.out.println("\nJumlah antrian yang belum terproses : " + antrianKRS.size + " mahasiswa");
                            break;

                        case 5:
                            System.out.println("\nJumlah antrian yang sudah terproses : " + antrianKRS.totalProsesKRS + " mahasiswa");
                            break;

                        case 0:
                            break;

                        default:
                            System.out.println("\nPilihan tidak valid. Silakan masukkan ulang.");
                    }
                
                    break;

                case 0:
                    System.out.println("\nTerima kasih sudah menggunakan layanan kami.");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Silakan masukkan ulang.");
            }

            System.out.println();

        } while (pilihan != 0);
    }
}
