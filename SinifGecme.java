package java_odev;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {


        int mat, fiz, kim, tr, muz;


        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fzik Notunuz : ");
        fiz = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kim = inp.nextInt();

        System.out.println("Türkçe Notunuz : ");
        tr = inp.nextInt();

        System.out.println("Müzik Notunuz : ");
        muz = inp.nextInt();

        int i = 0, toplam = 0;
        if (mat<=100 && mat>=0) {
            i++;
            toplam +=  mat;
        }
        if (fiz<=100 && fiz>=0) {
            i = i + 1;
            toplam += fiz;
        }
        if (kim<=100 && kim>=0) {
            i = i +1;
            toplam += kim;
        }
        if (tr<=100 && tr>=0) {
            i = i + 1;
            toplam += tr;
        }
        if (muz<=100 && muz>=0) {
            i = i + 1;
            toplam += muz;
        }

        double average = toplam / i;
        System.out.println("Not Ortalamanız : " + average);

        if (average<55) System.out.println("Sınıfta kaldınız. Seneye tekrar görüşmek üzere");
        else System.out.println("Tebrikler. Sınıfı Geçtiniz");
    }
}
