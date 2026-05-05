package Pertemuan11.Percobaan;
import java.util.Scanner;

public class SLLMain14 {

    static int max;
    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("\nMenu :\n");
        System.out.println("1. Input Data");
        System.out.println("2. Tampilkan Data");
        System.out.println("0. Keluar\n");
    }

    static void menu1() {
        System.out.println("\nMenu Input Data\n");

        System.out.println("1. Input di awal (index 0)");
        System.out.println("2. Input di akhir (index " + (max - 1) + ")");
        System.out.println("3. Input setelah data tertentu");
        System.out.println("4. Input setelah index tertentu");
        System.out.println("0. Keluar\n");
    }

    static Mahasiswa14 getInput() {

        System.out.println("\nInput data");
        System.out.print("NIM     : ");
        String nim = sc.nextLine();
        System.out.print("Nama    : ");
        String nama = sc.nextLine();
        System.out.print("Kelas   : ");
        String kelas = sc.nextLine();
        System.out.print("IPK     : ");
        double ipk = sc.nextDouble();

        Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas, ipk);
        //sc.nextLine();
        return mhs;
    }
    public static void main(String[] args) {
        SingleLinkedList14 sll = new SingleLinkedList14();

        
        Mahasiswa14 mhs1 = new Mahasiswa14("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa14 mhs2 = new Mahasiswa14("23212201", "Bimon", "2B", 3.8);
        Mahasiswa14 mhs3 = new Mahasiswa14("22212202", "Cintia", "3C", 3.5);
        Mahasiswa14 mhs4 = new Mahasiswa14("21212203", "Dirga", "4D", 3.6);

        
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
        
        /*
        System.out.println("=== PROGRAM LINKED LIST ===");

        int pilihan, subPilihan;

        do {
            menu();

            System.out.print("Masukkan pilihan : ");
            pilihan = sc.nextInt();
           

            switch (pilihan) {
                case 1:
                    
                    menu1();
                    
                    System.out.print("Masukkan pilihan : ");
                    subPilihan = sc.nextInt();
                    

                    switch(subPilihan) {
                        case 1:
                            sc.nextLine();
                            sll.addFirst(getInput());
                            break;

                        case 2:
                            sc.nextLine();
                            sll.addLast(getInput());
                            break;

                        case 3:
                            sc.nextLine();
                            System.out.print("Masukkan nama mahasiswa yang ingin anda inputkan data setelahnya : ");
                            String key = sc.nextLine();
                            Mahasiswa14 mhs1 = getInput();
                            sll.insertAfter(key, mhs1);
                            break;

                        case 4:
                            System.out.print("Masukkan index dimana anda ingin inputkan data : ");
                            int idx = sc.nextInt();
                            sc.nextLine();

                            sll.insertAt(idx, getInput());
                            break;

                        case 0:
                            break;

                        default:
                            System.out.println("\nPilihan tidak valid. Masukkan ulang.");
                            break;
                    }

                    break;
            
                case 2: 
                    sll.print();
                    break;

                case 0:
                    System.out.println("\nTerima kasih sudah menggunakan layanan kami.\n");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Masukkan ulang.");
                    break;
            }

        } while (pilihan != 0);
        */

        System.out.println("Data index 1 : ");
        sll.getData(1);

        System.out.println("Data mahasiswa AN Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}
