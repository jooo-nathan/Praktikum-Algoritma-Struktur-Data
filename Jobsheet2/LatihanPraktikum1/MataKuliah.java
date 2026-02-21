package Jobsheet2.LatihanPraktikum1;

public class MataKuliah {
    String namaMK, kodeMK;
    int sks, jumlahJam;

    MataKuliah() {

    }

    MataKuliah(String namaMK, String kodeMK, int sks, int jumlahJam) {
        this.namaMK = namaMK;
        this.kodeMK = kodeMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi() {
        System.out.println("\nInformasi mengenai mata kuliah");
        System.out.println("Nama mata kuliah       : " + namaMK);
        System.out.println("Kode mata kuliah       : " + kodeMK);
        System.out.println("Bobot SKS mata kuliah  : " + sks);
        System.out.println("Jumlah jam mata kuliah : " + jumlahJam + "\n");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("\nSKS telah diubah!");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("\nJumlah jam telah ditambah menjadi " + jumlahJam + " jam!");
    }

    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("\nPengurangan tidak dapat dilakukan karena jumlah jam saat ini lebih kecil daripada jam pengurang");
        }
        else {
            jumlahJam -= jam;
            System.out.println("\nJumlah jam telah dikurangi menjadi " + jumlahJam + " jam!");
        }
    }
}