import java.util.ArrayList;

public class e15_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(2);
        l1.add(5);
        l1.add(7);

        for (int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i)+" ");
        }

        l1.add(0,1);
        l1.add(0,12);


        System.out.println();
        for (int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i)+" ");
        }

        l1.add(3,55);

        System.out.println();
        for (int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i)+" ");
        }

        l1.remove(3);

        System.out.println();
        for (int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i)+" ");
        }

        //set();
        //contain();
        //indexOff();
    }
}
