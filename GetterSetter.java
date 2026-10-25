class My_Employee{
    private int id;
    private String name;

   public String getName(){
    return name;
   }

   public void setName(String n){
    name = n;
   }

   public void setId(int i){
    this.id = i;
   }
   public int getID(){
    return id;
   }
   
}
public class GetterSetter {
    public static void main(String[] args) {
        My_Employee harry = new My_Employee();
        harry.setName("Codewithharry");  
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getID());
    }
}