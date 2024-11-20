public class Prueba1 {
    public static void main(String[] args) {
        String nombre = "Daniel";
        int numero1 = 1;
        var numero2 = 2;
        boolean funciona = true;

        var sum = numero1 + numero2;

        if (funciona){
            sum = sum + sum;
        }

        System.out.println("la suma de todo lo que escribi es:"+" "+sum);
    }
}
