class the extends Thread{
    public void run()
    {
        int ik=0;
        while(ik<400)
        {
            System.out.println("kya bolati public : ****");
            ik++;
        }
    }


}

class the2 extends Thread{
    public void run()
    {
        int ik=0;
        while(ik<400)
        {
            System.out.println("kya bolati public*");
            ik++;
        }
    }


}
public class thr {
    public static void main(String[] args) {
        the t1=new the();
        the2 t2=new the2();



        t1.start();
        t2.start();



    }
}
