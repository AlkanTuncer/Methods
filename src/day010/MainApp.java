package day010;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Not : ");
        int not=input.nextInt();
        if (not<0){
            System.err.println("Ders notu negatif olamaz.");
            System.exit(-1);
        }
        System.out.println("Hesaplandı.");



       // ÇARPIM TABLOSU 1'DEN 10'A KADAR
        for (int i = 1; i <=10 ; i++) {
            for (int j =1 ; j <=10 ; j++) {
                System.out.print(j+"x"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }

    }
}
