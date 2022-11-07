package java_odev;

import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {

        // Değişkenler
        double a, b, c, x, alan;

        Scanner input = new Scanner(System.in);

        System.out.println("1.Kenar Uzunluğunu Giriniz : ");
        a = input.nextInt();
        System.out.println("2.Kenar Uzunluğunu Giriniz : ");
        b = input.nextInt();
        System.out.println("3.Kenar Uzunluğunu Giriniz : ");
        c = input.nextInt();

        // Hesap
        x = (a+b+c)/2;
        alan = Math.sqrt(x*(x-a)*(x-b)*(x-c));

        System.out.println("1.Kenar Uzunluğu : " + a);
        System.out.println("2.Kenar Uzunluğu : " + b);
        System.out.println("3.Kenar Uzunluğu : " + c);
        System.out.println("Üçgenin Alanı : " + alan);



    }
}
