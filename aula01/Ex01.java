/*
    Crie um programa que peça um número inteiro ao usuário e retorne a
    soma de todos os números de 1 até o número que o usuário digitou.
    – 1 + 2 + 3 + . . . + n
    – Obs.: Crie um método para realizar a soma
*/
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro e retornarei a soma de todos os númors de 1 até o número digitado: ");
        int numero = entrada.nextInt();
        int resultado = somatorio(numero);
        System.out.println(resultado);
        entrada.close();
    }
    
    public static int somatorio(int numero){
        int resultadoAuxiliar = 0;
        int numeroTotal = numero;
        for(int i =0; i <= numeroTotal; i++){
            resultadoAuxiliar+= i;
        }
        return resultadoAuxiliar;
    }
}


