package week06;

public class P05_yıldızlıBaklava_null {
    public static void main(String[] args) {

/*
 Yıldızlar (*) ile baklava deseni oluşturabileceğiniz bir kod yazınız.
        Sonuç böyle olmalıdır;

               *
              * *
             * * *
            * * * *
           * * * * *
            * * * *
             * * *
              * *
               *


           şeklini konsola yazdiriniz.
 */
        int toplam = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <9 ; j++) {
                if (i+j ==4){
                    System.out.print("   *");
                    if (i+j == 6){
                        System.out.print("   * *");
                        if (i+j==8){
                            System.out.print("  * * *");
                            if (i+j==10){
                                System.out.print(" * * * *");
                                if (i+j==12){
                                    System.out.print("* * * * *");
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("");
        }
    }
}
