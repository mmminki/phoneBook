package src;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<Person>();

        while (true) {
            System.out.println("=== 연락처 관리 프로그램 ===");
            System.out.println("1. 새 연락처 추가");
            System.out.println("2. 연락처 목록 보기");
            System.out.println("3. 이름으로 연락처 검색");
            System.out.println("4. 연락처 삭제");
            System.out.println("5. 종료");
            System.out.print("선택: ");
            int inputNum = scanner.nextInt();
            scanner.nextLine();
            if(inputNum == 1){
                addPerson(persons);
            }
            else if(inputNum == 2){
                printAllInfo(persons);
            }
            else if(inputNum == 3){
                System.out.print("검색할 이름: ");
                String inputName = scanner.nextLine();
                searchByName(persons, inputName);
            }
            else{
                break;
            }
        }

    }

    public static void printAllInfo(ArrayList<Person> phoneBook){
        for(Person i : phoneBook){
            i.printInfo();
        }
    }

    public static void addPerson(ArrayList<Person> phoneBook){

        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("전화번호: ");
        String phoneNumber = scanner.nextLine();

        Person newPerson = new Person(name, phoneNumber);
        phoneBook.add(newPerson);
    }

    public static void searchByName(ArrayList<Person> phoneBook, String name){
        boolean exist = false;
        for(Person p : phoneBook){  // 포함 구현해야함
            if(p.isNameCorrect(name)){
                System.out.println(p.getPhoneNumber());
                exist = true;
            }
        }
        if(exist == false){
            System.out.println("해당 이름의 연락처가 없습니다.");
        }
    }
}
