public class reverseofarray {

    public static void reverseArray(int[] number) {
        int first = 0;
        int last = number.length - 1;

        while (first < last) {
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int number[] = {3,4,5,6,20};

        reverseArray(number);

        System.out.print("The reversed array is ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " "); // Correctly print the array element at index i
        }
    }
}
