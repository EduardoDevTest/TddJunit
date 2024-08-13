package br.eduardoqa.exempletdd;

import br.eduardoqa.exampletdd.SimpleMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

    @Test
    void testSimpleMathSum() {
        // given(instanciar a classe)
        SimpleMath simpleMath = new SimpleMath();

        // when
        Double result = simpleMath.sum(6.2D, 2D);

        //then
        Assertions.assertEquals(8.2D, result, "TEST SUN PASSED");

    }



    @Test
    void testSimpleMathSubtraction() {
        // given(instanciar a classe)
        SimpleMath simpleMath = new SimpleMath();

        // when
        Double result = simpleMath.subtraction(6.2D, 2D);

        //then
        Assertions.assertEquals(4.2D, result, "TEST Subtraction PASSED");

    }


    @Test
    void testSimpleMathMultiplication() {
        // given(instanciar a classe)
        SimpleMath simpleMath = new SimpleMath();

        // when
        Double result = simpleMath.multiplication(6D, 2D);

        //then
        Assertions.assertEquals(12D, result, "TEST Multiplication PASSED");

    }

}