import java.util.Random;
import java.util.Scanner;

class game{
    int num;
    int numin;
    public game( )
    {
        Random rand=new Random();
        num=rand.nextInt(10);
    }

    public void takein()
    {
        Scanner sc=new Scanner(System.in);
        numin=sc.nextInt();
    }
    public boolean check()
    {
        if(num==numin)
        {
            System.out.println("correct");
            return true;
        }
        else if(numin>num)
        {
            System.out.println("to high..");


        }
        else if(numin<num)
        {
            System.out.println("too low..");

        }
        return false;

    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        game g=new game();
    int i=0;
        while(i!=9)
        {
            g.takein();
           boolean b= g.check();
           if(b==true)
           {
               break;
           }
            i++;
        }
    }
}
