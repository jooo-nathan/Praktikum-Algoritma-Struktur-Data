package Minggu5.BruteForceDivideConquer;

public class LatihanPraktikum {
    static String[][] mhs = {
        {"Ahmad", "220101001", "2022"},
        {"Budi", "220101002", "2022"},
        {"Cindy", "220101003", "2021"},
        {"Dian", "220101004", "2021"},
        {"Eko", "220101005", "2023"},
        {"Fajar", "220101006", "2020"},
        {"Gina", "220101007", "2023"},
        {"Hadi", "220101008", "2020"}
    
    };

    static int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};

    static int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

    static double highest(int nilai[], int l, int r) {
        
        int mid = (l + r) / 2;
        double highest, highestL, hightestR;


        if (r == l + 1) {
            if (nilai[l] >= nilai[r]) {
                highest = nilai[l];
            }
            else {
                highest = nilai[r];
            }
        }
        else if (r == l) {
            highest = nilai[l];
            return highest;
        }

        highestL = highest(nilai, l, mid);
        hightestR = highest(nilai, mid + 1, r);
            
        if (highestL > hightestR) {
            highest = highestL;
        }
        else {
            highest = hightestR;
        }
        
        return highest;
    }

    static double lowest(int nilai[], int l, int r) {
        
        int mid = (l + r) / 2;
        double lowest, lowestL, lowestR;


        if (r == l + 1) {
            if (nilai[l] <= nilai[r]) {
                lowest = nilai[l];
            }
            else {
                lowest = nilai[r];
            }
        }
        else if (r == l) {
            lowest = nilai[l];
            return lowest;
        }

        lowestL = lowest(nilai, l, mid);
        lowestR = lowest(nilai, mid + 1, r);
            
        if (lowestL < lowestR) {
            lowest = lowestL;
        }
        else {
            lowest = lowestR;
        }
        
        return lowest;
    }

    static double average(int nilai[]) {
        double res = 0;

        for (int i = 0; i < nilai.length; i++) {
            res += nilai[i];
        }

        return res / nilai.length;
        
    }

    public static void main(String[] args) {
        System.out.println("Nilai UTS Tertinggi : " + highest(nilaiUTS, 0, nilaiUTS.length-1));
        System.out.println("Nilai UAS Terendah : " + lowest(nilaiUTS, 0, nilaiUTS.length-1));

        System.out.println();

        System.out.println("Nilai UTS Tertinggi : " + highest(nilaiUAS, 0, nilaiUTS.length-1));
        System.out.println("Nilai UAS Terendah : " + lowest(nilaiUAS, 0, nilaiUTS.length-1));
        
        System.out.println("\n-----------------------------\n");

        System.out.println("Nilai rata-rata UAS seluruh mahasiswa : " + average(nilaiUAS) + "\n");
    }
}