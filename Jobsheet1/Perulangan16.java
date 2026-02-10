package Jobsheet1;

import java.util.Scanner;

public class Perulangan16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = 36; // NIM : 254107020036
        long nim = 0;

        System.out.print("Masukkan NIM anda : ");
        nim = sc.nextLong();

        long n = nim % 100;

        if (n < 10) {
            n += 10;
        }

        System.out.println();
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            } else if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            else {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

}
