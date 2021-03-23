public class Book {

    private final String name;
    private final String author;
    private final int numberOfPages;
    private final String isbn;

    public Book(String name, String author, int numberOfPages, String isbn){
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.isbn = isbn;
    }


    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
    public String getIsbn(){
        return isbn;
    }
    public void print(){
        System.out.println("Название: " +getName());
        System.out.println("Автор: " +getAuthor());
        System.out.println("Количество страниц: " +getNumberOfPages());
        System.out.println("Номер ISBN " +getIsbn());
        System.out.println("\n=================\n");
    }
}
