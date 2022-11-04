package a2;

public class singletonClass
{
    public static void main(String[] args)
    {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        System.out.println("Hashcode of x is "+ x.hashCode());
        System.out.println("Hashcode of y is "+ y.hashCode());
        System.out.println("Hashcode of z is "+ z.hashCode());

        if(x==y && y==z)
        {
            System.out.println("three objects point on the same memory location on the heap ie, to the same object");
        }
        else
        {
            System.out.println("three object not points to the same memory location to the heap");
        }
    }
}
class Singleton
{
    private static Singleton single_instance = null;
    public String s;

    private Singleton()
    {
        s = "hello i am a string part of singleton class";
    }

    public static Singleton getInstance()
    {
        if(single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}
