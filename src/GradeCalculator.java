import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int mark = sc.nextInt();
        if(mark>=90 && mark<=100){
            System.out.println("The grade is : A");
        } else if (mark>=80 && mark<=89) {
            System.out.println("The grade is : B");
        } else if (mark>=70 && mark<=79) {
            System.out.println("The grade is : C");
        } else if (mark>=60 && mark<=69) {
            System.out.println("The grade is : D");
        } else if(mark>=0 && mark<=50) {
            System.out.println("The grade is : E");
        }else {
            System.out.println("Enter the correct mark.");
        }
    }
}
