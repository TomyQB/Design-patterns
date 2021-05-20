package Creational.Prototype;

public class Movie extends Item {

    private String runtime;
    
    public Movie(){
    }

    public Movie(Movie movie) { 
        super(movie);
        if(movie != null) {
            this.runtime = movie.runtime;
        }
    }

    @Override
    public Item clone() {
        return new Movie(this);
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

}
