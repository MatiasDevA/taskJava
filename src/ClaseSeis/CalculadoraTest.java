package ClaseSeis;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {


    @DisplayName("El resultado tiene que dar 110")
    @org.junit.jupiter.api.Test
    void sumar() {
        double esperado = 110;
        double suma = Calculadora.sumar(150,180);
        double resultado = Calculadora.dividir(suma,3);
        boolean testAProbar = (resultado == esperado);
        assertTrue(testAProbar);
    }

    @DisplayName("No tiene que dar 605")
    @org.junit.jupiter.api.Test
    void restar() {
        double esperado = 605;
        double resta = Calculadora.restar(90,50);
        double multiplicado = Calculadora.multiplicar(resta,15);
        boolean testAProbar = (esperado == multiplicado);
        assertFalse(testAProbar);
    }

    @DisplayName("Se espera que el resultado sea de 240")
    @org.junit.jupiter.api.Test
    void multiplicar() {
        double esperado = 240;
       double resultado = Calculadora.multiplicar(80,3);
       boolean testAProbar = (esperado == resultado);
       assertTrue( testAProbar);
    }

    @DisplayName("No tiene que dar 2700")
    @org.junit.jupiter.api.Test
    void dividir() {
        double esperado = 2700;
        double suma = Calculadora.sumar(70,40);
        double multiplicar = Calculadora.multiplicar(suma,25);
        boolean testAProbar = (esperado == multiplicar);
        assertFalse(testAProbar);

    }
}