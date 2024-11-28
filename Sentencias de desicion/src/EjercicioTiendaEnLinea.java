import java.util.Scanner;
public class EjercicioTiendaEnLinea {
    public static void main(String[] args) {

        var scaner = new Scanner(System.in);

        System.out.print("Cual fue el monto de su compra: ");
        var monto = scaner.nextInt();

        scaner.nextLine();
        System.out.print("Es usted miembro de la tienda (S/N): ");
        var miembro = scaner.nextLine();

        if(monto >= 1000){
            var descuento = monto * 0.10;
            var rebaja = monto - descuento;
            System.out.println("\nFelicidades haz obtenido un descuento del 10%");
            System.out.println("Monto: $" + monto);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Monto final de su compra: $" + rebaja);
        } else if (miembro.equalsIgnoreCase("S") ) {
            var descuento = monto * 0.05;
            var rebaja = monto - descuento;
            System.out.println("\nFelicidades haz obtenido un descuento del 5%");
            System.out.println("Monto: $" + monto);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Monto final de su compra: $" + rebaja);
        }else{
            System.out.println("\nFelicidades haz obtenido un descuento del 0%");
            System.out.println("Monto final de su compra: $" + monto);
        }

    }
}
