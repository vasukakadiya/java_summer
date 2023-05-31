class employee{
    int salary;
    String name;
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
}

public class exe8 {

    public static void main(String[] args) {
            employee vasu=new employee();
            vasu.setName("vasu");
            vasu.salary=20000;
        System.out.println(vasu.getName());
        System.out.println(vasu.getSalary());

    }
}
