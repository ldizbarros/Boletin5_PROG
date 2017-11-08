package boletin5_6;

public class Clase1 {
    private int vendaAnual;
    private String producto;
    
    public void visualizarTipo(String pro,int venda){
        if (venda<=100){
            System.out.println("O producto "+pro+" e de tipo baixo");
        }else if (venda<=500){
            System.out.println("O producto "+pro+" e de tipo medio");
        }else if(venda<=1000){
            System.out.println("O producto "+pro+" e de tipo alto");
        }else{
            System.out.println("O producto "+pro+" e de tipo primeira necesidade");
        }
    }
}
