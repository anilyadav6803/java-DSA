public class binerysearch {

    public static int binarys(int numbers[] , int key){
        int start  = 0;
          int end = numbers.length-1;

        
        while(start <= end){
        int mid = (start+end)/2;
        if(numbers[mid] == key){
            return mid;
        }
        if(numbers[mid] < key){
            start=mid+1;

        }else
        {
            end = mid-1;
        }
     }
return-1;

    }

    public static void main(String[] args) {
        int numbers[]= {2,4,5,6,8,10,12};
        int key = 5;

        if(binarys(numbers, key)!=-1){
            System.out.println( "the value is found "+ binarys(numbers, key));
        }else {
            System.out.println( "the value is not found");
        }

    }

}
