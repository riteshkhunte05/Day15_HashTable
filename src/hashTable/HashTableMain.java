package hashTable;

public class HashTableMain {
	public static void main(String[] args) {
        Implementation<String, Integer> hashImpl = new Implementation();
        String message = "To be or not to be";

        
        String[] msgArray = message.toLowerCase().split(" ");

        for(String word: msgArray) {
            
            Integer value =  hashImpl.get(word);
            
            if( value == null) {
                value = 1;
            }
            else {
               
                value = value + 1;
            hashImpl.add(word , value);
        }
        System.out.println(hashImpl);
    }
}
}
