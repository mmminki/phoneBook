package src;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Validator {

    public boolean validateMemberExists(ArrayList<Person> phonebook, String targetName) {
        for(Person p : phonebook) {
            if(p.isNameEqualString(targetName)) {
                return true;
            }
        }
        return false;
    }

    public boolean validatePhoneNumberForm(String inputPhoneNumber) {
        if (Pattern.matches("^010-\\d{4}-\\d{4}$", inputPhoneNumber)){
            return true;
        }
        return false;
    }

}
