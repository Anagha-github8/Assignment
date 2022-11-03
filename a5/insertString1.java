package a5;

public class insertString1
{
    public static void main(String[] args)
    {
        StringBuilder phrase;
        phrase = new StringBuilder("It is used to _ at the specified index position.");
        String substring = "_";
        String replacement = "insert text";
        int position = phrase.lastIndexOf(substring);
        phrase.replace(position, position + substring.length(), replacement);

        System.out.println(phrase);
    }
}
