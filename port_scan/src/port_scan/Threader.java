package port_scan;

public class Threader extends Thread
{

    public Threader()
    {
        super();
    }

    @Override
    public void run()
    {
        Scanner scan = new Scanner();
        for (int i = 0; i < 65535; i++)
        {
            boolean isValid = scan.portIsOpen("127.0.0.1", i, 200);
            if (isValid)
            {
                System.out.println("Port: " + i + " - is free");
                break;
            }
            else
            {
                System.out.println("Port: " + i + " - is used");
            }

        }
        System.out.println("Terminating..");
    }

}
