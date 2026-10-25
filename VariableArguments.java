public class VariableArguments {
    // static int sum(int a,int b){
    //     return a+b;
    // }
    static int sum(int x ,int ...arr){
        int result = x;
        for(int a :arr){
            result += a;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Welcome to satlok");
        System.out.println("Sum 4 and 5 is = "+sum(4, 5));
        System.out.println("The sum is nothing = "+sum(1));
        System.out.println("Sum 4,5,3,9 and 2 is = "+sum(4,5,3,9,2));
    }
}
