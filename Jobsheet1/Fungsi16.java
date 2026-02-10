package Jobsheet1;
import java.util.Scanner;

public class Fungsi16 {
    public static void showData(int stok[][], int harga[]) {
        int cabang[] = new int[4];
        int jenisBunga[] = new int[4];
        int totalPendapatan;

        for (int i = 0; i < cabang.length; i++) {
            totalPendapatan = 0;
            System.out.print("RoyalGarden " + (i+1) + " : ");

            for (int j = 0; j < jenisBunga.length; j++) {
                totalPendapatan += (stok[i][j] * harga[j]);
            }
            System.out.println(totalPendapatan);

            if (totalPendapatan > 1500000) {
                System.out.println("Sangat Baik\n");
            }
            else {
                System.out.println("Perlu Evaluasi\n");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int harga[] = {75000, 50000, 60000, 10000};

        showData(stok, harga);
    }
}
