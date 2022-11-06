package a9;
import java.lang.*;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{
    String os();
}
@Test(os="it is a testcase")
class Annotation1
{
    String mode;
    Annotation1(String mode)
    {
        this.mode= mode;
    }
}

public class Annotations1
{
    public Annotations1(String test_case_annotation)
    {

    }

    public static void main(String[] args) throws Exception
        {
            Annotations1 n=new Annotations1("test case annotation");
            Class c=n.getClass();
            Annotation o=c.getAnnotation(Test.class);
            Test s=(Test)o;
            System.out.println(s.os());
        }
}

