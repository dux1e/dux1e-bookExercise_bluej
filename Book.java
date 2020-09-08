/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    // Add the methods here ...
    public String getAuthor() {
       return author; 
    }
    
    public String getTitle() {
       return title;
    }
    
    public int getPages() {
        return pages;
    }
    
    public void printAuther() {
        System.out.println(author);
    }
    
    public void printTitle() {
        System.out.println(title);
    }
    
    public void printPages() {
        System.out.println(pages);
    }
    
    public void printBookDetails() {
        if(refNumber.length() = 0) {
            System.out.println("The author of " + title + " is:");
            System.out.println(author);
            System.out.println("The book has " + pages + " pages");
            System.out.println("The reference number is ZZZ");
        } else {
        System.out.println("The author of " + title + " is:");
        System.out.println(author);
        System.out.println("The book has " + pages + " pages");
        System.out.println("The refence number is " + refNumber);
        }
    }
    
    public void setRefNumber(String ref) {
        refNumber = ref;
    }
    
    public String getRefNumber() {
        return refNumber;
    }
    
}
