package ntej.time;

/**
 * Created by navatejareddy on 12/18/16.
 */
public class Main {

    public static void main(String[] args)
    {

        String dateAndMonth;
        String time;

        UTCTimeGenerator utcTimeGenerator = new UTCTimeGenerator(System.currentTimeMillis());

        dateAndMonth = utcTimeGenerator.getMonthandDate();
        time = utcTimeGenerator.getTime();

        System.out.println(dateAndMonth+" "+time);

    }
}
