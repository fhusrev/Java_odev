package java_odev;
import java.util.Scanner;
public class KasaProgramı {
    public static void main(String[] args) {

        // Değişkenler
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00;
        double armutKg, elmaKg, domatesKg, muzKg, patlıcanKg;
        double armutUcret, elmaUcret, domatesUcret, muzUcret, patlıcanUcret, toplam;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç kilo armut aldınız ? ");
        armutKg = input.nextDouble();
        System.out.println("Kaç kilo elma aldınız ? ");
        elmaKg = input.nextDouble();
        System.out.println("Kaç kilo domates aldınız ? ");
        domatesKg = input.nextDouble();
        System.out.println("Kaç kilo muz aldınız ? ");
        muzKg = input.nextDouble();
        System.out.println("Kaç kilo patlıcan aldınız ? ");
        patlıcanKg = input.nextDouble();

        // Hesap

        armutUcret = armutKg * armut;
        elmaUcret = elmaKg * elma;
        domatesUcret = domatesKg * domates;
        muzUcret = muzKg * muz;
        patlıcanUcret = patlıcanKg * patlıcan;
        toplam = armutUcret+elmaUcret+domatesUcret+muzUcret+patlıcanUcret;


        System.out.println("Armut : " + armutKg + " kg. Ücret : " + armutUcret );
        System.out.println("Elma : " + elmaKg + " kg. Ücret : " + elmaUcret );
        System.out.println("Domates : " + domatesKg + " kg. Ücret : " + domatesUcret );
        System.out.println("Muz : " + muzKg + " kg. Ücret : " + muzUcret );
        System.out.println("Patlıcan : " + patlıcanKg + " kg. Ücret : " + patlıcanUcret );
        System.out.println("Toplam Tutar : " + toplam + " TL");
    }
}
