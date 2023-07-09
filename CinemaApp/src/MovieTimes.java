public class MovieTimes {
       private String hour;

    public MovieTimes(String movieTime) {
        this.hour = movieTime;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "ShowTime{" +
                "hour='" + hour + '\'' +
                '}';
    }
}
