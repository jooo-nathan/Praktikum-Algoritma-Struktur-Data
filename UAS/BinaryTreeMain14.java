package UAS;
import java.util.Scanner;

public class BinaryTreeMain14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        BinaryTree14 bat = new BinaryTree14();
        
        bat.add(new Mahasiswa14("220101001", "Andi", "TI-1A", 3.95));
        bat.add(new Mahasiswa14("220101002", "Budi", "TI-1A", 3.20));
        bat.add(new Mahasiswa14("220101003", "Sinta", "TI-1B", 3.82));
        bat.add(new Mahasiswa14("220101004", "Rina", "TI-1B", 3.45));
        bat.add(new Mahasiswa14("220101005", "Dimas", "TI-1C", 2.75));
        bat.add(new Mahasiswa14("220101006", "Fajar", "TI-1C", 3.10));
        bat.add(new Mahasiswa14("220101007", "Nabila", "TI-1D", 3.76));
        bat.add(new Mahasiswa14("220101008", "Rizky", "TI-1D", 3.50));
        bat.add(new Mahasiswa14("220101009", "Aulia", "TI-1E", 3.88));
        bat.add(new Mahasiswa14("220101010", "Kevin", "TI-1E", 3.00));
        
        int pilihan;
        do {

            System.out.println("Menu : ");
            System.out.println("1. Mencari mahasiswa berdasarkan nama");
            System.out.println("2. Mencari 3 IPK tertinggi");
            System.out.println("3. Menampilkan mahasiswa dari kelas tertentu");
            System.out.println("0. Keluar");
    
            System.out.print("\nMasukkan pilihan anda : ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama anda : ");
                    sc.nextLine();
                    String nama = sc.nextLine();

                    bat.cariBerdasarkanNama(nama);

                    break;

                case 2:
                    System.out.println("Berikut adalah 3 IPK tertinggi:");
                    bat.cari3IPKTertinggi();

                    break;

                case 3:
                    System.out.print("Masukkan kelas yang ingin anda cari mahasiswanya : ");
                    sc.nextLine();
                    String kelas = sc.nextLine();

                    bat.cariBerdasarkanKelas(kelas);
            }
        } while (pilihan != 0);
    }
}
