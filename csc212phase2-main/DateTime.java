public class DateTime implements IDateTime {
    
    int day;
    int month;
    int year;
    int hour;
    int minute;

   
   
    public DateTime (String date) // mm/dd/yyyy hh:mm
    {
        date = date.trim();
        int firstSlash  = date.indexOf('/');
        int secondSlash  = date.lastIndexOf('/');
        int space = date.lastIndexOf(' ');
        int first_dots = date.indexOf(':');
                
        this.month = Integer.parseInt(date.substring(0,firstSlash));
        if (this.month >12  || this.month < 1)
            this.month = 1;
            
        this.day = Integer.parseInt(date.substring(firstSlash+1, secondSlash));
        if (this.day >31  || this.day < 1)
            this.day = 1;

        this.year = Integer.parseInt(date.substring( secondSlash+1, space));

        this.hour = Integer.parseInt(date.substring( space+1 , first_dots));
        if (this.hour >23  || this.hour < 0)
            this.hour = 0;

        this.minute = Integer.parseInt(date.substring( first_dots+1));
        if (this.minute > 59  || this.minute < 0)
            this.minute = 0;

    }
    
    public DateTime ( int years, int months, int days , int hours, int minutes)
    {
        this.year = years;

        this.month = months;
        if (month < 1 || month > 12)
            this.month = 1;

}
        this.day = days;
        if (this.day >31  || this.day < 1)
            this.day = 1;

        this.hour = hours;
        if (this.hour < 0 || this.hour > 23))
            this.hour = 0;

        this.minute = minutes;
        if (this.minute > 59  || this.minute < 0)
            this.minute = 0;
    }

    public DateTime ( IDateTime dt)
    {
        this.year = dt.getYear();
        this.month = dt.getMonth();
        this.day = dt.getDay();
        this.hour = dt.getHour();
        this.minute = dt.getMinute();
    }
    
    //return year (e.g., 2026). 
    @Override
    public int getYear()
    {
        return year;
    }

    //return month in [1..12]. 
    @Override
    public int getMonth()
    {
        return month;
    }

    //return day in [1..31]. 
    @Override
    public int getDay()
    {
        return day;
    }

    //return hour in [0..23]. 
    @Override
    public int getHour()
    {
        return hour;
    }

    //return minute in [0..59]. 
    @Override
    public int getMinute()
    {
        return minute;
    }

    //Formats this date/time for display (e.g., "MM/DD/YYYY HH:MM").
    @Override
    public String format()
    {
        String str = "";
        str += String.format("%02d" , month) + "/";
        str += String.format("%02d" , day) + "/";
        str += String.format("%04d" , year) + " ";
        str += String.format("%02d" , hour) + ":";
        str += String.format("%02d" , minute) ;
        return str;
    }
    
    // must define chronological ordering via compareTo. 
    public int compareTo(IDateTime other)
    {
        if (this.year != other.getYear())
            return (this.year - other.getYear());
        else if (this.month != other.getMonth())
            return (this.month - other.getMonth());
        else if (this.day != other.getDay())
            return (this.day - other.getDay());
        else if (this.hour != other.getHour())
            return (this.hour - other.getHour());
        return (this.minute - other.getMinute());
    }
}
