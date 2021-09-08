import java.util.HashSet;
public class Common {
    public int count (String a, String b) {
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

        // loop through each set and manually find shared characters
        // init array which will contain shared letters
        char[] shared = new char[a.length()];

        // compare each char in a_set to each char in b_set
        for(char s : a_set){
            current_letter = a_set[s];

        }

        // get intersection of hashsets
        // return length of intersection

        // convert HashSet to array
        return 0;
    }
}