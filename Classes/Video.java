package Classes;

public abstract class Video {
    private int idNumber;
    private String title;
    private int year;
    private String country;

    public Video(int idNumber, String title, int year, String country) {
        this.idNumber = idNumber;
        this.title = title;
        this.year = year;
        this.country = country;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
