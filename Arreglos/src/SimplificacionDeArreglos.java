public class SimplificacionDeArreglos {
    public static void main(String[] args) {
        //declarar, inicializar y añadir dentro de la misma linea
        int[] enteros = {100,200,300,400,500};

        //otra forma de hacerlo ---v
        //var enteros = new int[]{100,200,300,400,500};

        for(var i=0; i < enteros.length; i++){
            System.out.printf("""
            el numero se encuentra en la posicion: %d
            y su valor dentro de esa posicion es?: %d
            """, i+1, enteros[i]);
        }
        //direccion de memoria del objeto
        System.out.println(""+ enteros);
     }
}
