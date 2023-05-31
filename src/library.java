import java.util.Scanner;

class library1{
    String [] book=new String[5];
    int i=0;

    String getname()
    {
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();

        return name;
    }

    public void addbook(String str)
    {
        System.out.println("hello");
        book[i]=str;
        i++;
    }
    public void avlbook()
    {
        for(int j=0;j<i;j++)
        {
            if(book[j]==null)
            {
                continue;
            }
            System.out.println(book[j]);
        }
    }

    public void issuebook(String s2)
    {
        for(int j=0;j<book.length;j++)
        {
           if(book[j].equals(s2))
           {
               System.out.println("book is issues now ...");
               book[j]=null;
               break;
           }

        }
    }
    public void returnbook(String s3)
    {
        addbook(s3);
    }

}
public class library {
    public static void main(String[] args) {
library1 l=new library1();
       Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        l.addbook(s);
//        l.avlbook();
        int c;
        String  s;

        System.out.println("1.add book");
        System.out.println("2.issue book");
        System.out.println("3.return book");
        System.out.println("4.display book");

        do {


            System.out.println(" select your choice...");
            c = sc.nextInt();

            switch (c) {
                case 1 -> {
                    System.out.println("enter book name : ");
                    s = l.getname();
                    System.out.println("enter book name : ");

                    l.addbook(s);
                }
                case 2 -> {
                    System.out.println("enter book name that you want to issue  : ");
                    String s1 = l.getname();
                    l.issuebook(s1);
                }
                case 3 -> {
                    System.out.println("enter book name that you want to return : ");
                    String s2 = l.getname();
                    l.returnbook(s2);
                }
                case 4 -> l.avlbook();
                default -> System.out.println("Unexpected value: " + c);
            }
        }while (c!=0);
    }
}
