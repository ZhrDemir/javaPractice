package week04;

import java.util.Scanner;

public class P_odev1 {
    public static void main(String[] args) {


    /*
ÖDEV SORUSU- 20230923- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
"Simdi calisma zamani tatile .. gun var" seklinde hafta sonu tatiline kac
gun kaldigini yazdirin, girilen gun hafta sonu ise "Simdi dinlenme
zamani" yazdirin.
 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen gün ismini giriniz: ");
        String day = scan.nextLine().toLowerCase();

        if (day.equals("pazartesi") || day.equals("salı") || day.equals("çarşamba") || day.equals("perşembe") || day.equals("cuma")){
            System.out.println("Şimdi çalışma zamanı "  );
        } else if (day.equals("cumartesi") || day.equals("pazar")) {
            System.out.println("Şimdi dinlenme zamanı");

        }else System.out.println("Yanlış girdiniz.");


    }
}
