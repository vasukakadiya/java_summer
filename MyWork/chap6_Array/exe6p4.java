import java.util.Scanner;

public class exe6p4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][]arr=new int[2][3];
        int[][]arr2=new int[2][3];
        int[][]sum=new int[2][3];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter second array : ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("sum");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++){
                sum[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++){
                System.out.println(sum[i][j]);
            }
        }


    }
}
