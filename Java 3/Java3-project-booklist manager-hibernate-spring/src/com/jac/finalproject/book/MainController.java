package com.jac.finalproject.book;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	private List<Book> thebooks = new ArrayList<>();
	private BookDAO bookDAO = new BookDAO();
	private Book abook = new Book();

	@RequestMapping("/")
	public String showHome() {
		return "index";
	}

	@RequestMapping("/list")
	public String list(Model theModel) {
		thebooks = bookDAO.list();
		// System.out.println(thebooks);
		theModel.addAttribute("books", thebooks);
		return "list";
	}

	@RequestMapping("/add")
	public String addBook(Model theModel) {
		abook = new Book();
		theModel.addAttribute("book", abook);
		return "add-form";
	}

	@RequestMapping("/save")
	public String processAdd(@ModelAttribute("book") Book book) {
		if (book.getId() == 0) {
			bookDAO.save(book);
		} else {
			bookDAO.update(book);
		}
		return "add-confirm";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam int id) {
		bookDAO.delete(id);
		return "redirect:/";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String edit(HttpServletRequest request, Model theModel) {
		abook = bookDAO.edit(request);
		theModel.addAttribute("book", abook);
		return "add-form";
	}

	@RequestMapping("/search")
	public String search() {
		return "search";
	}

	@RequestMapping("/showResult")
	public String showResult(HttpServletRequest request, Model theModel) {
		thebooks = bookDAO.showResult(request);
		 System.out.println(thebooks);
		if (thebooks.isEmpty()) {
			return "no-result";
		} else {
			theModel.addAttribute("books", thebooks);
			return "list";
		}

	}
}
