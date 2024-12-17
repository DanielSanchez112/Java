public class Matrices {
    public static void main(String[] args) {
        //definir la matriz

        //int[][] matriz = new int[2][3];
        var matriz = new int[2][3];

        //modificar la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        //acceder a valores
        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("valor 5 [1][1] = " + matriz[1][1]);
    }
}
