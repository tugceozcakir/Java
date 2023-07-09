import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Category;
import model.Movie;
import model.MovieTimes;
import model.Platform;

public class App {
    private static List<Movie> movieList = new ArrayList<>(); // To keep the movie list
    private static boolean isAdmin = false; //Admin status
    private static List<Category> categoryOptions = new ArrayList<>(); // Category options

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //Create category options
        categoryOptions.add(new Category("Action"));
        categoryOptions.add(new Category("Comedy"));
        categoryOptions.add(new Category("Drama"));
        categoryOptions.add(new Category("Fantasy"));
        categoryOptions.add(new Category("Horror"));
        categoryOptions.add(new Category("Science Fiction"));
        categoryOptions.add(new Category("Musical"));

        // Find out what type of login the user is logged in
        System.out.println("Are you an admin or a client? (1: admin, 2: client):");
        int userType = scanner.nextInt();
        scanner.nextLine();

        if (userType == 1) {
            // Admin
            System.out.println("You are logged in as admin.");
            isAdmin = true; // Set admin status to true
            addMovie(scanner);
            
        } else if (userType == 2) {
            // Client
            System.out.println("You are logged in as client.");
            showMovie(scanner);
        } else {
            System.out.println("Invalid user type.");
        }
        if (isAdmin) {
            System.out.println("Do you want to switch to client account? (1: Yes, 0: No):");
            int switchToClient = scanner.nextInt();
            scanner.nextLine();

            if (switchToClient == 1) {
                isAdmin = false;
                System.out.println("Switched to client account.");
                showMovie(scanner);
            } else{
                isAdmin = true;
                addMovie(scanner);
            }
        }
    }
    public static void addMovie(Scanner scanner) {
         // Create platforms
        List<Platform> selectedPlatforms = new ArrayList<>();
        System.out.println("Enter the number of platforms:");
        int platformCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < platformCount; i++) {
            System.out.println("Enter platform " + (i + 1) + ":");
            String platformName = scanner.nextLine();
            Platform platform = new Platform(platformName);
            selectedPlatforms.add(platform);
        }

        //Create categories
        List<Category> selectedCategories = new ArrayList<>();
        // Display category options
        System.out.println("Category Options:");
        for (int i = 0; i < categoryOptions.size(); i++) {
            System.out.println((i + 1) + ": " + categoryOptions.get(i).getCategoryName());
        }
        System.out.println("Enter the number of categories:");
        int categoryCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < categoryCount; i++) {
            System.out.println("Enter category " + (i + 1) + ":");
            int categoryIndex = scanner.nextInt();
            scanner.nextLine();
            if (categoryIndex >= 1 && categoryIndex <= categoryOptions.size()) {
                Category category = categoryOptions.get(categoryIndex - 1);
                selectedCategories.add(category);
            } else {
                System.out.println("Invalid category selection.");
            }
        }

        // Display the sorted category list
        System.out.println("Sorted category list:");
        for (int i = 0; i < selectedCategories.size(); i++) {
            System.out.println((i + 1) + ": " + selectedCategories.get(i).getCategoryName());
        }

         //Create movie
        System.out.println("Enter movie name:");
        String movieName = scanner.nextLine();
        System.out.println("Enter director name:");
        String directorName = scanner.nextLine();
        System.out.println("Enter the year of publication:");
        int publishYear = scanner.nextInt();
        scanner.nextLine();

        //Create seance
        List<MovieTimes> showHours = new ArrayList<>();
        System.out.println("Enter the number of show times:");
        int showHourCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < showHourCount; i++) {
            System.out.println("Enter show time " + (i + 1) + " (HH:mm):");
            String showHour = scanner.nextLine();
            MovieTimes movieTimes = new MovieTimes(showHour);
            showHours.add(movieTimes);
        }

        // Create movie
        Movie movie = new Movie(selectedCategories, selectedPlatforms, movieName, directorName, publishYear, showHours);
        movieList.add(movie);
        // Increment movie count for selected categories
        for (Category category : selectedCategories) {
            category.incrementMovieCount();
        }
        System.out.println("\nNew movie added:");
        System.out.println(movie.toString());
    }

    public static void showMovie(Scanner scanner){
        // Select platform
        System.out.println("Select a platform:");
        List<Platform> uniquePlatforms = new ArrayList<>();
        for (Movie movie : movieList) {
            for (Platform platform : movie.getPlatformList()) {
                if (!uniquePlatforms.contains(platform)) {
                    uniquePlatforms.add(platform);
                }
            }
        }
        for (int i = 0; i < uniquePlatforms.size(); i++) {
            System.out.println((i + 1) + ": " + uniquePlatforms.get(i));
        }
        int selectedPlatformIndex = scanner.nextInt();
        scanner.nextLine();

        if (selectedPlatformIndex >= 1 && selectedPlatformIndex <= uniquePlatforms.size()) {
            Platform selectedPlatform = uniquePlatforms.get(selectedPlatformIndex - 1);

            // Select category
            System.out.println("Select a category:");
            for (int i = 0; i < categoryOptions.size(); i++) {
                System.out.println((i + 1) + ": " + categoryOptions.get(i).getCategoryName());
            }
            int selectedCategoryIndex = scanner.nextInt();
            scanner.nextLine();

            if (selectedCategoryIndex >= 1 && selectedCategoryIndex <= categoryOptions.size()) {
                Category selectedCategory = categoryOptions.get(selectedCategoryIndex - 1);

                // Display movies
                System.out.println("Movies in the selected platform and category:");
                boolean foundMovies = false;
                for (Movie movie : movieList) {
                    if (movie.getPlatformList().contains(selectedPlatform) && movie.getCategoryList().contains(selectedCategory)) {
                        System.out.println(movie.toString());
                        foundMovies = true;
                    }
                }
                if (!foundMovies) {
                    System.out.println("No movies found in the selected platform and category.");
                }
            } else {
                System.out.println("Invalid category selection.");
            }
        } else {
            System.out.println("Invalid platform selection.");
        }
    }

}
