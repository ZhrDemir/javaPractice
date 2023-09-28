package week03;

import java.util.Scanner;

public class C_odev2VizeFinal {
    public static void main(String[] args) {

 /*
Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
 Yıl sonu notunu vizeler %40 final % 60 olacak şekilde hesaplayıp
 Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler!
 50'den küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız
 Ad:
 Soyad:
 1.Vize:
 2. Vize:
 Final :
 Yıl Sonu Notu:
 Ders Durumu :
  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk vize notunuzu girin");
        double vize1 = scan.nextDouble();
        System.out.println("Lütfen ikinci vize notunuzu girin");
        double vize2 = scan.nextDouble();
        System.out.println("Lütfen final notunuzu girin");
        double final1 = scan.nextDouble();

        double yilSonuNot = 0;
        yilSonuNot = (vize1 + vize2) / 2 * (0.4) + final1 * (0.60);

        System.out.println("Lütfen adınızı girin");
        String isim = scan.next();

        System.out.println("Lütfen soy isminizi girin");
        String soyad = scan.next();

        System.out.println("Ad: " + isim.toUpperCase());
        System.out.println("Soyadı : " + soyad.toUpperCase());
        System.out.println("1.Vize: " + vize1);
        System.out.println("2.Vize: " + vize2);
        System.out.println("Final: " + final1);
        System.out.println("Yıl Sonu Notu: " + yilSonuNot);
        System.out.print("Ders Durumu: ");
        if (yilSonuNot >= 50) {
            System.out.print("Geçtiniz Tebrikler ");
        } else {
            System.out.print("Maalesef Kaldınız");
        }
    }
}
