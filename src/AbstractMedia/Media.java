package AbstractMedia;

public abstract class Media {

    protected String media;
    protected String director;

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

