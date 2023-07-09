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

    public int getFilmCount() {
        return movieCount;
    }

    public void setFilmCount(int filmCount) {
        this.movieCount = filmCount;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", movieCount=" + movieCount +
                '}';
    }
}