import java.util.Scanner;

public class EjercicioSistemaEmpleados {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.print("Escriba su nombre: ");
        var nombre = consola.nextLine();

        System.out.print("escriba su edad: ");
        var edad = consola.nextInt();

        System.out.print("Escriba su salario: ");
        var salario = consola.nextDouble();

        System.out.print("Es el jefe del departamento: ");
        var jefe = consola.nextBoolean();

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(salario);
        System.out.println(jefe);
    }
}
