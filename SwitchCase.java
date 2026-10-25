import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        int age;
        System.out.print("ENTER YOUR AGE = ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("become adult");
                break;
            case 23:
            System.out.println("join job");
                break;
            case 68:
            System.out.println("already experienced");
            break;
            default:
                System.out.println("enjoy your life");
            
        }

        if (age>56) {
            System.out.println("you are experienced");
        }
        else if(age>46){
            System.out.println("u r semi-experince");
        }
        else if(age>36){
            System.out.println("u r semi-semi-experience");
        }
        else{
            System.out.println("u r not experience");
        }

    }
}
