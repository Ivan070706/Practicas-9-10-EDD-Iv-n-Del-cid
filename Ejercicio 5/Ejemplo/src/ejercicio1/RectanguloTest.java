package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias Junit 5 para la clase Rectangulo.
 * Alumno: Iván del Cid
 */
class RectanguloTest {

    @Test
    void testValoresPositivos() {
        Rectangulo r = new Rectangulo(3, 4);
        assertEquals(12, r.area(), "El área de 3x4 debería ser 12");
        assertEquals(14, r.perimetro(), "El perímetro de 3x4 debería ser 14");
    }

    @Test
    void testValoresNegativos() {
        Rectangulo r1 = new Rectangulo(-3, 4);
        Rectangulo r2 = new Rectangulo(3, -4);
        Rectangulo r3 = new Rectangulo(-3, -4);
        
        assertEquals(-1, r1.area());
        assertEquals(-1, r2.area());
        assertEquals(-1, r3.area());
        
        assertEquals(-1, r1.perimetro());
        assertEquals(-1, r2.perimetro());
        assertEquals(-1, r3.perimetro());
    }

    @Test
    void testValoresCero() {
        Rectangulo r1 = new Rectangulo(0, 5);
        Rectangulo r2 = new Rectangulo(5, 0);
        Rectangulo r3 = new Rectangulo(0, 0);
        
        assertEquals(0, r1.area());
        assertEquals(0, r2.area());
        assertEquals(0, r3.area());
        
        assertEquals(0, r1.perimetro());
        assertEquals(0, r2.perimetro());
        assertEquals(0, r3.perimetro());
    }

    @Test
    void testAsercionErroneaProvocada() {
        Rectangulo r = new Rectangulo(2, 5);
        // Provocamos un fallo a propósito para verificar que la prueba falla
        // El área real es 10, pero afirmamos que es 99 para forzar el fallo
        assertEquals(99, r.area(), "Este test está diseñado para fallar (Prueba de Iván del Cid)");
    }
}