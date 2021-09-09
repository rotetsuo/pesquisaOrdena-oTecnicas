/*
    Com recusividade crie um programa que peça um número inteiro ao usuário e retorne a
    soma de todos os números de 1 até o número que o usuário digitou.
        – 1 + 2 + 3 + . . . + n = ?
*/
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Recursivo -> Digite um número inteiro e retornarei a soma de todos os númors de 1 até o número digitado: ");
        int numero = entrada.nextInt();
        int resultado = somaRecursiva(numero);
        System.out.println(resultado);
        entrada.close();
    }

    public static int somaRecursiva(int numero){
        if(numero == 1){
            return 1;
        }else{
            return (numero + somaRecursiva(numero - 1));
        }
    }
}

/*
n= 5
soma = 5 + 4 + 3 + 2 + 1
n = 4
soma = 4 + 3 + 2 + 1
n = 3 
soma = 3 + 2 + 1
n = 2
soma = 2 + 1
n = 1
soma = 1
ele + ele mesmo - 1

*/