public class Quciksort {

     
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void qs(int arr[] , int si , int ei) {

        if(si>=ei){
            return ;

        }
        int Pidx = partition (arr , si ,ei );
        qs(arr, si, Pidx-1); //left
        qs(arr, Pidx+1, ei); //rigth
        
    }

    public static int partition(int arr[] , int si , int ei ) {
        int pivot = arr[ei];
        int i= si-1;

        for(int j=ei ; j<ei ; j++){
            if(arr[j] <= arr[i]){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp ; 
            }

        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp ; 
        return i ;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 7, 8, 2, 1 };
        qs(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
