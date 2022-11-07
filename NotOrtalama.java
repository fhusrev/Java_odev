package java_odev;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {

        // Değişkenler
        int mat, fiz, kim, tr, tar;

        // Scanner sınıfı
        Scanner imp = new Scanner(System.in);

        // Kullanıcıdan değerleri
        System.out.println("Matematik Notunuz : ");
        mat = imp.nextInt();

        System.out.println("Fzik Notunuz : ");
        fiz = imp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kim = imp.nextInt();

        System.out.println("Türkçe Notunuz : ");
        tr = imp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tar = imp.nextInt();

        // Hesaplama
        int toplam = (mat + fiz + kim + tr + tar);
        double ortalama = toplam / 5.0;
        // Ondalık sayı hanesi
        DecimalFormat df2 = new DecimalFormat(".00");
        System.out.println("Not Ortalamanız : " + df2.format(ortalama));

        String durum = ortalama >= 60 ? "Geçti" : "Kaldı";
        System.out.println(durum);
    }
}
