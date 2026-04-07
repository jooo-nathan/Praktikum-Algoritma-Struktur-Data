package CaseMethod1;

public class Mahasiswa {
    String nim, nama, prodi;

    Mahasiswa() {

    }

    Mahasiswa(String nm, String name, String prostud) {
        nm = nim;
        name = nama;
        prostud = prodi;
    }

    void tampilMahasiswa() {
        System.out.println("NIM : " + nim + " | Nama : " + nama + " | Prodi : " + prodi);
    }

    
}
