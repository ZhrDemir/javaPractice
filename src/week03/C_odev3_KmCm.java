package week03;

import java.util.Scanner;

public class C_odev3_KmCm {
    public static void main(String[] args) {

        /*
      Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
      sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
      "istediginiz birim sisteme kayitli degil" yazdirin.
 */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen km olarak mesafe giriniz:");
        double msf = scanner.nextDouble();
        System.out.println("Lütfen çevirmek istediğiniz birimi metre \"m\" veya santimetre \"cm\"  şeklinde giriniz:");
        String brm = scanner.next();
        double msf1 = msf ;

        if (brm.equalsIgnoreCase("m") ) {
           msf1 = msf1*1000;
            System.out.println(msf+" km = "+msf1+ " m");

        } else if (brm.equalsIgnoreCase( "cm")) {
            msf1 = msf1*100000;
            System.out.println(msf+" km = "+msf1+ " cm");

        }else {
            System.out.println( "istediginiz birim sisteme kayitli degil");
        }
    }
}
