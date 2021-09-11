package Task13_13;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task15_01 {
	public class User {

	    private String name;
	    private int age;

	    public String getName() {
	        return name;
	    }

	    public int setName(String name) {
	        if (name == null) {
	            return -1;
	        } else if (name.isEmpty()) {
	            return -2;
	        } else if (name.matches(".*\\d.*")) {
	            return -3;
	        } else {
	            this.name = name;
	            return 0;
	        }
	    }

	    public int getAge() {
	        return age;
	    }

	    public int setAge(int age) {
	        if (age < 0) {
	            return -1;
	        } else if (age > 150) {
	            return -2;
	        } else {
	            this.age = age;
	            return 0;
	        }
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) {
	            return true;
	        }
	        if (!(o instanceof User)) {
	            return false;
	        }
	        User user = (User) o;
	        return Objects.equals(getName(), user.getName());
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(getName());
	    }
	}

	public static final String INPUT_NAME = "\n������� ���: ";
    public static final String INPUT_AGE = "������� ������� ������������ '%s': ";

    public static final String CANNOT_BE_NULL = "��� �� ����� ���� null.";
    public static final String CANNOT_BE_EMPTY = "��� �� ����� ���� ������.";
    public static final String CANNOT_CONTAIN_DIGIT = "��� �� ����� ��������� �����.";
    public static final String CANNOT_BE_NEGATIVE = "������� �� ����� ���� ������ 0.";
    public static final String CANNOT_BE_TOO_BIG = "������� �� ����� ���� ������ 150.";
    public static final String UNKNOWN_ERROR = "����������� ������.";

    public static final String FOUND = "\n������������ '%s' ������ ��� �������� %d.\n";
    public static final String NOT_FOUND = "\n������������ '%s' �� ������.\n";

    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            addUser(new User());
        }

        User userToSearch = new User();
        userToSearch.setName("��������j");

        findUserIndex(userToSearch);
    }

    static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = scanner.nextLine();

        System.out.printf(INPUT_AGE, name);
        int age = Integer.parseInt(scanner.nextLine());

        switch (user.setName(name)) {
            case -1: System.out.println("��� �� ����� ���� null.");
            break;
            case -2: System.out.println("��� �� ����� ���� ������.");
            break;
            case -3: System.out.println("��� �� ����� ��������� �����.");
            break;
            case 0:  System.out.println(name);
            break;
            default: System.out.println("����������� ������.");
        }

        switch(user.setAge(age)) {
            case -1: System.out.println("������� �� ����� ���� ������ 0.");
            break;
            case -2: System.out.println("������� �� ����� ���� ������ 150.");
            break;
            case 0: System.out.println(age);
            break;
            default: System.out.println("����������� ������.");
        }

        users.add(user);
    }

    static void findUserIndex(User user) {
        if(users.indexOf(user) == -1)
        System.out.printf(NOT_FOUND,user.getName(), users.indexOf(user));
        else
        System.out.printf(FOUND, user.getName(), users.indexOf(user));
    }
}

