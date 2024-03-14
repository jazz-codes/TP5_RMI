import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReverseImpl  extends UnicastRemoteObject implements ReverseInterface{

    public ReverseImpl()throws RemoteException {
        super();
    };

    public String reverseString(String str) throws RemoteException {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            // Échanger les caractères à gauche et à droite
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            // Déplacer les indices vers le centre de la chaîne
            left++;
            right--;
        }
        
        // Créer une nouvelle chaîne à partir du tableau de caractères inversé
        return new String(charArray);
    }
} 
//     public static void main(String[] args) {
//         String original = "Hello, world!";
//         System.out.println("Chaîne originale: " + original);
        
//         String reversed = ReverseImpl(original);
//         System.out.println("Chaîne inversée: " + reversed);
//     }
// }