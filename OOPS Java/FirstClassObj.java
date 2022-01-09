class Person{
    //instance variables
    String name;
    int age;


    //Classes can contain

    //1. DAta
    //2. Methods
    void speak(){
        System.out.println("Hello");
    }
}

public class FirstClassObj {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe";
        person1.age  = 10;
        person1.speak();

        System.out.println(person1.name);
        
    }
}
