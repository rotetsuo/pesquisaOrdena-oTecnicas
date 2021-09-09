/*
    Faça um programa recursivo que faça a soma dos números de m a n em
    que m < n.
        – Exemplos:
            - soma de 5 a 10 = 45 - > 5 + 6 + 7 + 8 + 9 + 10 = 45
            - soma de 2 a 5 = 14 - > 2 + 3 + 4 +5 = 14
            - soma de 3 a 4 = 7 - > 3 + 4 = 7
*/

import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o primeiro algarismo: ");
            int n1 = entrada.nextInt();
            System.out.println("Digite o segundo algarismo: ");
            int n2 = entrada.nextInt();
            int resultadoSoma = somaRecursiva(n1, n2);
            System.out.println(resultadoSoma);
        entrada.close();
    }

    public static int somaRecursiva(int n1, int n2){
        if(n1 < n2){
            return n1 + somaRecursiva(n1+1, n2);
        }else{
            return n2;
        }
    } 
}
