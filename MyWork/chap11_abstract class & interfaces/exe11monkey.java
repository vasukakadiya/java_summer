class monkey{
    void jump()
    {
        System.out.println("jumping...");
    }

    void bite()
    {
        System.out.println("biting...");
    }
}

interface basicAnimal{
    void sleep();
   void eat();

}

class humans extends monkey implements basicAnimal{

    public void sleep()
    {
        System.out.println("sleeping...");
    }

    public void eat()
    {
        System.out.println("eating...");
    }
}
public class exe11monkey {
    public static void main(String[] args) {
//        monkey m=new monkey();
//        m.bite();

        humans h=new humans();
        h.bite();
        h.eat();
        h.sleep();

        basicAnimal b=new humans();
        b.eat();
    }
}
