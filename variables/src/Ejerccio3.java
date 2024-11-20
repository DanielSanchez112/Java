/*
crear las variables de un producto e imprimirlas

las variables son
nombre
precio
cantidad
disponibilidad

 */

public class Ejerccio3 {
    public static void main(String[] args) {
        String nombreProducto = "Shampo";
        float precioProducto = 35.5f ;
        int cantidadProducto = 10;
        boolean prodEnVenta = true;

        System.out.println(nombreProducto);
        System.out.println(precioProducto);
        System.out.println(cantidadProducto);
        if(prodEnVenta){
            System.out.println("el producto esta disponible para la venta");
        }else{
            System.out.println("el producto no esta disponible para la venta");
        }
    }
}
