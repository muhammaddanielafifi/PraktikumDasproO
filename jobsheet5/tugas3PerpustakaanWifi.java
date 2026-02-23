package jobsheet5;

import java.util.Scanner;

public class tugas3PerpustakaanWifi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("apakah membawa kartu mahasiswa? (true/false): ");
        boolean kartuMhs = scanner.nextBoolean();

        System.out.print("apakah sudah melakukan registrasi online? (true/false): ");
        boolean registrasiOnline = scanner.nextBoolean();
        
        if (kartuMhs || registrasiOnline){
            System.out.println("Anda boleh masuk");
        }else{
            System.out.println("Anda ditolak masuk");
        }
    }
}