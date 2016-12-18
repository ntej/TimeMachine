package ntej.time;

import java.util.ArrayList;
import java.util.TimeZone;

/**
 * Created by navatejareddy on 12/18/16.
 */
public class TimeZoneTimeGenerator {

    ArrayList<String> allZonesArrayList = new ArrayList<>();


    private ArrayList<String>  getAllZoneIds()
    {
        TimeZoneTimeGenerator tztg = new TimeZoneTimeGenerator();

        for(String zone : TimeZone.getAvailableIDs())
        {
            tztg.allZonesArrayList.add(zone);
        }

        return tztg.allZonesArrayList;
    }

}
