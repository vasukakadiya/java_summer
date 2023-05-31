interface  tvremote{
    void changeCNL();
    void volumeUP();
}
class tv implements tvremote{
    public void changeCNL()
    {
        System.out.println("changing channel ...");
    }

    public void volumeUP()
    {
        System.out.println("volume up and down...");
    }
}
interface  snmartTVremote extends tvremote{
    void youtube();
    void wifi();
}
public class exe11tv {
    public static void main(String[] args) {

         tv t=new tv();
         t.volumeUP();
    }
}
