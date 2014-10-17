package vo;
 
public class Book {


	private String ISBN;




    private String Title;




    private String AuthorID;
    private String Publisher;
    private String PublishDate;
    private String Price;
    
    public String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public String getAuthorID() {
        return AuthorID;
    }
    public void setAuthorID(String AuthorID) {
    	this.AuthorID = AuthorID;
    }
    
    public String getPublishDate() {
        return PublishDate;
    }
    public void setPublishDate(String PublishDate) {
    	this.PublishDate = PublishDate;
    }
    
    public String getPrice() {
        return Price;
    }
    public void setPrice(String Price) {
    	this.Price = Price;


    }
    
    public String getPublisher() {
        return Publisher;


    }
    public void setPublisher(String Publisher) {
    	this.Publisher = Publisher;


    }
}
