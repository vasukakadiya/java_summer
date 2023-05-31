class a{
    int x;
    a(){
        System.out.println("hello from a :");

    }
    public  a(int c,int k)
    {
        //x=c;

        System.out.println("hello frm 1 a");
        System.out.println(c);
    }
}
class b extends a{
    int y;
    b(int c){
        super(c,0);
     x=c;
        y=0;
        System.out.println("heloo from b: ");
    }
    public void chap10()
    {
        int sum=x+y;
        System.out.println("sum : "+sum);
    }
}
public class exe10 {

    public static void main(String[] args) {
        int m=10;
        b b=new b(m);
    b.chap10();
    }
}
