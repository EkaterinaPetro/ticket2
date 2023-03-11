public class Main {
    public static void main(String[] args) {
        System.out.println(isPolindrome("Я иду с мечем судия"));
    }

    public static boolean isPolindrome(String word) {
        word = word.toLowerCase();
        word = word.replace(" ", "");
        for (int indexL = 0; indexL < word.length() / 2; indexL++) {
            char leftChar = word.charAt(indexL);
            int indexR = word.length() - (indexL + 1);
            char rightChar = word.charAt(indexR);

            if (leftChar != rightChar) {
                return false;
            }
        }
        return true;
    }
}