import java.util.Scanner;

public class DibujarUnTriangulo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Cuanats filas quiere en el triangulo: ");
        var num = consola.nextInt();
        var control = 1;

        for (int i = 0; i < num ; i++ ){

            for(int z = num; z > i; z--){
                System.out.print(" ");
            }

            for (int x = 0; x < control; x++){
                System.out.print("*");
            }
            control = control + 2;

            System.out.println();
        }
    }
}
