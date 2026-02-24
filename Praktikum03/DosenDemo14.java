package Praktikum03;

public class DosenDemo14 {
    public static void main(String[] args) {

        Dosen14[] arrayOfDosen14 = new Dosen14[3];

        for (int i = 0; i < 3; i++) {
            arrayOfDosen14[i] = new Dosen14();
            arrayOfDosen14[i].addData(i);
        }

        int i = 0;

        for (Dosen14 dosen14 : arrayOfDosen14) {
            dosen14.showData(i);
            i++;
        }


        // BATAS TUGAS NOMOR 2 BATAS TUGAS NOMOR 2 BATAS TUGAS NOMOR 2 BATAS TUGAS NOMOR 2 BATAS TUGAS NOMOR 2 BATAS TUGAS NOMOR 2
        System.out.println("\n-------------------------------------------------------------------------------------------------\n");
        // BATAS TUGAS NOMOR 2 BATAS TUGAS NOMOR 2 BATAS TUGAS NOMOR 2 BATAS TUGAS NOMOR 2 BATAS TUGAS NOMOR 2 BATAS TUGAS NOMOR 2


        DataDosen14 dataDosenCaller = new DataDosen14();

        dataDosenCaller.dataSemuaDosen(arrayOfDosen14);

        dataDosenCaller.jumlahDosenPerJenisKelamin(arrayOfDosen14);

        dataDosenCaller.rerataUsiaDosenPerJenisKelamin(arrayOfDosen14);

        dataDosenCaller.infoDosenPalingTua(arrayOfDosen14);

        dataDosenCaller.infoDosenPalingMuda(arrayOfDosen14);

    }
}
