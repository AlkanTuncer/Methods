package day011;

/**
 * Metotların overload edilmesi  -- Aynı isimle birden fazla metot yazılabilmesi
 */

public class dCalculator {
    public static void main(String[] args) {
        topla(4,4);
        topla(4.5,5.3);
        double topla=topla(4.7,4);
        System.out.println("Toplam = "+topla);

        System.out.println("Çıkarma Sonucu = "+cikar(20,3));
        System.out.println(String.format("%5.2f",cikar(6.4,1.1)));

        int result=carp(10,5);
        System.out.println("Result = "+result);
        System.out.println(carp(10.3,5));

        System.out.println("Bölme sonucu =" +bol(300,15));


    }
    // Parantez içindeki parametre tipleri ve/veya parametre adetlerinin birbirinden farklı olması metotların imzasının farklı olmasıdır.
    // metotların imzaları farklı olursa aynı isimle istenildigi kadar metot yazılabilir. METOTLARIN OVERLOAD edilmesi durumudur.
                                                                                        // Aşırı yükleme

    public static int topla(int x,int y){
        return x+y;
    }

    public static double topla(double x,double y){
        return x+y;
    }

    public static int cikar(int x,int y){
        return x-y;
    }

    public static double cikar(double x,double y){
        return x-y;
    }

    public static int carp (int x,int y){
        return x*y;
    }

    public static double carp(double x,double y){
        return x*y;
    }

    public static int bol(int x,int y){
        return x/y;
    }

    public static double bol(double x,double y){
        return x/y;
    }

}
