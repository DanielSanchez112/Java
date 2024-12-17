public class RecorrerMatrices {
    public static void main(String[] args) {
        int x = 2, y = 3;

        //sintaxis simplificada var matriz = newint[][]{
        //          {100,200,300}
        //          {400,500,600}
        // }
        // para iterar sobre esta matriz se necesita matriz.length
        // para el primer for
        // y despues usar matriz[posicion].leng para el siguiente for

        var matriz = new int[x][y];

        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        for(var i = 0; i < x; i++){
            for (var i1 = 0; i1 < y; i1++){
                System.out.println("Valor : " + matriz[i][i1]);
            }
        }
    }
}
