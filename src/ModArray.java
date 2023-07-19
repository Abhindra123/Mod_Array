import java.util.Scanner;

public class ModArray {
    public static int modArray(int arr[],int p){
        int power=1;
        int result=0;
        for(int i=arr.length-1;i>=0;i--){
            result=(result+(arr[i]*power))%p;
            power=power*10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : " );
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the base : " );
        int B= sc.nextInt();
        int val=modArray(arr,B);
        System.out.println("The value s : "+val);

    }
}