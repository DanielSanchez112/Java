public class TiposDeDatos {
    public static void main(String[] args){
        //tipos de datos en java

        //----------Entreros (valor default: 0)
        byte tipoByte = 127; //valor maximo de esta tipo de dato byte
        System.out.println("tipo byte" + tipoByte);

        short tipoShort = 32000; //valor maximo de esta tipo de dato short
        System.out.println("tipo short" + tipoShort);

        int tipoInt = 1999999999; //valor maximo de esta tipo de dato int
        System.out.println("tipo int: " + tipoInt);

        long tipoLong = 9999999999L;
        /*
        en este caso se sobre pasa el valor de lo que long puede ser
        por lo que alfinal se pone una letra "L" mayuscula y esto dejara
        agregar mas valores a la variables
        * */
        System.out.println("tipo int: " + tipoLong);

        //----------punto flotante (valor default: 0.0)
        float tipoFloat = 3.14F; //soporta hasta 32 bits
        //se debe usar una "F" en float para decirle a java que es float
        System.out.println("tipo float: " + tipoFloat);

        double tipoDouble = 3.141516; //soporta hasta 64 bits
        //se debe usar una "D" en double para decirle a java que es un double
        System.out.println("tipo double: " + tipoDouble);

        //----------Caracteres (valor default: \u0000)
        char tipoChar = 'A'; //caracter unicode
        System.out.println("tipo char: " + tipoChar);
        tipoChar = 65;
        System.out.println("tipo char: " + tipoChar);
        tipoChar = '@';
        System.out.println("tipo char: " + tipoChar);

        //Boleano (valor default: false)
        boolean tipoBoolean = true;
        System.out.println("tipo boolean: " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipo boolean: " + tipoBoolean);

        //tipos object o de referencia (valor default: null)
        String nombre = null;
        System.out.println("tipo object: " + nombre);

    }
}
