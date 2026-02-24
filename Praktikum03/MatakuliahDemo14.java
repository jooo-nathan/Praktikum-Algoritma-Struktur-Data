package Praktikum03;
import java.util.Scanner;

public class MatakuliahDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahMK = sc.nextInt();

        Matakuliah14[] arrayOfMatakuliah = new Matakuliah14[jumlahMK];

        for (int i = 0; i < jumlahMK; i++) {
            arrayOfMatakuliah[i] = new Matakuliah14();
            arrayOfMatakuliah[i].tambahData(i);
        }

        for (int i = 0; i < jumlahMK; i++) {
            arrayOfMatakuliah[i].cetakInfo(i);

        }
    }    
}

