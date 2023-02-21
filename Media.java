public abstract class Media {
}

// method display for every title for a type of media

    public void displayMedia() {
        System.out.println("Media: " + getMedia());
    }

    // abstract method
    public abstract void start();

    // Getters / Setters for media type
    public abstract String getMedia();

    public abstract void setMedia(String Media);
}

// sub-type of media : DVDS

public class DVDS extends Media {
    private String media;
    private String director;
}

// constructor

    public DVDS(String media, String director) {
        this.media = media;
        this.director = director;

    }

    public void start() {
        System.out.println("Playing DVD: " + getMedia() + "by" + getDirector());
    }

    public String getMedia() {
        return media;
    }

    public void setMedia() {
        this.media = media;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }