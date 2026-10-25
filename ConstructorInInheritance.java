class base1{
    base1(){
        System.out.println("i m a constructor");
    }
    base1(int x){
        System.out.println("I am overload constructor with value of x = "+x);
    }
}

class Derived1 extends base1{
    Derived1(){
        // super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am overload constructor of derived with value of y = "+y);
    }
}
class Child_of_derived extends Derived1{
    Child_of_derived(){
        System.out.println("I am a child of derived constructor");
    }
    Child_of_derived(int x,int y,int z){
        super(x,y);
        System.out.println("I am overload constructor of derived with value of z = "+z);
    }
}
public class ConstructorInInheritance {
    public static void main(String[] args) {
        // base1 b  = new base1();
        Derived1 d = new Derived1(5,9);
        Child_of_derived cd = new Child_of_derived(12,76,3);
    }
}
