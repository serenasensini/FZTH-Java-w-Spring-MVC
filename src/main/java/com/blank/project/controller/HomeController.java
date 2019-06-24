package com.blank.project.controller;

import com.blank.project.dao.BookDAO;
import com.blank.project.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class HomeController {

	// value= URI of the request
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(Model view) {

		//View: we could add attributes to the view
		view.addAttribute("message", "hello world" );
		//name of the jsp
		return "home";
	}

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String getBooks(Model view) {

		BookDAO b = new BookDAO();
		List<Book> books = b.readAll();
		view.addAttribute("message", "here your books!!" );
		if(books.size()>0){
			view.addAttribute("book", books.get(0).getTitle());
		}
		else{
			System.out.println("Non ci sono libri");
		}
		//name of the jsp
		return "books";
	}
	
}
