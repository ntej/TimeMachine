package ntej.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by navatejareddy on 12/18/16.
 */
public class Main {

    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a Z");
    //Date date = new Date();
    public static void main(String[] args)
    {
        Main main = new Main();
        ArrayList<String> allZoneIds = TimeZoneTimeGenerator.getAllZoneIds();

        for(String zoneId: allZoneIds )
        {
            System.out.println("TimeZone:" + zoneId);
            main.formatter.setTimeZone(TimeZone.getTimeZone(zoneId));
            System.out.println("Date and Time: "+main.formatter.format(new Date()));
            System.out.println("---------------------------------");

        }
    }
}
