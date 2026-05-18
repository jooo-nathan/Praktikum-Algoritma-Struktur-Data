package CaseMethod2;

public class RestoranRoyalDelish {

    NodePembeli headPembeli, tailPembeli;

    NodePesanan headPesanan, tailPesanan;

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

        // mulai nampilin
        NodePesanan current = headPesanan;
        while (current != null) {
            System.out.printf("%-20s %-30s %-20d\n", current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            current = current.next;
        }
    }

    void insertionSort() { // ASC NAMA PESANAN, ES TEH, ROTI, SUSU

        NodePesanan current = headPesanan.next;

        while (current != null) {

            NodePesanan back = current.prev;
            NodePesanan front = current.next;

            while (back != null && back.data.namaPesanan.compareToIgnoreCase(current.data.namaPesanan) > 0) {
                back = back.prev;
            }

            // kalo ada yg berubah
            if (back != current.prev) {

                // lepas dulu ikatan terhadap current
                if (front != null) {
                    current.next.prev = current.prev;
                }
                else {
                    tailPesanan = current.prev;
                }
                current.prev.next = current.next;

                // menyisipkan current setelah node back

                if (back == null) { // null current head --> urutan
                    current.next = headPesanan;
                    current.prev = null;
                    headPesanan.prev = current;
                    headPesanan = current;
                }
                else {
                    current.next = back.next;
                    current.prev = back;

                    if (back.next != null) {
                        back.next.prev = current;
                    }
                    else {
                        tailPesanan = current;
                    }
                    back.next = current;
                }
            }

            // lanjut nyari
            current = front;
        }
    }

    void binarySearch() {
        String key = "a";

        

        String middle;
    }
}
