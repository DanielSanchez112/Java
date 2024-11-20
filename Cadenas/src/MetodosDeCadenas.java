public class MetodosDeCadenas {
    public static void main(String[] args) {
        // varios metodos de cadenas
        var cadena1 = "Hola Mundo";

        //obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("la longitud de la cadena es: "+longitud);

        //remplasar caracteres
        var newCadena = cadena1.replace('o','a');
        System.out.println("nueva cadena: " + newCadena);

        //convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas: " + mayusculas);

        //convertir a minusculas
        System.out.println("minusculas: " + cadena1.toLowerCase());

        //eliminar espacios al inicio y al final
        var cadena2 = " Los Reyes 1 ";
        System.out.println("con espacios: "+cadena2);
        System.out.println("la cadena 2 sin espacios: "+cadena2.trim());


    }
}
