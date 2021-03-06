public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Day: " + day + " - Month: " + month + "- Year: " + year;
    }

    public boolean isLeapYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return false;
            }
            return true;
        }
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }
}
