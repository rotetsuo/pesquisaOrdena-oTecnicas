/*
    Faça um função recursiva que converta um número na base 10 para a
    base 2.
    – Método: divisões sucessivas
    – Divisor: número 2
    – Parar quando: quociente for igual a zero
        ¨ 1ª divisão: 23/2 = 11 (resto 1)
        ¨ 2ª divisão: 11/2 = 5 (resto 1)
        ¨ 3ª divisão: 5/2 = 2 (resto 1)
        ¨ 4ª divisão: 2/2 = 1 (resto 0)
        ¨ 5ª divisão: 1/2 = 0 (resto 1)
    • Terminada a divisão, pegaremos os restos das divisões na ordem inversa
    (1 0 1 1 1).
    – Exemplo: 23 = 10111
*/

public class Ex09 {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(conversorBinario(numero));
    }

    public static String conversorBinario(int valor){
        if (valor > 0) {
            int resto = valor % 2;
            return conversorBinario(valor / 2) + "" + resto;
        }else{
            return "";
        }
    }
}
