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
    private int borrowed;
    private boolean courseText;

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
        courseText = false;
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
        if(refNumber.length() == 0) {
            System.out.println("The author of " + title + " is:");
            System.out.println(author);
            System.out.println("The book has " + pages + " pages");
            System.out.println("The reference number is ZZZ");
            System.out.println("The book has been borred " + borrowed + " times");
                if(courseText == true) {
                    System.out.println("This book is used as a course text");
                } else {
                    System.out.println("This book is not used as a course text");
                }
        } else {
        System.out.println("The author of " + title + " is:");
        System.out.println(author);
        System.out.println("The book has " + pages + " pages");
        System.out.println("The refence number is " + refNumber);
        System.out.println("The book has been borred " + borrowed + " times");
             if(courseText == true) {
                    System.out.println("This book is used as a course text");
                } else {
                    System.out.println("This book is not used as a course text");
                }
        }
    }
    
    public void setRefNumber(String ref) {
        if(ref.length() < 3) {
            System.out.println("ಠ_ಠ");
        } else {
            refNumber = ref;
        }        
    }
    
    public String getRefNumber() {
        return refNumber;
    }
    
    public void borrow() {
        borrowed += 1;
    }
    
    public int getBorrowed() {
        return borrowed;
    }
    
    public void toggleCourseText() {
        if(courseText == false){
            courseText = true;
        } else {
            courseText = false;
        }
    }
    
    public boolean isCourseText() {
        return courseText;
    }
}
