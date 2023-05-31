import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
     int m1,m2,m3;
        System.out.println("Enter marks of respective suject :");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enrer subject  1 marks :");
        m1=sc.nextInt();

        System.out.println("Enrer subject  2 marks :");
        m2=sc.nextInt();

        System.out.println("Enrer subject  3 marks :");
        m3=sc.nextInt();

        int sum=m1+m2+m3;
        int total =sum/3;

        if(total <=40 || m1<=33 || m2<=33 || m3<=33)
        {
            System.out.println("you are failed");
        }
        else
        {
            System.out.println("you are passed");
        }

    }
}
