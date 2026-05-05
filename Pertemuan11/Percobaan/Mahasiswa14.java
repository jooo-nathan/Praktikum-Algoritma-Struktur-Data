package Pertemuan11.Percobaan;

public class Mahasiswa14 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa14() {

    }

    Mahasiswa14(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}
