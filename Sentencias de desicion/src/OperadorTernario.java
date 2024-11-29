import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //operador ternaniro

        //determinar si un numero es par
        var consola = new Scanner(System.in);

        System.out.print("escriba un numero: ");
        var num = consola.nextInt();

        // sintaxis
        //                 condicio   ?  exp1 : exp2
        var resultado = (num % 2 == 0 ? "par" : "impar");

        System.out.println("el numero es: " + resultado);
    }
}
