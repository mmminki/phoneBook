package src;

public class Person {

    private String name;
    private String phoneNumber;

    public Person(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void printInfo(){
        System.out.println("이름: " + name + " 전화번호: " + phoneNumber);
    }

    public boolean isNameEqual(String name){
        if(this.name.equals(name)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isNameContain(String name){
        if(this.name.contains(name)){
            return true;
        }
        else{
            return false;
        }
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
