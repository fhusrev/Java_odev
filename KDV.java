package java_odev;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        // Değişkenler
        double fiyat, kdv18 = 0.18, kdv8 = 0.08, kdv, toplam, kdvOran;

        Scanner input = new Scanner(System.in);
        System.out.println("Fiyat Giriniz : ");
        fiyat = input.nextDouble();

        // Ondalık sayı hanesi
        DecimalFormat df2 = new DecimalFormat(".00");

        kdvOran = fiyat > 0 && fiyat <= 1000 ? kdv18 : kdv8;
        kdv = fiyat * kdvOran;
        toplam = fiyat + kdv;

        System.out.println("Ürün Fiyatı : " + df2.format(fiyat));
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV : " + df2.format(kdv));
        System.out.println("TOPLAM : " + df2.format(toplam));


    }
}
