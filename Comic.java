public class Comic extends Book{
  private String author;
  private int page;
  
  public Comic(String name,int price, String color,String isbn,String author,int page){
    super(name,price,color,isbn);
    this.author = author;
    this.page = page;
  }
  
  public String getAuthor(){return this.author;}
  public page getPage(){return this.page;}
}
