package a10;

public class LambdaThread
{
    public static void main(String[] args)
    {
        new Thread(() ->
        {
            for(int i=1; i<=5; i++)
            {
                System.out.println("thread1"+ i);
                try
                {
                    Thread.sleep(100);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }).start();
        for(int j=1;j<5;j++)
        {
            System.out.println("thread"+j);
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
