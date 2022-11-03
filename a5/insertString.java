package a5;

public class insertString
{
    public static void main(String[] arg) {
        StringBuffer phrase = new StringBuffer("It is used to _ at the specified index position.");
        String substring = "_";
        String replacement = "insert text";
        int position = phrase.lastIndexOf(substring);
        phrase.replace(position, position + substring.length(), replacement);

        System.out.println(phrase);
    }
}
