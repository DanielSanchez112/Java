import java.util.Scanner;

public class EjercicioMayorDosNumeros {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.print("Escriba el primer numero: ");
        var num1 = consola.nextFloat();

        System.out.print("Escriba el segundo numero: ");
        var num2 = consola.nextFloat();

        if (num1 > num2){
            System.out.printf("el %.2f es mayor a %.2f", num1, num2);
        } else if (num1 == num2) {
            System.out.printf("el numero %.2f y el numero %.2f son iguales", num1, num2);
        }else {
            System.out.printf("El numero %.2f es mayor al numero %.2f", num2, num1);
        }
    }
}
