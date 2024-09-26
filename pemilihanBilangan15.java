import java.util.Scanner;

public class pemilihanBilangan15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        String hasil;

        System.out.println("Masukkan bilangan: ");
        bilangan = sc.nextInt();

        hasil = (bilangan % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println("Angka: " + bilangan + " adalah " + hasil);       
    }
} 
