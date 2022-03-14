package day010;

public class aMethodsIntro {
    public static void main(String[] args) {  // main methodu programın baslangıc noktası.
        // public - access modifier > erişim belirteci
        // static - sonranın konusu şimdilik hep static yazıcaz.
        // void - bu methodun bir deger döndürmeyecegini ifade ediyor.

/*      int x1=3;
        int x2=5;
        int toplam1=x1+x2;
        System.out.println("Toplam1 = "+toplam1);*/

        topla(3,5); // burdaki parantez içine ARGUMENTS denir. Cagırırken argüments
        topla(9,7);
        topla(53,53);

        int x3=9;
        int x4=7;
        int toplam2=x3+x4;
        System.out.println("Toplam = "+toplam2);

    }

    // Methodlar class içinde yazılır.

    public static void topla(int x,int y){   // Parantez içine PARAMETRE denir. Tanımlarken parametre
        int toplam=x+y;
        System.out.println("Toplam = "+toplam);
    }

}
