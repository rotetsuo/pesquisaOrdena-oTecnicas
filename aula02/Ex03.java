/*
    • Escreva uma função recursiva conforme abaixo:
    – função(a,b) = ?
        - 0 -> se b = 0
        - a -> se b = 1
        - a + função(a, b-1) -> para os demais valores de b
    • Faça a execução dessa função com diversos valores e identifique qual o
    objetivo da mesma.

*/
public class Ex03 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int resultado = funcaoMisteriosa(a,b);
        System.out.println(resultado);
    }    

    public static int funcaoMisteriosa(int a, int b){
        if( b == 0){
            return 0;
        }else if(b == 1){
            return a;
        }else{
            return a + funcaoMisteriosa(a, b-1);
        }
    }
}

/*
    O objetivo da função é somar o valor de a por ele mesmo b vezes
*/

