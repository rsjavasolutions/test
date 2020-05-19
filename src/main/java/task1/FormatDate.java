package task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDate {

    private DateTimeFormatter dateTimeFormatter =
            DateTimeFormatter.ofPattern("yyyy-MM");

    public String formatDate(LocalDate localDate) {
        return localDate.format(dateTimeFormatter);
    }
}
