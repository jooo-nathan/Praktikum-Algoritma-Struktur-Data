package Quiz1;
import java.util.Scanner;

public class Cafe {

    Scanner sc = new Scanner(System.in);

    String menuName, menuType, menuCode;
    int menuStock;
    boolean isSure = true;

    void showData(int index) {
        System.out.println("\n---------------------------------");
        System.out.println("Data Menu ke-" + (index + 1) + "\n");
        System.out.println("Kode menu : " + menuCode);
        System.out.println("Nama menu : " + menuName);
        System.out.println("Jenis menu : " + menuType);
        System.out.println("Jumlah stok menu : " + menuStock);
        
    }

    String updateMenuCode(int index, String oldMenuCode) {
    System.out.println("\nKode menu lama adalah : " + oldMenuCode);

    String newMenuCode = "";

        do {
            System.out.print("Apakah anda yakin ingin mengganti kode (true/false): ");
            isSure = sc.nextBoolean();
            sc.nextLine();

            if (isSure) {
                System.out.print("\nMasukkan kode menu baru : ");
                newMenuCode = sc.nextLine();
                System.out.println("\nKode menu sukses diganti!");
                break;
            }
            else if (!isSure) {
                System.out.println("\nBaiklah. Kode menu anda tidak berubah.");
                newMenuCode = oldMenuCode;
                break;
            }
        } while (true);

        return newMenuCode;
    }

    String updateMenuName(int index, String oldMenuName) {
    System.out.println("\nNama menu lama adalah : " + oldMenuName);

    String newMenuName = "";

        do {
            System.out.print("Apakah anda yakin ingin mengganti nama (true/false): ");
            isSure = sc.nextBoolean();
            sc.nextLine();

            if (isSure) {
                System.out.print("\nMasukkan nama menu baru : ");
                newMenuName = sc.nextLine();
                System.out.println("\nNama menu sukses diganti!");
                break;
            }
            else if (!isSure) {
                System.out.println("\nBaiklah. Nama menu anda tidak berubah.");
                newMenuName = oldMenuName;
                break;
            }
        } while (true);

        return newMenuName;
    }

    int updateMenuStock(int index, int oldMenuStock) {
    System.out.println("\nJumlah stock menu lama adalah : " + oldMenuStock);

    int newMenuStock = 0;

        do {
            System.out.print("Apakah anda yakin ingin mengganti jumlah stok (true/false): ");
            isSure = sc.nextBoolean();
            sc.nextLine();

            if (isSure) {
                System.out.print("\nMasukkan jumlah stock menu baru : ");
                newMenuStock = sc.nextInt();
                System.out.println("\nJumlah stock menu sukses diganti!");
                break;
            }
            else if (!isSure) {
                System.out.println("\nBaiklah. Jumlah stok anda tidak berubah.");
                newMenuStock = oldMenuStock;
                break;
            }
        } while (true);

        return newMenuStock;
    }
}
