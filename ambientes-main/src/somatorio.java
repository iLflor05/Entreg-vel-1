import java.util.Scanner;

public class somatorio {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float a = 0;
        float b = 0;
        float soma = 0;

        System.out.println("Digite um número: ");
        a = teclado.nextInt();
        System.out.println("Digite um número: ");
        b = teclado.nextInt();

        soma = a + b;

        System.out.format("A Soma entre %.0f e %.0f é igual a %.0f ", a, b, soma);




    }
    
}
