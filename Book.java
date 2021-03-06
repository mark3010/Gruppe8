/*
 Author of Book.java, @Malthe Gram
 */

public class Book {
    private int ISBN;
    private int releaseYear;
    private String title;

    public Book(int ISBN, int releaseYear, String title){
        this.ISBN = ISBN;
        this.releaseYear = releaseYear;
        this.title = title;
    }

    public int getISBN(){
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public String getTitle(){
        return title;

    }

    @Override
    public String toString() {
        return "Book data: " + "ISBN = " + ISBN + ", releaseYear = " + releaseYear + ", title = " + title;
    }

}
