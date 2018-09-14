/**
 * @author created by Ying
 * Date: 2018-09-10
 */
public class Date {
    private final int year;
    private final int month;
    private final int day;

    public Date(int m, int d, int y){
        month = m;
        day = d;
        year = y;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if (o == null){
            return false;
        }
        if(this.getClass() != o.getClass()){
            return false;
        }
        Date d = (Date) o;
        return d.year == year && d.month == month && d.day == day;
    }
}
