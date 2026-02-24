package Praktikum03;

public class DosenDemo14 {
    public static void main(String[] args) {
        Dosen14[] arrayOfDosen14 = new Dosen14[3];

        for (int i = 0; i < 3; i++) {
            arrayOfDosen14[i] = new Dosen14();
            arrayOfDosen14[i].addData(i);
        }

        int i = 0;

        for (Dosen14 dosen14 : arrayOfDosen14) {
            arrayOfDosen14[i].showData(i);
            i++;
        }

    }
}
