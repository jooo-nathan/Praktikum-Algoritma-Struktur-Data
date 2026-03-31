package Praktikum06;
import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14();
        Mahasiswa14 mhs[] = new Mahasiswa14[jumlahMhs];

        for (int i = 0; i < jumlahMhs; i++) {

            sc.nextLine();

            mhs[i] = new Mahasiswa14();

            System.out.println("--------------------------");
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            mhs[i].nim =  sc.nextLine();
            System.out.print("Nama  : ");
            mhs[i].nama =  sc.nextLine();
            System.out.print("Kelas : ");
            mhs[i].kelas =  sc.nextLine();
            System.out.print("IPK   : ");
            mhs[i].ipk =  sc.nextDouble();

            list.tambah(mhs[i]);
        }

        System.out.println("--------------------------");

        System.out.println("\nData mahasiswa sebelum sorting:");

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("--------------------------");
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.println("NIM   : " + mhs[i].nim);
            System.out.println("Nama  : " + mhs[i].nama);
            System.out.println("Kelas : " + mhs[i].kelas);
            System.out.println("IPK   : " + mhs[i].ipk);
        }

        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        System.out.println("--------------------------");

        list.bubbleSort();
        list.tampil();

        /*
        Mahasiswa14 m1 = new Mahasiswa14("123", "Zidan","2A", 3.2);
        Mahasiswa14 m2 = new Mahasiswa14("124", "Ayu", "2A", 3.5);
        Mahasiswa14 m3 = new Mahasiswa14("125", "Sofi","2A", 3.1);
        Mahasiswa14 m4 = new Mahasiswa14("126", "Sita","2A", 3.9);
        Mahasiswa14 m5 = new Mahasiswa14("127", "Miki","2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        */

        System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC)");
        System.out.println("--------------------------");
        list.selectionSort();
        list.tampil();

    }
}