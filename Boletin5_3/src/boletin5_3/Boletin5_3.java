package boletin5_3;

import java.util.Scanner;

public class Boletin5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un numero:");
        int num1 = sc.nextInt();
        
        Clase1 c1 =  new Clase1();
        c1.visualizarNum(num1);
    }
    
}
