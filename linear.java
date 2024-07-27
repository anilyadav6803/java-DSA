public class linear {

    public static int linearserch(int num[], int key) {
        for (int i = 0; i <= num.length; i++) {
            if (num[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 6, 8, 10, 12, 14 };
        int key = 8;

        System.out.println(linearserch(num, key));
        if (key == -1) {
            System.out.println("not found num");
        } else {
            System.out.println("found it");
        }
    }
}
