import java.util.Scanner;

public class EjercicioEstacionDelAnio {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var x = true;

        while (x){
            System.out.print("Escriba el mes del año en numero: ");
            var mes = consola.nextInt();

            if(mes == 1 || mes == 2 || mes == 12){
                System.out.println("Se encuentra en invierno");
                x = false;
            } else if (mes == 3 || mes == 4 || mes == 5) {
                System.out.println("Se encuentra en Primavera");
                x = false;
            }else if (mes == 6 || mes == 7 || mes == 8) {
                System.out.println("Se encuentra en Verano");
                x = false;
            }else if (mes == 9 || mes == 10 || mes == 11) {
                System.out.println("Se encuentra en Otoño");
                x = false;
            }else {
                System.out.println("Escriba un numero que se refiera a un mes del año");
            }
        }
    }
}
