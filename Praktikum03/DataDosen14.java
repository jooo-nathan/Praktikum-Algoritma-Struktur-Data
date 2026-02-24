package Praktikum03;

public class DataDosen14 {

    void dataSemuaDosen(Dosen14[] arrayOfDosen14) {
        for (int i = 0; i < arrayOfDosen14.length; i++) {
            System.out.println("Data dosen ke-" + (i + 1));
            System.out.println("Kode          : " + arrayOfDosen14[i].kode);
            System.out.println("Nama          : " + arrayOfDosen14[i].nama);
            System.out.println("Jenis kelamin : " + arrayOfDosen14[i].jenisKelamin);
            System.out.println("Usia          : " + arrayOfDosen14[i].usia);
            System.out.println("--------------------------\n");
        }
        
    }

    void jumlahDosenPerJenisKelamin(Dosen14[] arrayOfDosen14) {

        int pria = 0, wanita = 0;

        for (int i = 0; i < arrayOfDosen14.length; i++) {
            if (arrayOfDosen14[i].jenisKelamin.equalsIgnoreCase("Pria")) {
                pria++;
            }
            else {
                wanita++;
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Data jumlah dosen per jenis kelamin");
        System.out.println("------------------------------------");
        System.out.println("| Dosen Pria     : " + pria);
        System.out.println("| Dosen Wanita   : " + wanita);
        System.out.println("------------------------------------\n");
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen14[] arrayOfDosen14) {
        int jumlahPria = 0, jumlahWanita = 0, kapasitasPria = 0, kapasitasWanita = 0;

        for (int i = 0; i < arrayOfDosen14.length; i++) {
            if (arrayOfDosen14[i].jenisKelamin.equalsIgnoreCase("Pria")) {
                jumlahPria++;
                kapasitasPria += arrayOfDosen14[i].usia;
            }
            else {
                jumlahWanita++;
                kapasitasWanita += arrayOfDosen14[i].usia;
            }
        }
        
        System.out.println("------------------------------------------");
        System.out.println("Data rerata usia dosen per jenis kelamin");
        System.out.println("------------------------------------------");
        System.out.println("| Rerata usia dosen pria     : " + kapasitasPria/jumlahPria);
        System.out.println("| Rerata usia dosen wanita   : " + kapasitasWanita/jumlahWanita);
        System.out.println("------------------------------------------\n");
    }

    void infoDosenPalingTua(Dosen14[] arrayOfDosen14) {

        int tertua = 0, indexTertua = 0;

        for (int i = 0; i < arrayOfDosen14.length; i++) {
            if (arrayOfDosen14[i].usia > tertua) {
                tertua = arrayOfDosen14[i].usia;
                indexTertua = i;
            }
        }

        System.out.println("------------------------------------------");
        System.out.println("Berikut adalah data dosen tertua");
        System.out.println("Kode          : " + arrayOfDosen14[indexTertua].kode);
        System.out.println("Nama          : " + arrayOfDosen14[indexTertua].nama);
        System.out.println("Jenis kelamin : " + arrayOfDosen14[indexTertua].jenisKelamin);
        System.out.println("Usia          : " + arrayOfDosen14[indexTertua].usia);
        System.out.println("------------------------------------------\n");
    }

    void infoDosenPalingMuda(Dosen14[] arrayOfDosen14) {

        int termuda = 100, indexTermuda = 0;

        for (int i = 0; i < arrayOfDosen14.length; i++) {
            if (arrayOfDosen14[i].usia < termuda) {
                termuda = arrayOfDosen14[i].usia;
                indexTermuda = i;
            }
        }

        System.out.println("------------------------------------------");
        System.out.println("Berikut adalah data dosen termuda");
        System.out.println("Kode          : " + arrayOfDosen14[indexTermuda].kode);
        System.out.println("Nama          : " + arrayOfDosen14[indexTermuda].nama);
        System.out.println("Jenis kelamin : " + arrayOfDosen14[indexTermuda].jenisKelamin);
        System.out.println("Usia          : " + arrayOfDosen14[indexTermuda].usia);
        System.out.println("------------------------------------------\n");
    }
}
