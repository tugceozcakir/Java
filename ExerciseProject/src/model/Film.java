package model;

public class Film {
     private String filmName;
     private String time;
     private String director;
     private String category;
     private String platform;
     
     public String getFilmName() {
          return filmName;
     }
     public void setFilmName(String filmName) {
          this.filmName = filmName;
     }
    
     public String getTime() {
          return time;
     }
     public void setTime(String time) {
          this.time = time;
     }
     public String getDirector() {
          return director;
     }
     public void setDirector(String director) {
          this.director = director;
     }
     public String getCategory() {
          return category;
     }
     public void setCategory(String category) {
          this.category = category;
     }
     public String getPlatform() {
          return platform;
     }
     public void setPlatform(String platform) {
          this.platform = platform;
     }
     @Override
     public String toString() {
          return "Film [filmName=" + filmName + ", time=" + time + ", director=" + director + ", category=" + category
                    + ", platform=" + platform + "]";
     }
     
}
