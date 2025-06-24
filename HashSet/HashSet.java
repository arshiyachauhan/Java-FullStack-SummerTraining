//SYNTAX- HashSet<DataType> hashSetNmae= new HashSet<>();
import java.util.HashSet;
import java.util.Iterator;
public class HashSetIntro {
    public static void main(String[] args) {
        HashSet<String> fruits= new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("grapes");
        fruits.add("litchi");
        
        boolean isapple= fruits.contains("apple");
        System.out.println(isapple);
        System.out.println(fruits.size());

        fruits.remove("grapes");
        // clear()- removes all elements from this set

        //iterating elements
        for(String fruit: fruits){
            System.out.println(fruit);
        }


        //Iterator can be used for iterating elements in the collection 
        Iterator<String> it= fruits.iterator();
        while(it.hasNext()){
            String fruit= it.next();
            System.out.println(fruit);
        }

    }
}
