package Pertemuan11.Tugas;

public class MahasiswaALUK {
    String nim, nama, kelas, prodi;

    MahasiswaALUK() {

    }

    MahasiswaALUK(String nim, String nama, String kelas, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.prodi = prodi;
    }

    void tampilInformasi() {
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + kelas);
    }
}
