public class BusquedaDeSubcadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola Todo el Mundo ";

        // se guardara la busqueda en indice1
        // en este caso guardara el valor de 0
        var indice1 = cadena1.indexOf("Hola");
        System.out.println(indice1);

        //lastIndexOf devuelve el indice de la ultima aparicion
        //las index sirve para encontra el ultimo lugar donde
        //se encuentra mientras que indexOf busca la primera
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println(indice2);

        //si cualquiera de las 2 regresa un -1 es que no encontro
        //la subcadenas
    }
}
