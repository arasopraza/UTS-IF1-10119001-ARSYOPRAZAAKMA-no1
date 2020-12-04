/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program menghitung umur
 * yang dinput oleh user
 */

import java.util.Calendar;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Age age = new Age(Calendar.getInstance().get(Calendar.YEAR));
        Scanner scanner;

        System.out.print("Masukkan tahun lahir anda : ");
        scanner = new Scanner(System.in);
        age.setYearBirth(scanner.nextInt());
        System.out.println("\n");
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
}
