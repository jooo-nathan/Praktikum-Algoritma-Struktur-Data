package Pertemuan14;

public class BinaryTreeMain14 {
    public static void main(String[] args) {
        
        BinaryTree14 bat = new BinaryTree14();
        
        bat.add(new Mahasiswa14("244160121", "Ali", "A", 3.57));
        bat.add(new Mahasiswa14("244160221", "Badar", "B", 3.85));
        bat.add(new Mahasiswa14("244160185", "Candra", "C", 3.21));
        bat.add(new Mahasiswa14("244160220", "Dewi", "B", 3.54));
        
        System.out.println("\nDaftar semua mahasiswa (is order traversal) : ");
        bat.traverseInOrder(bat.root);

        System.out.println("\nPencarian data mahasiswa : ");
        System.out.print("Cari mahasiswa dengan IPK : 3.54 : ");
        String hasilCari = bat.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan IPK : 3.22 : ");
        hasilCari = bat.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bat.add(new Mahasiswa14("244160131", "Devi", "A", 3.72));
        bat.add(new Mahasiswa14("244160205", "Ehsan", "D", 3.37));
        bat.add(new Mahasiswa14("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa : ");
        System.out.println("InOrder Traversal : ");
        bat.traverseInOrder(bat.root);
        System.out.println("\nPreOrder Traversal : ");
        bat.traversePreOrder(bat.root);
        System.out.println("\nPostOrder Traversal : ");
        bat.traversePostOrder(bat.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bat.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal)");
        bat.traverseInOrder(bat.root);
        
    }
}
