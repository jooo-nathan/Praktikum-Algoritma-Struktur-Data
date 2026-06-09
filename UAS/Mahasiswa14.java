package UAS;

public class Mahasiswa14 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa14() {

    }

    Mahasiswa14(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("NIM : " + this.nim + " " + "Nama : " + this.nama
        + " " + "Kelas : " + this.kelas + " " + "IPK : " + this.ipk);
    }
}
