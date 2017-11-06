package boletin5_5;

import java.util.Scanner;

public class Boletin5_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un numero:");
        int num1 = sc.nextInt();
        System.out.println("Introduzca otro numero::");
        int num2 = sc.nextInt();
        System.out.println("Introduzca uno mas:");
        int num3 = sc.nextInt();
        
        Clase1 c1 =  new Clase1();
        c1.numMaior(num1,num2,num3);
    }
    
}
