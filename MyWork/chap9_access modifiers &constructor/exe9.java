import java.util.Scanner;

class cylinder{
    private int height;
    private int radious;
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadious() {
        return radious;
    }

    public void setRadious(int radious) {
        this.radious = radious;
    }

    public double area(int x, int y)
    {
        return 3.14*y*y*x;
    }
    public cylinder()
    {
        System.out.println("*********Here you can find volume of a cylinderr************ ");
    }

}
public class exe9 {
    public static void main(String[] args) {
    cylinder c=new cylinder();
    Scanner sc=new Scanner(System.in);
        System.out.println("enter height and radious :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        c.setHeight(a);
        c.setRadious(b);
        System.out.println("height  is : "+c.getHeight());
        System.out.println("radious  is : "+c.getRadious());
        System.out.println("volune  is : "+c.area(a,b));


    }
}
