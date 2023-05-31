import java.util.Scanner;

public class exe4URL {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        boolean a=s.endsWith(".com");
        boolean a2=s.endsWith(".org");
        boolean a3=s.endsWith(".in");

        if(a)
        {
            System.out.println("it is commercial");
        }
        else if(a2)
        {
            System.out.println("it is organizational");

        }
        else if(a3)
        {
            System.out.println("it is indian");

        }
        else {
            System.out.println("something new...!");
        }
    }
}
