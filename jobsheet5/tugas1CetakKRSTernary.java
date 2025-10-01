package jobsheet5;

import java.util.Scanner;

public class tugas1CetakKRSTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String hasil = (uktLunas) ? "KRS berhasil dicetak" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

        System.out.println(hasil);

    }
}
