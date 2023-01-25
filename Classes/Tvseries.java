package Classes;

public class Tvseries extends Video{
    private int seasons;
    private int episodes;
    private int currentEpisode;
    public Tvseries(int idNumber, String title, int year, String country, int seasons, int episodes) {
        super(idNumber, title, year, country);
        this.seasons = seasons;
        this.episodes = episodes;
        currentEpisode = 1;
    }
    public void nextEpisode(){
        if(currentEpisode++<=episodes){
            currentEpisode  = currentEpisode++;
        }
    }
    public void previousEpisode(){
        if(currentEpisode-1>=1){
            currentEpisode = currentEpisode-1;
        }
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getCurrentEpisode() {
        return currentEpisode;
    }

    public void setCurrentEpisode(int currentEpisode) {
        this.currentEpisode = currentEpisode;
    }
}
