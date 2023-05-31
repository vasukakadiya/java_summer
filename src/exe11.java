abstract class pen{
    abstract void write();
    abstract  void refill();
}
class fountainpen extends pen{
    void write()
    {
        System.out.println("writing...");
    }

    void refill()
    {
        System.out.println("refill...");
    }

    void changenib()
    {
        System.out.println("changing nib....");
    }
}
public class exe11 {
    public static void main(String[] args) {

//        pen p=new pen();

            fountainpen f=new fountainpen();
            f.refill();
            f.changenib();

    }
}
