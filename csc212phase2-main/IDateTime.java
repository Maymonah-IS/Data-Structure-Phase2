/**
 * Minimal date/time abstraction used by meetings and workshops.
 * Implementations must define chronological ordering via compareTo.
 */
public interface IDateTime extends Comparable<IDateTime> {

    //return year (e.g., 2026). 
    int getYear();

    //return month in [1..12]. 
    int getMonth();

    //return day in [1..31]. 
    int getDay();

    //return hour in [0..23]. 
    int getHour();

    //return minute in [0..59]. 
    int getMinute();

    //Formats this date/time for display (e.g., "MM/DD/YYYY HH:MM").
     String format();
}