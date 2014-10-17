package model;
import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.Statement;

import java.util.ArrayList;

import sun.print.resources.serviceui;

import vo.Book;

import connection.BookConnection;

public class BookModel {
    public ArrayList getList()
    {
        ArrayList list=new ArrayList();
        try
        {
            BookConnection connection=new BookConnection();
            Connection mycon=connection.getConnection();
            Statement st=mycon.createStatement();
            ResultSet set=st.executeQuery("select * from book");
            while(set.next())
            {
                Book book=new Book();
                book.setISBN(set.getString("ISBN"));
                book.setTitle(set.getString("Title"));
                book.setAuthorID(set.getString("AuthorID"));
                book.setPublisher(set.getString("Publisher"));
                book.setPublishDate(set.getString("PublishDate"));
                book.setPrice(set.getString("Price"));
                list.add(book);
            }
        }
        catch(Exception e){}
        return list;
    }
    public void delete(String ISBN)
    {
            try {
                BookConnection connection=new BookConnection();
                Connection mycon=connection.getConnection();
                Statement st=mycon.createStatement();
                st.executeUpdate("delete from book where ISBN='"+ISBN+"'");
                connection.closeConnection(mycon);
            } catch (Exception e) {
                // TODO: handle exception
            }
    }
    public void save(String ISBN,String Title,String AuthorID,String Publisher,String PublishDate,String Price)
    {
        try {
            BookConnection connection=new BookConnection();
            Connection mycon=connection.getConnection();
            Statement st=mycon.createStatement();
            st.executeUpdate("insert into book (ISBN, Title, AuthorID, Publisher, PublishDate, Price) values ('"+ISBN+"','"+Title+"','"+AuthorID+"','"+Publisher+"','"+PublishDate+"','"+Price+"')");
            connection.closeConnection(mycon);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void update(String ISBN,String Title,String AuthorID,String Publisher,String PublishDate,String Price)
    {
        try {
            BookConnection connection=new BookConnection();
            Connection mycon=connection.getConnection();
            Statement st=mycon.createStatement();
            st.executeUpdate("update book set ISBN='"+ISBN+"',Title='"+Title+"',AuthorID='"+AuthorID+"',Publisher='"+Publisher+"',PublishDate='"+PublishDate+"',Price='"+Price+"' where ISBN="+ISBN);
            connection.closeConnection(mycon);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public Book get_one(String ISBN_var)
    {
        Book stu=new Book();
        try{
        BookConnection con=new BookConnection();
        java.sql.Connection mycon=con.getConnection();
        Statement st=mycon.createStatement();
         
        ResultSet rs=st.executeQuery("select * from book where ISBN="+ISBN_var);
        if(rs.next())
        {
            String ISBN=rs.getString("ISBN");
            String Title=rs.getString("Title");
            String AuthorID=rs.getString("AuthorID");
            String Publisher=rs.getString("Publisher");
            String PublishDate=rs.getString("PublishDate");
            String Price=rs.getString("Price");
            
            stu.setISBN(ISBN);
            stu.setTitle(Title);
            stu.setAuthorID(AuthorID);
            stu.setPublisher(Publisher);
            stu.setPublishDate(PublishDate);
            stu.setPrice(Price);
        }
        con.closeConnection(mycon);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return stu;
    }
}