package CaseMethod2;

public class NodePesanan {
    NodePesanan next, prev;
    Pesanan data;
    
    NodePesanan(Pesanan data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
