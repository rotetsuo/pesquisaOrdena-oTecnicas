/*
    Faça um programa que:
    – Encontre o valor do maior elemento de um vetor de inteiros de tamanho n
    – o vetor deve ser informado pelo usuário.
*/

import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o tamanho do vetor: ");
            int tamanho = entrada.nextInt();
            int vetor[] = new int[tamanho]; 
            System.out.println("Digite os valores do vetor: ");
            for(int i =0; i< tamanho; i++){
                vetor[i] = entrada.nextInt();
            }

            int resultado = maiorElementoVetor(vetor, tamanho);
            System.out.println(resultado);

        entrada.close();
    }

    public static int getMaior(int valor1, int valor2) {
        if (valor1 > valor2) {
          return valor1;
        } else {
          return valor2;
        }
      }
    
      public static int maiorElementoVetor(int v[], int n) {
        if (n == 1) {
          return v[0];
        }
        return getMaior(v[n - 1], maiorElementoVetor(v, n - 1));
      }
    
}
