import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Enter your name :");
//        Scanner s=new Scanner(System.in);
//        String a;
//        a=s.nextLine();
//        System.out.println("hello "+a+" how are you");
//
//    }
//}

//  public class Main {
//      public static void main(String[] args) {
//          System.out.println("Enter value in kilo meteres that you want to convert :");
//          float a;
//          Scanner s=new Scanner(System.in);
//          a=s.nextFloat();
//
//          float b=a*1000;
//          System.out.println("Converted value is : " +b);
//      }
//
//}

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("enter a number :");
//        int a;
//        Scanner s=new Scanner(System.in);
//
//        boolean op=s.hasNextInt();
//        System.out.println(op);
//    }
//}

public class Main {
    public static void main(String[] args) {
        float a,b,c;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter marks of subject 1 :");
        a=s.nextFloat();
        System.out.println("Enter marks of subject 2 :");
        b=s.nextFloat();;
        System.out.println("Enter marks of subject 3 :");
        c=s.nextFloat();

        float sum=a+b+c;
        float percentage =sum/3;

        System.out.println("percentage = "+percentage);
    }
}