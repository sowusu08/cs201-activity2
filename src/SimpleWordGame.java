import java.util.HashSet;

public class SimpleWordGame {
    public int points(String[] player,
                      String[] dictionary) {
        // initialize String HashSet to store player's unique words
        HashSet<String> player_set = new HashSet<>();
        // initialize String HashSet to store dictionary
        HashSet<String> dict_set = new HashSet<>();

        // loop through player array and add each String to initialized player_set HashSet
        for(String p : player){
            player_set.add(p);
        }

        // loop through dictionary array and add each String to initialized dict_set HashSet
        for(String d : dictionary){
            dict_set.add(d);
        }

        // Update player_set to be intersection of player_set and dict_set
        player_set.retainAll(dict_set);

        // initialize score variable which will be returned
        int score = 0;

        /* loop through each word remaining in player_set and
        calculate score as sum of squares of each word's length*/
        for(String w : player_set){
            score += Math.pow(w.length(), 2);
        }

        // return player's score
        return score;
    }
}
