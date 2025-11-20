public class MiPrimerClase {
    
    // La firma que siempre verás: el punto de entrada
    public static void main(String[] args) {

        //Declarar

        int numeroDeAlumnos; //Declaración: le dices al tipo (int) el el nombre
        
        // le pones un valor por primera vez usando el operador de asignación (=)

        numeroDeAlumnos = 35; // Asignacion : guardas el valor 35.

        String nombreCompleto = "Juan pèrez"; //declaracion e inicializacion de una linea
        
        String saludo = "Hola a todos" ;


        // concatenacion: usar el "+" para unir un strings y otras variables
        int valor = 5;
        String mensajeFinal = saludo + ". El valor es: " + valor;
        System.out.println(mensajeFinal); //Imprime: Hola a todos. el valor es: 5

    }
}
