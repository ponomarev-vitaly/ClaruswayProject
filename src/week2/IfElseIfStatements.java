package week2;

public class IfElseIfStatements {
    public static void main(String[] args) {
        int percentage = 77;
        char grade;
        if(percentage >= 90){
            grade = 'A';
        }else if(percentage >= 75){
            grade = 'B';
        }else if(percentage >= 65){
            grade = 'C';
        }else grade = 'F';

        System.out.println(grade);
        System.out.println("This codeline we executed for any condition...");

    }

}
