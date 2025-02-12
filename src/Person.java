package src;

public class Person {
    private final String name;
    private final String phoneNumber;

    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public boolean isNameEqualString(String inputName) { return this.name.equals(inputName);}

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPersonName(){
        return name;
    }

}
