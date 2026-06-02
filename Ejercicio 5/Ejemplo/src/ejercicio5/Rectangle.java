package ejercicio5;

/**
 * Clase que representa un Rectangle geométrico.
 * Permite calcular su superficie y su perímetro controlando
 * que las dimensiones introducidas sean válidas.
 * * @author Iván del Cid
 * @version 2.0
 */
public class Rectangle {
    
    /** Constante que define el factor de multiplicación para el cálculo del perímetro. */
    private static final int FACTOR_PERIMETRO = 2;
    
    /** El ancho del rectángulo. */
    private double ancho;
    
    /** El alto del rectángulo. */
    private double alto;

    /**
     * Constructor para crear un objeto Rectangle con sus dimensiones iniciales.
     * * @param ancho El ancho que tendrá el rectángulo.
     * @param alto El alto que tendrá el rectángulo.
     */
    public Rectangle(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Método interno encargado de comprobar si las dimensiones del rectángulo
     * son válidas (mayores que cero).
     * * @return <ul>
     * <li><b>-1</b>: Si el ancho o el alto son valores negativos.</li>
     * <li><b>0</b>: Si el ancho o el alto son iguales a cero.</li>
     * <li><b>1</b>: Si ambas dimensiones son correctas y positivas.</li>
     * </ul>
     */
    private int validarDimensiones() {
        if (ancho < 0 || alto < 0) {
            return -1;
        }
        if (ancho == 0 || alto == 0) {
            return 0;
        }
        return 1;
    }

    /**
     * Calcula el área o superficie total del rectángulo.
     * * @return El área calculada (ancho * alto) si los parámetros son válidos, 
     * un valor negativo (-1) si hay dimensiones negativas, o cero (0) si alguna dimensión es nula.
     */
    public double surface() {
        int estadoValidacion = validarDimensiones();
        if (estadoValidacion <= 0) {
            return estadoValidacion;
        }
        return ancho * alto;
    }

    /**
     * Calcula el perímetro total del rectángulo utilizando la constante configurada.
     * * @return El perímetro calculado si los parámetros son válidos, 
     * un valor negativo (-1) si hay dimensiones negativas, o cero (0) si alguna dimensión es nula.
     */
    public double perimeter() {
        int estadoValidacion = validarDimensiones();
        if (estadoValidacion <= 0) {
            return estadoValidacion;
        }
        return FACTOR_PERIMETRO * (ancho + alto);
    }

    /**
     * Obtiene el ancho actual del rectángulo.
     * @return El ancho como un valor numérico de tipo double.
     */
    public double getAncho() { return ancho; }

    /**
     * Modifica el ancho del rectángulo.
     * @param ancho El nuevo ancho a aplicar.
     */
    public void setAncho(double ancho) { this.ancho = ancho; }

    /**
     * Obtiene el alto actual del rectángulo.
     * @return El alto como un valor numérico de tipo double.
     */
    public double getAlto() { return alto; }

    /**
     * Modifica el alto del rectángulo.
     * @param alto El nuevo alto a aplicar.
     */
    public void setAlto(double alto) { this.alto = alto; }
}
