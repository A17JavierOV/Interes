/******************************************************************************
 * Visualizar el interes simple que produce un capital (capital)
 * a un determinado tipo de interes (redito) anual expresado en tanto por ciento
 * y considerando el tiempo (tiempo) en años.
 * La formula es: interes= (capital*redito*tiempo)/100
 * autor: profesor
 ******************************************************************************/

package proyecto_interes;
import java.util.*;

/*******************************************************************************
 *
 * @author A17JavierOV Ejercicio Javadoc
 * 
 * Clase principal de la aplicación.
 * Calcula el interés simple:
 * 
 *  1.- Teclea el capital que debe ser >0
 *  2.- Teclea el rédito
 *  3.- Teclea el tiempo en años y sin decimales
 * 
 * Devuelve:
 * 
 *  El interés simple calculado según el método Interes.CalcularInteres
 * 
 *  Si saltan excepciones imprimirá textos con los fallos.
 *  Inserta los valores directamente a la clase Interes.
 *  El main solo consta de una variable de clase Scanner y otra booleana "error"
 * 
 ******************************************************************************/
public class Main {

    /***************************************************************************
     *
     * @param args
     * 
     * Consta de 2 variables:
     * Scanner teclado;
     * boolean error;
     * 
     **************************************************************************/
    
    public static void main(String[] args) {
        System.out.println("CÁLCULO DEL INTERÉS SIMPLE");
        Scanner teclado = new Scanner(System.in);
        boolean error;
        do{
            error=false;
            try{
                System.out.print("Teclee el capital>0: ");
                float capital = teclado.nextFloat();
                System.out.print("Teclee el rédito: ");
                float redito = teclado.nextFloat();
                System.out.print("Teclee el tiempo en años>0 y sin decimales: ");
                int tiempo = teclado.nextInt();
                Interes supuesto = new Interes(capital,redito,tiempo);
                double resultado = supuesto.CalcularInteres();
                supuesto.x=50;
                System.out.printf("El interés simple es %f: ",resultado);                
            }catch (NumberFormatException e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println("Error en la conversión");
                error = true;
            } catch (InputMismatchException e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println("Error. El dato tecleado no es válido");
                error = true;
            }catch(Exception e){
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println(e.getMessage()); // Muestra el error
                error=true;
            }
        }while(error);                
    }
}
