package task1;

import org.junit.jupiter.api.Test;
import task1.FormatDate;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FormatDateTest {

    @Test
    void shouldFormatDateToYearMonthString() {
        //given
        LocalDate localDate = LocalDate.of(2019, 12, 15);

        //when
        FormatDate formatDate = new FormatDate();
        String dateString = formatDate.formatDate(localDate);

        //then
        assertEquals("2019-12", dateString);
    }
}