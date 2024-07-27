//import java.util.*;
public class star {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int stars = sc.nextInt();
        int i;
        int j;
        for(i=1;i<=4;i++){
            for(j=1;j<=4-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
