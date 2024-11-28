import java.util.Scanner;

public class SistemaDeAutenticacion {
    public static void main(String[] args) {

        final var user = "Daniel";
        final var pass = "Daniel112";

        var scaner = new Scanner(System.in);

        System.out.print("Escriba su nombre de usuario: ");
        var userAuth = scaner.nextLine();
        System.out.print("Escriba su contreaseña: ");
        var passAuth = scaner.nextLine();

        if (userAuth.equals(user) && passAuth.equals(pass)){
            System.out.println("correcto");
        }else {
            System.out.println("error");
        }
    }
}
