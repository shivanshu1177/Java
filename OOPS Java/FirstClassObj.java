class Person{
    //instance variables
    String name;
    int age;


    //Classes can contain

    //1. DAta
    //2. Methods
}

public class FirstClassObj {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe";
        person1.age  = 10;

        System.out.println(person1.name);
        
    }
}
