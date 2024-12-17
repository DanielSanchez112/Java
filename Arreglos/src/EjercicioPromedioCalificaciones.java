import java.util.Scanner;

public class EjercicioPromedioCalificaciones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int suma = 0;

        System.out.print("cuantas calificaciones va a agregar: ");
        var cantidad = new int[consola.nextInt()];

        for(var i = 0; i < cantidad.length ; i++){
            System.out.print("escriba la calificacion " + i + " :");
            cantidad[i] = consola.nextInt();
        }

        for(var i = 0; i < cantidad.length ; i++){
            suma = suma + cantidad[i];
        }

        for(var i = 0; i < cantidad.length ; i++){
            System.out.println("Calificacion[" + i + "]: " + cantidad[i]);
        }

        System.out.printf("\nEl promedio de las calificaciones es: %d ", suma/cantidad.length);

    }
}
