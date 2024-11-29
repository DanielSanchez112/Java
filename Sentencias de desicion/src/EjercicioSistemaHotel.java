import java.util.Scanner;

public class EjercicioSistemaHotel {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.print("Escriba su nombre: ");
        var nombre = consola.nextLine();

        System.out.print("Dias de estadia en el hotel: ");
        var dias = consola.nextInt();
        consola.nextLine();

        System.out.print("Quiere un cuarto con vista al mar? (S/N): ");
        var vistaMar = consola.nextLine();

        if (vistaMar.trim().equalsIgnoreCase("S")){
            var coste = dias * 190.50;
            System.out.printf("""
                    %s gracias por reservar en el hotel,
                    usted va a estar %d dias en el hotel,
                    escogios SI a la vista al mar
                    el coste es total es de: $%.2f
                    """, nombre, dias, coste);
        }else {
            var coste = dias * 150.20;
            System.out.printf("""
                    %s gracias por reservar en el hotel,
                    usted va a estar %d dias en el hotel,
                    escogios NO a la vista al mar
                    el coste es total es de: $%.2f
                    """, nombre, dias, coste);
        }

    }
}
