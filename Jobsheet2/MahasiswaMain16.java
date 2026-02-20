package Jobsheet2;

public class MahasiswaMain16 {
    public static void main(String[] args) {
        Mahasiswa16 mhs1 = new Mahasiswa16();

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.NIM = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.IPK = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

    }
}
