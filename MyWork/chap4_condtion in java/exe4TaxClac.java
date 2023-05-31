import java.util.Scanner;

public class exe4TaxClac {
    public static void main(String[] args) {
        double income;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income :");
        income=sc.nextInt();
        double tax;

        if(income>=250000 && income<500000)
        {
            tax=income*0.05;
            System.out.println(tax);
        }
        else if(income>=500000 && income<1000000)
        {
            tax=income*0.1;
            System.out.println(tax);
        }
        else if(income>=1000000)
        {
            tax=income*1.5;
            System.out.println(tax);
        }
        else {
            tax=0;
            System.out.println(tax);
        }
    }
}
