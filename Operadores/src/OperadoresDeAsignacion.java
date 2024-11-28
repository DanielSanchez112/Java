public class OperadoresDeAsignacion {
    public static void main(String[] args) {
        //asignacion

        //asignacion simple
        var numero = 10;
        int numero2;

        numero2 = 15; // se le asigna un numero

        //asignacion compuesto
        numero += 5; // se le suma un 5 al numero que ya tiene
        System.out.println("asignacion compuesto: " + numero);

        // este funciona con los operadores ya conocidos -= *= /= %=
        numero *= 2;
        System.out.println("la multiplicacion es: " + numero); //en cualquier caso se aplica la operacion sobre el valor

        //asignacion de variables multipleas
        int a = 10, b = 15, c = 20;
        System.out.printf("A: %d, B: %d, C: %d",a,b,c);

    }
}
