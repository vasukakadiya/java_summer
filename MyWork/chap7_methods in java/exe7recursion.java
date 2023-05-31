import java.util.Scanner;

public class exe7recursion {
    static int sumREC(int x)
    {
        if(x==1)
        {
            return 1;
        }
       return x+sumREC(x-1);

    }
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter valur for sum :");
//        a=sc.nextInt();
        int a= sumREC(10);
        System.out.println(a);
    }
}
