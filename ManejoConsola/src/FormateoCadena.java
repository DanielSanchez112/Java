public class FormateoCadena {
    public static void main(String[] args) {
        var nombre = "matias";
        var edad = 35;
        var salario = 31000.50;

        //string format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);
        System.out.println(mensaje);

        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);

        //formateo con text block

        var numeroEmpleado = 20;
        mensaje = """
                %nDetalle Persona:\s
                --------------------
                \tNombre: %s
                \tNumero Empleado: %04d
                \tEdad: %d
                \tSalario: %.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        System.out.printf("""
                %nDetalle Persona:\s
                --------------------
                \tNombre: %s
                \tNumero Empleado: %04d
                \tEdad: %d
                \tSalario: %.2f
                """,nombre, numeroEmpleado, edad, salario);
    }
}
