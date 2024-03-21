public class ordenacao2 {
    public static void main (String[] args){
        int[] vetor = new int [19];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }
        System.out.println("Desordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i] + " ");
        }
        quicksort(vetor, 0, vetor.length - 1);

        System.out.println("Ordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i] + " ");
        }



}
static void quicksort(int[] vetor, int esquerda, int direita){
        if (esquerda < direita){
            int p = particao(vetor, esquerda, direita);
            quicksort(vetor, esquerda, p);
            quicksort(vetor, p + 1, direita);
        }
}
static int particao(int[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        int pivot = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while(true){
            do{
                i++;
            }while(vetor[i] < pivot);
            do{
                j --;
            }while(vetor[j] > pivot);
            if (i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
}

    

}
