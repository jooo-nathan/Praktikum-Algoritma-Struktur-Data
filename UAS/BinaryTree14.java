package UAS;

public class BinaryTree14 {
    Node14 root;

    BinaryTree14() {
        root = null;
    }

    boolean isEmpty() {
        return (root == null);
    }

    void add(Mahasiswa14 mahasiswa) {
        Node14 newNode = new Node14(mahasiswa);

        if (isEmpty()) {
            root = newNode;
        }
        else {
            Node14 current = root;
            Node14 parent = null;

            while (true) {
                parent = current;

                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;

                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                else {
                    current = current.right;

                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                    
                }
            }
        }
    }


/* 
    Node14 cari3IPKTertinggi() {
        Node14 current = root;
        int counter = 0;
        double ipkTertinggi = current.mahasiswa.ipk;

        while (current != null) {
            if (current.mahasiswa.ipk >= ipkTertinggi) {
                counter++;

                current.mahasiswa.tampilInformasi();

                if (counter == 3) {
                    break;
                }
            }
            else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            }
            else {
                current = current.left;
            }
        }
        return current;
    }
*/
    

    void cariBerdasarkanNama(String nama) {
        if (traversePreOrder(root, nama)) {
            return;
        }
        else {
            System.out.println("\nNama tidak ditemukan!\n");
        }

    }

    boolean traversePreOrder(Node14 node, String nama) {
        Node14 current = node;

        if (current != null) {

            if (current.mahasiswa.nama.equalsIgnoreCase(nama)) {
                System.out.println();
                current.mahasiswa.tampilInformasi();
                return true;
            }
            else {
                traversePreOrder(current.left, nama);
                traversePreOrder(current.right, nama);
            }
        }
        return false;
    }

    /*
    void traversePreOrder(Node14 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
        */

            //  BEEEEEEEELLLLLLLLLUUUUUUUUUUUMMMMMMMMMM SELESAIIIIIIIIIIIIIIIIIIIII
       
       void cari3IPKTertinggi() {
        if (isEmpty()) {
            System.out.println("Tree masih kosong.");
            return;
        }

        Node14 current = root;
        int counter = 0;

        if (current == null) {
            System.out.println("Tidak ada mahasiswa.");
        }
        else {
            if (current.right != null) {
                if (current.right.right != null) {
                    if (current.right.right != null) {}
                        current.mahasiswa.tampilInformasi();
                        current.right.mahasiswa.tampilInformasi();
                        current.right.right.mahasiswa.tampilInformasi();
                        counter++;
                    }
                    current.mahasiswa.tampilInformasi();
                    current.right.mahasiswa.tampilInformasi();
                    counter++;
                }
            current.mahasiswa.tampilInformasi();
            counter++;
        }

        current = root;

        if (counter < 1) {
            root.mahasiswa.tampilInformasi();
        }
        else if (counter < 2) {
            root.left.mahasiswa.tampilInformasi();
        }
        else if (counter < 3) {
            root.left.mahasiswa.tampilInformasi();
            root.left.left.mahasiswa.tampilInformasi();
        }
    }

    void cariBerdasarkanKelas(String kelas) {
        if (traversePreOrderKelas(root, kelas)) {
            return;
        }
        System.out.println("\nKelas tidak ditemukan!\n");
    }
    
    boolean traversePreOrderKelas(Node14 node, String kelas) {
        Node14 current = node;

        if (current != null) {

            if (current.mahasiswa.kelas.equalsIgnoreCase(kelas)) {
                System.out.println();
                current.mahasiswa.tampilInformasi();
            }
            else {
                traversePreOrderKelas(current.left, kelas);
                traversePreOrderKelas(current.right, kelas);
            }

            return true;
        }
        return false;
    }

    /*
    void traverseInOrder(Node14 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node14 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    void cariipktertinggi() {
        Node14 successorParent = root;
        
        if (successorParent != null) {
            successorParent.mahasiswa.tampilInformasi();

            if (successorParent.left != null) {
                successorParent.left.mahasiswa.tampilInformasi();
            }
            if (successorParent.right != null) {
                successorParent.right.mahasiswa.tampilInformasi();
            }
        }
        else {
            System.out.println("Tidak ada data mahasiswa.");
        }
    }
    
    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        // cari node (current) yang akan dihapus
        Node14 parent = root;
        Node14 current = root;

        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            }
            else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            }
            else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        // PENGHAPUSAN
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }
        else {
            // jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                }
                else {
                    if (isLeftChild) {
                        parent.left = null;
                    }
                    else {
                        parent.right = null;
                    }
                }
            }
            else if (current.left == null) { // jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                }
                else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    }
                    else {
                        parent.right = current.right;
                    }
                }
            }
            else if (current.right == null) { // jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                }
                else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    }
                    else {
                        parent.right = current.left;
                    }
                }
            }
            else { // jika punya 2 anak
                Node14 successor = getSuccessor(current);
                
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();

                if (current == root) {
                    root = successor;
                }
                else {
                    if (isLeftChild) {
                        parent.left = successor;
                    }
                    else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    // LATIHAN PRAKTIKUM -----------------------------------------------------------------------------------------

    // MODIFIKASI NOMOR 1

    void addRekursif(Node14 current, Mahasiswa14 mahasiswa) { // menambahkan node dengan rekursif

        if (isEmpty()) {
            root = new Node14(mahasiswa);
            return;
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) { // kalau ipk yg mau diinput lebih kecil dari ipk saat ini
            if (current.left == null) {
                current.left = new Node14(mahasiswa);
            }
            else {
                addRekursif(current.left, mahasiswa);
            }
        }
        else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            if (current.right == null) {
                current.right = new Node14(mahasiswa);
            }
            else {
                addRekursif(current.right, mahasiswa);
            }
        }
    }

    // MODIFIKASI NOMOR 2

    Node14 cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree masih kosong.");
            return null;
        }

        Node14 current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    Node14 cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree masih kosong.");
            return null;
        }

        Node14 current = root;

        while (current.right != null) {
            current = current.right;
        }

        return current;
    }

    // MODIFIKASI NOMOR 3

    void tampilMahasiswaIPKdiAtas(double ipkBatas, Node14 current) {

        if (isEmpty()) {
            System.out.println("Tree masih kosong.");
            return;
        }

        if (current != null) {

            tampilMahasiswaIPKdiAtas(ipkBatas, current.left);

            if (current.mahasiswa.ipk > ipkBatas) {
                current.mahasiswa.tampilInformasi();
            }
            
            tampilMahasiswaIPKdiAtas(ipkBatas, current.right);
        }
    }*/
}
