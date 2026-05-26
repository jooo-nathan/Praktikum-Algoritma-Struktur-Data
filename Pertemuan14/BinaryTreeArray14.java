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

    // -------------------------------------------------------------------------------------------

    // MODIFIKASI NOMOR 4

    void add(Mahasiswa14 data) {

        int index = 0;

        while (index < dataMahasiswa.length) {
            if (dataMahasiswa[index] == null) {
                dataMahasiswa[index] = data;

                if (index > idxLast) {
                    idxLast = index;
                }
            
                return;
            }

            if (data.ipk < dataMahasiswa[index].ipk) {
                index = 2 * index + 1;
            }
            else {
                index = 2 * index + 2;
            }
        }

        System.out.println("Gagal menambahkan data karena kapasitas tree array sudah penuh.");
    }

    void traversePreOrder() {
        traversePreOrderHelper(0);
    }

    void traversePreOrderHelper(int idxStart) {
        if (idxStart <= idxLast) {

            if (dataMahasiswa[idxStart] != null) {
                
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrderHelper(2* idxStart + 1);
                traversePreOrderHelper(2 * idxStart + 2);
            }
        }
    }
}
