package br.eduardoqa.exempletdd;

import br.eduardoqa.exampletdd.SimpleMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

    @Test
    void testSum() {
        // given(instanciar a classe)
        SimpleMath simpleMath = new SimpleMath();

        // when
        Double result = simpleMath.sum(6.2D, 2D);

        //then
        Assertions.assertEquals(8.2D, result, "TEST SUN PASSED");

    }

    @Test
    void testFaill() {
        // given(instanciar a classe)
        SimpleMath simpleMath = new SimpleMath();
        // when
        Double result = simpleMath.sum(6.2D, 2D);
        Double expected = 8.2D;
        //then
        Assertions.assertEquals(expected, result);

    }


}