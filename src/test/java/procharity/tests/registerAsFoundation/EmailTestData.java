package procharity.tests.registerAsFoundation;


import java.security.SecureRandom;

public class EmailTestData {


    public static void main(String[] args) {
        System.out.println(getEmailValidLength1());
    }

    public static String getRandomStr(int len) {
        String AB = "procharity";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    //@gmail.com = 10 символов
    public static String getEmailValidLength255() {
        return getRandomStr(245) + "@gmail.com";
    }

    public static String getEmailValidLength254() {
        return getRandomStr(244) + "@gmail.com";
    }

    public static String  getEmailValidLength256() {
        return getRandomStr(246) + "@gmail.com";
    }

    public static String  getEmailValidLength100() {
        return getRandomStr(90) + "@gmail.com";
    }

    public static String getEmailValidLength1() {
        return getRandomStr(1);
    }

    public static String getEmailValidLength0() {
        return "";
    }

    public static String getEmailInputHugeLength() {
        return getRandomStr(990) + "@gmail.com";

    }

    public String getEmailInputDigits() {
        return emailInputDigits;
    }
    public String getEmailInputCyrillic() {
        return emailInputCyrillic;
    }
    public String getEmailInputLatin() {
        return emailInputLatin;
    }

    public String getEmailInputSpecialSymbols() {
        return emailInputSpecialSymbols;
    }

    private final String emailInputDigits = "1234567890";
    private final String emailInputSpecialSymbols = "!@#$%^&*()_+";
    private final String emailInputCyrillic = "Друзья";
    private final String emailInputLatin = "Friends";

}
