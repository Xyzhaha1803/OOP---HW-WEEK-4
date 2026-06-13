/* Class LibraryItem with fields: title, author, id.
Method: getInfo() prints details.
Subclasses: Book, Magazine, Newspaper override getInfo() to include type-specific info 
(e.g., publication frequency, issue number).
Demonstrate a catalog using an array of LibraryItem objects.
File: LibrarySystem.java. */

class LibraryItem{
    public String title;
    public String author;
    public int id;

    public void getInfo(){}
}

class Book extends LibraryItem{
    public String genre;

    public Book(String t, String a, int i, String g){
        this.title = t;
        this.author = a;
        this.id = i;
        this.genre = g;
    }

    @Override
    public void getInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
        System.out.println("Genre: " + genre);
    }
}

class Magazine extends LibraryItem{
    public int issueNumber;

    public Magazine(String t, String a, int i, int iN){
        this.title = t;
        this.author = a;
        this.id = i;
        this.issueNumber = iN;
    }

    @Override
    public void getInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
        System.out.println("Issue Number: " + issueNumber);
    }
}

class Newspaper extends LibraryItem{
    public int pages;

    public Newspaper(String t, String a, int i, int p){
        this.title = t;
        this.author = a;
        this.id = i;
        this.pages = p;
    }

    @Override
    public void getInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
        System.out.println("Pages: " + pages);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("Programming with C", "George", 123123, "Educational");
        Magazine magazine = new Magazine("GQ", "John", 474321, 149);
        Newspaper newspaper = new Newspaper("Effect of Junk Food", "BBC News", 5743123, 12);

        System.out.println("------------------");
        book.getInfo();
        System.out.println("------------------");
        magazine.getInfo();
        System.out.println("------------------");
        newspaper.getInfo();
    }
}
