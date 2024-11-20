public class EjercicioEmail {
    public static void main(String[] args) {

        // el proposito es usar los metodos de cadenas para generar un email
        /*
        este sera designado con el nombre en minusculas, sin espacios y con
        un . separandolo, un arroba seguido del nombre de la empresa en minus
        culas, finalmente la extencion
         */

        var nombre = "Ubaldo Acosta Soto";
        var empresa = "Global Mentoring";
        var Extencion = ".com.mx";

        var email = nombre.toLowerCase().replace(" ",".") + "@" +
                empresa.toLowerCase().replace(" ","") +
                Extencion;

        System.out.println("nombre del usuario: " + nombre + "\n" +
                "nombre usuario normalizado: " + nombre.toLowerCase().replace(" ",".")
        + "\n\n nombre de la empresa: " + empresa + "\n extencion: " + Extencion
        + "\n Dominio del email: " + "@" +
                empresa.toLowerCase().replace(" ","") +
                Extencion);
        System.out.println("\nEmail final"+email);
    }
}
