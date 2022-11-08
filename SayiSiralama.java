package java_odev;
import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {

        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("1.Sayıyı Giriniz : ");
        a = input.nextInt();
        System.out.println("2.Sayıyı Giriniz : ");
        b = input.nextInt();
        System.out.println("3.Sayıyı Giriniz : ");
        c = input.nextInt();

        if ( a == b || a == c || b == c ) {
            System.out.println("Aynı sayı girdiniz !");
        } else {
            if ((a < b) && (a < c)) {
                if (b < c) {
                    System.out.println("1.Sayı < 2.Sayı < 3.Sayı");
                } else {
                    System.out.println("1.Sayı < 3.Sayı < 2.Sayı");
                }
            } else if ((b < a) && (b < c)) {
                if (a < c) {
                    System.out.println("2.Sayı < 1.Sayı < 3.Sayı");
                } else {
                    System.out.println("2.Sayı < 3.Sayı < 1.Sayı");
                }
            } else {
                if (a < b) {
                    System.out.println("3.Sayı < 1.Sayı < 2.Sayı");
                } else {
                    System.out.println("3.Sayı < 2.Sayı < 1.Sayı");
                }
            }
        }
    }
}
