package Praktikum06;

public class MahasiswaBerprestasi14 {
    Mahasiswa14[] listMhs = new Mahasiswa14[5];
    int idx;

    void tambah (Mahasiswa14 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }
        else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
    for (int i = 0; i < idx; i++) {
        listMhs[i].tampilInformasi();
        System.out.println("---------------------------------------");
    }
}

    void bubbleSort() {
    // Ganti listMhs.length menjadi idx
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa14 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < idx-1; i++) {
            int idxMin = i;

            for (int j = i+1; j < idx; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
 
            Mahasiswa14 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa14 temp = listMhs[i];
            int j = i;
            while (j < 0 && listMhs[j-1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
