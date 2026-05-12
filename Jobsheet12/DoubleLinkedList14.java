package Jobsheet12;

public class DoubleLinkedList14 {
    Node14 head, tail;

    DoubleLinkedList14() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void addFirst(Mahasiswa14 data) {
        Node14 newNode = new Node14(data);

        if (isEmpty()) {
            head = tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Mahasiswa14 data) {
        Node14 newNode = new Node14(data);

        if (isEmpty()) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAfter(String keyNIM, Mahasiswa14 data) {
        Node14 current = head;

        while (current != null && !current.data.nim.equals(keyNIM)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNIM + " tidak ditemukan.");
            return;
        }

        Node14 newNode = new Node14(data);

        // jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        }
        else { // node baru disisipkan di tengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Data berhasil disisipkan setelah NIM " + keyNIM);
    }

    void add(Mahasiswa14 data, int index) {

    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        
        Node14 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        
        Node14 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    void removeFirst() {

    }

    void removeLast() {

    }

    void search() { // null ?

    }
}
