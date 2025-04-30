package products;

public class Book extends Product {
    private String author;
    private String publication;
    private String genre;
    protected static int idCounter = 1;

    public Book(String author, String publication, String genre, String title, Double price) {
        super(title, price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() +
                "   Author: " + getAuthor() +
                "   Publication: " + getPublication() +
                "   Genre: " + getGenre();
    }

    @Override
    protected String generateId() {
        String formattedId;
        if (idCounter < 10) {
            formattedId = "100" + idCounter;
        } else if (idCounter < 100) {
            formattedId = "10" + idCounter;
        } else if (idCounter < 1000) {
            formattedId = "1" + idCounter;
        } else {
            System.out.println("ID limit reached");
            return null;
        }
        idCounter++;
        return formattedId;
    }
}
