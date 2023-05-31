public class exe7RECpat {
    static void pat(int n)
    {
        if(n>0) {

            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            pat(n - 1);
            int a=n-1;
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        pat(4);
    }
}
