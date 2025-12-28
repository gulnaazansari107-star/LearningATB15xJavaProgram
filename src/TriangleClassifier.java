import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a==b && b==c){
            System.out.println("This is an equilateral triangle");
        } else if (a==b || b==c || c==a) {
            System.out.println("This is an isosceles triangle");
        }else {
            System.out.println("This is a scalene triangle");
        }
    }
}
