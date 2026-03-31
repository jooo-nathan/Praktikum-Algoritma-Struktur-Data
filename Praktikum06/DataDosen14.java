package Praktikum06;

public class DataDosen14 {
    Dosen14[] dataDosen = new Dosen14[10];
    int idx;

    void tambah (Dosen14 d) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = d;
            idx++;
        }
        else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil(i);
        }
    }

    void sortingASC() { // bubble sort (Kecil ke Besar)
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j-1].usia > dataDosen[j].usia) {
                    Dosen14 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = temp;
                }
            }
        }
    }

    void sortingDSC() { // insertion sort (Besar ke Kecil)
        for (int i = 1; i < idx; i++) {
            Dosen14 temp = dataDosen[i];
            int j = i - 1;

            while (j >= 0 && dataDosen[j].usia < temp.usia) {
                dataDosen[j+1] = dataDosen[j];
                j--;
            }
            dataDosen[j+1] = temp;
        }
    }

    /*void insertionSort() {

    }*/
}
