package task6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static task6.ExceptionsExample.DEFAULT_NUMBER;

class ExceptionsExampleTest {

    private ExceptionsExample exceptionsExample = new ExceptionsExample();

    @Test
    void shouldReturnStringFromNumberIfNumberIsLessThanDefault(){
        //given
        int i = 2;

        //when
        String string = exceptionsExample.doSomething(i);

        //then
        assertThat(string).isEqualTo("2");
    }

    @Test
    void shouldReturnStringFromNumberIfNumberIsEqualDefault(){
        //when
        String string = exceptionsExample.doSomething(DEFAULT_NUMBER);

        //then
        assertThat(string).isEqualTo(String.valueOf(DEFAULT_NUMBER));
    }

    @Test
    void shouldThrowExceptionIfNumberIsGraterThanDefault(){
        //given
        int i = 10;

        //when
        assertThatThrownBy(() -> exceptionsExample.doSomething(i))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Parametr jest większy od 5");
    }
}
