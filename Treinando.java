import java.util.Scanner;

public class Treinando {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double altura, PesoIdeal;
        char sexo;
        float n = 1;
        
        System.out.println("Qual e sua altura?");
        altura = entrada.nextDouble();
        System.out.println("Qual e seu sexo? \nf.Femenino\nm.Masculino");
        sexo = entrada.next().charAt(0);
        
        if(sexo=='f'){
            PesoIdeal = (62.1 * altura) - 44.7;
        }else{
            PesoIdeal = (72.7 * altura) - 58;
        }
        
        System.out.println("Seu peso ideal é:"+PesoIdeal);
    }
}