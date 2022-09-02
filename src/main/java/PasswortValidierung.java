public class PasswortValidierung {//    public static void main(String[] args) {

    //        String password = "pass";
//        getLength(password);
//    }
    public static int getLength(String password) {
        int length = password.length();
        return length;
    }

    public static String checkLength(String password) {
        int length = getLength(password);
        String Message = null;
        boolean containsNumber = checkNumber(password);
        if (length >= 8 && containsNumber) {
            Message = "Passwort akzeptiert";
        } else if (length >= 8 && !containsNumber) {
            Message = "Fehlende Zahl im Passwort.";
        } else {
            Message = "Passwort zu kurz!";
        }
        return Message;
    }

    public static boolean checkNumber(String password) {
        boolean containsNumber = true;
        int number[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < number.length; i++) {
            if (password.contains(String.valueOf(number[i]))) {
                containsNumber = true;
                break;
            } else {
                containsNumber = false;
            }
        }
            return containsNumber;

    }
}