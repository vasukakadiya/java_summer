import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class exe15 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("vasu");
        al.add("vasu1");
        al.add("vasu2");
        al.add("vasu3");
        al.add("vasu4");
        al.add("vasu5");

        for (Object o:
            al ) {
            System.out.println(o);
        }

        Date d=new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        LocalTime L=LocalTime.now();
        System.out.println(L);

        DateTimeFormatter dt=DateTimeFormatter.ofPattern("H:m:s");
        String date=L.format(dt);
    System.out.println(date);
    }
}
