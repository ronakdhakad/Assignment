// Movie Rating System
// Create a class Movie with fields: name, genre, and rating.
// Use setters and create a method isHit() that returns true if rating ≥ 8.0.
public class MovieRating {
    private String movieName;
    private String genre;
    private float rate;

    public void data(String movieName,String genre, float rate){
        this.movieName=movieName;
        this.genre=genre;
        this.rate=rate;
    }
    public void data2(){
        System.out.println("Movie name "+movieName);
        System.out.println("Movie type "+genre);
        if(isHit())
            System.out.println("Top rated movie "+rate+" rating");
        else
            System.out.println("Low rated movie "+rate+" rating");
    }
    public boolean isHit(){
        boolean isHit=(rate>=8.0);
        return isHit;
    }
}
class Main{
    public static void main(String args[]){
        MovieRating obj=new MovieRating();
        obj.data("PUSHPA","ACTION",9.2f);
        obj.data2();
    }
}