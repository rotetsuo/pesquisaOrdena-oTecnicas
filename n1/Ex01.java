
public class Ex01 {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(comb(n, k));
    }

    public static int comb(int n1, int n2){
        if(n2 == 1){
            return n2;
        }else if(n2 == n1){
            return 1;
        }else{
            return comb(n1-1, n2-1) + comb(n1-1, n2);
        }
    }
}
