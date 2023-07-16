/**
 * Version:
 * (2023a)
 * Author:
 * Michael Verthin
 */
public class Date {
    /* Perms */
    private int _day;
    private int _month;
    private int _year;

    /* Constructors */

    /**
     * If the given date is valid - creates a new Date object, otherwise creates the
     * date 1/1/2000
     * 
     * @param day   the day in the month (1-31)
     * @param month the month in the year (1-12)
     * @param year  the year (4 digits)
     */
    public Date(int day, int month, int year) {
        if (day > 0 && day < 32 && month > 0 && month < 13 && year > 999 && year < 9999) {
            _day = day;
            _month = month;
            _year = year;
        } else if (month == 2 && day < 30) {
            _day = 1;
            _month = 1;
            _year = 2000;
        } else {
            _day = 1;
            _month = 1;
            _year = 2000;
        }
    }

    /**
     * Copy constructor
     * 
     * @param other the date to be copied
     */
    public Date(Date other) {
        this._day = other._day;
        this._month = other._month;
        this._year = other._year;
    }

    /* Methods */

    /**
     * Gets the day
     * 
     * @return the day
     */
    public int getDay() {
        return this._day;
    }

    /**
     * Gets the month
     * 
     * @return the month
     */
    public int getMonth() {
        return this._month;
    }

    /**
     * Gets the year
     * 
     * @return the year
     */
    public int getYear() {
        return this._year;
    }

    /**
     * Set the day (only if date remains valid)
     * 
     * @param dayToSet the day value to be set
     */
    public void setDay(int dayToSet) {
        if (this._month == 2 && dayToSet < 30) {
            if (dayToSet > 0 && dayToSet < 31)
                this._day = dayToSet;
        }
    }

    /**
     * Set the month (only if date remains valid)
     * 
     * @param monthToSet the month value to be set
     */
    public void setMonth(int monthToSet) {
        if (monthToSet == 2 && this._day < 30) {
            if (monthToSet > 0 && monthToSet < 12)
                this._month = monthToSet;
        }
    }

    /**
     * Sets the year (only if date remains valid)
     * 
     * @param yearToSet the year value to be set
     */
    public void setYear(int yearToSet) {
        if (yearToSet > 999 && yearToSet < 9999)
            this._year = yearToSet;
    }

    /**
     * Check if 2 dates are the same
     * 
     * @param other the date to compare this date to
     * @return true if the dates are the same, otherwise false
     */
    public boolean equals(Date other) {
        return this._day == other.getDay() && this._month == other.getMonth() && this._year == other.getYear();
    }

    /**
     * Check if this date is before other date
     * 
     * @param other date to compare this date to
     * @return true if this date is before other date, otherwise false
     */
    public boolean before(Date other) {
        if (this._year < other.getYear() || this._month < other.getMonth() || this._day < other.getDay())
            return true;
        return false;
    }

    /**
     * Check if this date is after other date
     * 
     * @param other date to compare this date to
     * @return true if this date is after other date, otherwise false
     */
    public boolean after(Date other) {
        return this.before(other) == false;
    }

    /**
     * Calculates the difference in days between two dates
     * 
     * @param other the date to calculate the difference between
     * @return the number of days between the dates (non negative value)
     */
    public int difference(Date other) {
        if (this.after(other))
            return calculateDate(_day, _month, _year)
                    - calculateDate(other.getDay(), other.getMonth(), other.getYear());
        else if (this.before(other))
            return calculateDate(other.getDay(), other.getMonth(), other.getYear())
                    - calculateDate(_day, _month, _year);
        else
            return 0;
    }

    /**
     * Returns a String that represents this date
     * 
     * @return String that represents this date in the following format: day (2
     *         digits) / month(2 digits) / year (4 digits) for example: 02/03/1998
     */
    public String toString() {
        String date = "";
        if (_day < 10)
            date += "0";
        date += _day + "/";
        if (_month < 10)
            date += "0";
        date += _month + "/";
        return date + _year;
    }

    /**
     * Calculate the date of tomorrow
     * 
     * @return the date of tomorrow
     */
    public Date tomorrow() {
        int day = _day;
        int month = _month;
        int year = _year;
        if (month == 2 && day > 27) {
            day = 1;
            month = 3;
        } else if (day == 31 && month == 12) { // new year
            day = 1;
            month = 1;
            year++;
        } else if (day == 31) {
            day = 1;
            month++;
        } else
            day++;
        Date d = new Date(day, month, year);
        return d;
    }

    /**
     * 
     * @param day   the day in the month (1-31)
     * @param month the month in the year (1-12)
     * @param year  the year (4 digits)
     * @return the day number since the beginning of the Christian counting of
     *         years
     */
    private int calculateDate(int day, int month, int year) {
        if (month < 3) {
            year--;
            month = month + 12;
        }
        return 365 * year + year / 4 - year / 100 + year / 400 + ((month + 1) * 306) / 10 + (day - 62);
    }
}
