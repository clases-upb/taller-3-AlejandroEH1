/*
 * This source file was generated by the Gradle 'init' task
 */
package taller3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testEscribirAsc() {
        // Test para números en orden ascendente
        assertEquals("4 - 3 - 2", App.Escribir_asc(4, 3, 2));

        // Test para números desordenados
        assertEquals("5 - 3 - 2", App.Escribir_asc(3, 5, 2));

        // Test con números iguales
        assertEquals("Error: La función no considera números iguales", App.Escribir_asc(2, 2, 3));
    }

    @Test
    public void testObtenerCifras() {
        // Test para números dentro del rango
        assertEquals(2, App.Obtener_cifras(10));
        assertEquals(4, App.Obtener_cifras(9999));

        // Test para números fuera del rango
        assertEquals(0, App.Obtener_cifras(-1));
        assertEquals(0, App.Obtener_cifras(50001));

    }

    @Test
    public void testClasificarChar() {
        // Test para letras
        assertEquals("ES LETRA", App.Clasificar_char('a'));
        assertEquals("ES LETRA", App.Clasificar_char('Z'));

        // Test para números
        assertEquals("ES NUMERO", App.Clasificar_char('1'));

        // Test para caracteres especiales
        assertEquals("ESPECIAL", App.Clasificar_char('@'));
    }

    @Test
    public void testHallarDivisionExacta() {
        // Test para división exacta
        assertEquals("DIVISION EXACTA", App.Hallar_division_exacta(10, 5));

        // Test para división no exacta
        assertEquals("DIVISION NO EXACTA", App.Hallar_division_exacta(10, 3));

        // Test para números negativos o cero
        assertEquals("NO SE ADMITE CERO O NEGATIVOS", App.Hallar_division_exacta(-10, 5));
        assertEquals("NO SE ADMITE CERO O NEGATIVOS", App.Hallar_division_exacta(10, 0));

    }

    @Test
    public void testConsultarHab() {
        // Test para casos válidos
        assertEquals("102", App.Consultar_hab((byte) 1, "VE"));
        assertEquals("101|301", App.Consultar_hab((byte) 2, "AA"));
        assertEquals("202", App.Consultar_hab((byte) 2, "VE"));
        assertEquals("201", App.Consultar_hab((byte) 3, "AA"));
    }

    @Test
    public void testObtenerObs() {
        // Test para platos seleccionados
        assertEquals("POSTRE", App.Obtener_obs(true, false, false));
        assertEquals("BEBIDA", App.Obtener_obs(true, true, false));
        assertEquals("BEBIDA Y POSTRE", App.Obtener_obs(true, true, true));

        // Test para platos no válidos
        assertEquals("PLATOS NO VÁLIDOS", App.Obtener_obs(false, false, false));

    }


    @Test
    public void testConocerInvitacion() {
        // Test para colores válidos
        assertEquals("Invita a las cervezas", App.Conocer_invitacion("verde"));
        assertEquals("Invita a la pizza", App.Conocer_invitacion("azul"));
        assertEquals("Invita al postre", App.Conocer_invitacion("rojo"));
        assertEquals("Paga el parqueadero de todos", App.Conocer_invitacion("amarillo"));
        assertEquals("Vaya y disfrute", App.Conocer_invitacion("negro"));

        // Test para colores no válidos
        assertEquals("Error en el color", App.Conocer_invitacion("morado"));
    }
}
