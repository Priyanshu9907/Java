import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int n=10;
        int [] arr=new int[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("enter no ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" is even");
            }
            else{
                System.out.println(arr[i]+" is odd");
            }
        }
    }
}
