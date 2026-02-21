package Jobsheet2.LatihanPraktikum2;

public class DosenMain16 {
    public static void main(String[] args) {
        Dosen16 dosen1 = new Dosen16();
        dosen1.tampilkanInformasi();

        Dosen16 dosen2 = new Dosen16("Ani Mariati", "AM", "Programmer", true, 2012);
        dosen2.tampilkanInformasi();
        dosen2.setStatusAtif(false);
        dosen2.hitungMasaKerja(2027);
        dosen2.ubahKeahlian("UI/UX");
        dosen2.tampilkanInformasi();

        Dosen16 dosen3 = new Dosen16("Budi Amato", "BA", "Mesin", false, 2000);
        dosen3.tampilkanInformasi();
        dosen3.setStatusAtif(true);
        dosen3.hitungMasaKerja(2030);
        dosen3.ubahKeahlian("Memasak");
        dosen3.tampilkanInformasi();
    }
}
