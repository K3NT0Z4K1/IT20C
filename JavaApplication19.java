package javaapplication19;

/**
 *
 * @author ITLAB1-PC14-STUDENT
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] freakyNum = {
            {2, 4, 6},
            {8, 10, 12},
            {14, 16, 18},
            {18, 20, 22}
        };

        for (int i = 0; i < freakyNum.length; i++) {
            for(int j = 0; j< freakyNum[i].length; j++ ){
               
                System.out.print(freakyNum[i][j] + " ");
            }
            System.out.println();


        }
        }
    }

