package string_manipulation.first_uppercase;

/**
* Giving a String. Return first uppercase letter in the String.
* */
public class FirstUpperCase {

    public char getFirstUppercase(String str) {
        return getFirstUppercase(str, 0);
    }

    private char getFirstUppercase(String string, int index) {
        if (index == string.length())
                return ' ';

        char check = string.charAt(index);
        if (Character.isUpperCase(check))
            return check;

        return getFirstUppercase(string, index + 1);
    }
}
