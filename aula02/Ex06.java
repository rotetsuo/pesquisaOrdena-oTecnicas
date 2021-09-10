/*
    • Faça um programa recursivo que:
    – imprima todos os elementos de um vetor de tamanho n
    – da posição 0 até a posição n - 1.
*/

public class Ex06 {
    public static void main(String[] args) {
        int vetor[] = new int[] { 23, 45, 67 };
        imprimeVetor(vetor, 0);
    }

    public static void imprimeVetor(int[] vetor, int tamanho){
        if (tamanho == vetor.length-1) {
            System.out.print(vetor[tamanho] + " ");
            return;
        }else{
            System.out.print(vetor[tamanho] + " ");
            imprimeVetor(vetor, tamanho + 1);
        }
      
        
    }
}
