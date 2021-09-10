/*
    • Faça um programa recursivo que:
    – imprima todos os elementos de um vetor de tamanho n
    – do posição n ´ 1 até a posição 0.
*/
public class Ex07 {
    public static void main(String[] args) {
        int vetor[] = new int[] { 23, 45, 67 };
        imprimeVetor(vetor, vetor.length-1);
    }

    public static void imprimeVetor(int[] vetor, int tamanho){
        if (tamanho == 0) {
            System.out.print(vetor[tamanho] + " ");
            return;
        }else{
            System.out.print(vetor[tamanho] + " ");
            imprimeVetor(vetor, tamanho - 1);
        }
    }
}
