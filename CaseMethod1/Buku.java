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

    void tampilBuku(String kodeBuku, String judul, int tahunTerbit) {
        System.out.println("Kode : " + kodeBuku + " | Judul : " + judul + " | Tahun : " + tahunTerbit);
    }

    void kodeBukuSearching(Buku[] book, String key) {

        Boolean counter = false;
        for (int i = 0; i < book.length; i++) {
            if (key.equalsIgnoreCase(book[i].kodeBuku)) {
                tampilBuku(book[i].kodeBuku, book[i].judul, book[i].tahunTerbit);
                counter = true;
                break;
            }
        }
        if (!counter) {
            System.out.println("\nBuku tidak ditemukan!");
        }
    }
}
