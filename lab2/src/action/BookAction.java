package action;

import java.util.*;

import javax.faces.application.Application;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import sun.awt.AppContext;

import vo.Book;

import model.*;

import com.opensymphony.xwork2.ActionContext;

public class BookAction {
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
    
    public String add()
    {
        BookModel model=new BookModel();
        model.save(ISBN, Title, AuthorID, Publisher, PublishDate, Price);
        return "add";
    }
    public String select()
    {
        BookModel model=new BookModel();
        ArrayList list=model.getList();
        ActionContext.getContext().put("list", list);
        return "list";
    }
    public String delete()
    {
        BookModel model=new BookModel();
        model.delete(ISBN);
        return this.select();
    }
    //这个update只是取值
    public String update()
    {
        BookModel model=new BookModel();
        Book book= model.get_one(ISBN);
        this.ISBN=book.getISBN();
        this.Title=book.getTitle();
        this.Price=book.getPrice();
        this.AuthorID=book.getAuthorID();
        this.PublishDate=book.getPublisher();
        this.Publisher=book.getPublisher();
        return "update";
    }
    public String updateOne()
    {
        BookModel model=new BookModel();
        model.update(ISBN, Title, AuthorID, Publisher, PublishDate, Price);
        return this.select();
    }
}