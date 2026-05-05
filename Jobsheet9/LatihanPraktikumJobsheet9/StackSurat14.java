

public class StackSurat14 {

    Surat14[] stack;

    int size, top;

    StackSurat14(int size) {
        this.size = size;
        stack = new Surat14[size];
        top = -1;
    }

    Boolean isFull() {
        if (top == size - 1) {
            return true;
        }
        else {
            return false;
        }
    }

    Boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    boolean push(Surat14 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            return true;
        }
        else {
            System.out.println("\nStack penuh! Tidak bisa menambahkan surat lagi.");
            return false;
        }
    }

    Surat14 pop() {
        if (!isEmpty()) {
            Surat14 s = stack[top];
            top--;
            return s;
        }
        else {
            System.out.println("\nStack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    void print() {
        if (!isEmpty()) {
            System.out.println("\nBerikut adalah identitas surat terakhir\n");

            System.out.println("ID Surat          : " + stack[top].idSurat);
            System.out.println("Nama Mahasiswa    : " + stack[top].namaMahasiswa);
            System.out.println("Kelas             : " + stack[top].kelas);
            System.out.println("Jenis Izin (I/S)  : " + stack[top].jenisIzin);
            System.out.println("Durasi            : " + stack[top].durasi);
        }
        else {
            System.out.println("\nStack kosong! Tidak ada surat untuk ditampilkan.");
        }
    }

    void sequentialSearch(String key) {

        boolean found = false;

        for (int i = 0; i <= top; i++) {
            if (key.equalsIgnoreCase(stack[i].namaMahasiswa)) {
                System.out.println("\nSurat ditemukan!\nBerikut adalah data lengkapnya.\n");

                System.out.println("ID Surat          : " + stack[i].idSurat);
                System.out.println("Nama Mahasiswa    : " + stack[i].namaMahasiswa);
                System.out.println("Kelas             : " + stack[i].kelas);
                System.out.println("Jenis Izin (I/S)  : " + stack[i].jenisIzin);
                System.out.println("Durasi            : " + stack[i].durasi);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nSurat tidak ditemukan!\nPastikan anda menuliskan nama dengan benar.");    
        }
        
    }
}
