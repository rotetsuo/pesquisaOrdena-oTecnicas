/*
    • Faça um programa recursivo que:
    – imprima todos os elementos de um vetor de tamanho n
    – da posição 0 até a posição n - 1.
*/

public class Ex06 {
    public static void main(String[] args) {
        int vetor[] = new int[] { 23, 45, 67 };
        imprimeVetor(vetor, vetor.length-1);
    }

    public static void imprimeVetor(int[] vetor, int tamanho){
        if (tamanho == 0) {
            System.out.print(vetor[0] + " ");
            return;
        }else{
            System.out.print(vetor[tamanho] + " ");
            imprimeVetor(vetor, tamanho - 1);
        }
      
        
    }
}
