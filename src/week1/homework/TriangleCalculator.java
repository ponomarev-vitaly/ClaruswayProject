package week1.homework;
import java.util.Scanner;
/*
6) Type a program which calculates the perimeter of a triangle whose
Side lengths are entered by user. (Use
byte) Hint 1: Perimeter of a triangle is a +
b + c Hint 4: To get byte, use nextByte()
 */
public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the A side of the triangle: ");
        byte triangleSideA = scan.nextByte();
        System.out.println("Please enter the length of the B side of the triangle: ");
        byte triangleSideB = scan.nextByte();
        System.out.println("Please enter the length of the C side of the triangle: ");
        byte triangleSideC = scan.nextByte();
        byte trianglePerimeter = (byte) (triangleSideA + triangleSideB + triangleSideC);
        System.out.println("The perimeter of the triangle is: " + trianglePerimeter);

    }
}
