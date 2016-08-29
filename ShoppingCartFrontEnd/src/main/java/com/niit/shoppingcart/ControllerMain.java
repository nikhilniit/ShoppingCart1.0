package com.niit.shoppingcart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.ShoppingCart.dao.CategoryDAO;
import com.niit.ShoppingCart.model.Category;

@Controller
public class ControllerMain {

	@Autowired
	CategoryDAO categoryDAO;
	@RequestMapping("/")
	@Autowired
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("message","thanku for visiting");
		List<Category> categoryList = categoryDAO.list();
		mv.addObject("categoryList",categoryList);
		System.out.println("size:"+categoryList.size());
		return mv;
	}
	@RequestMapping("/signup")
	public ModelAndView register()
	{

		ModelAndView mv=new ModelAndView("signup");
		mv.addObject("user clicked register here","true");
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView Login()
	{

		ModelAndView mv=new ModelAndView("login");
		mv.addObject("user clicked register here","true");
		return mv;
	}
}
