package Task13_13;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task17_02 {
	public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();
        dateList.add(new Date(2015, 12, 25, 20, 40));
        dateList.add(new Date("July 20, 1969"));
        dateList.add(new Date(1989, 11, 9));
        dateList.add(new Date("January 1, 2000"));

        System.out.println("before fixes:");
        dateList.forEach(System.out::println);

        fixDate(dateList);

        System.out.println("after fixes:");
        dateList.forEach(System.out::println);
    }

    static void fixDate(List<Date> brokenDates) {
        Date currentDate = new Date();
        for (int i = 0; i < brokenDates.size(); i++) {
            if (brokenDates.get(i).after(currentDate)) {
                brokenDates.get(i).setYear(brokenDates.get(i).getYear() - 1900);
                brokenDates.get(i).setMonth(brokenDates.get(i).getMonth() - 1);
            }
        }
    }
}

