public class palidrom {

    public static boolean ispalidrom(String str) {
        int n = str.length();
        for(int i = 0 ; i < n ; i++){
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;

            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        String str = "npon";
        System.out.print(ispalidrom(str));

    }
}
