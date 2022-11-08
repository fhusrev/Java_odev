package java_odev;
import java.util.Scanner;

public class HesapMakinesi_Case {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n1, n2;
        int select;

        System.out.println("İlk sayıyı giriniz : ");
        n1 = input.nextDouble();
        System.out.println("İkinci sayıyı giriniz : ");
        n2 = input.nextDouble();

        System.out.println("Hangi işlemi yapmak istiyorsunuz ? ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama işlemi sonucu : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma işleminin sonucu : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma işleminin sonucu : " + (n1 * n2));
                break;
            case 4:
                switch (String.valueOf(n2)) {
                    case "0.0":
                        System.out.println("Bir sayı 0'a bölünemez !");
                        break;
                    default:
                        System.out.println("Bölme işleminin sonucu : " + (n1 / n2)); }
                break;
            default:
                System.out.println("Hatalı işlem seçtiniz !");
                break;
        }


    }
}
