public class Data {
    public static boolean checkData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!checkLength(login)) {
            throw new WrongLoginException("неверная длина логина");
        }
        if (!checkSymbols(login)) {
            throw new WrongLoginException("неверные символы в логине");
        }
        if (!checkLength(password)) {
            throw new WrongPasswordException("неверная длина пароля");
        }
        if (!checkSymbols(password)) {
            throw new WrongPasswordException("неверные символы в пароле");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("пароли не совпадают");
        }
        return true;
    }


    private static boolean checkLength(String login) {
        return login.length() >= 1 && login.length() <= 20;

    }

    private static boolean checkSymbols(String login) {
        char[] chars = login.toCharArray();
        for (char aChar : chars) {
            boolean charIsUnderscore = aChar == 95;
            boolean charIsUpperLatin = aChar >= 65 && aChar <= 90;
            boolean charIsLoverLatin = aChar >= 97 && aChar <= 122;
            boolean charIsDigit = Character.isDigit(aChar);
            if (!charIsUnderscore && !charIsUpperLatin && !charIsLoverLatin && !charIsDigit) {
                return false;
            }
        }
        return true;
    }
}
