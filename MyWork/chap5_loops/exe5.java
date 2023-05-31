import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {

        //pattern---------------------------------------
//        int i,j;
//        for(i=0;i<5;i++)
//      {
//           for(j=5-i;j>0;j--) {
//                System.out.print("*");
//
//           }
//          System.out.print("\n");
//       }


        //sum of n even number-----------------------------------
//    int i=0,j=10;
//    int sum=0;
//        while(i<=j)
//        {
//            if(i%2==0)
//            {
//                System.out.println(i);
//                sum=sum+i;
//            }
//            i++;
//        }
//        System.out.println(sum);

        //multiplication---------------------------------------------

//        int i,j,m,sum=0;
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter table no that you want to print...");
//        m=sc.nextInt();
//
//        for (i=1;i<11;i++)
//        {
//            j=m*i;
//            System.out.println(m+"x"+i+"="+j);
//            sum=sum+j;
//        }
//        System.out.println("sum of all :"+sum);

        //reverse----------
//        int i,j,m=10;
//        for (i=10;i>0;i--)
//        {
//            j=m*i;
//            System.out.println(m+"x"+i+"="+j);
//
//        }


        //factorial----

        int i,j,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number for factorial :");
        j=sc.nextInt();

        for(i=1;i<=j;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
