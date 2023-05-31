import java.util.Scanner;

public class exe6sort {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number for desired length element :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter a elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("elements :");
        for(int e=0;e<n;e++)
        {
            System.out.print(arr[e]+" ");
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++) {


                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("sorted array :");
        for(int e=0;e<n;e++)
        {
            System.out.print(arr[e]+" ");
        }
    }
}
