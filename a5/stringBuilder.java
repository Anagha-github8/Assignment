package a5;

public class stringBuilder
{
    public static void main(String[] args)
    {
    StringBuilder sbd = new StringBuilder("StringBuffer");
    System.out.println(" string buffer = " + sbd);

    CharSequence chSeq;
    chSeq = " is a peer class of string" + " that provide much of" + " the functionality of strings.";

    sbd.append(chSeq);
    System.out.println(sbd);
    }
}
