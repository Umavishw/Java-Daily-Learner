public class Loops {
    public static void main(String[] args) {
        System.out.println("WHILE LOOP");
        int i = 100;
        while (i <= 200) {
            System.out.println(i);
            i++;
        }

    System.out.println("DO WHILE LOOP");
    int i = 1;
    do {
        System.out.println(i);
        i++;
    } while(i<5);

    System.out.println("FOR LOOP");
    for (int i=1;i<=3; i++){
        System.out.println(i);
    }

    System.out.println("QUESTION"); // 2n for even no.
                                        //2n+1 for odd no.
    int n = 5;                   
    for (int i = 0; i<5;i++){
        System.out.println(2*i+1);
    }

    System.out.println("DECREMENT LOOP");
    for(int i = 10; i>0;i--){
        System.out.println(i);
    }
    }
}
