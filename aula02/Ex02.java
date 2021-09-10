/*
  • Crie um programa que:
    – leia dois números: a base e o expoente;
    – e apresente a potência entre esses números.
    – Obs.: utilize expoente inteiro e com valor maior ou igual a zero.
    • Exemplo:
        – f(2,3) = 8
        – f(2,4) = 16
        – f(3,2) = 9
        – f(3,4) = 81
*/
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a base:");
            int base = entrada.nextInt();
            System.out.println("Digite o expoente: ");
            int expoente = entrada.nextInt();
            int potencia = potenciaRecursiva(base, expoente);
            System.out.println(potencia);
        entrada.close();
    }

    public static int potenciaRecursiva(int base, int expoente){
        if(expoente == 0){
            return 1;
        }else{
            return base * potenciaRecursiva(base, expoente-1);
        }
    }
}
