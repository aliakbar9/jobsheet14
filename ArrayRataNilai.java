package jobsheet14Array1;


import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int[] nilai = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        int totalLulus = 0, Lulus = 0;
        int totalTidakLulus = 0, TidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nilai[i] >= 70) {
                totalLulus += nilai[i];
                Lulus++;
            } else {
                totalTidakLulus += nilai[i];
                TidakLulus++;
            }
        }

        double rataLulus = (Lulus > 0) ? (double) totalLulus / Lulus : 0;
        double rataTidakLulus = (TidakLulus > 0) ? (double) totalTidakLulus / TidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);

        input.close();
    }
}
