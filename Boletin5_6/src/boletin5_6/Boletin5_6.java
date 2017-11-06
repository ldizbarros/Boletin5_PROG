package boletin5_6;

import java.util.Scanner;

public class Boletin5_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca o producto:");
        String pro = sc.next();
        System.out.println("Introduzca o venda anual:");
        int venda = sc.nextInt();
        
        Clase1 c1 =  new Clase1();
        c1.visualizarTipo(pro, venda);
    }
    
}
