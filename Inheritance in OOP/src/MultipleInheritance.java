interface fatherClass {
    public void fatherName();
}
 
interface motherClass {
    public void motherName();
}
 
interface childClass extends fatherClass, motherClass {
    public void childName();
}

class child implements childClass {
    public void fatherName() {
        System.out.println("James Potter");
    }
    public void motherName() {
        System.out.println("Lily Potter");
    }
    public void childName() {
        System.out.println("Harry Potter");
    }
}

public class MultipleInheritance {
    public static void main(String[] args)
    {
        child obj = new child();
        obj.fatherName();
        obj.motherName();
        obj.childName();
    }
}