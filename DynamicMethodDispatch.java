class phone{
    public void showtime(){
        System.out.println("time is 8 am");
    }
    public void on(){
        System.out.println("turning on phone");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("your welcome");
    }
    public void on(){
        System.out.println("turning on smartphone");
    }
}
public class DynamicMethodDispatch{
    public static void main(String[] args) {
        phone obj = new smartphone();
        obj.showtime();
        obj.on();
        // obj.music(); NOT ALLOWED

    }
}