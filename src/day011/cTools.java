package day011;

public class cTools {
    public static void main(String[] args) {

        int aHiz=60;
        int aSure=3;
        int mesafe=calculateDistance(aHiz,aSure);
        System.out.println(String.format("A aracı %d km yol aldı.",mesafe)); //System.out.println("A aracı "+adistance+" km yol aldı.");

        System.out.println("5'in karesi = "+kareAl(5));
        int result=kuvvetAl(2,6);
        System.out.println("Result = "+result);

        System.out.println("86 F -->"+convertFahrenheitToCelsius(86)+" C");
        System.out.println("30 C -->"+convertCelsiusToFahrenheit(30)+" F");

        int f=60;
        System.out.println(String.format("%d F --> %5.1f C",f,convertFahrenheitToCelsius(60)));
        convertFahrenheitToCelsius(95.8);
    }

    // Mesafe hesaplayan bir metot yazınız.
    public static int calculateDistance(int speed,int time){
        int distance=speed*time;
        return distance;
    }

    // Bir sayının kuvvetini alan metot yazınız.
    public static int kareAl(int sayi){
        return sayi*sayi;
    }

    public static int kuvvetAl(int sayi, int us){

        int carpim=1;
        for (int i= 0;  i< us; i++) {
            carpim *=sayi;  // carpim=carpim*sayi
        }
        return carpim;
    }


    // Sıcaklı Dönüşümü için metot tasarlayınız.
    // C * 1.8 + 32 = F    (F-32)/1.8 = C       //Metot overload konusunu gördügümüz için böyle yaptık yoksa int tanımlamaya gerek yok sadece double yazılır. CelToFah gibi.
    public static double convertFahrenheitToCelsius(int grade){
        return (grade-32)/1.8;
    }
    public static double convertFahrenheitToCelsius(double grade) {
        return (grade-32)/1.8;
    }

    public static double convertCelsiusToFahrenheit(double grade){
        return grade*1.8+32;
    }

}
