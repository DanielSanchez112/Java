public class ComparacionCadenas {
    public static void main(String[] args) {
        // pool de cadenas nos dice que cadena 1 y cadena 2 apunta
        // al mismo objeto con el texto java por que son lo  mismo
        var cadena1 = "java";
        var cadena2 = "java";

        var cadena3 = new String("java");
        //comparacion de cadenas

        if (cadena1 == cadena2){
            System.out.println("son iguales: ");
            System.out.println(cadena1 == cadena2);
        }

        //comparacion de la cadena 1 y 3
        //al cadena3 ser un new String se crea un nuevo objeto
        //que nos dice que se usan diferentes objetos en memoria
        System.out.println(cadena1 == cadena3);

        //en este caso al usar equals se verifica que los caracteres
        //sean iguales
        System.out.println(cadena1.equals(cadena3));
    }
}
