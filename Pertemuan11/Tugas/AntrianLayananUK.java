package Pertemuan11.Tugas;

public class AntrianLayananUK {
    NodeALUK head;
    NodeALUK tail;

    int front = -1;
    int rear = -1;
    int count = 0;

    MahasiswaALUK mhs = new MahasiswaALUK();

    boolean isEmpty() {
        return (head == null);
    }

    public void addQueue(MahasiswaALUK mhs) {
        NodeALUK ndInput = new NodeALUK(mhs, null);

        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
            front = rear = 0;
        }
        else {
            rear++;
            tail.next = ndInput;
            tail = ndInput;
        }
        count++;
    }

    public void callQueue() {
        if (isEmpty()) {
            System.out.println("\nTidak ada yang dapat dipanggil karena antrian masih kosong");
            return;
        }
        else {
            System.out.println("\nBerhasil memanggil mahasiswa dengan identitas :");
            print(front);

            if (head == tail) {
                head = tail = null;
            }
            else {
                head = head.next;
            }
        }
        count--;
    }

    public void print(int index) {
        if (isEmpty()) {
            System.out.println("\nTidak ada yang dapat ditampilkan karena antrian masih kosong");
            return;
        }

        NodeALUK temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data.tampilInformasi();
    }

    public void showFirst() {
        NodeALUK tmp = head;

        if (tmp != null) {
            System.out.println("\nBerikut adalah antrian terdepan");
            tmp.data.tampilInformasi();
            return;
        }
        System.out.println("\nTidak ada yang dapat ditampilkan karena antrian masih kosong");
    }

    public void showLast() {
        NodeALUK tmp = tail;
        if (tmp != null) {
            System.out.println("\nBerikut adalah antrian terakhir");
            tmp.data.tampilInformasi();
            return;
        }
        System.out.println("\nTidak ada yang dapat ditampilkan karena antrian masih kosong");
    }

    public void showCount() {
        System.out.println("\nJumlah mahasiswa yang sedang mengantri : " + count);
    }

    public void clear() {

        if (head == null) {
            System.out.println("\nTidak ada yang perlu dikosongkan karena antrian sudah kosong");
            return;
        }

        head = tail = null;
        front = rear = -1;
        count = 0;
        System.out.println("\nAntrian berhasil dikosongkan");
    }
}