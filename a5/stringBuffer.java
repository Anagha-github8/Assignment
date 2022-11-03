package a5;

public class stringBuffer
{
    public static void main(String[] args)
    {
        StringBuffer sbf = new StringBuffer("StringBuffer");
        System.out.println(" string buffer = " + sbf);

        CharSequence chSeq;
        chSeq = "is a peer class of string"+" that provide much of"+" the functionality of strings";


         sbf.append(chSeq);


        System.out.println("After append = " + sbf);
    }
}
