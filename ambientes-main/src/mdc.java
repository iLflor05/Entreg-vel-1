import java.util.Scanner;

public class mdc {
      public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int a,b,mdc,maior;

        mdc = 1;

        System.out.println("Maximo divisor comum de A e B");

        System.out.println("Digite o número de A: ");
        a = teclado.nextInt();
        System.out.println("Digite o número de B: ");
        b = teclado.nextInt();

        maior = a;
        if(a>b) maior=a;
        if(b>a) maior=b;

        for(int i=2; i<=maior; i++){

            while((a % i == 0) && (b % i == 0)){
                a=a/i;
                b=b/i;
                mdc=mdc*i;
            }
        }

        
        System.out.format("O MDC entre %d e %d é igual a %d", a, b, mdc );


    }
    
}
