public class Book implements Comparable<Book>{
    private final String name;
    private final int pageNumber;
    private final String authorName;

    public Book(String name, int pageNumber, String authorName) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
    }

    @Override
    public int compareTo(Book book) {
        return getName().compareTo(book.getName());
    }

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }
    public void printBook() {
        System.out.println(getName() + "\t" + getAuthorName() +
                "\t" + getPageNumber());
    }
}
