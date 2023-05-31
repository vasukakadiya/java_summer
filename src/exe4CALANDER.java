import java.util.Scanner;

public class exe4CALANDER {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a number for day :");
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();

        switch (a) {
            case 1 -> {
                System.out.println("IT  is monday :");
            }
            case 2 -> {
                System.out.println("IT  is tuesday :");
            }
            case 3 -> {
                System.out.println("IT  is wdnesday :");
            }
            case 4 -> {
                System.out.println("IT  is thu :");
            }
            case 5 -> {
                System.out.println("IT  is friday :");
            }
            case 6 -> {
                System.out.println("IT  is sat :");
            }
            case 7 -> {
                System.out.println("IT  is sunday :");
            }
        }
    }
}
