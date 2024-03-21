import java.util.Scanner;

public class primos {
    public static void main(String[] args){
        
        Scanner teclado  = new Scanner(System.in);

        int numero = 0, cont = 0;

        System.out.println("Digite um numero para ver se é primo: ");
        numero = teclado.nextInt();

        for(int i=1; i<=numero; i++){
            if(numero % i == 0){
                cont++;
            }
        }

        if(cont == 2){
            System.out.println("O número "+numero+" É primo");
        }else{
            System.out.println("O número "+numero+" Não é primo");
        }
    }
    
}
