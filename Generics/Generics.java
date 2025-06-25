//Generics- helps to declare multiple data types using a single class/method, also called diamond notation, not able to work with primitive data types(like int,long)
class Gen <T>
{
    T ob;//an obj of type T
    Gen(T o){//Constructor
        ob= o;
    }
    public T getobj(){//returns the generic type
        return ob;
    }
}

public class Generics {
    public static void main(String[] args) {
        //passing the data type here with its value
        Gen <Integer> iob= new Gen<>(100); //instance of Integer type Gen class
        int x= iob.getobj();
        System.out.println(x);
        Gen <String> sob= new Gen<>("Hello");//instance of String type Gen class
        String str=sob.getobj();
        System.out.println(str);
    }
}
