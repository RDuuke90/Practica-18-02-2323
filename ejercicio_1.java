/**
 *
 * @author Juan Duque
*/

/**
 * Iniciar 2 variables de tipo entero y evaluar si la primera es mayoro la segunda es mayor o son iguales
 * 
 */


public class Ejercicico_1 {

    public static void main(String[] args) {

        // Definimos las variables de tipo entera con un valor asignado
        int Number1 = 10;
        int Number2 = 20;

        // Usamos el metodo if para evaluar si la primera es mayor que la segunda con el operador >

        if (Number1 > Number2) {
            System.out.println("El número 1 :"+Number1+" es mayor que el número 2 : "+Number2);
            
        // Usamos el metodo if para evaluar si la segunda es mayor que la primera con el operador <
        } else if (Number1 < Number2) {
            System.out.println("El número 2 :"+Number2+" es mayor que el número 1 : "+Number1);

        //Si no se cumple ninguna de las dos, se ejecuta metodo else
        } else {
            System.out.println("Los números son iguales");

        }
    }
}
