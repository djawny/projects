package sda.sdajava.przyklady.klas;

/**
 * Created by RENT on 2016-12-07.
 */
public class Time {
    private int hours;
    private int minutes;
    public final static int MAX_HOUR = 23;
    public final static int MIN_HOUR = 0;
    public final static int DEFAULT_HOUR = 0;
    public final static int MAX_MINUTES = 59;
    public final static int MIN_MINUTES = 0;
    public final static int DEFAULT_MINUTES = 0;
    public final static int MINUTES_IN_HOUR = 60;
    public final static int HOURS_IN_DAY = 24;

    public Time() {
    }

    public Time(int hours, int minutes) {
        setHours(hours);
        setMinutes(minutes);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= MIN_HOUR && hours <= MAX_HOUR) this.hours = hours;
        else this.hours = DEFAULT_HOUR;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= MIN_MINUTES && minutes <= MAX_MINUTES) this.minutes = minutes;
        else this.minutes = DEFAULT_MINUTES;
    }

    public void printTime() {
        System.out.println("Time " + hours + ":" + minutes);
    }

    public boolean addMinutes(int minutes) {
        if (minutes < MIN_MINUTES) {
            return false;
        } else {
            int newMinutes = this.minutes + minutes;
            if (newMinutes > MINUTES_IN_HOUR) {
                addHours(newMinutes / MINUTES_IN_HOUR);
                this.minutes = newMinutes % MINUTES_IN_HOUR;
            } else {
                this.minutes = newMinutes;
            }
            return true;
        }

    }

    public void addHours(int hours) {
        int newHours = this.hours + hours;
        if (newHours > HOURS_IN_DAY) {
            this.hours = newHours % HOURS_IN_DAY;
        } else {
            this.hours = newHours;
        }

    }

    public void addTime(Time time) {
        addMinutes(time.getMinutes());
        addHours(time.getHours());
    }

}
