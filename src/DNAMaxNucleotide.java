public class DNAMaxNucleotide {
    public /*static void*/ String max(String[] strands, String nuc) {
        // initialize index
        int index_ = -1;

        // set nuc to character
        char nuc_char = nuc.charAt(0);
        //System.out.println(nuc_char);

        // initialize max_count to 0
        int max_count = 0;

        // initialize max_length to 0
        int max_length = 0;

        // loop through each element 'e' in array
        for(int e = 0; e < strands.length; e += 1) {
            // for each element loop through each character and adjust count based on each encounter with 'nuc'
           String strand = strands[e];

           // initialize count for each strand
           int count = 0;

           for(int c = 0; c < strand.length(); c += 1){
               if(strand.charAt(c) == nuc_char){
                   count += 1;
               }
           }

            // if count > max_count overwrite max_count and store index of element 'e'
            if(count > max_count){
                max_count = count;
                index_ = e;
            }

            // if count == max_count compare current length to length of previous winner of
            // max_count
            if(count == max_count && max_count != 0){
                // if current length is bigger update index_
                if(strand.length() > strands[index_].length()) {
                    index_ = e;
                }
            }

        }

        // if index remains unchanged return empty string
        if(index_ == -1){
            return "";
            //System.out.println("none");
        } else {
            return strands[index_];
            //System.out.println(strands[index_]);
        }

    }

    /*public static void main(String[] args){
        String[] strands_ = {"agt", "aagt", "taattt", "ccatg" };
        String nuc_ = "a";
        max(strands_, nuc_);
    }*/
}
