public class Category {
    private String categoryName;
    private int movieCount;

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.movieCount = 0;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getMovieCount() {
        return movieCount;
    }

    public void incrementMovieCount() {
        movieCount++;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", movieCount=" + movieCount +
                '}';
    }
}