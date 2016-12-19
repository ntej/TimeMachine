package ntej.time;

import java.util.ArrayList;
import java.util.TimeZone;

/**
 * Created by navatejareddy on 12/18/16.
 */
public class TimeZoneTimeGenerator {

    ArrayList<String> allZonesArrayList = new ArrayList<>();


    protected static ArrayList<String>  getAllZoneIds()
    {
        TimeZoneTimeGenerator tztg = new TimeZoneTimeGenerator();

        for(String zone : TimeZone.getAvailableIDs(-12600000))
        {
            tztg.allZonesArrayList.add(zone);
        }

        return tztg.allZonesArrayList;
    }

}
