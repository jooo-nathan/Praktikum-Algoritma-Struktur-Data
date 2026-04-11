package CaseMethod1;

public class Buku {
    String kodeBuku, judul;
    int tahunTerbit;

    Buku() {

    }

    Buku(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul =  judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilBuku() {
        System.out.println("Kode : " + kodeBuku + " | Judul : " + judul + " | Tahun : " + tahunTerbit);
    }
}
