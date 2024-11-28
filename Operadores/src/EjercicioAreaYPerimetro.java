import java.util.Scanner;

public class EjercicioAreaYPerimetro {
    public static void main(String[] args) {

        var scaner = new Scanner(System.in);

        System.out.print("Escriba la base del rectangulo: ");
        var base = scaner.nextInt();

        System.out.print("Escriba la altura del rectangulo: ");
        var altura = scaner.nextInt();

        var area = base * altura;
        var perimetro = 2 * (base + altura);

        System.out.printf("El area del rectangulo es de: %d \nEl perimetro del rectangulo es de " +
                "%d", area, perimetro);
    }
}
