package ntej.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by navatejareddy on 12/18/16.
 */
public class TimeZoneTimeGenerator {

    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a Z");

    ArrayList<String> allZonesTimeAndDateList = new ArrayList<>();

    StringBuilder sb = new StringBuilder();


    private static ArrayList<String>  getAllZoneIdsWithTimeAndDate()
    {
        TimeZoneTimeGenerator tztg = new TimeZoneTimeGenerator();

        for(String zoneId : TimeZone.getAvailableIDs())
        {
            tztg.sb.append(zoneId+'\n');

            tztg.formatter.setTimeZone(TimeZone.getTimeZone(zoneId));
            tztg.sb.append(tztg.formatter.format(new Date()));

            tztg.allZonesTimeAndDateList.add(tztg.sb.toString());
        }


        return tztg.allZonesTimeAndDateList;
    }

}
