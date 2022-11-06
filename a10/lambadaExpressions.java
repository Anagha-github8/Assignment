package a10;

public class lambadaExpressions
{
    public static void main(String[] args)
    {
        Expressions ad1=(a,b)->(a+b);
        System.out.println(ad1.operations(20,10));
        Expressions sb1=(a,b)->(a-b);
        System.out.println(sb1.operations(20,10));
        Expressions ml1=(a,b)->(a*b);
        System.out.println(ml1.operations(20,10));
        Expressions di1=(a,b)->(a/b);
        System.out.println(di1.operations(20,10));

    }
}
interface Expressions
{
    int operations(int a, int b);

}