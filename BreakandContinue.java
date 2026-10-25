public class BreakandContinue{
    public static void main(String[] args) {
      for (int i = 0;i<=6;i++){
            System.out.println(i);
            System.out.println("great kabir");
            if(i==2){
                System.out.println("end");
                break;
            }
        }
        int i = 0;
        while (i<=8){
            System.out.println(i);
            System.out.println("great");
            if(i==2){
                System.out.println("end");
                break;
            }
            i++;
        }
        int i = 0;
        do {
            System.out.println(i);
            System.out.println("great");
            if(i==5){
                System.out.println("end");
                break;
            }
            i++;
        }while(i<=8);

        int i = 0;
        do {
            i++;
            if(i==2){
                System.out.println("end");
                continue;
            }
            System.out.println(i);
            System.out.println("great");
        
        }while(i<5);
        System.out.println("loop end");

        int i = 0;
        while (i<=8){
            i++;
            if(i==2){
                System.out.println("end");
                continue;
            }
            System.out.println(i);
            System.out.println("great");
        }

        for (int i = 0;i<=6;i++){
            if(i==2){
                System.out.println("end");
                continue;
            }
            System.out.println(i);
            System.out.println("great kabir");
        }

    }
}