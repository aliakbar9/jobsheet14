package jobsheet14Array1;

import java.util.Scanner;

public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
            if(nilaiMhs[i] > 70 ){
                jumlahLulus++;
            }
        }for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
            if (nilaiMhs[i] < 70 ){
                jumlahTidakLulus++;
            }
        } 
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai lulus= " + rata2);
        System.out.println("Rata - rata nilai yang tidak lulus = " + rata2);

        // System.out.println("Jumlah mahasiswa yang lulus = " + jumlahLulus);
    }
}
