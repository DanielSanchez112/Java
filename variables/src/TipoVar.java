public class TipoVar {
    public static void main(String[] args) {
        String nombre = "juan";
        System.out.println(nombre);

        var nombre2 = "carlos";
        System.out.println(nombre2);
        //la variable al ser inicializada como var no puede cambiar de tipo de dato
        nombre2 = "pedro";
        System.out.println(nombre2);
    }
}
