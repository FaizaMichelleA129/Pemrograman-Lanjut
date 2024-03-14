package yum;

public class books {
    public String titles;
    public String authors;
    public String categories;

    books() {
        categories = "Default Name";
        titles = "Default Name";
        authors = "Default Name";
    }

    books(String categories, String titles, String authors) {
        this.categories = categories;
        this.titles = titles;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Category: " + categories + "\nTitle: " + titles + "\nAuthor: " + authors;
    }

}
