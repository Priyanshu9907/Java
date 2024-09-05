import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your marks");
        int marks=sc.nextInt();
        if(marks>90){
            System.out.println("O");
        }
        else if(marks>80){
            System.out.println("E");
        }
        else if(marks>70){
            System.out.println("A");
        }
        else if(marks>60){
            System.out.println("B");
        }
        else if(marks>50){
            System.out.println("C");
        }
        else{
            System.out.println("you fail");
        }
    }
}