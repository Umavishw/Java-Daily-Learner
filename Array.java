public class Array {
    public static void main(String[] args) {
        int [] marks = new int [5];
        marks[0]=100;
        marks[1]=60;
        marks[2]=70;
        marks[3]=90;
        marks[4]=21;
        System.out.println(marks[4]);

        // float [] marks = {88.2f,45.8f,23.6f,79.6f,63.2f};
        String [] students = {"harry","uma","kabir","gururji"};
        System.out.println(students.length);
        System.out.println(students[3]);
        System.out.println(marks.length);
        System.out.println(marks[0]);

        // -------------DISPLAY ARRAY USING FOR LOOP--------------
        // int [] marks = {34,66,86,21,99,75,37,93};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);
        System.out.println(marks[7]);

        // -----------DISPLAY ARRAY----------------
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        // --------------TO REVERSE THE ARRAY USE DECREMENT------------------
        for(int i = marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        // --------------FOR EACH LOOP--------------
        for(int element: marks){
            System.out.println(element);
        }

        //----------DIMENSIONAL ARRAY--------------
        // int [] marks; // 1-D array
        int [][] flats; // 2-D array
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 101;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for(int i = 0;i<flats.length;i++){
            for(int j = 0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}