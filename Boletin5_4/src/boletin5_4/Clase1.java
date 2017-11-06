package boletin5_4;

public class Clase1 {
    private String nome;
    private float peso;
    
    public void mostrarDatos(String nome1,String nome2,float peso1,float peso2){
        if (peso1>peso2){
            System.out.println("Nome: "+nome1+" Peso: "+peso1);
            System.out.println("DIferencia: "+(peso1-peso2));
        }
        else{
            System.out.println("Nome: "+nome2+" Peso: "+peso2);
            System.out.println("DIferencia: "+(peso2-peso1));
        }
    }
}
