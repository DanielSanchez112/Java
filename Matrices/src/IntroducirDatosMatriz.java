import java.util.Scanner;

public class IntroducirDatosMatriz {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("cuantas Columnas quiere: ");
        int x = consola.nextInt();
        System.out.print("Cuantas filas quiere: ");
        int y = consola.nextInt();

        var matriz = new int[x][y];

        for(var i=0 ; i < matriz.length ; i++){
            for (var i1=0 ; i1 < matriz[i].length ; i1++){
                System.out.printf("inserte el valor para la matriz[%d][%d]: ",i,i1);
                matriz[i][i1] = consola.nextInt();
            }
        }

        System.out.println("\nlos valores son");
        for(var i = 0; i < x; i++){
            for (var i1 = 0; i1 < y; i1++){
                System.out.println("Valor : " + matriz[i][i1]);
            }
        }
    }
}