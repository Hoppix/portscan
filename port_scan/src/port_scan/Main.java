package port_scan;

public class Main
{

    public Main()
    {
    }

    public static void main(String[] args)
    {
        System.out.println("");
        Threader thread = new Threader();
        thread.start();
    }

}
