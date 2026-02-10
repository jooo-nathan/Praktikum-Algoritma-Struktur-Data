package Jobsheet1;
import java.util.Scanner;

public class Tugas2_16 {

    static Scanner sc = new Scanner(System.in);

    public static String[][] inputSchedule(int jumlah, String komponen[]) {
        String jadwal[][] = new String[jumlah][komponen.length];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nJadwal ke-" + (i+1));
            for (int j = 0; j < komponen.length; j++) {
                System.out.print("Masukkan " + komponen[j] + " : ");
                jadwal[i][j] = sc.nextLine();
            }
        }

        return jadwal;
    }

    public static void showSchedule(int jumlah, String komponen[], String jadwal[][]) {

        System.out.printf("%-30s %-20s %-20s %-20s%n", komponen[0], komponen[1], komponen[2], komponen[3]);

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-30s %-20s %-20s %-20s%n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    public static void byDay(int jumlah, String komponen[], String jadwal[][]) {

        sc.nextLine();
        System.out.print("Berdasarkan hari apa anda ingin mencari jadwal : ");
        String day = sc.nextLine();

        System.out.println();
        System.out.printf("%-30s %-20s %-20s %-20s%n", komponen[0], komponen[1], komponen[2], komponen[3]);

        for (int i = 0; i < jumlah; i++) {
            if (jadwal[i][2].equalsIgnoreCase(day)) {
                System.out.printf("%-30s %-20s %-20s %-20s%n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
            else {
                continue;
            }
        }
    }

    public static void byMatkul(int jumlah, String komponen[], String jadwal[][]) {

        sc.nextLine();
        System.out.print("Berdasarkan mata kuliah apa anda ingin mencari jadwal : ");
        String matkul = sc.nextLine();

        System.out.println();
        System.out.printf("%-30s %-20s %-20s %-20s%n", komponen[0], komponen[1], komponen[2], komponen[3]);

        for (int i = 0; i < jumlah; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.printf("%-30s %-20s %-20s %-20s%n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
            else {
                continue;
            }
        }
    }

    public static void main(String[] args) {

        String komponen[] = {"Nama Mata Kuliah", "Ruang", "Hari Kuliah", "Jam Kuliah"};

        System.out.println("=======================================================");
        System.out.println("PROGRAM PENYIMPAN DAN PENGELOLA JADWAL KULIAH MAHASISWA");
        System.out.println("=======================================================\n");

        System.out.print("Masukkan jumlah jadwal kuliah : ");
        int jumlahJadwal = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = inputSchedule(jumlahJadwal, komponen);

        boolean rep = true;
        
        do {
            System.out.println("\nPilihan Menu : ");
            System.out.println("1. Tampilkan seluruh jadwal");
            System.out.println("2. Tampilkan jadwal berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal berdasarkan nama mata kuliah tertentu");
            System.out.println("4. Exit");

            System.out.print("\nMasukkan pilihan anda : ");
            int pilihan = sc.nextInt();

            if (pilihan == 1) {
                showSchedule(jumlahJadwal, komponen, jadwal);
            }
            else if (pilihan == 2) {
                byDay(jumlahJadwal, komponen, jadwal);
            }
            else if (pilihan == 3) {
                byMatkul(jumlahJadwal, komponen, jadwal);
            } 
            else if (pilihan == 4) {
                System.out.println("\nTerima kasih sudah menggunakan layanan kami\n");
                break;
            }
            else {
                System.out.println("Pilihan tidak valid! Masukkan ulang!");
            }
        } while (rep);
        

    }
}
