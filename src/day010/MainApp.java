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
    }
}
