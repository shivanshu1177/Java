class Pen {
    String colour;
    String type;

    public void printsth() {
        System.out.println("Just checking");
        
    }
    void colourpr() {
        System.out.println(this.colour);
        
    }

    void typeprint() {
        System.out.println(this.type);
        
    }
}


public class SecondClass {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.colour = "Blue";
        pen1.type = "Ball Point Pen";

        Pen pen2 = new Pen();
        pen2.colour = "Black";
        pen2.type = "Gel Pen";

        pen1.colourpr();
        pen1.typeprint();

        pen2.colourpr();
        pen2.typeprint();

        pen1.printsth();
        
    }
}
