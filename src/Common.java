import java.util.HashSet;
import java.util.ArrayList;
import java.util.*;

public class Common {
    public /*static void*/ int count(String a, String b) {
        // init num_shared which will be returned
        int num_shared = 0;

        // split each string into array of characters
        char[] a_char = a.toCharArray();
        char[] b_char = b.toCharArray();

        // initialize arrayLists for both char arrays
        ArrayList<Character> a_list = new ArrayList<>();
        ArrayList<Character> b_list = new ArrayList<>();

        // convert each char array to ArrayList
        for(char charA : a_char){
            a_list.add(charA);
        }
        for(char charB : b_char){
            b_list.add(charB);
        }

        // loop through each element in a_set and see if b_set contains it
        for(int k = 0; k < a_list.size(); k += 1){
            // if both arrayLists contain the element increase count by one and remove the element
            if( b_list.contains(a_list.get(k)) ){
                num_shared += 1;
                // get index of where the shared element is and remove the element
                b_list.remove(b_list.indexOf(a_list.get(k)));
            }
        }
        //System.out.println(num_shared);
        return num_shared;
    }

    /*public static void main(String[] args){
        String a_ = "toots";
        String b_ = "stout";
        count(a_, b_);
    }*/

}