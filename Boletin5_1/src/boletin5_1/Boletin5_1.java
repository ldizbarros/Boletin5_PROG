package boletin5_1;

import java.util.Scanner;

public class Boletin5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un numero:");
        int num1 = sc.nextInt();

        Clase1 c1 =new Clase1();
        c1.numPositivo(num1);
    }
    
}
