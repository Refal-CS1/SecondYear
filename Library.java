\\(CLASS BOOK-AUTHOR-BOOKTEST-LIBRARY-TESTINGCLASS)
public class Library {
    private Book[] Books;
    private int NumOfBooks;
    //First constructor takes the number of books and sets the size
    public Library(int cap){
    this.Books=new Book[cap];
    this.NumOfBooks=0;}
    //Second constructor takes an already filled array and sets the instance variable
    public Library (Book[] FilledArray){
    this.Books=FilledArray;
    this.NumOfBooks=Books.length;
    }
    //First method adds books to the library
    public void addBook(Book newBook){
    if(NumOfBooks<Books.length){
    this.Books[NumOfBooks]=newBook;
    NumOfBooks++;}
    else{
        System.out.println("Error The Library is Full!!");}}
    //Second Method finds a book by title
    public Book findBook(String Title){
    for(int i=0;i<NumOfBooks;i++){
    if(Books[i].getTitle().equals(Title)){
    return Books[i];}
    }
            return null;
    }
    //To string method
    public String toString(){
    if(NumOfBooks==0){
    return "Library is empty";}
    else{
    String Result= " Library Collection \n";
    for(int i=0;i<NumOfBooks;i++){
    Result=Result+" "+(i+1)+"-"+Books[i].toString()+"\n";}
    return Result;}}
    
}
