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

        // make a hashset for each array of characters, excluding ' '
        HashSet<Character> a_set = new HashSet<>();
        for(char i : a_char){
            if(i != ' ') {
                a_set.add(i);
            }
        }
        HashSet<Character> b_set = new HashSet<>();
        for(char k : b_char){
            if(k != ' ') {
                b_set.add(k);
            }
        }

        // initialize arrayLists for both HashSets
        ArrayList<Character> a_list = new ArrayList<>();
        ArrayList<Character> b_list = new ArrayList<>();

        // convert each HashSet to ArrayList
        for(char charA : a_set){
            a_list.add(charA);
        }
        for(char charB : b_set){
            b_list.add(charB);
        }

        // loop through each element in a_set and see if b_set contains it
        for(char k : a_list){
            // if both arrayLists contain the element increase count by one
            if( b_list.contains(k) ){
                num_shared += 1;
            }
        }
        //System.out.println(num_shared);
        return num_shared;
    }

    /*public static void main(String[] args){
        String a_ = "horse";
        String b_ = "moose";
        count(a_, b_);
    }*/

}