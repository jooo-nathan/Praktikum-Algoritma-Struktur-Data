package Jobsheet12;
import java.util.Scanner;

public class DoubleLinkedListMain14 {

    static Mahasiswa14 inputMahasiswa() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nInput Data Mahasiswa");
        System.out.print("Masukkan NIM      : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama     : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas    : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK      : ");
        double ipk = sc.nextDouble();

        Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas, ipk);
        return mhs;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DoubleLinkedList14 list = new DoubleLinkedList14();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data dari awal");
            System.out.println("0. Keluar\n");

            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa14 mhsAwal = inputMahasiswa();
                    list.addFirst(mhsAwal);
                    break;

                case 2:
                    Mahasiswa14 mhsAkhir = inputMahasiswa();
                    list.addLast(mhsAkhir);
                    break;

                case 3:
                    System.out.print("\nMasukkan NIM yang dicari : ");
                    String keyNIM = scan.nextLine();
                    
                    System.out.print("\nMasukkan data baru :");
                    Mahasiswa14 dataBaru = inputMahasiswa();
                    list.insertAfter(keyNIM, dataBaru);
                    break;

                case 4:
                    list.removeFirst();
                    break;

                case 5:
                    list.removeLast();
                    break;

                case 6:
                    list.print();
                    break;

                case 0:
                    System.out.println("Program selesai.");

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        scan.close();
    }
}
