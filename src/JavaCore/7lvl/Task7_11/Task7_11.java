package Tasks;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Task7_11 {
    public static SimpleDateFormat SDformat = new SimpleDateFormat();
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
       if (args[0] == "-c") {
           
           int allPeopleSize = allPeople.size();
           
           if (args[2] == "м") {
               SDformat.applyPattern("dd/MM/yyyy");
               allPeople.add(Person.createMale(args[1], SDformat.parse(args[3])));
           } else {
               SDformat.applyPattern("dd/MM/yyyy");
               allPeople.add(Person.createFemale(args[1], SDformat.parse(args[3])));
           }
           
           System.out.println(allPeopleSize);
       } else if (args[0] == "-r") {
           String name = allPeople.get(Integer.parseInt(args[1])).getName();
           String sexToString = "";
           
           Sex sex = allPeople.get(Integer.parseInt(args[1])).getSex();

            if (sex == Sex.MALE) 
                sexToString = "м";
            else 
                sexToString = "ж";
                
            SDformat.applyPattern("dd-MMM-yyyy");
            String birthDate = SDformat.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate());
            
            System.out.println(name + " " + sexToString + " " + birthDate);
       } else if (args[0] == "-u") {
           if (args[3] == "м") {
               SDformat.applyPattern("dd/MM/yyyy");
               Person newPerson = Person.createMale(args[2], SDformat.parse(args[4]));
               allPeople.set(Integer.parseInt(args[1]),newPerson);
           } else {
               SDformat.applyPattern("dd/MM/yyyy");
               Person newPerson = Person.createFemale(args[2], SDformat.parse(args[4]));
               allPeople.set(Integer.parseInt(args[1]),newPerson);
           }
           
       } else if (args[0] == "-d") {
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
       }
        
    }
}
