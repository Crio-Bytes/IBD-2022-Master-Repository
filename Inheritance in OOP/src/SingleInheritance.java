class parentClass {
    public void printStatement() {
        System.out.println("Crio");
    }
}

class childClass extends parentClass {
    public void printIBD() {
        System.out.println("I believe in Doing!");
    }
}

public class SingleInheritance {
    public static void main(String[] args)
    {
        childClass obj = new childClass();
        obj.printStatement();
        obj.printIBD();
    }
}