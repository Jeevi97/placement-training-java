import java.util.*;
abstract class Movie {
    private String title;  
    private double rating;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {   
        return title;
    }

    public double getRating() {
        return rating;
    }

    public abstract void displayInfo(); 
}

class ActionMovie extends Movie {
    public ActionMovie(String title, double rating) {
        super(title, rating);
    }

    @Override
    public void displayInfo() {
        System.out.println(" Action Movie: " + getTitle() + " || Rating: " + getRating());
    }
}

class ComedyMovie extends Movie {
    public ComedyMovie(String title, double rating) {
        super(title, rating);
    }

    @Override
    public void displayInfo() {
        System.out.println(" Comedy Movie: " + getTitle() + " || Rating: " + getRating());
    }
}

public class MovieProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Movie> movies = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== MOVIE =====");
            System.out.println("1. Add Action Movie");
            System.out.println("2. Add Comedy Movie");
            System.out.println("3. View Movies");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Action Movie Title: ");
                    String aTitle = sc.nextLine();
                    System.out.print("Enter Rating: ");
                    double aRating = sc.nextDouble();
                    movies.add(new ActionMovie(aTitle, aRating));
                    break;
                case 2:
                    System.out.print("Enter Comedy Movie Title: ");
                    String cTitle = sc.nextLine();
                    System.out.print("Enter Rating: ");
                    double cRating = sc.nextDouble();
                    movies.add(new ComedyMovie(cTitle, cRating));
                    break;
                case 3:
                    if (movies.isEmpty()) {
                        System.out.println("No movies available.");
                    } else {
                        System.out.println("\n Movie List:");
                        for (Movie m : movies) {
                            m.displayInfo(); 
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}
