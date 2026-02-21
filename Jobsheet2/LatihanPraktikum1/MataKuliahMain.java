package Jobsheet2.LatihanPraktikum1;

public class MataKuliahMain {
    public static void main(String[] args) {

        MataKuliah MK1 = new MataKuliah();
        MK1.tampilkanInformasi();
        MK1.ubahSKS(4);
        MK1.tambahJam(2);
        MK1.kurangiJam(1);
        MK1.tampilkanInformasi();


        MataKuliah MK2 = new MataKuliah("Basis Data", "BD", 2, 4);
        MK2.tampilkanInformasi();
        MK2.ubahSKS(4);
        MK2.tambahJam(2);
        MK2.kurangiJam(1);
        MK2.tampilkanInformasi();


        MataKuliah MK3 = new MataKuliah("Sistem Operasi", "SO", 4, 4);
        MK3.tampilkanInformasi();
        MK3.ubahSKS(2);
        MK3.tambahJam(1);
        MK3.kurangiJam(6);
        MK3.tampilkanInformasi();
    }


}
