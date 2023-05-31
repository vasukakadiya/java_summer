public class exe7argument {
    static int vararg(int...arr)
    {
        int sum =0;
        for(int ele:arr)
        {
            sum=sum+ele;
        }
      return  sum/arr.length;
    }
    public static void main(String[] args) {
        System.out.println(vararg(85,86,45));
    }
}
