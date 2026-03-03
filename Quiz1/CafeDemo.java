package Quiz1;

import java.util.Scanner;

public class CafeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option = 0, menuCount = 0;

        System.out.println("\nProgram Manajemen Menu Cafe\n");
        System.out.print("Masukkan jumlah menu : ");
        menuCount = sc.nextInt();

        Cafe[] menu = new Cafe[menuCount];

        for (int i = 0; i < menu.length; i++) {

            sc.nextLine();
            menu[i] = new Cafe();

            System.out.println("\n---------------------------------");
            System.out.println("Input Menu Nomor " + (i + 1) + "\n");
            System.out.print("Masukkan kode menu : ");
            menu[i].menuCode = sc.nextLine();
            System.out.print("Masukkan nama menu : ");
            menu[i].menuName = sc.nextLine();
            System.out.print("Masukkan jenis menu : ");
            menu[i].menuType = sc.nextLine();
            System.out.print("Masukkan jumlah stok menu : ");
            menu[i].menuStock = sc.nextInt();
        }

        do {
            System.out.println("\n---------------------------------");
            System.out.println("Menu Program Cafe\n");
            System.out.println("1. Tampilkan Informasi Semua Menu");
            System.out.println("2. Tampilkan Informasi Menu Spesifik");
            System.out.println("3. Update Kode Menu");
            System.out.println("4. Update Nama Menu");
            System.out.println("5. Update Jumlah Stok Menu");
            System.out.println("6. Keluar\n");

            System.out.print("Masukkan nomor pilihan anda : ");
            option = sc.nextInt();

            if (option == 1) {
                for (int i = 0; i < menu.length; i++) {
                    menu[i].showData(i);
                }
            }
            else if (option == 2) {
                System.out.print("\nMasukkan nomor menu yang ingin anda cek : ");
                int index = sc.nextInt();

                if (index > menuCount) {
                    System.out.println("\nTidak ada menu pada nomor ini.");
                }
                else {
                    menu[index-1].showData(index-1);
                }
                
            } 
            else if (option == 3) {
                System.out.print("\nMasukkan nomor menu yang ingin update kodenya : ");
                int index = sc.nextInt();

                if (index > menuCount) {
                    System.out.println("\nTidak ada menu pada nomor ini.");
                }
                else {
                    menu[index-1].menuCode = menu[index-1].updateMenuCode(index-1, menu[index-1].menuCode);
                }
    
            }
            else if (option == 4) {
                System.out.print("\nMasukkan nomor menu yang ingin update namanya : ");
                int index = sc.nextInt();

                if (index > menuCount) {
                    System.out.println("\nTidak ada menu pada nomor ini.");
                }
                else {
                    menu[index-1].menuName = menu[index-1].updateMenuName(index-1, menu[index-1].menuName);
                }
                
            }
            else if (option == 5) {
                System.out.print("\nMasukkan nomor menu yang ingin update jumlah stoknya : ");
                int index = sc.nextInt();

                if (index > menuCount) {
                    System.out.println("\nTidak ada menu pada nomor ini.");
                }
                else {
                    menu[index-1].menuStock = menu[index-1].updateMenuStock(index-1, menu[index-1].menuStock);
                }
                
            }
            else if (option == 6) {
                System.out.println("\nTerima kasih sudah menggunakan layanan kami.\n");
                break;
            }
            else {
                System.out.println("\nInput invalid. Masukkan input ulang!\n");
            }
        } while (option != 5);
    }
}
