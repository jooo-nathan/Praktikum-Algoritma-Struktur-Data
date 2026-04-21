package Jobsheet9;

public class StackTugasMahasiswa14 {
    Mahasiswa14[] stack;

    int size, top;

    StackTugasMahasiswa14(int size) {
        this.size = size;
        stack = new Mahasiswa14[size];
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

    void push(Mahasiswa14 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        }
        else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    Mahasiswa14 pop() {
        if (!isEmpty()) {
            Mahasiswa14 m = stack[top];
            top--;
            return m;
        }
        else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    Mahasiswa14 peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println();
    }
}
