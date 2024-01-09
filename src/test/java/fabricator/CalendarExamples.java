package fabricator;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.TimeZone;

public class CalendarExamples {
    public static void main(String[] args) {
        Calendar calendar = Fabricator.calendar();

        System.out.println(calendar.day()); // numeric day
        System.out.println(calendar.dayOfWeek()); // represent 7 days a week
        System.out.println(calendar.hour12h()); // 12-hour format
        System.out.println(calendar.hour24h()); // 24-hour format
        System.out.println(calendar.month(true)); // provide month as number
        System.out.println(calendar.month(false)); // provide month as string
        System.out.println(calendar.randomDate().asString()); // provide random date (support different date formats)
        System.out.println(calendar.randomDate().inYear(2023).asString()); // provide random date in specific year (also months, days etc )
        System.out.println(calendar.relativeDate().years(2).asString()); // provide date + 2 years
        System.out.println(calendar.relativeDate(DateTime.now().plusDays(1)).tomorrow().asString()); // current date +2 days (1 plus .plusDays() and 1 with tomorrow())

    }
}
