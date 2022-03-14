package day010;

public class KisaTekrar {
    public static void main(String[] args) {
        //Değişken Tanımlama
        //Resmi - Gayrıresmi kurallar
        //Notasyonlar : Camel - Pascal - Snake
        //Sınıf tanımlamaları PASCAL NOTASYONU ile : KisaTekrar
        //Değişken ve method tanımlamaları CAMEL NOTASYONU ile : birinciSayi
        //Constantlar SNAKE NOTASYONU ile : PI_SAYISI
        int birinciSayi=5;

        //OPERATÖRLER
        // Aritmetik Operatörler : + , - , * , / , %
        // Relational Ops : == , != , < , > , >= , <=
        // Logical Ops : & , | , !   --> & And , | Or , !
        int ikinciSayi=7;
        if (birinciSayi>ikinciSayi&ikinciSayi>=0){   // false & true 'dan false geldi ve elseden sonraki kısım çalıştı.
            System.out.println("İşlem Geçerli");
        }else{
            System.out.println("İşlem Geçersiz");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+" . Merhaba");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        int sayac=1;  // 1'den 5'e kadar olan sayıların toplamı.
        int toplam=0;
        while (sayac<=5){
            toplam=toplam+sayac;
            sayac++;
        }
        System.out.println("Toplam = "+toplam);

        do {
            //statements;
        }while (sayac<=5);
    }
}
