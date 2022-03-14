package day010;

import javax.swing.plaf.metal.MetalLookAndFeel;

public class bDortIslem {
    public static void main(String[] args) { // main methodunu jdk cagırır.

        ikiSayiyiTopla(5,7);
        ikiSayiyiTopla(10,17);   // parantez içine ARGUMENT
        ikiSayiyiTopla(23,30);
        int x=7;
        int y=10;
        ikiSayiyiTopla(x,y);
/*      float a=4;    Metodumuzda int tanımladıgımız için floatlat geçemez. byte ve short geçebilir cünkü byte 1 byte - short 2 byte - int 4 byte.
        float b=5;
        ikiSayiyiTopla(a,b);  ikiSayiyiTopla((int)a,b); --> bu kabul edilir çünkü girdigim degerin int oldgunu bildigimden dolayı manuel dönüştürdüm.*/

        int toplam2=ikiSayiyiTopla2(3,5);
        System.out.println(toplam2);
    }

    //İki tam sayıyı toplayan bir method yazınız. Sonuç ekranda "iki sayının toplamı .. " şeklinde gösterilsin.

    public static void ikiSayiyiTopla(int danteBir,int danteİki){   // methodlarımızı emir kipinde yazıyoruz.  // parantez içi PARAMETRE
        int toplam=danteBir+danteİki;
        System.out.println(String.format("İki sayının toplamı %d." ,toplam));
    }
    // { } Scope-Blok içerisinde tanımlanan değişken AYNI İSİMLE başka scopelar-bloklar içinde tanımlanamaz.

    public static int ikiSayiyiTopla2(int a,int b){   //metotla deger döndürme kücük bir örnek.
        return a+b;
    }



}
