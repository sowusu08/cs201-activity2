import java.util.HashSet;

public class SandwichBar {
    public int /*static void*/ whichOrder(String[] available, String[] orders){
        // convert 'available' to set
        HashSet<String> available_set = new HashSet<>();
        for(String a : available){
            available_set.add(a);
        }

        // initialize variable to store index that will be returned
        int index_ = -1;

        // loop through each order in 'orders'
        for(int k = 0; k < orders.length; k += 1){
            // make a copy of the 'available_set' to avoid altering it
            HashSet<String> avail_copy = new HashSet<>(available_set);

            // convert an element in 'orders' to array that describes one 'order'
            // (an array where each element is an ingredient for the indexed order)
            // String[] order = orders[k].split(" ");

            // initialize set to store an order
            HashSet<String> order_set = new HashSet<>();

            // store each element of 'order' array in set
            for(String o : orders[k].split(" ")/*order*/){
                order_set.add(o);
            }
            //System.out.println(order_set);

            // store length of unaltered order_set
            int len_order = order_set.size();

            // get intersection of all elements in 'available_set' that are in 'order_set'
            avail_copy.retainAll(order_set);

            // if length of intersection equals original length of 'order_set' return index of the order, 'k'
            // and stop searching through orders
            if(avail_copy.size() == len_order){
                index_ = k;
                break;
            }

        }

        return index_;
        //System.out.println(index_);
    }

    /*public static void main(String[] args) {
        String[] available_ = { "cheese", "mustard", "lettuce" };
        String[] orders_ = { "cheese ham", "cheese mustard lettuce", "ketchup", "beer" };

        whichOrder(available_, orders_);
    }*/
}