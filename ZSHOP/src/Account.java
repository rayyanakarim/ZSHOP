import java.util.ArrayList;
import java.util.Scanner;
public class Account extends PRODUCT {
    String Name;
    String Email;
    char Password;
    ArrayList<DRESS> Checkout = new ArrayList<>();
    boolean Yes = true;
    private void CheckOut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" :: Check Out Now :: ");
        ArrayList<DRESS>Checkout = new ArrayList<>();
        Checkout.add();

    }
    private void InputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create Your Account:: Write Name :: ");
        Name = scanner.next();
    }
    private void InputEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" :: Write Email :: ");
        Email = scanner.next();
    }
    private void CreatePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" :: Create Password ::");
        Password = scanner.next();
    }
    private void Decide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" :: Proceed Yes/No :: ");
        Yes = scanner.hasNext();

        if (Yes == false){
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }else {
            System.out.println(" ::Pay Now:: ");
        }
    }
}
