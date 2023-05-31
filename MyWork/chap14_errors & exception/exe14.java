import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class myexp extends Exception{

    public String toString()
    {
        return "kya";
    }
}

public class exe14 {
    public static void main(String[] args) {
        int[] marks=new int[4];
        marks[0]=11;
        marks[1]=12;
        marks[2]=13;
        marks[3]=14;
        int i=0;
        while(i<4) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter index number for watching data :");
        int a=sc.nextInt();




            try {
                if(a>3)
                {
                   throw new myexp();
            //        throw new ArrayIndexOutOfBoundsException("5eryt");
                }
                System.out.println("value for index :" + marks[a]);
            } catch (Exception e) {
               System.out.println(e);
                    //myexp m=new myexp();

            }
            i++;

        }
    }
}
