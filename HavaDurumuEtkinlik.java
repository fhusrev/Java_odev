package java_odev;

import java.util.Scanner;

public class HavaDurumuEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.println("Hava Sıcaklığını Giriniz : ");
        heat = input.nextInt();

        if ((heat < 5) && (-5 <= heat)) {
            System.out.println("Kayak yapabilirsiniz");

        }else if ((heat >= 5) && (15 >= heat)) {
            System.out.println("Sinemaya gidebilirsiniz");

        }else if ((heat>=15) && (25>=heat)) {
            System.out.println("Pikniğe gidebilirsiniz");

        } else if ((heat >= 25) && (35 >= heat)) {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
        else {
            System.out.println("Evde kalmanız daha iyi olacak.");
        }
    }
}