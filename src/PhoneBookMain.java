package src;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookMain {
    static Scanner scanner;
    static Printer printer;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        printer = new Printer();
        ArrayList<Person> persons = new ArrayList<Person>();    // 이걸 그냥 전역으로 선언할까

        while (true) {
            printer.printUI();
            int inputNum = scanner.nextInt();
            scanner.nextLine();
            if(inputNum == 1) {
                addPerson(persons);
            }
            else if(inputNum == 2) {
                printer.printAllInfo(persons);
            }
            else if(inputNum == 3) {
                System.out.print("검색할 이름: ");
                String inputName = scanner.nextLine();
                searchByName(persons, inputName);
            }
            else if(inputNum == 4) {
                System.out.print("삭제할 이름: ");
                String inputName = scanner.nextLine();
                deleatePerson(persons, inputName);
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

    public static void addPerson(ArrayList<Person> phoneBook) {

        System.out.print("이름: ");
        String name = scanner.nextLine();
        for(Person p : phoneBook) {
            if(p.isNameEqualString(name)) {
                System.out.println("이미 존재하는 이름입니다!");
                return;
            }
        }

        System.out.print("전화번호: ");
        String phoneNumber = scanner.nextLine();
        if(phoneNumber.charAt(3) == '-' && phoneNumber.charAt(8) == '-') {
            Person newPerson = new Person(name, phoneNumber);
            phoneBook.add(newPerson);
            return;
        }

        System.out.println("유효하지 않은 전화번호입니다.");
    }

    public static void searchByName(ArrayList<Person> phoneBook, String name) {
        boolean exist = false;
        for(Person p : phoneBook) {
            if(p.isNameContainString(name)) {
                System.out.println(p.getPhoneNumber());
                exist = true;
            }
        }

        if(!exist) {
            System.out.println("해당 이름의 연락처가 없습니다.");
        }
    }

    public static void deleatePerson(ArrayList<Person> phoneBook, String name) {
        for (int i = 0; i < phoneBook.toArray().length; i++) {
            if(phoneBook.get(i).isNameEqualString(name)){  // 삭제
                phoneBook.remove(i);
                return;
            }
        }
        System.out.println("해당 이름의 연락처가 없습니다.");

    }


}
