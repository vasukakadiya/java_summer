import java.util.Scanner;

class square{
    int l;
    public int setlength(int x)
    {
        l=x;
        return x;
    }
    public  int getArea()
    {
        return l*l;
    }
    public  int getPeri()
    {
        return l+l+l+l;
    }
}

public class exe8sqare {
    public static void main(String[] args) {
        square sq1=new square();
        System.out.println("Enter a length for square :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sq1.setlength(a);
        System.out.println("area is :"+sq1.getArea());
        System.out.println("perimeter is :"+sq1.getPeri());

    }
}
