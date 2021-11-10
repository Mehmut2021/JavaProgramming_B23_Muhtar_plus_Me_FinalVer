package JavaPractice;

public class PasswordValidation {

    public static void main(String[] args) {
        password("Abcd@2e");
        ValidPassword("Abcd@2e");
    }


    public static boolean password(String password) {


        int upperCaseLetterCount = 0;
        int lowerCaseLetterCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
        boolean isValidPassword = false;
        boolean validLength = password.length() >= 6 && !password.contains(" ");

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (ch >= 'A' && ch <= 'Z'){
                upperCaseLetterCount++;
            }else if (ch >= 'a' && ch <= 'z'){
                lowerCaseLetterCount++;
            }else if (ch >= '0' && ch <= '9'){
                digitCount++;
            }else {
                //if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')))
                specialCharCount++;
            }

        }

        //if
        return (upperCaseLetterCount >= 1 && lowerCaseLetterCount >= 1 && digitCount >= 1
                && specialCharCount >= 1 && validLength) ;
        //{
          //  isValidPassword = true;
        }
       // return isValidPassword;


    public static boolean ValidPassword(String password) {

        //boolean isValid= false;
        boolean isLengthAndSpace = false;
        boolean oneUpperCase = false;
        boolean oneLowerCase = false;
        boolean oneSpecialCase = false;
        boolean oneDigit = false;

        if (!(password.length()<6 && password.contains(" "))){
            isLengthAndSpace=true;
        }
        for (int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                oneUpperCase=true;
            }
            if (Character.isLowerCase(password.charAt(i))){
                oneLowerCase=true;
            }
            if (Character.isDigit(password.charAt(i))){
                oneDigit=true;
            }
            else if (!(Character.isLetterOrDigit(password.charAt(i)))){
                oneSpecialCase=true;
            }
        }
        return (isLengthAndSpace && oneUpperCase && oneLowerCase && oneSpecialCase && oneDigit);

    }
}


