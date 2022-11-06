package a10;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class person
{
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}

public class mainClass
{
    public static void main(String[] args)
    {
        //1)predicate--boolean result
        Predicate<String> checkLength=str -> str.length()>5;
        System.out.println(checkLength.test("checklength"));
        //2)consumer--modifies data no output
        person p = new person();
        Consumer<person> setName = t ->t.setName("lambda function");
        setName.accept(p);
        System.out.println(p.getName());
        //3) function--input and output
        Function<Integer,String> getInt = t -> t*10+" data multiplied by 10";
        System.out.println(getInt.apply(20));
        //4)supplier--only output
        Supplier<Double> getRandomDouble = () -> Math.random();
        System.out.println(getRandomDouble.get());
    }
}
