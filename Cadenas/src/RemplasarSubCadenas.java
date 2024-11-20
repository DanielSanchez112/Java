public class RemplasarSubCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";
        System.out.println("cadena 1: " + cadena1);

        //remplazando Mundo por Todos
        var nuevaCadena1 = cadena1.replace("Mundo", "a Todos");
        System.out.println("nueva cadena: "+ nuevaCadena1);

        //remplazar hola por saludos
        nuevaCadena1 = cadena1.replace("Hola", "Saludos");
        System.out.println("nueva cadena: " + nuevaCadena1);

        //como ya sabemos que las cadenas son inmutables
        //por lo que realmente es otra cadena a partir de cadena1
    }
}
