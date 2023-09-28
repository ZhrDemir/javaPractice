package week04;

import java.util.Scanner;

public class P02_hesapMak {
    public static void main(String[] args) {


        // Basit bir hesap makinesi oluşturun

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen işlem yapmak için 1. sayıyı girin:  ");
        double sayi1= scan.nextDouble();

        System.out.print("Lütfen işlem yapmak için 2. sayıyı girin:  ");
        double sayi2= scan.nextDouble();


        System.out.println("***********İŞLEMİNİZİ SEÇİNİZ***********");
        System.out.println("1.TOPLAMA");
        System.out.println("2.ÇIKARMA");
        System.out.println("3.ÇARPMA");
        System.out.println("4.BÖLME");
        int secim = scan.nextInt();


        if (secim==1){
            System.out.println("Toplama işleminin sonucu = " + (sayi1 + sayi2));

        } else if (secim==2){
            System.out.println("Çıkarma işleminin sonucu = " + (sayi1 - sayi2));

        }else if(secim==3) {
            System.out.println("Çarpma işleminin sonucu = " + (sayi1 * sayi2));

        } else if (secim==4){
            System.out.println("Bölme işleminin sonucu = " + (sayi1 / sayi2));

        }else {
            System.out.println("Yanlış giriş yaptınız.");
        }

    }
}
