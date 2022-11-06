package a8;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Set;

class phoneNum
{
    private long num;

    public phoneNum(long num)
    {
        super();
        this.num = num;
    }
    public long getNum(long num)
    {
        return num;
    }
    public String toString()
    {
        return "phoneNum [ num = "+num+" ]";
    }
}
class Sortbyphno implements Comparator
{
    public int compare(Object str1, Object str2)
    {
        String i1=str1.toString();
        String i2= str2.toString();
        return i2.compareTo(i1);
    }
}

class contactList
{
    private String name;
    private String gender;

    public contactList(String name, String gender)
    {
        super();
        this.name = name;
        this.gender = gender;
    }
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
    public String toString()
    {
        return "contactList[ name = "+name+" , gender = "+gender+" ]";
    }
}

public class Test
{
    public static void main(String[] args)
    {

        contactList cl1 = new contactList("anu","female");
        contactList cl2 = new contactList("ansu","female");
        contactList cl3 = new contactList("sara","female");
        contactList cl4 = new contactList("anna","female");

        phoneNum ph1 = new phoneNum(7809065433L);
        phoneNum ph2 = new phoneNum(8909078344L);
        phoneNum ph3 = new phoneNum(7700990088L);
        phoneNum ph4 = new phoneNum(8908907768L);

        TreeMap<phoneNum,contactList> tree = new TreeMap<phoneNum,contactList>(new Sortbyphno());

        tree.put(ph1,cl1);
        tree.put(ph2,cl2);
        tree.put(ph3,cl3);
        tree.put(ph4,cl4);

        System.out.println(tree);
        Set s1=tree.keySet();
        System.out.println(s1);
        Collection s2=tree.values();
        System.out.println(s2);
        Set s3=tree.entrySet();
        System.out.println(s3);

    }
}
