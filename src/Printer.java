package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Printer {
    Scanner scanner = new Scanner(System.in);
    public void printUI() {
            System.out.println("=== 연락처 관리 프로그램 ===");
            System.out.println("1. 새 연락처 추가");
            System.out.println("2. 연락처 목록 보기");
            System.out.println("3. 이름으로 연락처 검색");
            System.out.println("4. 연락처 삭제");
            System.out.println("5. 종료");
            System.out.print("선택: ");
    }

    public void printAllInfo(ArrayList<Person> phoneBook) {
        if(phoneBook.isEmpty()) {
            System.out.println("전화번호부가 비었습니다.");
            return;
        }
        for (Person i : phoneBook) {
            printPersonInformation(i);
        }
    }

    public void printPersonInformation(Person person){
        System.out.println("이름: " + person.getPersonName() + " 전화번호: " + person.getPhoneNumber());
    }


}
