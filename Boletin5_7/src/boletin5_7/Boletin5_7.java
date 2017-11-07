package boletin5_7;

import java.util.Scanner;

public class Boletin5_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clase1 c1 = new Clase1();
        
        System.out.println("****** MENU ******");
        System.out.println("1)CUADRADO \n2)TRIANGULO \n3)CIRCULO");
        System.out.println("Elige una opcion");
        int op = sc.nextInt();
        c1.superficies(op);
    }
    
}
