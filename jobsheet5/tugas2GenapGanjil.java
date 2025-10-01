package jobsheet5;

import java.util.Scanner;

public class tugas2GenapGanjil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        int umur = sc.nextInt();

        if (umur >= 17) {
            System.out.println("Boleh membuat KTP");
        } else {
            System.out.println("Belum boleh membuat KTP");
        }

    }
}
