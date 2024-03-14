import java.rmi.Remote;
import java.rmi.RemoteException;
public interface ReverseInterface extends Remote{

public  String reverseString(String str) throws RemoteException;

}