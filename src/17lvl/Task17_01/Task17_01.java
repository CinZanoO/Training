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
            case 1: dayOnRus = "�����������";
            break;
            case 2: dayOnRus = "�������";
            break;
            case 3: dayOnRus = "�����";
            break;
            case 4: dayOnRus = "�������";
            break;
            case 5: dayOnRus = "�������";
            break;
            case 6: dayOnRus = "�������";
            break;
            case 0: dayOnRus = "�����������";
            break;
        }
        return dayOnRus;
    }
}