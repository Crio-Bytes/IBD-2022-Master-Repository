class parentClass {
    public void parentName() {
        System.out.println("My name is Harry Potter");
    }
}

class firstChildClass extends parentClass {
    public void firstChildName() {
        System.out.println("My name is James Sirius Potter");
    }
}

class secondChildClass extends parentClass {
    public void secondChildName() {
        System.out.println("My name is Albus Severus Potter");
    }
}
class thirdChildClass extends parentClass {
    public void thirdChildName() {
        System.out.println("My name is Lily Luna Potter");
    }
}


public class HierarchicalInheritance {
    public static void main(String[] args)
    {
        firstChildClass obj1 = new firstChildClass();
        obj1.parentName();
        obj1.firstChildName();

        secondChildClass obj2 = new secondChildClass();
        obj2.parentName();
        obj2.secondChildName();

        thirdChildClass obj3 = new thirdChildClass();
        obj3.parentName();
        obj3.thirdChildName();

    }
}