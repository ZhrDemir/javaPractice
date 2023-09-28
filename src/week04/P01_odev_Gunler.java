package week04;

import java.util.Scanner;

public class P01_odev_Gunler {

    public static void main(String[] args) {


            Scanner scanner=new Scanner(System.in);
            System.out.println("Lutfen gun ismini giriniz.");
            String dayname= scanner.nextLine().toLowerCase();

            switch (dayname){
                case "pazartesi":
                    System.out.println("Simdi calisma zamani tatile 5 gun var.");
                    break;
                case "sali":
                    System.out.println("Simdi calisma zamani tatile 4 gun var.");
                    break;
                case "carsamba":
                    System.out.println("Simdi calisma zamani tatile 3 gun var.");
                    break;
                case "persembe":
                    System.out.println("Simdi calisma zamani tatile 2 gun var.");
                    break;
                case "cuma":
                    System.out.println("Simdi calisma zamani tatile 1 gun var.");
                    break;
                case "cumartesi":
                    System.out.println("Simdi dinlenme zamani.");
                    break;
                case "pazar":
                    System.out.println("Simdi dinlenme zamani.");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz.");
                    break;
            }

        }
    }




