package com.epam.java8.dateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.testng.annotations.Test;

public class DateAndTimeTest {

	/* Write a predicate to check if the given date 
	 * is yesterday date. 
	 */
	
	@Test(priority=1)
	public void test1() {
		Predicate<LocalDate> date = d -> {
            if (d.equals(LocalDate.now().minusDays(1))){
                return true;
            }
            return false;
        };
        System.out.println("Date is same as Yesterday : " + date.test(LocalDate.now().minusDays(1)));
	}
	
	/* Write a Supplier to get Date for next Thursday. 
	 * 
	 */
	@Test(priority=2)
	public void test2() {
		Supplier<LocalDate> nextDate = () -> {
            return LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        };
        System.out.println("Next Date of Thursday : " + nextDate.get());
    }
	
	/* Write a Supplier to get CurrentTime in EST timezone 
	 * 
	 */
	@Test(priority=3)
	public void test3() {
		Supplier<String> timeInEST = () ->{
            return LocalTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("EST"))).toString();
        };
        System.out.println("Current EST TimeZone : " + timeInEST.get());
    }
	
	/* Write a Function to calculate the age of a person given date of birth. 
	 * 
	 */
	@Test(priority=4)
	public void test4() {
		Function<LocalDate, Integer> getAge = (d)->{
            return Period.between(d, LocalDate.now()).getYears();
        };
        System.out.println("Age is : "+ getAge.apply(LocalDate.of(1987,2,9)));
    }
	
}
