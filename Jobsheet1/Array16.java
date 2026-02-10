package Jobsheet1;

import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalNilai = 0, totalSKS = 0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================\n");

        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();

        String namaMatkul[] = new String[jumlahMK];
        int SKS[] = new int[jumlahMK];
        int nilai[] = new int[jumlahMK];
        String nilaiHuruf[] = new String[jumlahMK];
        float nilaiSetara[] = new float[jumlahMK];

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("\nMasukkan nama mata kuliah ke-" + (i+1) + " : ");
            namaMatkul[i] = sc.nextLine();
            System.out.print("Masukkan SKS-nya : ");
            SKS[i] = sc.nextInt();
            System.out.print("Masukkan nilai angka untuk mata kuliah ini : ");
            nilai[i] = sc.nextInt();
            sc.nextLine();

            

            if (nilai[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            }
            else if (nilai[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = (float) 3.5;
            }
            else if (nilai[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            }
            else if (nilai[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = (float) 2.5;
            }
            else if (nilai[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            }
            else if (nilai[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            }
            else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }

            totalNilai += (nilaiSetara[i] * SKS[i]);
            totalSKS += SKS[i];

        }

        System.out.println("\n====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================\n");


        System.out.println("====================================================================================");

        System.out.printf("%-30s %-20s %-20s %-20s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-33s %-20d %-20s %-20.2f%n", namaMatkul[i], nilai[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        System.out.println("====================================================================================\n");

        float IP = (totalNilai/totalSKS) ;

        System.out.println("\n==========");
        System.out.println("IP : " + IP);
        System.out.println("==========\n");
    }
}
