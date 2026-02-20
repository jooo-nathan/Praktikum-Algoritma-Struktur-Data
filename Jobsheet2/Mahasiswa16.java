package Jobsheet2;

public class Mahasiswa16{

    static String nama, NIM, kelas;
    static double IPK;

    void tampilkanInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("IPK : " + IPK);
        System.out.println("Kelas : " + kelas);

    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIPK(double IPKBaru) {
        IPK = IPKBaru;
    }

    String nilaiKinerja(double IPK) {
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