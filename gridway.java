public class gridway {

    public static int grideway(int i , int j , int m,  int n ) {

        if(i == n-1 && j == m-1 ){
            return 1;
        }
        else if(i == n || j == n ){
            return 0 ;
        }

        int w1 = grideway(i+1 , j , n , m );
        int w2 =  grideway(i , j+1 , n , m );
        return w1+w2 ;

        
    }
     
    public static void main(String[] args) {
        int n= 3 , m= 3 ;
         int gride = grideway(0,0,n,m);
        System.out.println(gride);
      
    }
    
}
