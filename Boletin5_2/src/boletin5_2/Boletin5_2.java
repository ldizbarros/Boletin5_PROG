package boletin5_2;

import java.util.Scanner;

public class Boletin5_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un numero:");
        short num1 = sc.nextShort();
        System.out.println("Introduzca otro numero:");
        short num2 = sc.nextShort();
        
        Clase1 c1 =  new Clase1();
        c1.visualizarResta(num1, num2);
        System.out.println("Suma: "+(num1+num2));
    }
    
}
