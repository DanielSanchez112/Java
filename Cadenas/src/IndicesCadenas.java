public class IndicesCadenas {
    public static void main(String[] args) {
        //manejo de indices de una cadena
        var cadena1 = "Hola Mundo";

        //recuperar el primer caracter
        var primCaracter = cadena1.charAt(0);
        System.out.println(primCaracter);

        //recuperar el ultimo caracter
        var ultmCaracter = cadena1.charAt(9);
        System.out.println(ultmCaracter);

        //recuperar letra M
        var mCaracter = cadena1.charAt(5);
        System.out.println(mCaracter);
    }
}
