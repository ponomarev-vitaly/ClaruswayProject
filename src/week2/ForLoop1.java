package week2;

public class ForLoop1 {
    public static void main(String[] args) {
        for(int i = 4; i > 1; i--){
            System.out.println(i);
        }
        System.out.println("When i is less than or equals to 1, the code will continue from this line.");
        for(int i = 1; i < 101; i++) {
            System.out.print(i + "-");
        }

        for(int i = 1; i <= 10; i++){
            System.out.println("The value i is " + i);
            System.out.println("Welcome to Clarusway SDET Course.");
            System.out.println("We will win!");
        }
    }
}