package boletin5_4;

import java.util.Scanner;

public class Boletin5_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca o nome da primeira persoa:");
        String nome1 = sc.next();
        System.out.println("Introduzca o peso primeira persoa:");
        float peso1 = sc.nextFloat();
        System.out.println("Introduzca o nome da segunda persoa:");
        String nome2 = sc.next();
        System.out.println("Introduzca o peso da segunda persoa:");
        float peso2 = sc.nextFloat();
        
        Clase1 c1 =  new Clase1();
        c1.mostrarDatos(nome1, nome2, peso1, peso2);
    }
    
}
