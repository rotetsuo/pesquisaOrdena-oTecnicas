/*
    Construa um programa que:
    – monte um vetor de inteiros com n posições (tamanho definido pelo usuário)
    – inicie cada elemento com um valor digitado pelo usuário.
    – desenvolva uma função recursiva que retorne a soma dos elementos do vetor.
    – Dica: use um parâmetro inteiro para servir de “contador” para o índice do vetor.
*/
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        int tamanho = entrada.nextInt();
        int vetor[];
        vetor = new int[tamanho];
        System.out.println("Digite o valor:");
        for(int i =0; i< tamanho; i++){
            vetor[i] = entrada.nextInt();
        }
        int somaResultado = somaVetorRecursiva(vetor, tamanho-1);
        System.out.println(somaResultado);
        
        entrada.close();
    }

    public static int somaVetorRecursiva(int[] vetor, int tamanho){
        if(tamanho == 0){
            return vetor[0];
        }else{
            return vetor[tamanho] + somaVetorRecursiva(vetor, tamanho-1);
        }
    }
}
