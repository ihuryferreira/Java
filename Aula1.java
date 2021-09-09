import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        Scanner codigo = new Scanner(System.in);
        int num = 0;
        int num2 = 0;
        int soma = 0;
        
        System.out.println("Digite o primeiro número: ");
        num = codigo.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = codigo.nextInt();
        
        soma = num + num2;
        
        System.out.println("A soma dos dois números é: "+ soma);
    }
    
}
