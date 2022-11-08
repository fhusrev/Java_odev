package java_odev;
import java.util.Scanner;
public class DaireHesap {
    public static void main(String[] args) {

        // Değişkenler
        double pi = 3.14, aci, r, alan, cevre;

        Scanner input = new Scanner(System.in);

        System.out.println("Yarı çapı giriniz : ");
        r = input.nextDouble();
        System.out.println("Hesaplanacak açıyı giriniz : ");
        aci = input.nextDouble();

        alan = (pi*(r*r)*aci)/360;
        cevre = (2*pi*r*aci)/360;
        System.out.println(aci + "° daire diliminin alanı : " + alan);
        System.out.println(aci + "° daire diliminin çevresi : " + cevre);

    }
}
