public class Ex02 {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        System.out.println(alg5(n, k));
    }

    public static int alg5(int n1, int n2){
        if(n1 == 0){
            return 0;
        }else{
            return alg5(n1-1, n2) + n2;
        }
    }
}