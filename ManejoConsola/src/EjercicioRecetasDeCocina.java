import java.util.Scanner;

public class EjercicioRecetasDeCocina {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.print("Nombre de la receta: ");
        var nombre = consola.nextLine();

        System.out.print("ingredientes principales: ");
        var ingredientes = consola.nextLine();

        System.out.print("tiempo de preparacion en minutos: ");
        var tiempo = consola.nextInt();

        consola.nextLine();
        System.out.println("que dificultad tiene Facil, Medio, Dificil");
        var difucultad = consola.nextLine();

        System.out.println(nombre);
        System.out.println(ingredientes);
        System.out.println(tiempo + " minuto de preparacion");
        System.out.println("Difucultad " + difucultad);
    }
}
