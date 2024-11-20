public class DetalleLibro {
    /*
    * el punto de este ejercicio es ver el comportamiento de las variables en
    * la memoria stack y map
    * en done la memoria map se encarga de guardar los objetos
    * y la stack se encarga de guardar la posicio hexadecimal que para saber
    * en que parte de la memoria se encuentra
    *
    * en la memoria stack se guardan objetos como variables
    * y en la memoria map se guardan objetos como un String
    * */
    public static void main(String[] args) {
        //detalle libro
        String tituloLibro = "el señor de los anillos";
        int anioPublicacion = 1954;
        boolean disponibilidad = true;
        double precio = 500.50;

        System.out.println(tituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(disponibilidad);
        System.out.println(precio);

        tituloLibro = "El señor de los anillos";
        System.out.println(tituloLibro);
    }
}
