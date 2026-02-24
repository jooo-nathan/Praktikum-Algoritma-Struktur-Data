package Praktikum03;

public class Mahasiswa14 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    void cetakInfo(int index) {
        System.out.println("Data mahasiswa ke-" + (index + 1));
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
        System.out.println("--------------------------------------\n");
    }
}

