public class Sum_natural_number {

    public static int calsum(int n ) {
        if(n==1){
            return 1 ;

        }
        int snm = (n-1);
        int sn = n + snm ;
        return sn ;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(calsum(n));
    }
}
