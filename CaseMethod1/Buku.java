package CaseMethod1;

public class Buku {
    String kodeBuku, judul;
    int tahunTerbit;

    Buku() {

    }

    Buku(String kode, String jdl, int thn) {
        kodeBuku = kode;
        judul =  jdl;
        tahunTerbit = thn;
    }

    void tampilBuku() {
        System.out.println("Kode : " + kodeBuku + " | Judul : " + judul + " | Tahun : " + tahunTerbit);
    }
}
