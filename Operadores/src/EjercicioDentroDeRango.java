import java.util.Scanner;

public class EjercicioDentroDeRango {
    public static void main(String[] args) {

        var scaner = new Scanner(System.in);

        System.out.print("escriba un numero entre 0 y 5: ");
        var numero = scaner.nextInt();

        if(numero >= 0 && numero <= 5 ){
            System.out.println("numero se encuentra entre lo indicado: " + numero);
        }else {
            System.out.println("el numero se encuentra fuera del valor indicado: " + numero);
        }


        // otro metodo sin if
        final var minimo = 0;
        final var maximo = 5;
        //solicitar el valor
        System.out.println("escriba un numero entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine()); // otra manera de usar el escaner
        //verificar si esta dentro del rango
        var estaDentroDeRango = dato >= minimo && dato <= maximo;
        System.out.println("esta dentro del rango? : " + estaDentroDeRango);
    }
}
