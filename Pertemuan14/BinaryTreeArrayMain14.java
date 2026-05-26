package Pertemuan14;

public class BinaryTreeArrayMain14 {
    public static void main(String[] args) {
        BinaryTreeArray14 bta = new BinaryTreeArray14();

        Mahasiswa14 mhs1 = new Mahasiswa14("244160131", "Devi", "A", 3.72);
        Mahasiswa14 mhs2 = new Mahasiswa14("244160221", "Badar", "B", 3.85);
        Mahasiswa14 mhs3 = new Mahasiswa14("244160185", "Candra", "C", 3.21);
        Mahasiswa14 mhs4 = new Mahasiswa14("244160220", "Dewi", "B", 3.54);
        
        Mahasiswa14 mhs5 = new Mahasiswa14("244160131", "Devi", "A", 3.72);
        Mahasiswa14 mhs6 = new Mahasiswa14("244160205", "Ehsan", "D", 3.37);
        Mahasiswa14 mhs7 = new Mahasiswa14("244160170", "Fizi", "B", 3.46);
    
        Mahasiswa14[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;

        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInOrder Traversal Mahasiswa : ");
        bta.traverseInOrder(0);
    }
}
