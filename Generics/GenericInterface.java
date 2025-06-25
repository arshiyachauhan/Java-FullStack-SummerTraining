/* Syntax of Generic Interface
interface interface-name<T>
{
    void method-name(T t);//public abstract method
}
//using it in generic class
class class-name<T> implements public interface -name<T> {
    public void method-name(T t){
        //Write code for this method as required
    }
    
} */

// Create a simple example program where we will create a generic interface A and implement class Test. 
// Then the implementation class will implement the method of interface A to display a message

// Create a generic interface A
interface A<T> {
    void displayMsg(T t);
}

// Implementing the interface in class Test
class Test<T> implements A<T> {
    public void displayMsg(T t) {
        System.out.println("Message: " + t);
    }
}

public class GenericInterface {
    public static void main(String[] args) {
        Test<String> obj = new Test<>();
        obj.displayMsg("Hello");
    }
}
