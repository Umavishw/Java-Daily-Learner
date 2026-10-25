class Employee{
    int id;
    String name;
    int salary;
    public void Print_details(){
        System.out.println("My id is = "+id);
        System.out.println("My name is = "+name);
    }

    public int getsalary(){
        return salary;
    }
}
public class FirstcodeOOPS {
    public static void main(String[] args) {
        System.out.println("This is custom class");
        Employee harry = new Employee(); // New employee object
        Employee Uma = new Employee();

        //Setting Attributes for harry
        harry.id = 12;
        harry.salary = 25;
        harry.name = "codewithharry";

        //Setting Attributes for uma
        Uma.id = 17;
        Uma.salary = 50;
        Uma.name = "umasingh";

    // Printing the attributes;
        // System.out.println(harry.id);
        // System.out.println(harry.name);

        harry.Print_details(); //shortcut  to print details
        Uma.Print_details();
        int salary = Uma.getsalary();
        System.out.println("My salary is = "+salary);
    }
}