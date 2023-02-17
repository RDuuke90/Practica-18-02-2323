/**
 *
 * @author Juan Duque
*/

/**
 * Se asigna una cantidad de dinero que se debe entregar en las denominciones necesarias.
 * Las denominaciones de billetes son: 100, 50, 20, 10 y 5
 * Ejemplo: si se asigna 250 se debe imprimir que se uso 
 * 100 (2)
 * 50 (1)
 * 20 (0)
 * 10 (0)
 * 5 (0)
 * 
 */


public class Ejercicico_3 {

    public static void main(String[] args) {

    
        // Definimos las variables de tipo entera con las cantidades en 0 de cada deonominación
        int Amount100 = 0;
        int Amount50 = 0;
        int Amount20 = 0;
        int Amount10 = 0;
        int Amount5 = 0;

        //Definimos la cantidad ha analizar
        int RequestedAmountStatic = 185;
        int RequestedAmount = 185;

        //Con la sentencia if preguntamos si la cantidad ha analizar es mayor o igual a la cifra de 100
        //Para obtener cuantos billetes de esa cantidad usar

        if (RequestedAmount >= 100) {

            //Divimos la cantidad analizada por la denomiación para obtener billetes usados y guardarlos en su variable correspondiente
            Amount100 = RequestedAmount/100;

            //Restamos la cantidad entregada para actualizar la antidad ha analizar y seguir con los siguientes billetes
            RequestedAmount -= Amount100*100;
        }

        if (RequestedAmount >= 50) {

            //Divimos la cantidad analizada por la denomiación para obtener billetes usados y guardarlos en su variable correspondiente
            Amount50 = RequestedAmount/50;

            //Restamos la cantidad entregada para actualizar la antidad ha analizar y seguir con los siguientes billetes
            RequestedAmount -= Amount50*50;
        }

        if (RequestedAmount >= 20) {

            //Divimos la cantidad analizada por la denomiación para obtener billetes usados y guardarlos en su variable correspondiente
            Amount20 = RequestedAmount/20;

            //Restamos la cantidad entregada para actualizar la antidad ha analizar y seguir con los siguientes billetes
            RequestedAmount -= Amount20*20;
        }

        if (RequestedAmount >= 10) {

            //Divimos la cantidad analizada por la denomiación para obtener billetes usados y guardarlos en su variable correspondiente
            Amount10 = RequestedAmount/10;

            //Restamos la cantidad entregada para actualizar la antidad ha analizar y seguir con los siguientes billetes
            RequestedAmount -= Amount10*10;
        }

        if (RequestedAmount >= 5) {

            //Divimos la cantidad analizada por la denomiación para obtener billetes usados y guardarlos en su variable correspondiente
            Amount5 = RequestedAmount/5;

            //Restamos la cantidad entregada para actualizar la antidad ha analizar y seguir con los siguientes billetes
            RequestedAmount -= Amount5*5;
        }

        System.out.println("Billetes utilizados para la cifra: "+RequestedAmountStatic);
        System.out.println("100("+Amount100+")");
        System.out.println("50("+Amount50+")");
        System.out.println("20("+Amount20+")");
        System.out.println("10("+Amount10+")");
        System.out.println("5("+Amount5+")");
    }
}
