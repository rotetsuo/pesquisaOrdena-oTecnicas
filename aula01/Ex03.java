/*
    • Faça um programa recursivo que verifique se uma palavra é palíndromo.
        – Exemplo: ovo, ana, abba, 010010
        – faça uma função que retorne true caso a palavra seja palíndromo.

*/

public class Ex03 {
    public static void main(String[] args) {
        String word = "11";
        System.out.println(verificaPalindromo(word, word.length()));
        
    }

    public static boolean verificaPalindromo(String palavra, int size){
        if (size == 1) {
            return true;
          }
      
          if (palavra.charAt(palavra.length() - size) != palavra.charAt(size - 1)) {
            return false;
          }
      
          return verificaPalindromo(palavra, size - 1);
    }
}
