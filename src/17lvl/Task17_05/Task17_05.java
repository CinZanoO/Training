package Task13_13;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task17_05 {
	 public static final String INVENTED = "����������, ������ ������� ��� ��������� ��������. ������� �� ��������!";
	    public static final String NOT_INVENTED = "��������, �������� ��� �� ��������, ��������� ����� 10 ���.";

	    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

	    public static void main(String[] args) {
	        Calendar currentDay = Calendar.getInstance();
	        while (true) {
	            if (isTeleportInvented(currentDay) == false)
	            currentDay.add(Calendar.YEAR, 10);
	            else break;
	        }
	    }

	    static boolean isTeleportInvented(Calendar currentDay) {
	        boolean b = true;
	        if (currentDay.after(INVENTION_DAY)) {
	            System.out.println(INVENTED); 
	            return b;
	        }
	        else {
	            System.out.println(NOT_INVENTED);
	            return b = false;
	        }
	    }
	}
