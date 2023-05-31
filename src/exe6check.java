import java.util.Scanner;

public class exe6check {
    public static void main(String[] args) {
        int []arr=new int[5];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter element of array : ");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements of array : ");
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("enter elemet that you want to search : ");
        int c=sc.nextInt();
        int f=0;
        int index=0;
        for(int i=0;i<5;i++)
        {
            if(arr[i]==c)
            {
                index=arr[i];
                f++;
            }
        }
        if(f>0)
        {
            System.out.println("element found on index : "+index);
            System.out.println(arr[index]);
        }
        else {
            System.out.println(c+"not found in current array : ");
        }
    }
}
