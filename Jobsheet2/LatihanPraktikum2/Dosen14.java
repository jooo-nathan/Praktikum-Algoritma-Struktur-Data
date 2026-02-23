package Jobsheet2.LatihanPraktikum2;

public class Dosen14 {
    String idDosen, namaDosen, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    Dosen14() {

    }

    Dosen14(String namaDosen, String idDosen, String bidangKeahlian, boolean statusAktif, int tahunBergabung) {
        this.namaDosen = namaDosen;
        this.idDosen = idDosen;
        this.bidangKeahlian = bidangKeahlian;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
    }

    void tampilkanInformasi() {
        System.out.println("\nInformasi mengenai dosen" );
        System.out.println("Nama dosen                  : " + namaDosen);
        System.out.println("ID dosen                    : " + idDosen);
        System.out.println("Bidang keahlian dosen       : " + bidangKeahlian);
        System.out.println("Status aktif dosen          : " + statusAktif);
        System.out.println("Tahun bergabung dosen       : " + tahunBergabung);
    }

    void setStatusAtif(boolean status) {
        if (status) {
            System.out.println("\nStatus telah diubah menjadi 'Aktif' !\n");
        }
        else {
            System.out.println("\nStatus telah diubah menjadi 'Tidak Aktif' !\n");
        }
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        int masaKerjaDosen = thnSkrg - tahunBergabung;
        System.out.println("\nMasa kerja dosen selama " + masaKerjaDosen + " tahun!\n");

        return masaKerjaDosen;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("\nBidang keahlian telah diganti menjadi " + bidangKeahlian + "!\n");
    }
}
