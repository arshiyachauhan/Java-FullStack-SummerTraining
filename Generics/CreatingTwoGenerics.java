// creating 2 different types of generics
class Gen<T1, T2>{
    T1 name;
    T2 value;
    Gen(T1 o1, T2 o2){
        name= o1;
        value= o2;
    }
    public T1 getName(){
        return name;
    }
    public T2 getValue(){
        return value;
    }
}

public class CreatingTwoGenerics {
    public static void main(String[] args) {
        Gen <String, Integer> obj= new Gen<>("Riya", 20);
        System.out.println("Name: " + obj.getName());
        System.out.println("Value: " + obj.getValue());

        //Generic class is Type safe, bc in methods we donot declare any specific data type so it can take any value here
        Gen <Integer, String> ob= new Gen<>(20, "Rohan");
        System.out.println(ob.getName());
        System.out.println(ob.getValue());
    }
 
}
