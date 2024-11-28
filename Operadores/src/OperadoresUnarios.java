public class OperadoresUnarios {
    public static void main(String[] args) {
        //operadores unarios

        int a = 3, b = -2, resultado;
        var c = true;

        // unario +
        resultado = +a;
        System.out.println("resultado de +a: " + resultado);

        //unario -
        resultado = -a;
        System.out.println("resultado de -a: " + resultado);

        //unarios de incremento ++
        //pre incremento
        a = 3;
        resultado = ++a;
        System.out.println("resultado ++a: " + resultado);
        System.out.println("a ya se incremento: " + a);

        //post incremento
        a = 3;
        resultado = a++;
        System.out.println("resultado a++: " + resultado); // no se incremente hasta despues de esta linea
        System.out.println("el valor de a post incremento: " + a); // aqui se incerementa

        //unarios de decremento --
        //pre decremento
        b = -2;
        resultado = --b;
        System.out.println("resultado --b: " + resultado);
        System.out.println("el valor de b: " + b);

        //post decremento
        b = -2;
        resultado = b--;
        System.out.println("resultado de b--: " + resultado);
        System.out.println("el valor de b post decremento: " + b);

    }
}
