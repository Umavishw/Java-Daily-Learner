class My_Employee{
    private int id;
    private String name;

    public My_Employee(){
        id = 44;
        name = "Your name here";
    }

    public String getname(){ return name;}
    public void setname(String n){this.name = n;}
    public void setId(int i){this.id = i;}
    public int getID(){ return id;}
}
public class Constructor {
    public static void main(String[] args) {
        My_Employee uma = new My_Employee();
        System.out.println(uma.getID());
        System.out.println(uma.getname());
    }
}
