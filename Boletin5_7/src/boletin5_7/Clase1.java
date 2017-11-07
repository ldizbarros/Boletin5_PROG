package boletin5_7;

import java.util.Scanner;

public class Clase1 {
    public void superficies (int op){
        Scanner sc = new Scanner(System.in);
        final float PI = (float)3.14;
        
        switch (op){
            case 1: System.out.println("Introduce el lado del cuadrado");
                    double lado = sc.nextDouble();
                    System.out.println("Superficie del Cuadrado = "+(lado*lado));
                    break;
            case 2: System.out.println("Introduce la base del triangulo");
                    double base = sc.nextDouble();
                    System.out.println("Introduce la altura del triangulo");
                    double altura = sc.nextDouble();
                    System.out.println("Superficie del Triangulo = "+(base*altura));
                    break;
            case 3: System.out.println("Introduce el radio del circulo");
                    double radio = sc.nextDouble();
                    System.out.println("Superficie del Circulo = "+(PI*Math.pow(radio, 2)));
                    break;
            default: System.out.println("La opcion introducida no es valida");
        }
    }
}
