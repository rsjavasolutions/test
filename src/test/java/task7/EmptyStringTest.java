package task7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmptyStringTest {

    private EmptyString emptyString = new EmptyString();

    @ParameterizedTest(name = "Param : `{0}`")
    @ValueSource(strings = {"a", " ",  "  a", "  a  ", "Name"})
    void shouldCheckStringIsNotEmpty(String string){
        //when
        boolean result = emptyString.checkIfNotEmpty(string);

        //then
        assertThat(result).isTrue();
    }



}