import java.util.Scanner;

class rec{
    int l;
    int b;

    public void setREC(int x,int y)
    {
        l=x;
        b=y;
    }
    public int getArea()
    {
        return l*b;
    }
    public int getPeri()
    {
        return 2*(l+b);
    }
}

public class exe8rectangle {
    public static void main(String[] args) {
        rec r=new rec();
        System.out.println("Enter a length for rectangle :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter a b for rectangle :");
        int b=sc.nextInt();
        r.setREC(a,b);
        System.out.println("area is :"+r.getArea());
        System.out.println("perimeter is :"+r.getPeri());
    }
}
