package src;

public class Person {

    private String name;
    private String phoneNumber;

    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public boolean isNameEqualString(String inputName) {
        return this.name.equals(inputName);
    }

    public boolean isNameContainString(String inputName) {
        return this.name.contains(inputName);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPersonName(){
        return name;
    }
}
