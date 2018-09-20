package com.youtube.projectRest.library;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;




@Path("/library")
public class LibraryRestService {
	
	private static Map<String, Book>books=new HashMap<>();
	
	
	@GET //acess to the information
	@Path("/book/{ISBN}") //the path
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBook(@PathParam(value="isbn") String isbn)
	{
		return books.get(isbn);
	}
	
	
	
	@GET
	@Path("/books")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Book>books()
	{
		return new ArrayList<>(books.values());
	}
	
	
	@POST
	@Path("/books")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Book save(Book book)
	{
		books.put(book.getIsbn(), book);
		return book;
	}
	
	

	@PUT
	@Path("/books/{isbn}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book Update(Book book,@PathParam(value="isbn") String isbn)
	{
		
		books.put(isbn, book);
		return book;
	}
	
	
	@DELETE
	@Path(("/books/{isbn}"))
	@Produces(MediaType.APPLICATION_JSON)
	public void delete(Book book, @PathParam(value="isbn") String isbn)
	{
		books.put(isbn, book);
	}
	
	
	
	
}