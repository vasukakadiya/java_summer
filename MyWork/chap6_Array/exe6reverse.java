import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class exe6reverse {
    public static void main(String[] args) {
        int [] arr=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        int l=arr.length;
        int n=arr.length/2;
        for(int i=0;i<n;i++)
        {
            int temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int element:arr)
        {
            System.out.println(element);
        }
    }
}
