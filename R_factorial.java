public class R_factorial {

    public static int  facttorial(int n ){

        if(n==0){
           return 1 ; 
        }
        int fnm  = facttorial(n-1);
        int fn = n * facttorial(n-1);
        return fn ;
    }
    public static void main(String[] args) {
        int n = 5;

        System.err.println(facttorial(n));
    }
}
