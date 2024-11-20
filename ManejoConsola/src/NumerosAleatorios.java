import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        var random = new Random();

        //generar
        // se genera entre 0 y 9
        var numeroRand = random.nextInt(10);
        System.out.println(numeroRand);

        //aqui se generan numeros entre 1 y 10
        numeroRand = random.nextInt(10) +1;
        System.out.println(numeroRand);

        // genera un numero random entre 0.0 y 1.0
        var floatRand = random.nextFloat();
        System.out.println(floatRand);

        //generar random de entre 1 y 6
        var dado = random.nextInt(6)+1;
        System.out.println("dado: "+dado);
    }
}
