package day011;

public class bNumbers {
    public static void main(String[] args) {

        System.out.println("Max is "+getMax(5,30));
        System.out.println("Max is "+getMax(53,17));

        showMax(53,17);

        int kat10=10*getMax(5,10);
        System.out.println(kat10);

        int kucukSayi=getMin(17,53);
        getMin(6,4); // output olmucak.
        System.out.println("Küçük Sayı = "+kucukSayi);
        System.out.println("Küçük Sayı = "+getMin(92,53));


    }

    //Verilen iki sayıdan büyük olanı tespit eden bir metot yazınız.
    public static int getMax(int x,int y){
        int max=x;
        if (y>max){
            max=y;
        }
        return max;
    }

    public static void showMax(int a,int t){    // void oldugu geriye deger döndürmedigi için sout yazmadan output verir cagırıldıgında.
        int max=a;
        if (t>max){
            max=t;
        }
        System.out.println("Max = "+max); // sout("Max = "+getMax(x,y));
    }

    //Verilen iki sayıdan küçük olanı tespit eden metot yazınız.
    public static int getMin(int a,int b){
        int min=a;
        if (b<min){
            min=b;
        }
        return min;
    }


}
