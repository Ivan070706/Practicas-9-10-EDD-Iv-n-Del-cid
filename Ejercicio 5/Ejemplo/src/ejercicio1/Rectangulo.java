package ejercicio1;

/**
 * Clase Rectangulo para la práctica de Entornos de Desarrollo.
 * @author Iván del Cid
 * @version 1.0
 */
public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Calcula el área del rectángulo.
     * Devuelve -1 si algún parámetro es negativo, 0 si alguno es cero.
     */
    public double area() {
        if (ancho < 0 || alto < 0) {
            return -1;
        }
        if (ancho == 0 || alto == 0) {
            return 0;
        }
        return ancho * alto;
    }

    /**
     * Calcula el perímetro del rectángulo.
     * Devuelve -1 si algún parámetro es negativo, 0 si alguno es cero.
     */
    public double perimetro() {
        if (ancho < 0 || alto < 0) {
            return -1;
        }
        if (ancho == 0 || alto == 0) {
            return 0;
        }
        return 2 * (ancho + alto);
    }

    // Getters y Setters necesarios
    public double getAncho() { return ancho; }
    public void setAncho(double ancho) { this.ancho = ancho; }
    public double getAlto() { return alto; }
    public void setAlto(double alto) { this.alto = alto; }
}