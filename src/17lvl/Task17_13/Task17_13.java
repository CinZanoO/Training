package Task13_13;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;

public class Task17_13 {

	public static void main(String[] args) {
        List<LocalDateTime> dateTimeList = new ArrayList<>();
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 18, 39));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 21, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 22, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 23, 5, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 8, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 22, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 23, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 25, 11, 5));

        for (LocalDateTime dateTime : dateTimeList) {
            System.out.println(dateTime + ", is weekend - " + isWeekend(dateTime));
        }

    }

    public static boolean isWeekend(LocalDateTime dateTime) {
       LocalTime time = LocalTime.of(dateTime.getHour(), dateTime.getMinute());
       LocalTime friday = LocalTime.of(21, 59);
       LocalTime Sunday = LocalTime.of(23, 0);
       if (dateTime.getDayOfWeek().toString() == "FRIDAY") {
           if (time.isAfter(friday)) return true;
           else return false;
       }
       else if (dateTime.getDayOfWeek().toString() == "SATURDAY") {
        return true;   
       }
       else if (dateTime.getDayOfWeek().toString() == "SUNDAY") {
           if (Sunday.isAfter(time)) return true;
           else return false;
       }
       else return false;
    }
}
