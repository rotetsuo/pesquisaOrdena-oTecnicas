/*
    • Faça um algoritmo que:
– imprima a série de FIBONACCI até o nº termo.
– o termo deve ser passado pelo usuário.
– a série de FIBONACCI é formada pela sequência:
    -0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 . . .
• Dica:
– Faça um programa que calcule o fibonacci de um determinado número
– depois, faça a lógica para imprimir a série até o nº termo
*/
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um termo de FIBONNACI: ");
            int termo = entrada.nextInt();
            for(int i = 0; i < termo; i++){
                int resultado = fibonnaci(i);
                System.out.println(resultado);
            }
            
        entrada.close();        
    }

    public static int fibonnaci(int termo){
        if(termo == 0){
            return 0;
        }else if(termo == 1){
            return 1;
        }else{
            return fibonnaci(termo - 1) + fibonnaci(termo - 2);
        }
    }
}
