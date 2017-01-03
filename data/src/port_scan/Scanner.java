package port_scan;

import java.net.InetSocketAddress;
import java.net.Socket;

public class Scanner
{

    public Scanner()
    {
    }

    public boolean portIsOpen(String ip, int port, int timeout)
    {
        try
        {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(ip, port), timeout);
            socket.close();
            return true;
        }
        catch (Exception ex)
        {
            return false;
        }
    }

}
