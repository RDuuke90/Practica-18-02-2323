/**
 *
 * @author Juan Duque
*/

/**
 * Inicializar dos variables de tipo string que contengan el nombre y apellido de un empleado.
 * A cual le daran un bono de 10usd por cada tarea realizada.
 * Imprimir el nombre completo con el número de tareas y el total de bono ganado.
 * 
 */


public class Ejercicico_1 {

    public static void main(String[] args) {

        //Definimos las variables string para nombres y apellidos

        String Name = "Juan";
        String Last_Name = "Duque";
 
        // Definimos las variables de tipo entera con un valor asignado
        int Bonus = 10;
        int Task = 20;

        // Calculamos el pago que se le hace al empleado
        int Pay = Bonus*Task;

        System.out.println("El empleado: "+Name+" "+Last_Name+". Que realizo "+Task+" tareas, obtuvo un pago de bono de: "+Pay);
    }
}
