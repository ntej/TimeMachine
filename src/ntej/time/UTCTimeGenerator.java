package ntej.time;

import java.util.Calendar;

/**
 * Created by navatejareddy on 11/4/16.
 */
public class UTCTimeGenerator {

    private long millis;

    //Date and Month variables
    private int dateofTheMonth;
    private int monthNumber;
    private String monthName="";

    //Time Variables
    private String timeofTheDay;
    private String hour;
    private String minutes;
    private int AM_orPM_number;
    private String AM_orPM;

    //other
    private Calendar calendar;

    //constructor
    public UTCTimeGenerator(long millis) {

        this.millis = millis;

        //getting calender instance
        calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
    }

    public String getMonthandDate(){

        dateofTheMonth = calendar.get(Calendar.DATE);
        monthNumber = calendar.get(Calendar.MONTH);
        switch (monthNumber) {
            case 0:
                monthName = "Jan";
                break;

            case 1:
                monthName = "Feb";
                break;

            case 2:
                monthName = "Mar";
                break;

            case 3:
                monthName = "Apr";
                break;

            case 4:
                monthName = "May";
                break;

            case 5:
                monthName = "Jun";
                break;

            case 6:
                monthName = "Jul";
                break;

            case 7:
                monthName = "Aug";
                break;

            case 8:
                monthName = "Sep";
                break;

            case 9:
                monthName = "Oct";
                break;

            case 10:
                monthName = "Nov";
                break;

            case 11:
                monthName = "Dec";
                break;
        }

        return dateofTheMonth +monthName;

    }

    public String getTime(){

        hour = Integer.toString(calendar.get(Calendar.HOUR));
        minutes =Integer.toString(calendar.get(Calendar.MINUTE));
        if(minutes.trim().length()==1) //adding zero infront of single digit minutes
        {
            minutes = 0+minutes;
        }
        timeofTheDay = hour + ":" + minutes;

        AM_orPM_number = calendar.get(Calendar.AM_PM);
        if(AM_orPM_number == 0)
        {
            AM_orPM = "AM";
        }
        else
        {
            AM_orPM = "PM";
        }

       return timeofTheDay +AM_orPM;

    }


}
