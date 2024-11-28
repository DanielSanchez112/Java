import java.util.Scanner;

public class EjercicioCasaDeEspejos {
    public static void main(String[] args) {
        var scaenr = new Scanner(System.in);

        System.out.println("""
                para entrar a esta casa debes cumplir con las siguientes condiciones
                1 tener mas de 10 años
                2 no tener miedo a la obcuridad
                """);

        System.out.println("Edad: ");
        var edad = scaenr.nextInt();

        System.out.print("Miedo a la obcuridad (S/N): ");
        scaenr.nextLine();
        var miedo = scaenr.nextLine();

        if(edad >= 10 && miedo.equalsIgnoreCase("N")){
                System.out.print("Biemvenido a la casa de los espejos");
        }else {
            System.out.print("no tienes el valor suficiente o ");
            System.out.println("no tienes la edad suficiente");
        }

    }
}
