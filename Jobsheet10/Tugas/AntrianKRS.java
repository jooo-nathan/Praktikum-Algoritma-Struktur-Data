package Jobsheet10.Tugas;

public class AntrianKRS {
    MahasiswaKRS[] data;
    int front, rear, size, max, totalProsesKRS = 0;

    //MahasiswaKRS antrianMhs = new MahasiswaKRS(30);

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new MahasiswaKRS[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isKRSFull() {
        if (size == max) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isMhsFull() {
        if (MahasiswaKRS.isFull()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void cetak2AntrianTerdepan(int iteration) {
        int j = front;

        for (int i = 0; i < iteration; i++) {

            if ((size < 2) && (i > 0)) {
                break;
            }
            System.out.println("-----------------------------------");
            System.out.println("Data antrian ke-" + (i + 1) + "\n");

            System.out.println("NIM         : " + data[j].nim);
            System.out.println("Nama        : " + data[j].nama);
            System.out.println("Prodi       : " + data[j].prodi);
            System.out.println("Kelas       : " + data[j].kelas);
            j = (j + 1) % max;
        }
    }

    public void cetakAntrianTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
            System.out.println("-----------------------------------");
            System.out.println("Data antrian ke-" + (MahasiswaKRS.totalInputMhs) + "\n");

            System.out.println("NIM         : " + data[rear].nim);
            System.out.println("Nama        : " + data[rear].nama);
            System.out.println("Prodi       : " + data[rear].prodi);
            System.out.println("Kelas       : " + data[rear].kelas);
    }

    public void kosongkanAntrian() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            MahasiswaKRS.totalInputMhs = 0;
            totalProsesKRS = 0;

            System.out.println("Antrian KRS berhasil dikosongkan!");
        }
        else {
            System.out.println("Antrian sudah kosong, tidak perlu dikosongkan kembali");
        }
    }

    public void tambahAntrian(MahasiswaKRS mhs) {
        if (isMhsFull()) {
            System.out.println("Maaf. Jumlah maksimal yang ditangani DPA sudah tercukupi, yakni sebanyak " + MahasiswaKRS.max + " mahasiswa");
            return;
        }

        if (isKRSFull()) {
            System.out.println("\nAntrian penuh, tidak dapat menambah mahasiswa");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;

        System.out.println("\n" + mhs.nama + " berhasil masuk ke antrian.");
        System.out.println("\nJumlah mahasiswa yang belum melakukan input KRS : " + (MahasiswaKRS.max - MahasiswaKRS.totalInputMhs) + " mahasiswa");
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        MahasiswaKRS mhs = data[front];
        System.out.println("KRS atas nama " + mhs.nama + " telah diproses");
        mhs.tampilkanData();

        if (size >= 2) {
            MahasiswaKRS mhs1 = data[(front + 1) % max];
            System.out.println("KRS atas nama " + mhs1.nama + " telah diproses");
            mhs1.tampilkanData();

            front = (front + 2) % max;
            size -= 2;
            totalProsesKRS += 2;
        }
        else {
            front = (front + 1) % max;
            size--;
            totalProsesKRS++;
        }
        
        System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS : " + (MahasiswaKRS.max - totalProsesKRS) + " mahasiswa");
    }

    public void tampilkanSemua() {
        int j = front;
        
        for (int i = 0; i < size; i++) {
            System.out.println(data[j].nim + " - " + data[j].nama + " - " + data[j].prodi + " - " + data[j].kelas);
            j = (j + 1) % max;
        }
    }
}