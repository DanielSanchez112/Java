import java.util.Scanner;

public class IntroducirValoresArreglos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("proporcione el largo del arreglos: ");
        var largoArreglo = consola.nextInt();

        //craemos la variable arreglo
        var arreglo = new int[largoArreglo];
        int numero;

        //solicitar los valores del arreglo
        for(var i = 0; i < largoArreglo; i++){
            System.out.print("proporcione un valor para el arreglo en la posicion " + i + " :");
            numero = consola.nextInt();
            arreglo[i] = numero;
        }

        for (var i = 0; i < arreglo.length ;i++){
            System.out.println("Los valores son [" +i+"] = " + arreglo[i]);
        }

    }
}
