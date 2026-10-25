public class MethodOverloading {
    static void foo(){
        System.out.println("god morning bro");
    }
    static void foo(int a){
        System.out.println("God morning " + a + " bro"); // "a" parameter ha
    }
    
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void telljoke(){
        System.out.println("i invented a new word");
    }
    public static void main(String[] args) {
        telljoke();
        
        //----CHANGING THE INTEGER-----
        int x = 45;
        change(x);
        System.out.println("The value of x change is done = "+x);

        // ------CHANGING THE ARRAY-------
        int [] marks = {52,73,77,89,98,94};
        change2(marks);
        System.out.println("The value of x after change done = "+marks[0]);

        // -------METHOD OVERLOADING-------
        foo();
        foo(3000); // 3000 argument ha and arguments are actual
    }
}

