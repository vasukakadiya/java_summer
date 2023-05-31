import java.util.Random;
import java.util.Scanner;

public class stonePaperS {
    public static void main(String[] args) {
        System.out.println("0 for stone :\n1. for paper\n2.for seizer");

        System.out.println("Please choose a number between 0 to 3:");
        Scanner sc=new Scanner(System.in);
        int hc=sc.nextInt();
        Random random =new Random();
        int choice=random.nextInt(3);
        System.out.println("computer choose :"+choice);
        if(choice==hc)
        {
            System.out.println("draw");
        }

        if(choice==0 && hc==1)
        {
            System.out.println("you win..");
        }
        if (choice==1 &&hc==0)
        {
            System.out.println("computer win..");
        }

        if(choice==1 && hc==2)
        {
            System.out.println("you win..");
        }
        if (choice==2 &&hc==1)
        {
            System.out.println("computer win..");
        }

        if(choice==2 && hc==0)
        {
            System.out.println("you win..");
        }
        if (choice==0 &&hc==2)
        {
            System.out.println("computer win..");
        }



    }
}
