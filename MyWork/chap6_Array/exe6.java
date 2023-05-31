import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        float [] arr=new float [5];
        System.out.println("enter 5 elements of array: ");
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            arr[i]= sc.nextFloat();
        }
        System.out.println("elemets of array : ");
    float sum=0;
        for (int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("sum of 5 float numbers :" +sum);
//maximum
        float max=arr[0];
        int m=0;
        for(int i=0;i<5;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                m=i;
            }
        }
        System.out.println("maximum : "+arr[m]);
//minimum
        float min=arr[0];
        int mn=0;
        for(int i=0;i<5;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
                mn=i;
            }
        }
        System.out.println("minimum : "+arr[mn]);
    }
}
