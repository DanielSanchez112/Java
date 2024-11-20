public class Cadenas {
    public static void main(String[] args) {
        System.out.println("*** Manejo de Cadenas en java ***");

        var cadena1 = "hola";
        System.out.println("cadena 1 = " + cadena1);

        var cadena2 = new String("Mundo");
        System.out.println("cadena 2 = " + cadena2);

        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena 3 = " + cadena3);

        //cadena de multiples lineas (text block)
        var cadena4 = """
                Este es un texto
                multilinea que puede generar
                saltos de linea.
                """;
        System.out.println("cadena 4 = "+ cadena4);
    }
}
