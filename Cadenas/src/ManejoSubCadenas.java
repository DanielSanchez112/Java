public class ManejoSubCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";

        var cadena2 = cadena1.substring(0,4);

        var cadena3 = cadena1.substring(5,10);

        System.out.println("se separaro la cadena Hola mundo");
        System.out.println(cadena1);

        //se spararo en 2 subcadenas
        System.out.println(cadena2);
        System.out.println(cadena3);
    }
}
