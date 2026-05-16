package CaseMethod2;

public class RestoranRoyalDelish {

    NodePembeli headPembeli, tailPembeli;
    Pembeli pembeli = new Pembeli();

    NodePesanan headPesanan, tailPesanan;
    Pesanan pesanan = new Pesanan();

    boolean isPembeliEmpty() {
        return (headPembeli == null);
    }

    boolean isPesananEmpty() {
        return (headPesanan == null);
    }

    void tambahAntrian(Pembeli pembeli) {

        NodePembeli newNodePembeli = new NodePembeli(pembeli);

        if (isPembeliEmpty()) {
            headPembeli = newNodePembeli;
            tailPembeli = newNodePembeli;
        } else {
            newNodePembeli.prev = tailPembeli;
            tailPembeli.next = newNodePembeli;
            tailPembeli = newNodePembeli;
        }
    }

    void cetakAntrian() {
        if (isPembeliEmpty()) {
            System.out.println("\n---------------------------------------------------");
            System.out.println("| Belum ada antrian. Tidak ada yang perlu dicetak |");
            System.out.println("---------------------------------------------------");
            return;
        }

        System.out.println("\n======================");
        System.out.println("DAFTAR ANTRIAN PEMBELI");
        System.out.println("======================\n");

        System.out.printf("%-20s %-20s %-20s\n", "Nomor Antrian", "Nama", "No HP");

        NodePembeli current = headPembeli;
        while (current != null) {
            System.out.printf("%-20d %-20s %-20s\n", current.data.idx, current.data.namaPembeli, current.data.noHP);
            current = current.next;
        }
    }

    void hapusDanPesan() {
        if (isPembeliEmpty()) {
            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.println("| Mohon mengantri terlebih dahulu dengan menambahkan antrian pada menu pertama |");
            System.out.println("--------------------------------------------------------------------------------");
            return;
        }

        Pesanan pesanan = RestoranMain.inputPesanan();

        System.out.println("\n" + headPembeli.data.namaPembeli + " telah memesan " + pesanan.namaPesanan);

        if (headPembeli == tailPembeli) {
            headPembeli = tailPembeli = null;
        } else {
            headPembeli = headPembeli.next;
            headPembeli.prev = null;
        }

        NodePesanan newNodePesanan = new NodePesanan(pesanan);

        if (isPesananEmpty()) {
            headPesanan = tailPesanan = newNodePesanan;
        }
        else {
            newNodePesanan.prev = tailPesanan;
            tailPesanan.next = newNodePesanan;
            tailPesanan = newNodePesanan;
        }
    }

    void laporanPesanan() {
        if (isPesananEmpty()) {
            System.out.println("\n----------------------------------------------------------------------------------------");
            System.out.println("| Mohon memesan terlebih dahulu dengan menukar antrian dengan pesanan pada menu ketiga |");
            System.out.println("----------------------------------------------------------------------------------------");
            
            return;
        }

        System.out.println("\n======================================");
        System.out.println("| LAPORAN PESANAN (ASC NAMA PESANAN) |");
        System.out.println("======================================\n");

        System.out.printf("%-20s %-30s %-20s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        insertionSort();
    }

    void insertionSort() { // ASC NAMA PESANAN

        if (headPesanan == tailPesanan) {
            System.out.printf("%-20s %-30s %-20d\n", headPesanan.data.kodePesanan, headPesanan.data.namaPesanan, headPesanan.data.harga);
        }
        else {

            NodePesanan current = headPesanan.next;

            while (current != null) {

                NodePesanan back = current.prev;
                NodePesanan front = current.next;

                while (front != null && current.data.namaPesanan.compareToIgnoreCase(back.data.namaPesanan) > 0) {
                    back = back.prev;
                }

                if (back != current.prev) {
                    if (current.next != null) {
                        
                    }
                }
            }


        }
    }
}
