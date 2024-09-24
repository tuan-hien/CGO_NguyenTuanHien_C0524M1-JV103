package ss09_TDD.calculator.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ss09_TDD.calculator.NextDayCalculator;
import java.time.LocalDate;
public class NextDayCalculatorTest {
    @Test
    public void testNextDay() {
        LocalDate inputDate = LocalDate.of(2020, 1, 1);
        LocalDate expectedDate = LocalDate.of(2020, 1, 2);
        LocalDate result = NextDayCalculator.getNextDay(inputDate);
        Assertions.assertEquals(expectedDate, result);
    }

    @Test
    public void testEndOfMonth() {
        LocalDate inputDate = LocalDate.of(2020, 1, 31);
        LocalDate expectedDate = LocalDate.of(2020, 2, 1);
        LocalDate result = NextDayCalculator.getNextDay(inputDate);
        Assertions.assertEquals(expectedDate, result);
    }

    @Test
    public void testEndOfYear() {
        LocalDate inputDate = LocalDate.of(2020, 12, 31);
        LocalDate expectedDate = LocalDate.of(2021, 1, 1);
        LocalDate result = NextDayCalculator.getNextDay(inputDate);
        Assertions.assertEquals(expectedDate, result);
    }
}
