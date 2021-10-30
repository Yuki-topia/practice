public class Comic extends Book{
  private String author;
  private int page;
  private int year;
  
  public Comic(String name,int price, String color,String isbn,String author,int page,int year){
    super(name,price,color,isbn);
    this.author = author;
    this.page = page;
    this.year = year;
  }
  
  public String getAuthor(){return this.author;}
  public int getPage(){return this.page;}
  public int getYear(){return this.year;}
}
