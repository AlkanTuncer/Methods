package day011;

import java.time.LocalDateTime;
import java.util.Scanner;

public class aMethods2 {
    public static void main(String[] args) {
        int sayi1=5;
        System.out.println(sayi1+" tek mi? "+tekMi(sayi1));
        System.out.println("6 tek mi? "+tekMi(6));
        System.out.println("53 tek mi? "+tekMi(53));


        Scanner input=new Scanner(System.in);
        System.out.print("Doğum Yılınız : ");
        int dYil= input.nextInt();
        System.out.print("Aktif Yıl : ");
        int aktifYil=input.nextInt(); // int=aktifYil=LocalDateTime.now().getYear(); yaparsak aktif yıl localden alınır. Üst satıra gerek kalmaz.

        System.out.println("Yaşınız --> "+calculateAge(dYil,aktifYil));
    }

    //Bir sayının tek olup olmadığını test eden bir metot yazınız.   Sonuc true or false olucagı için boolean kullanılır.
    public static boolean tekMi(int sayi) {
        boolean result=(sayi%2)==1;
        return result;
    }

    //Kişinin kaç yaşında oldugunu hesaplayan bir metot yazınız.
    public static int calculateAge(int birthYear,int currentYear){
        int age=currentYear-birthYear;
        return age;
    }


}
