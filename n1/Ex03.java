public class Ex03 {
    public static void main(String[] args) {
      
      
       int vetor[];
  
      vetor = new int[10];
      vetor[0] = 10;
      vetor[1] = 20;
      vetor[2] = 30;
      vetor[3] = 40;
      vetor[4] = 50;
      vetor[5] = 60;
      vetor[6] = 70;
      vetor[7] = 80;
      vetor[8] = 90;
      vetor[9] = 100;
      int n1 = 100;
      int index = 0;
      System.out.println(buscaLinear(n1, vetor, index));
  
    }
    public static int buscaLinear(int n1, int vector[], int i){
          if(vector[i] == n1){
              return i;
          }else if(i == vector.length){
              return -1;
          }else{
              return buscaLinear(n1, vector, i+1);
          }
      }
  }