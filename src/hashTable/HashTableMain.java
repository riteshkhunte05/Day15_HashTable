package hashTable;

public class HashTableMain {
    public static void main(String[] args) {
        Implementation<String, Integer> hashImpl = new Implementation();
        String message = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";

        //Split the words when a white space comes up.
        //Convert all the words in lowercase
        String[] msgArray = message.toLowerCase().split(" ");

        for(String word: msgArray) {
            //Search for the word in the linked list
            Integer value =  hashImpl.get(word);
            //If not found, frequency of the word StayWith 1
            if( value == null)
                value = 1;
            else
                //If found, frequency of the word increases by 1
                value = value + 1;
            hashImpl.add(word , value);
        }
        System.out.println(hashImpl);
    }
}