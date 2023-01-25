package Classes;

public class Movie extends Video{
    private String director;

    private boolean watched;
    private int duration;

    public Movie(int idNumber, String title, int year, String country, String director, int duration) {
        super(idNumber, title, year, country);
        this.director = director;
        this.duration = duration;
        watched = false;
    }

    public void toggleWatched(){
        watched = !watched;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


}