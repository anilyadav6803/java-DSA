
public class StringLinearSearch {

    public static int linearSearch(String[] menu, String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] menu = { "samosa", "chilli", "kachorui", "sbaji" };
        String key = "samosa";

        int index = linearSearch(menu, key);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Item found at index: " + index);
        }
    }
}

// public class string_leanier {

// public static string leanierarry(string[] menu , string key ){
// for(i=0 , i<index.length; i++){
// string menu[] = string key;
// return i ;

// }
// return -1;

// }

// public static void main(String[] args) {
// string[] menu = { "samosa" , "chilli " , "kachorui " , "sbaji"};
// string key = "samosa";

// string index = leanierarry(menu, key);

// if(index ==-1){
// System.out.println("not found ");
// }else{
// System.out.println( "arry is found "+ index);
// }

// }

// }
