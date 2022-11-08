package java_odev;
import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {

        // Değişkenler
        double boy, kilo, endeks;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Boyunuzu Giriniz (m) : ");
        boy = input.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz (kg) : ");
        kilo = input.nextDouble();

        // Hesap
        endeks = kilo / ( boy * boy );
        System.out.println("Boyunuz : " + boy);
        System.out.println("Kilonuz : " +kilo);
        System.out.println("Vucut Kitle Endeksiniz : " + endeks);
    }
}
