class parentClass {
    public void printName() {
        System.out.println("My name is James Potter");
    }
}

class childClass extends parentClass {
    public void printChildName() {
        System.out.println("My name is Harry Potter");
    }
}

class secondChilClass extends childClass {
    public void printGrandChildName() {
        System.out.println("My name is James Sirius Potter");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args)
    {
        secondChilClass obj = new secondChilClass();
        obj.printName(); //printing father name
        obj.printChildName(); //printing my name
        obj.printGrandChildName(); //printing child name
    }
}