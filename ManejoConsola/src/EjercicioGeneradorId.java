import java.util.Random;
import java.util.Scanner;

public class EjercicioGeneradorId {
    public static void main(String[] args) {


        var consola = new Scanner(System.in);
        var ramndom = new Random();

        System.out.print("Escriba su nombre: ");
        var nombre = consola.nextLine();

        System.out.print("Escriba su apellido: ");
        var apellido = consola.nextLine();

        System.out.print("Escriba su año de nacimiento: ");
        var anioNacimiento = consola.nextLine();

        var partOne = nombre.trim().toUpperCase().substring(0,2);
        var partTwo = apellido.trim().toUpperCase().substring(0,2);
        var partTre = anioNacimiento.trim().substring(2,4);
        var randNumber = ramndom.nextInt(9999)+1;

        var ID = String.format("Su ID es: %s%s%s%d",partOne,partTwo,partTre,randNumber);

        System.out.println("El id es: " + ID);

    }
}
