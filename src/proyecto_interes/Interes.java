package proyecto_interes;

/*******************************************************************************
 *
 * @author A17JavierOV Ejercicio Javadoc
 * 
 * Class Interes:
 * 
 * Atributo capital El capital inicial sobre el que se calculará el interés
 * Atributo redito El interés al que estará ese capital
 * Atributo tiempo El tiempo que permanecerá el capital al interés determinado (años)
 * 
 * Constructor Interes(float capital, float redito, int tiempo)
 * 
 * Metodo CalcularInteres() devuelve un double = capital*redito*tiempo/100
 * 
 ******************************************************************************/
public class Interes {

    /***************************************************************************
     *  Se declaran las variables de la clase:
     *  float capital;
     *  float redito;
     *  float tiempo;
     **************************************************************************/
    
    public int x=2;
    private float capital;
    private float redito;
    private int tiempo;

    /***************************************************************************
     * Constructor: 
     * Interes(float capital, float redito, int tiempo)
     * Se declara el interés insertando un float capital, float
     * redito y un int tiempo en años.
     * 
     * 
     * @param capital El capital inicial sobre el que se calculará el interés
     * @param redito El interés al que estará ese capital
     * @param tiempo El tiempo que permanecerá el capital al interés determinado (años)
     * 
     **************************************************************************/
    
    public Interes(float capital, float redito, int tiempo) {        
        this.capital=capital;
        this.redito=redito;
        this.tiempo=tiempo;
    }

    /***************************************************************************
     *
     * @return Devuelve el interés dado un capital y un interés a lo largo de un
     * tiempo: Capital * interés * tiempo /100
     * 
     * @throws Exception
     *  El capital debe ser mayor que 0 y el tiempo debe ser mayor que 0.
     * 
     * 
     **************************************************************************/
    
    public double CalcularInteres()throws Exception{
        if (capital<=0)
            throw (new Exception ("Error. El capital tiene que ser >=0"));
        if (tiempo<=0)
            throw (new Exception ("Error. El interés tiene que ser >=0"));
        x=25;
        return (double)capital*redito*tiempo/100;
    }
}
