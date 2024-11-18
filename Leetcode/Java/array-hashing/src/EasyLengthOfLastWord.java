public class EasyLengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Lerom Ipsum Dolor Sit Amet"));
    }

    public static int lengthOfLastWord(String s) {
        String[] splittedS = s.trim().split(" ");
        return splittedS[splittedS.length - 1].length();
    }
}