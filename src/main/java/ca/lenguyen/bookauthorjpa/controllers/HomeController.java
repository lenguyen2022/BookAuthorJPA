package ca.lenguyen.bookauthorjpa.controllers;

import ca.lenguyen.bookauthorjpa.beans.Author;
import ca.lenguyen.bookauthorjpa.beans.Book;
import ca.lenguyen.bookauthorjpa.databases.AuthorRepository;
import ca.lenguyen.bookauthorjpa.databases.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class HomeController {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;
    Logger logger = Logger.getLogger(HomeController.class.toString());

    @GetMapping("/")
    public String index(Model model){
        //get the authorSet and passto index page.
        model.addAttribute("authorSet", authorRepository.findAll());

        //get author a by id = 1
        Author a = authorRepository.findById(1L).get();
        //get book b by id 1
        Book b = bookRepository.findById(1L).get();
        logger.log(Level.INFO, a.toString() + a.getBooks().toString());
        logger.log(Level.INFO, b.toString() + b.getAuthors().toString());
        //pass author a to the index page.
        model.addAttribute("author", a);
        //pass author a's book to the index page.
        model.addAttribute("bookSet", a.getBooks());
        return "index";
    }
}
