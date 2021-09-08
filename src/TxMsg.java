public class TxMsg {
    // create helper method to evaluate a word for all vowels
    public static boolean allVowels(String word){
        /*
        Returns whether or not a word contains all vowels or not

        Params
        -----
        word : String
            word to be evaluated

        Returns
        ------
        eval : boolean
            true if the word contains only vowels
            false if the word contains consonants
        */

        // initialize eval variable
        boolean eval = true;

        // loop through each char in string and evaluate if vowel or not
        for(int k = 0; k < word.length(); k += 1){
            // get char
            char letter = word.charAt(k);

            // if the letter is a vowel move on to next letter; notice for characters we use single quotes
            if(letter == 'a' | letter == 'e' | letter == 'i' | letter == 'o' | letter == 'u'){
              //System.out.println(letter+" is a vowel");
              //continue;
            }
            // if letter is a consonant update eval variable and stop entire loop
            else {
               eval = false;
               break;
            }
        }

        // return results
        return eval;
    }

    public static String dropConsonants(String word){
        /*
        Takes a word with consonants and (a) removes vowels then
        (b) only returns consonants that don't have another
        consonant right before them.

        Params
        ------
        word : String
            word to be evaluated

        Returns
        ------
        eval_word : String
            edited word only containing consonants that don't
            have another consonant right before them
        */

        String eval_word = "";
        

        return eval_word;
    }

    public String getMessage(String original) {
        /* split original message into words so each word can be analyzed
        and store in String array */
        String[] words = original.split(" ");

        /* loop through each word in the array
        so each word can be analyzed */
        for(int i = 0; i < words.length; i += 1){
            // get a word
            String word = words[i];

            // split the word into array of characters
            // char[] split_word = word.toCharArray();

            // if the word contains only vowels do not edit it and move unto next word
            if(allVowels(word) == true) {
                continue;
            }
            else {
                /* if the word doesn't contain only vowels

                */
                // System.out.println(word+" doens't contain only vowels");

            }

            // store the first letter in the word
            char first = word.charAt(0);
            // initialize indicator for all vowels
            boolean all_vowels = true;

            // loop through each letter in the word
            for(int k = 0; k < word.length(); k += 1){
                // if the first letter is a vowel move on

            }



        }

        return "hello";
    }


    public static void main(String[] args) {
        // test allVowels
        // System.out.println(allVowels("aeiou"));

        String[] words = {"aeiou", "hi"};
        for(int i = 0; i < words.length; i += 1) {
            // get a word
            String word = words[i];

            // split the word into array of characters
            // char[] split_word = word.toCharArray();

            // if the word contains only vowels do not edit it and move unto next word
            if (allVowels(word) == true) {
                continue;
            }

            // otherwise
            System.out.println(word + " doens't contain only vowels");
        }

    }

}