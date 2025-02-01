package src;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class PhoneBookManager {
    Validator validator = new Validator();
    Scanner scanner = new Scanner(System.in);

    public void addPerson(ArrayList<Person> phoneBook) {
        System.out.print("이름: ");
        String targetName = scanner.nextLine();
        if(validator.validateMemberExists(phoneBook, targetName)){
            System.out.println("이미 존재하는 이름입니다.");
        }

        System.out.print("전화번호: ");
        String phoneNumber = scanner.nextLine();
        if(validator.validatePhoneNumberForm(phoneNumber)) {
            Person newPerson = new Person(targetName, phoneNumber);
            phoneBook.add(newPerson);
            return;
        }

        System.out.println("유효하지 않은 전화번호입니다.");
    }

    public Person findMemberByName(ArrayList<Person> phoneBook, String targetName) {
        for (Person person : phoneBook) {
            if (person.getPersonName().equals(targetName)){
                return person;
            }
        }

        throw new NoSuchElementException("이름 '" + targetName + "'을(를) 가진 사용자가 없습니다.");
    }

    public void searchByName(ArrayList<Person> phoneBook) {
        System.out.print("검색할 이름 : ");
        String targetName = scanner.nextLine();
        try {
            Person p = findMemberByName(phoneBook, targetName);
            System.out.println(p.getPersonName() + "의 전화번호 : " + p.getPhoneNumber());
        }
        catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleatePerson(ArrayList<Person> phoneBook) {
        System.out.print("삭제할 사용자의 이름 : ");
        String targetName = scanner.nextLine();
        for (int i = 0; i < phoneBook.toArray().length; i++) {
            if (phoneBook.get(i).isNameEqualString(targetName)) {  // 삭제
                phoneBook.remove(i);
                return;
            }
        }

        System.out.println("해당 이름의 연락처가 없습니다.");
    }
}
