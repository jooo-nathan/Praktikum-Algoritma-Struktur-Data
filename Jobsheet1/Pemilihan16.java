package Jobsheet1;
import java.util.Scanner;

public class Pemilihan16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        float nilaiAkhir;
        boolean isLulus = true;
        String nilaiHuruf = "";

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================\n");

        System.out.print("Masukkan Nilai Tugas  : ");
        nilaiTugas = sc.nextInt();

        System.out.print("Masukkan Nilai Kuis   : ");
        nilaiKuis = sc.nextInt();

        System.out.print("Masukkan Nilai UTS    : ");
        nilaiUTS = sc.nextInt();

        System.out.print("Masukkan Nilai UAS    : ");
        nilaiUAS = sc.nextInt();

        System.out.println("==============================");

        if ((nilaiTugas > 100) || (nilaiTugas < 0) || (nilaiKuis > 100) || (nilaiKuis < 0) || (nilaiUTS > 100) || (nilaiUTS < 0) || (nilaiUAS > 100) || (nilaiUAS < 0)) {
            System.out.print("Nilai Tidak Valid");
        }
        else {
            nilaiAkhir = (float) ((nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3));

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            }
            else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            }
            else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            }
            else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            }
            else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            }
            else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            }
            else if (nilaiAkhir <= 39 && nilaiAkhir >= 0) {
                nilaiHuruf = "E";
            }

            if (nilaiHuruf == "D" || nilaiHuruf == "E") {
                isLulus = false;
            }

            System.out.printf("Nilai Akhir  : %.2f\n", nilaiAkhir);
            System.out.println("Nilai Huruf  : " + nilaiHuruf);

            System.out.println("==============================\n");

            if (isLulus) {
                System.out.println("SELAMAT! ANDA LULUS!");
            }
            else {
                System.out.println("MAAF, ANDA TIDAK LULUS.");
            }
        }
        System.out.println("\n==============================\n");
    }
}
