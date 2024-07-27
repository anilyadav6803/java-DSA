// public class lopps{
//     public static void main(String[] args) {
//         int num=1;
//         int sum = 0;
//         while(num<=5){
//             // System.out.println("num = "+ num);
//             // num++;

//             sum = sum + num;
//             num++;
//             System.out.println("sum = "+ sum);

//         }

//     }
// }

public class lopps {
    public static void main(String[] args) {
        int n = 56789;
        int reserve = 0;
        while (n >0) {
            int lastdigit = n % 10;
            reserve = (reserve * 10) + lastdigit;
            n = n / 10;
            System.out.println(reserve);

        }

    }
}
