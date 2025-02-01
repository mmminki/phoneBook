package src;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookMain {
    static Scanner scanner;
    static Printer printer;
    static PhoneBookManager phoneBookManager;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        printer = new Printer();
        phoneBookManager = new PhoneBookManager();
        ArrayList<Person> persons = new ArrayList<Person>();

        while (true) {
            printer.printUI();
            int inputNum = scanner.nextInt();
            scanner.nextLine();
            if(inputNum == 1) {
                phoneBookManager.addPerson(persons);
            }
            else if(inputNum == 2) {
                printer.printAllInfo(persons);
            }
            else if(inputNum == 3) {
                phoneBookManager.searchByName(persons);
            }
            else if(inputNum == 4) {
                phoneBookManager.deleatePerson(persons);
            }
            else if(inputNum == 5) {
                System.out.println("종료합니다.");
                break;
            }
            else{
                System.out.println("번호를 잘못 입력했습니다. (1 ~ 5 입력만 유효합니다.");
            }
        }

    }
}
