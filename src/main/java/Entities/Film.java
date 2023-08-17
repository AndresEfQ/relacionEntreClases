package Entities;

public class Film {

    private String title;
    private int minutesDuration;
    private int minimumAge;
    private String director;

    public Film() {
    }

    public Film(String title, int minutesDuration, int minimumAge, String director) {
        this.title = title;
        this.minutesDuration = minutesDuration;
        this.minimumAge = minimumAge;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinutesDuration() {
        return minutesDuration;
    }

    public void setMinutesDuration(int minutesDuration) {
        this.minutesDuration = minutesDuration;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", minutesDuration=" + minutesDuration +
                ", minimumAge=" + minimumAge +
                ", director='" + director + '\'' +
                '}';
    }
}
