package Jobsheet2;

public class Mahasiswa16 {

    String nama, NIM, kelas;
    double IPK;

    public Mahasiswa16() {

    }

    public Mahasiswa16(String nm, String NIM, double IPK, String kls) {
        nama = nm;
        this.NIM = NIM;
        this.IPK = IPK;
        kelas = kls;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("IPK : " + IPK);
        System.out.println("Kelas : " + kelas);

    }

    public void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    public void updateIPK(double IPKBaru) {
        if (IPK >= 0.00 && IPK <= 4.00) {
            IPK = IPKBaru;
        }
        else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    public String nilaiKinerja(double IPK) {
        if (IPK >= 3.5) {
            return "Kinerja sangat baik";
        }
        else if (IPK >= 3.0) {
            return "Kinerja baik";
        }
        else if (IPK >= 2.0) {
            return "Kinerja cukup";
        }
        else {
            return "Kinerja kurang";
        }
    }
}