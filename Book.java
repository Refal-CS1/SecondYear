\\(CLASS BOOK-AUTHOR-BOOKTEST-LIBRARY-TESTINGCLASS)
public class Book {
    private String Title;
    private final int NumOfPages;
    private final Author Author;
    
    public Book(String Title,int NumOfPages,Author Author) 
    {
    this.Title=Title;
    this.NumOfPages=NumOfPages;
    this.Author=Author;
    }
    public void setTitle(String Title){
    this.Title=Title;}
    
    public String getTitle(){
    return Title;}
    
    public Author getAuthor(){
    return Author;}
    
    public int getNumOfPages(){
    return NumOfPages;}
    public String toString(){
    return    getTitle()+ " by " + getAuthor() +getNumOfPages() + " pp ";}
}
