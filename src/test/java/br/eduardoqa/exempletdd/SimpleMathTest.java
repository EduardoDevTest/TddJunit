package br.eduardoqa.exempletdd;

import br.eduardoqa.exampletdd.SimpleMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {
    SimpleMath simpleMath = new SimpleMath();

    @Test
    void testSimpleMathSum() {
        // when
        Double result = simpleMath.sum(6.2D, 2D);
        Double Esperado = 8.2D;
        //then
        Assertions.assertEquals(Esperado, result, "TEST SUN PASSED");

    }


    @Test
    void testSimpleMathSubtraction() {
        // when
        Double result = simpleMath.subtraction(6.2D, 2D);

        //then
        Assertions.assertEquals(4.2D, result, "TEST Subtraction PASSED");

    }


    @Test
    void testSimpleMathMultiplication() {
        // when
        Double result = simpleMath.multiplication(6D, 2D);

        //then
        Assertions.assertEquals(12D, result, "TEST Multiplication PASSED");

    }

    //    Testes de Falhas
    @Test
    void testFaillSimpleMathSum() {
        // when
        Double result = simpleMath.sum(6.2D, 2D);
        Double Esperado = 8.2D;
        //then
        Assertions.assertEquals(Esperado, result, "TEST SUN PASSED");

    }


    @Test
    void testFaillSimpleMathSubtraction() {
        // when
        Double result = simpleMath.subtraction(6.2D, 2D);

        //then
        Assertions.assertEquals(4.2D, result, "TEST Subtraction PASSED");

    }


    @Test
    void testFaillSimpleMathMultiplication() {
        // when
        Double result = simpleMath.multiplication(6D, 2D);

        //then
        Assertions.assertEquals(12D, result, "TEST Multiplication PASSED");


    }
}