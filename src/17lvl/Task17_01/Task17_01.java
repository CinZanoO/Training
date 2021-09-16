package Task13_13;
import java.util.Date;

public class Task17_01 {
	static Date birthDate = new Date (100, 05, 28);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        int dayOfWeek = date.getDay();
        String dayOnRus = "";
        switch (dayOfWeek) {
            case 1: dayOnRus = "Понедельник";
            break;
            case 2: dayOnRus = "Вторник";
            break;
            case 3: dayOnRus = "Среда";
            break;
            case 4: dayOnRus = "Четверг";
            break;
            case 5: dayOnRus = "Пятница";
            break;
            case 6: dayOnRus = "Суббота";
            break;
            case 0: dayOnRus = "Воскресенье";
            break;
        }
        return dayOnRus;
    }
}