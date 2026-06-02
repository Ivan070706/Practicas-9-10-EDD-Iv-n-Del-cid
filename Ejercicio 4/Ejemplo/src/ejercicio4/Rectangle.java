package ejercicio4;

/**
 * Clase Rectangle refactorizada (Ejercicio 4).
 * @author Iván del Cid
 * @version 2.0
 */
public class Rectangle {
    
    // Constante extraída para evitar "números mágicos"
    private static final int FACTOR_PERIMETRO = 2;
    
    private double ancho;
    private double alto;

    public Rectangle(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Método extraído para unificar las validaciones de dimensiones.
     * Devuelve -1 si hay negativos, 0 si hay algún cero, o 1 si las dimensiones son correctas.
     */
    private int validarDimensiones() {
        if (ancho < 0 || alto < 0) {
            return -1;
        }
        if (ancho == 0 || alto == 0) {
            return 0;
        }
        return 1; // Dimensiones válidas
    }

    /**
     * Calcula el área (superficie) del rectángulo.
     */
    public double surface() {
        int estadoValidacion = validarDimensiones();
        if (estadoValidacion <= 0) {
            return estadoValidacion; // Devuelve -1 o 0 si la validación falla
        }
        return ancho * alto;
    }

    /**
     * Calcula el perímetro del rectángulo utilizando la constante.
     */
    public double perimeter() {
        int estadoValidacion = validarDimensiones();
        if (estadoValidacion <= 0) {
            return estadoValidacion; // Devuelve -1 o 0 si la validación falla
        }
        return FACTOR_PERIMETRO * (ancho + alto);
    }

    // Getters y Setters
    public double getAncho() { return ancho; }
    public void setAncho(double ancho) { this.ancho = ancho; }
    public double getAlto() { return alto; }
    public void setAlto(double alto) { this.alto = alto; }
}