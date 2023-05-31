import java.util.Scanner;

public class exe7 {
    static void multi(int x)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(x+"x"+i+"="+x*i);
        }

    }
    static void pat()
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("* ");

            }
            System.out.println("\n");
        }
    }
    static  void sum(int y)
    {
        int sum=0;
        for(int i=1;i<=y;i++)
        {
             sum=sum+i;
        }
        System.out.println("sum of first "+y+" numbers :"+sum);
    }

    static void pat2()
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                System.out.print("* ");

            }
            System.out.println("\n");
        }
}
    public static void main(String[] args) {
        System.out.println("Q1--------------------");

        System.out.println("Enter a number that you want multiplication tablr :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        multi(a);
        System.out.println("Q2--------------------");
        pat();
        System.out.println("Q3--------------------");
        int b=sc.nextInt();
        sum(b);
        System.out.println("Q4--------------------");

        pat2();
    }
}
