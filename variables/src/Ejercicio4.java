public class Ejercicio4 {
    public static void main(String[] args) {
        var nombreCliente = "Juan";
        var diasEstancia = 3;
        var tarifaDiaria = 200.0;
        var tieneVista = true;
        var tarifaTotal = diasEstancia*tarifaDiaria;

        System.out.println(nombreCliente);
        System.out.println("dias de estancia: "+diasEstancia+" "+"tarifa diaria: "+tarifaDiaria);
        System.out.println("Total: "+tarifaTotal);
        if(tieneVista){
            System.out.println("tiene vista al mar");
        }else {
            System.out.println("no tiene vista al mar");
        }
    }
}
