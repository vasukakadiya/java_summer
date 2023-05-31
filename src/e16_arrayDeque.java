import java.util.ArrayDeque;

public class e16_arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1=new ArrayDeque<>();
        l1.add(2);
        l1.add(4);
        l1.add(6);
        l1.add(8);

//        for (int i=0;i<l1.size();i++)
//        {
//            System.out.print(l1.get(i)+" ");
//        }

        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());

        //for remove there is two methods in java
        //1.removeFirst();
        //2.removeLast();


        //dispaly will be learned by nextsem.

    }
}
