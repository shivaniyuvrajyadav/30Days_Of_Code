import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner (System.in);
       int T = sc.nextInt() ;
       int N = sc.nextInt(), K = sc.nextInt();
      
       int res = 0;
       int A [] = new int[N];
        
       for(int i = 0;i<N;i++){
         A[i] = sc.nextInt();
         }
        if(K < 0){
            K = K + A.length;
        }
           K %= N;
        for(int i = 0;i<N;i++){
         res = A[(i+(N-K))%N];
         System.out.print(res + " ");
        }
        System.out.println();
      


    }
}
