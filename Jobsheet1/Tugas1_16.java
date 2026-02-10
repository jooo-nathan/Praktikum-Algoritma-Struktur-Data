package Jobsheet1;

import java.util.Scanner;

public class Tugas1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] kode = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] kota = {
                { 'A', 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'B', 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'D', 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'E', 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'F', 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'G', 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'H', 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'L', 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'N', 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'T', 'E', 'G', 'A', 'L' }
        };

        System.out.print("Masukkan kode plat nomor : ");
        String input = sc.nextLine();
        Boolean isFound = true;

        for (int i = 0; i < kode.length; i++) {
            if (input.equalsIgnoreCase(String.valueOf(kode[i]))) {
                for (int j = 1; j < kota[i].length; j++) {
                    System.out.print(kota[i][j]);
                }
                break;
            }
        }

        System.out.println();
    }
}
