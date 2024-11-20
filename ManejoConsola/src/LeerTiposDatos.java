import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("escriba su edad: ");
        var edad = consola.nextInt();

        System.out.print("escriba su altura: ");
        var altura = consola.nextDouble();

        //consumir el caracter de salto de linea
        consola.nextLine();
        System.out.println("escriba su nombre: ");
        var nombre = consola.nextLine();
        //esto sirve por que en caso de no tenerlo y ejecutar el
        //programa este no se dejara de ejecutar y pasara de largo
        //el input de nombre

        //conversion de datos
        System.out.println("proporciona un valor entero: ");
        var enteroCadena = consola.nextLine();
        var entero = Integer.parseInt(enteroCadena);

        System.out.println("valor entero: " + entero);

        //un valor de tipo flotante
        System.out.println("proporciona un valor de tipo float: ");
        var flotanteCandena = consola.nextLine();
        var flotante = Float.parseFloat(flotanteCandena);

        System.out.println("valor flotante: " + flotante);

        System.out.println("edad: " + edad + " altura: "+ altura);
        System.out.println("nombre: " + nombre);
    }
}
