package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        for(int l=0;l<60;l++) {  // took 50 numbers for the size of the pyramid
            for(int m=0;m<60-l;m++) {
                System.out.print(" ");
            }

            for (int n=0;n<=l;n++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}