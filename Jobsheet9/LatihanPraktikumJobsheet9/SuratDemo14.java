
import java.util.Scanner;

public class SuratDemo14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String idSurat, namaMahasiswa, kelas;
        char jenisIzin;
        int durasi, option;
        boolean check;

        StackSurat14 stack = new StackSurat14(3);

        System.out.println("=== PROGRAM PENGAJUAN SURAT ===");
        
        do {
            System.out.println("\nMenu : \n");
            System.out.println("1. Terima Surat");
            System.out.println("2. Proses Surat");
            System.out.println("3. Lihat Surat Teratas");
            System.out.println("4. Cari Surat (berdasarkan nama mahasiswa)");
            System.out.println("0. Exit\n");

            System.out.print("Masukkan pilihan anda : ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\nMasukkan data surat\n");
                    System.out.print("ID Surat          : ");
                    idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa    : ");
                    namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas             : ");
                    kelas = sc.nextLine();

                    do {
                        System.out.print("Jenis Izin (I/S)  : ");
                        jenisIzin = sc.next().charAt(0);

                        if ((jenisIzin != 'S') && (jenisIzin != 's') && (jenisIzin != 'I') && (jenisIzin != 'i')) {
                            System.out.println("\nJenis Izin harus berupa I (izin) atau S (sakit)!");
                            System.out.println("Silakan masukkan ulang.\n");
                        }
                        else {
                            break;
                        }

                    } while (true);
                    
                    System.out.print("Durasi            : ");
                    durasi = sc.nextInt();
                    
                    Surat14 surat = new Surat14(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);

                    check = stack.push(surat);

                    if (check) {
                        System.out.printf("\nSurat dengan ID %s berhasil diserahkan.\n", surat.idSurat);
                    }
                    break;
            
                case 2:
                    System.out.println("\nMemproses surat terakhir...");
                    Surat14 verify = stack.pop();

                    if (verify != null) {
                        System.out.printf("\nSurat terakhir dengan ID '%s' telah diproses\n", verify.idSurat);
                    }
                    break;

                case 3:

                    stack.print();
                    break;

                case 4:

                    System.out.print("\nMasukkan nama mahasiswa : ");
                    String namaMhs = sc.nextLine();

                    stack.sequentialSearch(namaMhs);
                    
                    break;
                default:
                    System.out.println("\nPilihan tidak ada dalam menu. Silakan masukkan ulang!\n");
                    break;
            }

        } while (option >= 0 && option <= 4);
    }
}
