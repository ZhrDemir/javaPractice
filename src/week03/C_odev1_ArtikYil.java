package week03;

import java.util.Scanner;

public class C_odev1_ArtikYil {
    public static void main(String[] args) {

  /*
    Soru ) Interview Question
    Kullanicidan artik yil olup olmadigini kontrol
    etmek icin yil girmesini isteyin.
    Kural 1: 4 ile bolunen yillar artik yildir
    Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
    Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen artık yıl olup olmadığını kontrol etmek için bir yıl giriniz");
        int sene = scan.nextInt();

        if (sene % 4 == 0) {
            if (!(sene % 100 == 0)) {
                System.out.println("Girdiğiniz yıl ARTIK YIL");

            } else if (sene % 400 == 0) {
                System.out.println("Girdiğiniz yıl ARTIK YIL");

            } else {
                System.out.println("Girdiğiniz yıl Artık Yıl değildir.");
            }
        }
        System.out.println("****************************");

        String numdays ;
        System.out.println(numdays= (sene%4==0 && !(sene%100==0) || sene%400==0)?"Girdiğiniz yıl artık yıl subat 29 gün ":"Artık yıl değil şubat 28 gün çeker.");





    }
}