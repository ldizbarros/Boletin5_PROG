package boletin5_5;

public class Clase1 {
    private int num1,num2,num3;
    
    public void numMaior(int num1,int num2,int num3){
        if (num1>num2){
            if (num1>num3){
                System.out.println("O numero "+num1+" e o mayor dos introducidos");
            }else{
                System.out.println("O numero "+num3+" e o mayor dos introducidos");
            }
        }else if (num2>num3){
            System.out.println("O numero "+num2+" e o mayor dos introducidos");
        }else{
            System.out.println("O numero "+num3+" e o mayor dos introducidos");
        }
    }
}
