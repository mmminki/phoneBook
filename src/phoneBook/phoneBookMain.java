package phoneBook;
import java.util.ArrayList;
import java.util.Scanner;

public class phoneBookMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 동적 배열로 Person 배열 선언
        ArrayList<Person> persons = new ArrayList<Person>();
        Person person1 = new Person("민기", "010-xxxx-5821");
        persons.add(person1);
        Person person2 = new Person("민기", "010-xxxx-5821");
        persons.add(person2);

        System.out.println(persons.toArray().length);
    }

    public static void printAllInfo(Person[] persons){

    }
}
