package week4.homework;

/**
 * Print Floyd’s Triangle.
 * result should be like this;
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */
public class FloydsTriangle {
    public static void main(String[] args) {
        int rows = 4;
        int number1 = 4;
        for(int i = 0; i< rows; i++){ // This for loop to display the rows.
            for(int number = i; number < (2*i+1); number++){ // This for loop to display the Numbers.
                if(i <= 1){
                    System.out.print((number + 1) + " ");
                }
                else {
                    System.out.print(number1 + " ");
                    number1++;
                }

            }

            System.out.println();
        }
    }
}
