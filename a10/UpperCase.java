package a10;
import java.lang.*;
import java.util.*;
import java.util.function.Consumer;

public class UpperCase
{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "java", "intellij","Eclipse");
        UpperCase Letter = new UpperCase();
        System.out.println(Letter.convertToUpperCase(list));
    }
    public List<String> convertToUpperCase(List<String> list) {
        List<String> ToUpper = new ArrayList<>();
        Consumer<String> consumer = (str)->ToUpper.add(str.toUpperCase());
        list.stream().forEach(consumer);
        return  ToUpper;
    }
}
