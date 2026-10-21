
public class testingClass {
    public static void main(String args[]){
        //first constructor
        Library Size=new Library(3);
        
        Author auth1=new Author("deital","deital@deitalcom");
        
        Book Book=new Book("Java How to program",1453,auth1);
        
        Book.setTitle("never");
        System.out.println(Book);
        
        Author auth2=new Author("Saul","Saul@Saul.com");
        Book book2=new Book("the ending fire",4668,auth2);
        
        Author auth3=new Author("pansy","pansy@pansy.com");
        Book book3=new Book("the goblen of fire",8990,auth3);
        
        Size.addBook(Book);
        Size.addBook(book2);
        Size.addBook(book3);
        
        System.out.println(Size);
        
        System.out.println(Size.findBook("the three ladies"));
        
        Book[] bookArray={new Book("programming",921,auth2),new Book("Operating Systems",443,auth1)};
        Library FilledLibrary=new Library(bookArray);
        
        System.out.println(FilledLibrary);
        
        FilledLibrary.addBook(new Book("power of gray",654,auth3));
        
    }
}
