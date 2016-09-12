
import static java.lang.Math.abs;

/**
 *
 * @author tuf48938
 */
public class Date {
    private int year;
    private int month;
    private int day;
    
    private Date () {
        year = 2016;
        month = 9;
        day = 12;
    }
    public Date (int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int daysTo(Date d2) {
        int daysInBetween;
        int days;
        int months;
        int years;
        
        months = abs(d2.month - this.month);
        days = abs(d2.day - this.day);
        years = abs(d2.year - this.year);
        
//        if (d2.day < this.day){
//            months = months - 1;
//            days = 30 - days;  
//        }
//        
//        if(d2.month < this.month) {
//            years = years - 1;
//            months = 12 - month;
//        }
        
        daysInBetween = (months * 30) + days + (years * 360);
        
        return daysInBetween;
    }
}
