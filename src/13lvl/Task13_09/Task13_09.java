import java.util.ArrayList;
public class Task13_09 {
	public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("������");
        waitingEmployees.add("��������");
        waitingEmployees.add("���������");
        waitingEmployees.add("������");
        waitingEmployees.add("�������");
        waitingEmployees.add("�������");
        waitingEmployees.add("�����");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(null)) {
        }
        else if (waitingEmployees.contains(name)) {
                 alreadyGotSalaryEmployees.add(name);
                 waitingEmployees.set(waitingEmployees.indexOf(name), null);
        }
    }
}
