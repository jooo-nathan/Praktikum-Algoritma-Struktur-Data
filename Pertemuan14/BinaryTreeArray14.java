package Pertemuan14;

public class BinaryTreeArray14 {
    Mahasiswa14[] dataMahasiswa;
    int idxLast;

    BinaryTreeArray14() {
        this.dataMahasiswa = new Mahasiswa14[10];
    }

    void populateData(Mahasiswa14 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}
