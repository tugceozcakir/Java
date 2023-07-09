package model;
import java.util.List;

public class Movie {
    private List<Category> categoryList;
    private List<Platform> platformList;
    private String movieName;
    private String directorName;
    private int publishYear;
    private List<MovieTimes> showHours;

    public Movie(List<Category> categoryList, List<Platform> platformList, String movieName, String directorName, int publishYear, List<MovieTimes> showHours) {
        this.categoryList = categoryList;
        this.platformList = platformList;
        this.movieName = movieName;
        this.directorName = directorName;
        this.publishYear = publishYear;
        this.showHours = showHours;
    }


    public List<Category> getCategoryList() {
        return categoryList;
    }

     public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getPublishYear() {
        return publishYear;
    }
   public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public List<MovieTimes> getShowHours() {
        return showHours;
    }

    public void setShowHours(List<MovieTimes> showHours) {
        this.showHours = showHours;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "categoryList=" + categoryList +
                ", platformList=" + platformList +
                ", movieName='" + movieName + '\'' +
                ", directorName='" + directorName + '\'' +
                ", publishYear=" + publishYear +
                ", showHours=" + showHours +
                '}';
    }
}
