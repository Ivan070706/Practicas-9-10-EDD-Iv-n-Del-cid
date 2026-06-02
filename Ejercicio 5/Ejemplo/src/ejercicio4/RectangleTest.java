package ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias Junit 5 adaptadas para la clase Rectangle refactorizada.
 * Alumno: Iván del Cid
 */
class RectangleTest {

    @Test
    void testValoresPositivos() {
        Rectangle r = new Rectangle(3, 4);
        assertEquals(12, r.surface(), "El área (surface) de 3x4 debería ser 12");
        assertEquals(14, r.perimeter(), "El perímetro de 3x4 debería ser 14");
    }

    @Test
    void testValoresNegativos() {
        Rectangle r1 = new Rectangle(-3, 4);
        Rectangle r2 = new Rectangle(3, -4);
        Rectangle r3 = new Rectangle(-3, -4);
        
        assertEquals(-1, r1.surface());
        assertEquals(-1, r2.surface());
        assertEquals(-1, r3.surface());
        
        assertEquals(-1, r1.perimeter());
        assertEquals(-1, r2.perimeter());
        assertEquals(-1, r3.perimeter());
    }

    @Test
    void testValoresCero() {
        Rectangle r1 = new Rectangle(0, 5);
        Rectangle r2 = new Rectangle(5, 0);
        Rectangle r3 = new Rectangle(0, 0);
        
        assertEquals(0, r1.surface());
        assertEquals(0, r2.surface());
        assertEquals(0, r3.surface());
        
        assertEquals(0, r1.perimeter());
        assertEquals(0, r2.perimeter());
        assertEquals(0, r3.perimeter());
    }

    /* @Test
    void testAsercionErroneaProvocada() {
        Rectangle r = new Rectangle(2, 5);
        // Descomentar si se quiere forzar deliberadamente la barra roja para una captura
        assertEquals(99, r.surface(), "Este test está diseñado para fallar (Prueba de Iván del Cid)");
    }
    */
}