/**
 * • Desenvolva um programa que calcule o fatorial de um número inteiro
 *   não negativo fornecido pelo usuário.
 * 
 * 
 */
import java.util.Scanner;
public class Ex01{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um número inteiro não negativo:");
            int n1 = entrada.nextInt();
            int resultado = fatorial(n1);
            System.out.println(resultado);
        entrada.close();
    }

    public static int fatorial(int n1){
        if(n1 == 0){
            return 1;
        }else{
            return n1 * fatorial(n1-1); 
        }
    }
}