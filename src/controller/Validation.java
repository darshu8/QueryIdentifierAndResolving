package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import pojo.Customer;
import pojo.Student;
import service.CustomerService;
import service.StudentService;

public class Validation implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		String user=arg0.getParameter("username");
		String pass=arg0.getParameter("pass");
		CustomerService.addCustomer(new Customer(user, pass));
		StudentService.addStudent(new Student(1, "papsjg", "aa", "m", "A", "1234", "a@a"));
		ModelAndView mv=new ModelAndView("welcome");
		mv.addObject("name",user);
		mv.addObject("pass",pass);
		
		return mv;
	}

}
