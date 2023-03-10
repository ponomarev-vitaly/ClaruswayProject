package week2.homework;
/*
Program to print pyramid using Numbers
result should be like this;
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
*/
public class FullPyramidFromNumbersSecondSolution {

        // Main driver method
        public static void main(String[] args) {
            int num = 5;
            int x = 0;

            // Outer loop for rows
            for (int i = 1; i <= num; i++) {
                x = i - 1;

                // inner loop for "i"th row printing
                for (int j = i; j <= num - 1; j++) {

                    // First Number Space
                    System.out.print(" ");

                    // Space between Numbers
                    System.out.print("  ");
                }

                // Pyramid printing
                for (int j = 0; j <= x; j++) {
                    if ((i + j) < 10) System.out.print((i + j) + "  ");
                    else System.out.print((i + j) + " ");
                }

                for (int j = 1; j <= x; j++) {
                    if ((i + x - j) < 10) System.out.print((i + x - j) + "  ");
                    else System.out.print((i + x - j) + " ");
                }

                // By now we reach end for one row, so
                // new line to switch to next
                System.out.println();
            }
        }
}


