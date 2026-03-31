package Praktikum06;
import java.util.Scanner;

public class DosenDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen14[] dsn = new Dosen14[10];
        DataDosen14 list = new DataDosen14();

        // INPUT
        for (int i = 0; i < dsn.length; i++) {
            dsn[i] = new Dosen14();
            
            System.out.println("--------------------------");
            System.out.println("Input data dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            dsn[i].kode =  sc.nextLine();
            System.out.print("Nama          : ");
            dsn[i].nama =  sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            dsn[i].jenisKelamin =  sc.nextLine();
            System.out.print("Usia          : ");
            dsn[i].usia =  sc.nextInt();

            sc.nextLine();

            list.tambah(dsn[i]);

            System.out.println();
        }

        for (int i = 0; i < dsn.length; i++) {
            dsn[i].tampil(i);
        }

        System.out.println("\nData dosen setelah sorting berdasarkan usia (ASC) : ");
        System.out.println("-----------------------------------------------------------");

        list.sortingASC();
        list.tampil();

        System.out.println("\nData dosen setelah sorting berdasarkan usia (DSC) : ");
        System.out.println("-----------------------------------------------------------");

        list.sortingDSC();
        list.tampil();



    }
}
