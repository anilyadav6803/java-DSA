import java.util.*;
public class elseif {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary:-");
        int salary = sc.nextInt();
       

        if(salary>500000)
        {
           System.out.println("your tax is 0");
        }

        else if(salary>500000 && salary<1000000)
        {
            System.out.println("your tax is"+(salary*0.2));
        }

        else
        {
            System.out.println("your tax is "+(salary*0.3));
        }

        sc.close();
    }      
    
}
