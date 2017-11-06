package boletin5_3;

public class Clase1 {
    private int num1;
    
    public void visualizarNum(int num1){
        if(num1==0){
            System.out.println("0");
        }
        else if (num1>0){
            System.out.println("+");
        }
        else{
            System.out.println("-");
        }
    }
}
