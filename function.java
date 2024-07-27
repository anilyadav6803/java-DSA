import java.util.*;
public class function {

    public static void hello(){
        System.out.println("anil");
        System.out.println("anil");
        System.out.println("anil");
    }


     public static void calculation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a  = sc.nextInt();
        System.out.println("Enter the value of b ");
        int b  = sc.nextInt();
        int sum = a + b ;
        System.out.println(sum);
        sc.close();
       
     }
    public static void main(String[] args) {
        hello();
        calculation();
    }
}
