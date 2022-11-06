package a10;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;

public class firstletter
{
    List<String> list = Arrays.asList("Hello","java","intellij");
    public static void main(String[] args)
    {
        firstletter firstletter = new firstletter();
        processWords(firstletter.list);
    }

    public static String processWords(List<String> list)
    {
        StringBuilder words = new StringBuilder();
        Consumer<String> consumer = p-> words.append(p.charAt(0));
        list.stream().forEach(consumer);
        System.out.println(words);
        return  words.toString();
    }
}
