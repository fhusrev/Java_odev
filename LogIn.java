package java_odev;
import java.util.Scanner;
public class LogIn {
    public static void main(String[] args) {

        String userName = "patika", password="java123";

        Scanner imp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız : ");
        String impUserName = imp.nextLine();

        System.out.println("Şifreniz : ");
        String impPassword = imp.nextLine();

        if (impUserName.equals(userName) ) {
            if ( impPassword.equals(password) ) {
            System.out.println("Giriş Yaptınız.");}
            else {
                System.out.println("Hatalı Şifre");
                System.out.println("Şifrenizi Yenilemek İstermisiniz ?\n(E)vet   (H)ayır");
                String event = imp.nextLine();
                if (event.equals("E")) {
                    System.out.println("Lütfen Yeni Şifreizi Giriniz : ");
                    String newPassword = imp.nextLine();
                    if ( newPassword.equals(password) || newPassword.equals(impPassword) )
                    { System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz."); }
                    else { System.out.println("Şifre Oluşturuldu"); }
                }
            }
        }
        else { System.out.println("Hatalı Kullanıcı Adı !"); }

    }
}
