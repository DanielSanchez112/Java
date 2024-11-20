public class ConcatenacionDeCadenas {
    public static void main(String[] args) {
        //mas formas de concatenar ademas del signo de +
        var cadena1 = "Hola";
        var cadena2 = "Mundo";

        var cadena3 = cadena1 + " " + cadena2;
        System.out.println(cadena3);

        //metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("concat: "+cadena3);

        //StringBuilder
        var costructorDeCadenas = new StringBuilder();
        costructorDeCadenas.append(cadena1);
        costructorDeCadenas.append(" ");
        costructorDeCadenas.append(cadena2);
        var resultado = costructorDeCadenas.toString();
        System.out.println("StringBuild: " + resultado);
        //sirve para crear solo un objeto de tipo cadena en memoria

        //StringBuffer
        //sirve para cuando se ejecutan varios procesos o hilos
        //al mismo tiempo
        var stringBuffer = new StringBuffer();
        //esta misma forma se pudo hacer en el StringBuilder
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("StringBufer: " + stringBuffer);

        //join
        //el primer espacio nos dice que cada cadena que se agrege
        //se separara por un espacio pero este puede ser lo
        //que sea
        resultado = String.join(" ", cadena1, cadena2,"Adios");
        System.out.println("Join: " + resultado);
    }
}
