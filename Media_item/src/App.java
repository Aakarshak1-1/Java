class MediaItem {
    // Create a base class named MediaItem with the following attributes:
    String title = "ABC";
    private int duration = 8883;
    private String media_type = "XYZ";

    public MediaItem() {
    }

    // Implement a constructor to initialize these attributes.
    MediaItem(String title, int duration, String media_type) {
        this.title = title;
        this.duration = duration;
        this.media_type = media_type;
    }

    // Include a method named display_info that prints out the basic information
    void display_info() {
        System.out.printf("%s-%d-%s%n", title, duration, media_type);
    }
}

class Book extends MediaItem {
    String author;

    public Book(String author) {
        this.author = author;
    }

    Book(String title, String author) {
        super(title, 0, "Book");
        this.author = author;
    }

    @Override
    void display_info() {
        super.display_info();
        System.out.println(author);
    }

}

class Movie extends MediaItem {
    String director;

    Movie() {
    }

    Movie(String title, int duration, String director) {
        super(title, duration, "Movie");
        this.director = director;
    }

    @Override
    void display_info() {
        super.display_info();
        System.out.println(director);

    }
}

class MusicAlbum extends MediaItem {
    String artist;

    MusicAlbum() {
    }

    MusicAlbum(String title, int duration, String artist) {
        super(title, duration, "MusicAlbum");
        this.artist = artist;
    }

    @Override
    void display_info() {
        super.display_info();
        System.out.println(artist);

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        MediaItem A = new MediaItem();
        MediaItem B = new Book("CHetan");
        MediaItem C = new Movie("RRR", 120, "RR");
        MediaItem D = new MusicAlbum("YJHD", 10, "Arijit");
        A.display_info();
        B.display_info();
        C.display_info();
        D.display_info();
    }
}